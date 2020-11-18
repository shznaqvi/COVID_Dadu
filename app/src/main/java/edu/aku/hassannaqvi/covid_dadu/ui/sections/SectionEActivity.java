package edu.aku.hassannaqvi.covid_dadu.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.covid_dadu.R;
import edu.aku.hassannaqvi.covid_dadu.contracts.FormsContract;
import edu.aku.hassannaqvi.covid_dadu.core.DatabaseHelper;
import edu.aku.hassannaqvi.covid_dadu.core.MainApp;
import edu.aku.hassannaqvi.covid_dadu.databinding.ActivitySectionEBinding;
import edu.aku.hassannaqvi.covid_dadu.models.FUP;
import edu.aku.hassannaqvi.covid_dadu.models.Form;
import edu.aku.hassannaqvi.covid_dadu.ui.other.EndingActivity;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import static edu.aku.hassannaqvi.covid_dadu.core.MainApp.form;
import static edu.aku.hassannaqvi.covid_dadu.core.MainApp.setGPS;

public class SectionEActivity extends AppCompatActivity {

    ActivitySectionEBinding bi;
    DatabaseHelper db;
    FUP fup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e);
        bi.setCallback(this);
        bi.pid.requestFocus();
        db = MainApp.appInfo.getDbHelper();
        setupSkip();
    }


    private void setupSkip() {

        bi.fus1q3.setOnCheckedChangeListener(((radioGroup, i) -> {
            if (i == bi.fus1q302.getId()) {
                Clear.clearAllFields(bi.fldGrpfus1q3);
            }
        }));

    }


    public void BtnContinue() {
        if (!formValidation()) return;
        try {
            SaveDraft();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (UpdateDB()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
        }
    }

    public void BtnCheckFUP(View v) {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return;

        getSpecificFUP()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(fupcontract -> {
                    fup = fupcontract;
                    setupFields(View.VISIBLE);
                    bi.fus1q1.setText(fup.getPatient());
                    Clear.clearRadioGroup(bi.fus1q2, false);
                    bi.fus1q2.check(fup.getSex().equals("1") ? bi.fus1q201.getId() : bi.fus1q202.getId());

                    String[] dt = fup.getSysdate().split(" ");
                    bi.fus1q5.setMinDate(dt[0].replace("-20", "-2020").replace("-", "/"));

                }, error -> {
                    Toast.makeText(this, "No Follow up found!!", Toast.LENGTH_SHORT).show();
                    setupFields(View.GONE);
                });
    }

    private Observable<FUP> getSpecificFUP() {
        return Observable.create(emitter -> {
            emitter.onNext(db.getHHFromFUP(bi.pid.getText().toString()));
            emitter.onComplete();
        });
    }

    public void pidOnTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        setupFields(View.GONE);
    }

    private void setupFields(int visibility) {
        bi.fldGrpSecE01.setVisibility(visibility);
        Clear.clearAllFields(bi.fldGrpSecE01);
    }


    private boolean UpdateDB() {
        long updcount = db.addForm(form);
        form.set_ID(String.valueOf(updcount));
        if (updcount > 0) {
            form.set_UID(form.getDeviceID() + form.get_ID());
            db.updatesFormColumn(FormsContract.FormsTable.COLUMN_UID, form.get_UID());
            return true;
        } else {
            Toast.makeText(this, "Sorry. You can't go further.\n Please contact IT Team (Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private void SaveDraft() throws JSONException {

        form = new Form();
        form.setSysdate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        form.setUsername(MainApp.userName);
        form.setDeviceID(MainApp.appInfo.getDeviceID());
        form.setDevicetagID(MainApp.appInfo.getTagName());
        form.setAppversion(MainApp.appInfo.getAppVersion());
        form.setFormdate(new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime()));
        form.setPid(bi.pid.getText().toString());
        form.setFormType("3");

        JSONObject json = new JSONObject();

        json.put("luid", fup.getLuid());

        json.put("fus1q1", bi.fus1q1.getText().toString());

        json.put("fus1q2", bi.fus1q201.isChecked() ? "1"
                : bi.fus1q202.isChecked() ? "2"
                : "-1");

        json.put("fus1q3", bi.fus1q301.isChecked() ? "1"
                : bi.fus1q302.isChecked() ? "2"
                : "-1");

        json.put("fus1q3a", bi.fus1q3a01.isChecked() ? "1"
                : bi.fus1q3a02.isChecked() ? "2"
                : bi.fus1q3a96.isChecked() ? "96"
                : "-1");
        json.put("fus1q3a96x", bi.fus1q3a96x.getText().toString());

        json.put("fus1q4", bi.fus1q401.isChecked() ? "1"
                : bi.fus1q402.isChecked() ? "2"
                : "-1");
        json.put("fus1q5", bi.fus1q5.getText().toString());

        form.setsB(String.valueOf(json));
        setGPS(this);

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

}