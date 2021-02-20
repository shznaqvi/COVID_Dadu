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
import edu.aku.hassannaqvi.covid_dadu.databinding.ActivitySectionDBinding;
import edu.aku.hassannaqvi.covid_dadu.ui.other.EndingActivity;
import edu.aku.hassannaqvi.covid_dadu.utils.AppUtilsKt;
import edu.aku.hassannaqvi.covid_dadu.utils.JSONUtils;

import static edu.aku.hassannaqvi.covid_dadu.core.MainApp.form;

public class SectionDActivity extends AppCompatActivity {
    ActivitySectionDBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d);
        bi.setCallback(this);
        setupSkip();

    }

    private void setupSkip() {
        bi.kcs2q4.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVkcs2q4Title));
        bi.kcs2q5.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVkcs2q5Title));
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
            Toast.makeText(this, "Sorry! Failed to update DB)", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(FormsContract.FormsTable.COLUMN_SB, form.getsB());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Sorry! Failed to update DB)", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {

        JSONObject json = new JSONObject();
        json.put("kcs2q4", bi.kcs2q4y.isChecked() ? "1"
                : bi.kcs2q4n.isChecked() ? "2"
                : "-1");

        json.put("kcs2q401", bi.kcs2q401.isChecked() ? "1" : "-1");

        json.put("kcs2q402", bi.kcs2q402.isChecked() ? "2" : "-1");

        json.put("kcs2q403", bi.kcs2q403.isChecked() ? "3" : "-1");

        json.put("kcs2q404", bi.kcs2q404.isChecked() ? "4" : "-1");

        json.put("kcs2q405", bi.kcs2q405.isChecked() ? "5" : "-1");

        json.put("kcs2q406", bi.kcs2q406.isChecked() ? "6" : "-1");

        json.put("kcs2q407", bi.kcs2q407.isChecked() ? "7" : "-1");

        json.put("kcs2q408", bi.kcs2q408.isChecked() ? "8" : "-1");

        json.put("kcs2q4096", bi.kcs2q4096.isChecked() ? "96" : "-1");

        json.put("kcs2q4096x", bi.kcs2q4096x.getText().toString());
        json.put("kcs2q4010", bi.kcs2q4010.isChecked() ? "10" : "-1");

        json.put("kcs2q4011", bi.kcs2q4011.isChecked() ? "11" : "-1");

        json.put("kcs2q5", bi.kcs2q5y.isChecked() ? "1"
                : bi.kcs2q5n.isChecked() ? "2"
                : "-1");

        json.put("kcs2q501", bi.kcs2q501.isChecked() ? "1" : "-1");

        json.put("kcs2q502", bi.kcs2q502.isChecked() ? "2" : "-1");

        json.put("kcs2q503", bi.kcs2q503.isChecked() ? "3" : "-1");

        json.put("kcs2q504", bi.kcs2q504.isChecked() ? "4" : "-1");

        json.put("kcs2q505", bi.kcs2q505.isChecked() ? "5" : "-1");

        json.put("kcs2q506", bi.kcs2q506.isChecked() ? "6" : "-1");

        json.put("kcs2q507", bi.kcs2q507.isChecked() ? "7" : "-1");

        json.put("kcs2q508", bi.kcs2q508.isChecked() ? "8" : "-1");

        json.put("kcs2q5096", bi.kcs2q5096.isChecked() ? "96" : "-1");

        json.put("kcs2q5096x", bi.kcs2q5096x.getText().toString().trim().isEmpty() ? "-1" : bi.kcs2q5096x.getText().toString());
        json.put("kcs2q5010", bi.kcs2q5010.isChecked() ? "10" : "-1");

        try {
            JSONObject json_merge = JSONUtils.mergeJSONObjects(new JSONObject(form.getsB()), json);
            form.setsB(String.valueOf(json_merge));
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void BtnEnd() {
        AppUtilsKt.openEndActivity(this);
    }
}