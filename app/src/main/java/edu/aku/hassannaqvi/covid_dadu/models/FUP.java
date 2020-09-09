package edu.aku.hassannaqvi.covid_dadu.models;


import android.database.Cursor;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.covid_dadu.contracts.FUPContract;

public class FUP {

    private static final String TAG = "FUP_CONTRACT";
    String luid;
    String sysdate;
    String pid;
    String patient;
    String sex;
    String istatus;
    String s2q7;

    public FUP() {
        // Default Constructor
    }


    public String getLuid() {
        return luid;
    }

    public void setLuid(String luid) {
        this.luid = luid;
    }

    public String getSysdate() {
        return sysdate;
    }

    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }

    public String getS2q7() {
        return s2q7;
    }

    public void setS2q7(String s2q7) {
        this.s2q7 = s2q7;
    }

    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();
        try {
            json.put(FUPContract.FUPTable.COLUMN_LUID, this.luid == null ? JSONObject.NULL : this.luid);
            json.put(FUPContract.FUPTable.COLUMN_SYSDATE, this.sysdate == null ? JSONObject.NULL : this.sysdate);
            json.put(FUPContract.FUPTable.COLUMN_PID, this.pid == null ? JSONObject.NULL : this.pid);
            json.put(FUPContract.FUPTable.COLUMN_PATIENT, this.patient == null ? JSONObject.NULL : this.patient);
            json.put(FUPContract.FUPTable.COLUMN_SEX, this.sex == null ? JSONObject.NULL : this.sex);
            json.put(FUPContract.FUPTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
            json.put(FUPContract.FUPTable.COLUMN_S2Q7, this.s2q7 == null ? JSONObject.NULL : this.s2q7);
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public FUP Sync(JSONObject jsonObject) throws JSONException {
        this.luid = jsonObject.getString(FUPContract.FUPTable.COLUMN_LUID);
        this.sysdate = jsonObject.getString(FUPContract.FUPTable.COLUMN_SYSDATE);
        this.pid = jsonObject.getString(FUPContract.FUPTable.COLUMN_PID);
        this.patient = jsonObject.getString(FUPContract.FUPTable.COLUMN_PATIENT);
        this.sex = jsonObject.getString(FUPContract.FUPTable.COLUMN_SEX);
        this.istatus = jsonObject.getString(FUPContract.FUPTable.COLUMN_ISTATUS);
        this.s2q7 = jsonObject.getString(FUPContract.FUPTable.COLUMN_S2Q7);
        return this;
    }

    public FUP HydrateFUP(Cursor cursor) {
        this.luid = cursor.getString(cursor.getColumnIndex(FUPContract.FUPTable.COLUMN_LUID));
        this.sysdate = cursor.getString(cursor.getColumnIndex(FUPContract.FUPTable.COLUMN_SYSDATE));
        this.pid = cursor.getString(cursor.getColumnIndex(FUPContract.FUPTable.COLUMN_PID));
        this.patient = cursor.getString(cursor.getColumnIndex(FUPContract.FUPTable.COLUMN_PATIENT));
        this.sex = cursor.getString(cursor.getColumnIndex(FUPContract.FUPTable.COLUMN_SEX));
        this.istatus = cursor.getString(cursor.getColumnIndex(FUPContract.FUPTable.COLUMN_ISTATUS));
        this.s2q7 = cursor.getString(cursor.getColumnIndex(FUPContract.FUPTable.COLUMN_S2Q7));
        return this;
    }
}