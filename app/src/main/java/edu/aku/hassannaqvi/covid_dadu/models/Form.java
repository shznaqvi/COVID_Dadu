package edu.aku.hassannaqvi.covid_dadu.models;

import android.database.Cursor;

import androidx.lifecycle.LiveData;

import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.covid_dadu.contracts.FormsContract.FormsTable;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class Form extends LiveData<Form> {

    private final String projectName = "covid_dadu";
    private String _ID = "";
    private String _UID = "";
    private String username;
    private String sysdate = "";
    private String formdate = "";
    private String pid = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsDT = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String devicetagID = "";
    private String synced = "";
    private String synced_date = "";
    private String appversion = "";
    private String istatus = ""; // Interview Status
    private String istatus96x = ""; // Interview Status
    private String endingdatetime = "";
    private String sB = "";
    private String formType = "";

    private String s1q1 = "";
    private String s1q2 = "";
    private String s1q3 = "";
    private String s1q4 = "";
    private String s1q5 = "";
    private String s1q6 = "";

    private String s2q101 = "";
    private String s2q101x = "";
    private String s2q102 = "";
    private String s2q102x = "";
    private String s2q103 = "";
    private String s2q103x = "";
    private String s2q104 = "";
    private String s2q104x = "";
    private String s2q105 = "";
    private String s2q105x = "";
    private String s2q106 = "";
    private String s2q106x = "";
    private String s2q107 = "";
    private String s2q107x = "";
    private String s2q108 = "";
    private String s2q108x = "";
    private String s2q109 = "";
    private String s2q109x = "";
    private String s2q110 = "";
    private String s2q110x = "";
    private String s2q111 = "";
    private String s2q111x = "";
    private String s2q112 = "";
    private String s2q112x = "";
    private String s2q113 = "";
    private String s2q113x = "";
    private String s2q114 = "";
    private String s2q114x = "";
    private String s2q115 = "";
    private String s2q115x = "";
    private String s2q116 = "";
    private String s2q116x = "";
    private String s2q2 = "";
    private String s2q3 = "";
    private String s2q31 = "";
    private String s2q32 = "";
    private String s2q33 = "";
    private String s2q4 = "";
    private String s2q501 = "";
    private String s2q502 = "";
    private String s2q503 = "";
    private String s2q504 = "";
    private String s2q505 = "";
    private String s2q506 = "";
    private String s2q507 = "";
    private String s2q508 = "";
    private String s2q509 = "";
    private String s2q596 = "";
    private String s2q596x = "";
    private String s2q6 = "";
    private String s2q7 = "";
    private String s2q71 = "";
    private String s2q72 = "";

    public Form() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getSysdate() {
        return sysdate;
    }

    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }


    public String getFormdate() {
        return formdate;
    }

    public void setFormdate(String formdate) {
        this.formdate = formdate;
    }


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }


    public String getS1q1() {
        return s1q1;
    }

    public void setS1q1(String s1q1) {
        this.s1q1 = s1q1;
    }


    public String getS1q2() {
        return s1q2;
    }

    public void setS1q2(String s1q2) {
        this.s1q2 = s1q2;
    }


    public String getS1q3() {
        return s1q3;
    }

    public void setS1q3(String s1q3) {
        this.s1q3 = s1q3;
    }


    public String getS1q4() {
        return s1q4;
    }

    public void setS1q4(String s1q4) {
        this.s1q4 = s1q4;
    }


    public String getS1q5() {
        return s1q5;
    }

    public void setS1q5(String s1q5) {
        this.s1q5 = s1q5;
    }


    public String getS1q6() {
        return s1q6;
    }

    public void setS1q6(String s1q6) {
        this.s1q6 = s1q6;
    }


    public String getS2q101() {
        return s2q101;
    }

    public void setS2q101(String s2q101) {
        this.s2q101 = s2q101;
    }

    public String getS2q101x() {
        return s2q101x;
    }

    public void setS2q101x(String s2q101x) {
        this.s2q101x = s2q101x;
    }


    public String getS2q102() {
        return s2q102;
    }

    public void setS2q102(String s2q102) {
        this.s2q102 = s2q102;
    }

    public String getS2q102x() {
        return s2q102x;
    }

    public void setS2q102x(String s2q102x) {
        this.s2q102x = s2q102x;
    }


    public String getS2q103() {
        return s2q103;
    }

    public void setS2q103(String s2q103) {
        this.s2q103 = s2q103;
    }

    public String getS2q103x() {
        return s2q103x;
    }

    public void setS2q103x(String s2q103x) {
        this.s2q103x = s2q103x;
    }


    public String getS2q104() {
        return s2q104;
    }

    public void setS2q104(String s2q104) {
        this.s2q104 = s2q104;
    }

    public String getS2q104x() {
        return s2q104x;
    }

    public void setS2q104x(String s2q104x) {
        this.s2q104x = s2q104x;
    }


    public String getS2q105() {
        return s2q105;
    }

    public void setS2q105(String s2q105) {
        this.s2q105 = s2q105;
    }

    public String getS2q105x() {
        return s2q105x;
    }

    public void setS2q105x(String s2q105x) {
        this.s2q105x = s2q105x;
    }


    public String getS2q106() {
        return s2q106;
    }

    public void setS2q106(String s2q106) {
        this.s2q106 = s2q106;
    }

    public String getS2q106x() {
        return s2q106x;
    }

    public void setS2q106x(String s2q106x) {
        this.s2q106x = s2q106x;
    }


    public String getS2q107() {
        return s2q107;
    }

    public void setS2q107(String s2q107) {
        this.s2q107 = s2q107;
    }

    public String getS2q107x() {
        return s2q107x;
    }

    public void setS2q107x(String s2q107x) {
        this.s2q107x = s2q107x;
    }


    public String getS2q108() {
        return s2q108;
    }

    public void setS2q108(String s2q108) {
        this.s2q108 = s2q108;
    }

    public String getS2q108x() {
        return s2q108x;
    }

    public void setS2q108x(String s2q108x) {
        this.s2q108x = s2q108x;
    }


    public String getS2q109() {
        return s2q109;
    }

    public void setS2q109(String s2q109) {
        this.s2q109 = s2q109;
    }

    public String getS2q109x() {
        return s2q109x;
    }

    public void setS2q109x(String s2q109x) {
        this.s2q109x = s2q109x;
    }


    public String getS2q110() {
        return s2q110;
    }

    public void setS2q110(String s2q110) {
        this.s2q110 = s2q110;
    }

    public String getS2q110x() {
        return s2q110x;
    }

    public void setS2q110x(String s2q110x) {
        this.s2q110x = s2q110x;
    }


    public String getS2q111() {
        return s2q111;
    }

    public void setS2q111(String s2q111) {
        this.s2q111 = s2q111;
    }

    public String getS2q111x() {
        return s2q111x;
    }

    public void setS2q111x(String s2q111x) {
        this.s2q111x = s2q111x;
    }


    public String getS2q112() {
        return s2q112;
    }

    public void setS2q112(String s2q112) {
        this.s2q112 = s2q112;
    }

    public String getS2q112x() {
        return s2q112x;
    }

    public void setS2q112x(String s2q112x) {
        this.s2q112x = s2q112x;
    }


    public String getS2q113() {
        return s2q113;
    }

    public void setS2q113(String s2q113) {
        this.s2q113 = s2q113;
    }

    public String getS2q113x() {
        return s2q113x;
    }

    public void setS2q113x(String s2q113x) {
        this.s2q113x = s2q113x;
    }


    public String getS2q114() {
        return s2q114;
    }

    public void setS2q114(String s2q114) {
        this.s2q114 = s2q114;
    }

    public String getS2q114x() {
        return s2q114x;
    }

    public void setS2q114x(String s2q114x) {
        this.s2q114x = s2q114x;
    }


    public String getS2q115() {
        return s2q115;
    }

    public void setS2q115(String s2q115) {
        this.s2q115 = s2q115;
    }

    public String getS2q115x() {
        return s2q115x;
    }

    public void setS2q115x(String s2q115x) {
        this.s2q115x = s2q115x;
    }


    public String getS2q116() {
        return s2q116;
    }

    public void setS2q116(String s2q116) {
        this.s2q116 = s2q116;
    }

    public String getS2q116x() {
        return s2q116x;
    }

    public void setS2q116x(String s2q116x) {
        this.s2q116x = s2q116x;
    }


    public String getS2q2() {
        return s2q2;
    }

    public void setS2q2(String s2q2) {
        this.s2q2 = s2q2;
    }


    public String getS2q3() {
        return s2q3;
    }

    public void setS2q3(String s2q3) {
        this.s2q3 = s2q3;
    }


    public String getS2q31() {
        return s2q31;
    }

    public void setS2q31(String s2q31) {
        this.s2q31 = s2q31;
    }


    public String getS2q32() {
        return s2q32;
    }

    public void setS2q32(String s2q32) {
        this.s2q32 = s2q32;
    }


    public String getS2q33() {
        return s2q33;
    }

    public void setS2q33(String s2q33) {
        this.s2q33 = s2q33;
    }


    public String getS2q4() {
        return s2q4;
    }

    public void setS2q4(String s2q4) {
        this.s2q4 = s2q4;
    }


    public String getS2q501() {
        return s2q501;
    }

    public void setS2q501(String s2q501) {
        this.s2q501 = s2q501;
    }


    public String getS2q502() {
        return s2q502;
    }

    public void setS2q502(String s2q502) {
        this.s2q502 = s2q502;
    }


    public String getS2q503() {
        return s2q503;
    }

    public void setS2q503(String s2q503) {
        this.s2q503 = s2q503;
    }


    public String getS2q504() {
        return s2q504;
    }

    public void setS2q504(String s2q504) {
        this.s2q504 = s2q504;
    }


    public String getS2q505() {
        return s2q505;
    }

    public void setS2q505(String s2q505) {
        this.s2q505 = s2q505;
    }


    public String getS2q506() {
        return s2q506;
    }

    public void setS2q506(String s2q506) {
        this.s2q506 = s2q506;
    }


    public String getS2q507() {
        return s2q507;
    }

    public void setS2q507(String s2q507) {
        this.s2q507 = s2q507;
    }


    public String getS2q508() {
        return s2q508;
    }

    public void setS2q508(String s2q508) {
        this.s2q508 = s2q508;
    }


    public String getS2q509() {
        return s2q509;
    }

    public void setS2q509(String s2q509) {
        this.s2q509 = s2q509;
    }


    public String getS2q596() {
        return s2q596;
    }

    public void setS2q596(String s2q596) {
        this.s2q596 = s2q596;
    }


    public String getS2q596x() {
        return s2q596x;
    }

    public void setS2q596x(String s2q596x) {
        this.s2q596x = s2q596x;
    }


    public String getS2q6() {
        return s2q6;
    }

    public void setS2q6(String s2q6) {
        this.s2q6 = s2q6;
    }


    public String getS2q7() {
        return s2q7;
    }

    public void setS2q7(String s2q7) {
        this.s2q7 = s2q7;
    }


    public String getS2q71() {
        return s2q71;
    }

    public void setS2q71(String s2q71) {
        this.s2q71 = s2q71;
    }


    public String getS2q72() {
        return s2q72;
    }

    public void setS2q72(String s2q72) {
        this.s2q72 = s2q72;
    }


    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }


    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }


    public String getProjectName() {
        return projectName;
    }


    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }


    public String get_UID() {
        return _UID;
    }

    public void set_UID(String _UID) {
        this._UID = _UID;
    }


    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }


    public String getIstatus96x() {
        return istatus96x;
    }

    public void setIstatus96x(String istatus96x) {
        this.istatus96x = istatus96x;
    }


    public String getEndingdatetime() {
        return endingdatetime;
    }

    public void setEndingdatetime(String endingdatetime) {
        this.endingdatetime = endingdatetime;
    }


    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }


    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }


    public String getGpsDT() {
        return gpsDT;
    }

    public void setGpsDT(String gpsDT) {
        this.gpsDT = gpsDT;
    }


    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }


    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }


    public String getDevicetagID() {
        return devicetagID;
    }

    public void setDevicetagID(String devicetagID) {
        this.devicetagID = devicetagID;
    }


    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }


    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;

    }


    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public Form Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this._UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.username = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_USERNAME));
        this.sysdate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYSDATE));
        this.formdate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMDATE));
        this.formType = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMTYPE));
        this.pid = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_PID));
        this.s1q1 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S1Q1));
        this.s1q2 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S1Q2));
        this.s1q3 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S1Q3));
        this.s1q4 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S1Q4));
        this.s1q5 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S1Q5));
        this.s1q6 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S1Q6));
        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.istatus96x = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS96x));
        this.endingdatetime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsDT = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSDATE));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.devicetagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.appversion = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APPVERSION));

        if (this.formType.equals("1"))
            sBHydrate(cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB)));
        else
            this.sB = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB));

        return this;
    }


    //TODO: Try this instead of toJSONObject
    @Override
    public String toString() {
        return new GsonBuilder().create().toJson(this, Form.class);
    }

    public String sBtoString() {
        JSONObject json = new JSONObject();

        try {
            json.put("s2q101", s2q101)
                    .put("s2q101x", s2q101x)
                    .put("s2q102", s2q102)
                    .put("s2q102x", s2q102x)
                    .put("s2q103", s2q103)
                    .put("s2q103x", s2q103x)
                    .put("s2q104", s2q104)
                    .put("s2q104x", s2q104x)
                    .put("s2q105", s2q105)
                    .put("s2q105x", s2q105x)
                    .put("s2q106", s2q106)
                    .put("s2q106x", s2q106x)
                    .put("s2q107", s2q107)
                    .put("s2q107x", s2q107x)
                    .put("s2q108", s2q108)
                    .put("s2q108x", s2q108x)
                    .put("s2q109", s2q109)
                    .put("s2q109x", s2q109x)
                    .put("s2q110", s2q110)
                    .put("s2q110x", s2q110x)
                    .put("s2q111", s2q111)
                    .put("s2q111x", s2q111x)
                    .put("s2q112", s2q112)
                    .put("s2q112x", s2q112x)
                    .put("s2q113", s2q113)
                    .put("s2q113x", s2q113x)
                    .put("s2q114", s2q114)
                    .put("s2q114x", s2q114x)
                    .put("s2q115", s2q115)
                    .put("s2q115x", s2q115x)
                    .put("s2q116", s2q116)
                    .put("s2q116x", s2q116x)
                    .put("s2q2", s2q2)
                    .put("s2q3", s2q3)
                    .put("s2q31", s2q31)
                    .put("s2q32", s2q32)
                    .put("s2q33", s2q33)
                    .put("s2q4", s2q4)
                    .put("s2q501", s2q501)
                    .put("s2q502", s2q502)
                    .put("s2q503", s2q503)
                    .put("s2q504", s2q504)
                    .put("s2q505", s2q505)
                    .put("s2q506", s2q506)
                    .put("s2q507", s2q507)
                    .put("s2q508", s2q508)
                    .put("s2q509", s2q509)
                    .put("s2q596", s2q596)
                    .put("s2q596x", s2q596x)
                    .put("s2q6", s2q6)
                    .put("s2q7", s2q7)
                    .put("s2q71", s2q71)
                    .put("s2q72", s2q72)
                    .put("appversion", appversion);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

    public JSONObject toJSONObject() {

        JSONObject json = new JSONObject();

        try {
            json.put(FormsTable.COLUMN_ID, this._ID == null ? JSONObject.NULL : this._ID);
            json.put(FormsTable.COLUMN_UID, this._UID == null ? JSONObject.NULL : this._UID);
            json.put(FormsTable.COLUMN_USERNAME, this.username == null ? JSONObject.NULL : this.username);
            json.put(FormsTable.COLUMN_SYSDATE, this.sysdate == null ? JSONObject.NULL : this.sysdate);
            json.put(FormsTable.COLUMN_FORMDATE, this.formdate == null ? JSONObject.NULL : this.formdate);
            json.put(FormsTable.COLUMN_FORMTYPE, this.formType == null ? JSONObject.NULL : this.formType);
            json.put(FormsTable.COLUMN_PID, this.pid == null ? JSONObject.NULL : this.pid);
            json.put(FormsTable.COLUMN_S1Q1, this.s1q1 == null ? JSONObject.NULL : this.s1q1);
            json.put(FormsTable.COLUMN_S1Q2, this.s1q2 == null ? JSONObject.NULL : this.s1q2);

            if (this.formType.equals("1")) {
                json.put(FormsTable.COLUMN_S1Q3, this.s1q3 == null ? JSONObject.NULL : this.s1q3);
                json.put(FormsTable.COLUMN_S1Q4, this.s1q4 == null ? JSONObject.NULL : this.s1q4);
                json.put(FormsTable.COLUMN_S1Q5, this.s1q5 == null ? JSONObject.NULL : this.s1q5);
                json.put(FormsTable.COLUMN_S1Q6, this.s1q6 == null ? JSONObject.NULL : this.s1q6);
            }

            if (this.sB != null && !this.sB.equals("")) {
                json.put(FormsTable.COLUMN_SB, new JSONObject(this.sB));
            }

            json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
            json.put(FormsTable.COLUMN_ISTATUS96x, this.istatus96x == null ? JSONObject.NULL : this.istatus96x);
            json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endingdatetime == null ? JSONObject.NULL : this.endingdatetime);
            json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
            json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
            json.put(FormsTable.COLUMN_GPSDATE, this.gpsDT == null ? JSONObject.NULL : this.gpsDT);
            json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
            json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
            json.put(FormsTable.COLUMN_DEVICETAGID, this.devicetagID == null ? JSONObject.NULL : this.devicetagID);
            json.put(FormsTable.COLUMN_APPVERSION, this.appversion == null ? JSONObject.NULL : this.appversion);

            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void sBHydrate(String string) {

        if (string != null) {

            try {
                JSONObject json = new JSONObject(string);

                this.s2q101 = json.getString("s2q101");
                this.s2q101x = json.getString("s2q101x");
                this.s2q102 = json.getString("s2q102");
                this.s2q102x = json.getString("s2q102x");
                this.s2q103 = json.getString("s2q103");
                this.s2q103x = json.getString("s2q103x");
                this.s2q104 = json.getString("s2q104");
                this.s2q104x = json.getString("s2q104x");
                this.s2q105 = json.getString("s2q105");
                this.s2q105x = json.getString("s2q105x");
                this.s2q106 = json.getString("s2q106");
                this.s2q106x = json.getString("s2q106x");
                this.s2q107 = json.getString("s2q107");
                this.s2q107x = json.getString("s2q107x");
                this.s2q108 = json.getString("s2q108");
                this.s2q108x = json.getString("s2q108x");
                this.s2q109 = json.getString("s2q109");
                this.s2q109x = json.getString("s2q109x");
                this.s2q110 = json.getString("s2q110");
                this.s2q110x = json.getString("s2q110x");
                this.s2q111 = json.getString("s2q111");
                this.s2q111x = json.getString("s2q111x");
                this.s2q112 = json.getString("s2q112");
                this.s2q112x = json.getString("s2q112x");
                this.s2q113 = json.getString("s2q113");
                this.s2q113x = json.getString("s2q113x");
                this.s2q114 = json.getString("s2q114");
                this.s2q114x = json.getString("s2q114x");
                this.s2q115 = json.getString("s2q115");
                this.s2q115x = json.getString("s2q115x");
                this.s2q116 = json.getString("s2q116");
                this.s2q116x = json.getString("s2q116x");
                this.s2q2 = json.getString("s2q2");
                this.s2q3 = json.getString("s2q3");
                this.s2q31 = json.getString("s2q31");
                this.s2q32 = json.getString("s2q32");
                this.s2q33 = json.getString("s2q33");
                this.s2q4 = json.getString("s2q4");
                this.s2q501 = json.getString("s2q501");
                this.s2q502 = json.getString("s2q502");
                this.s2q503 = json.getString("s2q503");
                this.s2q504 = json.getString("s2q504");
                this.s2q505 = json.getString("s2q505");
                this.s2q506 = json.getString("s2q506");
                this.s2q507 = json.getString("s2q507");
                this.s2q508 = json.getString("s2q508");
                this.s2q509 = json.getString("s2q509");
                this.s2q596 = json.getString("s2q596");
                this.s2q596x = json.getString("s2q596x");
                this.s2q6 = json.getString("s2q6");
                this.s2q7 = json.getString("s2q7");
                this.s2q71 = json.getString("s2q71");
                this.s2q72 = json.getString("s2q72");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
