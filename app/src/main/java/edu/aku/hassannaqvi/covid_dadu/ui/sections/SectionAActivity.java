package edu.aku.hassannaqvi.covid_dadu.ui.sections;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.covid_dadu.R;
import edu.aku.hassannaqvi.covid_dadu.contracts.FormsContract;
import edu.aku.hassannaqvi.covid_dadu.core.DatabaseHelper;
import edu.aku.hassannaqvi.covid_dadu.core.MainApp;
import edu.aku.hassannaqvi.covid_dadu.databinding.ActivitySectionABinding;
import edu.aku.hassannaqvi.covid_dadu.models.Form;
import edu.aku.hassannaqvi.covid_dadu.utils.AppUtilsKt;

import static edu.aku.hassannaqvi.covid_dadu.core.MainApp.form;


public class SectionAActivity extends AppCompatActivity {

    ActivitySectionABinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_a);
        bi.setCallback(this);
        bi.pid.requestFocus();
    }

    public void BtnContinue() {
        if (!formValidation()) return;
        SaveDraft();
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, SectionBActivity.class));
        } else {
            Toast.makeText(this, "Sorry! Failed to update DB)", Toast.LENGTH_SHORT).show();
        }
    }


    private boolean UpdateDB() {

        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        long updcount = db.addForm(form);
        form.set_ID(String.valueOf(updcount));
        if (updcount > 0) {
            form.set_UID(form.getDeviceID() + form.get_ID());
            db.updatesFormColumn(FormsContract.FormsTable.COLUMN_UID, form.get_UID());
            return true;
        } else {
            Toast.makeText(this, "Sorry! Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() {

        form = new Form();
        form.setSysdate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        form.setFormdate(form.getSysdate());
        form.setPid(bi.pid.getText().toString());
        form.setUsername(MainApp.userName);
        form.setDeviceID(MainApp.appInfo.getDeviceID());
        form.setDevicetagID(MainApp.appInfo.getTagName());
        form.setAppversion(MainApp.appInfo.getAppVersion());
        form.setFormType("1");

        form.setS1q0(bi.s1q001.isChecked() ? "1"
                : bi.s1q002.isChecked() ? "2"
                : "-1");
        form.setS1q1(bi.s1q1.getText().toString());
        form.setS1q2(bi.s1q201.isChecked() ? "1"
                : bi.s1q202.isChecked() ? "2"
                : "-1");
        form.setS1q3(bi.s1q3.getText().toString());
        form.setS1q4(bi.s1q4.getText().toString());
        form.setS1q5(bi.s1q5.getText().toString());
        form.setS1q6(bi.s1q6.getText().toString());
        //MainApp.setGPS(this);

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void BtnEnd() {
        AppUtilsKt.openEndActivity(this);
    }

}