package edu.aku.hassannaqvi.covid_dadu.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.covid_dadu.R;
import edu.aku.hassannaqvi.covid_dadu.contracts.FormsContract;
import edu.aku.hassannaqvi.covid_dadu.core.DatabaseHelper;
import edu.aku.hassannaqvi.covid_dadu.core.MainApp;
import edu.aku.hassannaqvi.covid_dadu.databinding.ActivitySectionEBinding;
import edu.aku.hassannaqvi.covid_dadu.ui.other.EndingActivity;
import edu.aku.hassannaqvi.covid_dadu.utils.AppUtilsKt;

import static edu.aku.hassannaqvi.covid_dadu.core.MainApp.form;

public class SectionEActivity extends AppCompatActivity {

    ActivitySectionEBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e);
        bi.setCallback(this);
        setupSkip();
    }


    private void setupSkip() {

        /*bi.s2q3.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVs2q31));

        bi.s2q597.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.s2q5check.setTag("-1");
                Clear.clearAllFields(bi.s2q5check, false);
            } else {
                Clear.clearAllFields(bi.s2q5check, true);
                bi.s2q5check.setTag("0");
            }
        });*/




        bi.fus1q3.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i != bi.fus1q302.getId()) {
                Clear.clearAllFields(bi.fldGrpfus1q3);
            }
        }));
    }




    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();
        json.put("formdate", bi.formdate.getText().toString());

        json.put("pid", bi.pid.getText().toString());

        json.put("fus1q1", bi.fus1q1.getText().toString());

        json.put("fus1q2", bi.fus1q201.isChecked() ? "1"
                : bi.fus1q202.isChecked() ? "2"
                :  "-1");

        json.put("fus1q3", bi.fus1q301.isChecked() ? "1"
                : bi.fus1q302.isChecked() ? "2"
                :  "-1");

        json.put("fus1q4", bi.fus1q401.isChecked() ? "1"
                : bi.fus1q402.isChecked() ? "2"
                :  "-1");

        json.put("fus1q5", bi.fus1q5.getText().toString());




    }
    public void BtnEnd() {
        AppUtilsKt.openEndActivity(this);
    }
}