package edu.aku.hassannaqvi.covid_dadu.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.google.android.gms.common.internal.Asserts;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.covid_dadu.contracts.BLRandomContract.BLRandomTable;
import edu.aku.hassannaqvi.covid_dadu.contracts.FUPContract;
import edu.aku.hassannaqvi.covid_dadu.contracts.FormsContract.FormsTable;
import edu.aku.hassannaqvi.covid_dadu.contracts.UsersContract.UsersTable;
import edu.aku.hassannaqvi.covid_dadu.contracts.VersionAppContract;
import edu.aku.hassannaqvi.covid_dadu.contracts.VersionAppContract.VersionAppTable;
import edu.aku.hassannaqvi.covid_dadu.models.BLRandom;
import edu.aku.hassannaqvi.covid_dadu.models.FUP;
import edu.aku.hassannaqvi.covid_dadu.models.Form;
import edu.aku.hassannaqvi.covid_dadu.models.Users;
import edu.aku.hassannaqvi.covid_dadu.models.VersionApp;

import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.DATABASE_NAME;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.DATABASE_VERSION;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.SQL_ALTER_FORMS01;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.SQL_ALTER_FORMS02;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.SQL_ALTER_FUP02;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.SQL_CREATE_BL_RANDOM;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.SQL_CREATE_FORMS;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.SQL_CREATE_FUP;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.SQL_CREATE_USERS;
import static edu.aku.hassannaqvi.covid_dadu.utils.CreateTable.SQL_CREATE_VERSIONAPP;


/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_BL_RANDOM);
        db.execSQL(SQL_CREATE_VERSIONAPP);
        db.execSQL(SQL_CREATE_FUP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1:
                db.execSQL(SQL_CREATE_FUP);
            case 2:
                String prvTbName = "covid";
                if (getTableNames(db, prvTbName)) {
                    db.execSQL("ALTER TABLE " + prvTbName + " RENAME TO " + FormsTable.TABLE_NAME_FORMS);
                    db.execSQL(SQL_ALTER_FORMS01);
                }
            case 3:
                db.execSQL(SQL_ALTER_FORMS02);
                db.execSQL(SQL_ALTER_FUP02);
        }
    }

    private boolean getTableNames(SQLiteDatabase db, String name) {
        Cursor c = db.rawQuery(
                "SELECT name FROM sqlite_master WHERE type='table'", null);
        Asserts.checkNotNull(c);

        List<String> actual = new ArrayList<>();
        if (c.moveToFirst()) {
            while (!c.isAfterLast()) {
                actual.add(c.getString(0));
                c.moveToNext();
            }
        }
        c.close();

        if (actual.size() == 0) return false;
        return actual.contains(name);
    }


    public int syncBLRandom(JSONArray blList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(BLRandomTable.TABLE_NAME, null, null);

        int insertCount = 0;
        for (int i = 0; i < blList.length(); i++) {
            JSONObject jsonObjectCC;
            try {
                jsonObjectCC = blList.getJSONObject(i);

                BLRandom Vc = new BLRandom();
                Vc.Sync(jsonObjectCC);

                ContentValues values = new ContentValues();

                values.put(BLRandomTable.COLUMN_ID, Vc.get_ID());
                values.put(BLRandomTable.COLUMN_LUID, Vc.getLUID());
                values.put(BLRandomTable.COLUMN_STRUCTURE_NO, Vc.getStructure());
                values.put(BLRandomTable.COLUMN_FAMILY_EXT_CODE, Vc.getExtension());
                values.put(BLRandomTable.COLUMN_HH, Vc.getHh());
                values.put(BLRandomTable.COLUMN_EB_CODE, Vc.getEbcode());
                values.put(BLRandomTable.COLUMN_P_CODE, Vc.getpCode());
                values.put(BLRandomTable.COLUMN_RANDOMDT, Vc.getRandomDT());
                values.put(BLRandomTable.COLUMN_HH_HEAD, Vc.getHhhead());
                values.put(BLRandomTable.COLUMN_CONTACT, Vc.getContact());
                values.put(BLRandomTable.COLUMN_HH_SELECTED_STRUCT, Vc.getSelStructure());
                values.put(BLRandomTable.COLUMN_SNO_HH, Vc.getSno());

                long row = db.insert(BLRandomTable.TABLE_NAME, null, values);
                if (row != -1) insertCount++;

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return insertCount;
    }

    public Integer syncVersionApp(JSONObject VersionList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(VersionAppContract.VersionAppTable.TABLE_NAME, null, null);
        long count = 0;
        try {
            JSONObject jsonObjectCC = ((JSONArray) VersionList.get(VersionAppContract.VersionAppTable.COLUMN_VERSION_PATH)).getJSONObject(0);
            VersionApp Vc = new VersionApp();
            Vc.Sync(jsonObjectCC);

            ContentValues values = new ContentValues();

            values.put(VersionAppContract.VersionAppTable.COLUMN_PATH_NAME, Vc.getPathname());
            values.put(VersionAppContract.VersionAppTable.COLUMN_VERSION_CODE, Vc.getVersioncode());
            values.put(VersionAppContract.VersionAppTable.COLUMN_VERSION_NAME, Vc.getVersionname());

            count = db.insert(VersionAppContract.VersionAppTable.TABLE_NAME, null, values);
            if (count > 0) count = 1;

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return (int) count;
    }

    public Integer syncFUP(JSONArray FUPList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(FUPContract.FUPTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < FUPList.length(); i++) {
                JSONObject jsonObjectCC = FUPList.getJSONObject(i);

                FUP Vc = new FUP();
                Vc.Sync(jsonObjectCC);

                ContentValues values = new ContentValues();
                values.put(FUPContract.FUPTable.COLUMN_LUID, Vc.getLuid());
                values.put(FUPContract.FUPTable.COLUMN_SYSDATE, Vc.getSysdate());
                values.put(FUPContract.FUPTable.COLUMN_PID, Vc.getPid());
                values.put(FUPContract.FUPTable.COLUMN_PATIENT, Vc.getPatient());
                values.put(FUPContract.FUPTable.COLUMN_SEX, Vc.getSex());
                values.put(FUPContract.FUPTable.COLUMN_ISTATUS, Vc.getIstatus());
                values.put(FUPContract.FUPTable.COLUMN_S2Q7, Vc.getS2q7());
                values.put(FUPContract.FUPTable.COLUMN_HF, Vc.getHf());

                long row = db.insert(FUPContract.FUPTable.TABLE_NAME, null, values);
                if (row > 0) insertCount++;
            }

        } catch (Exception ignored) {
        } finally {
            db.close();
        }

        return insertCount;
    }

    public VersionApp getVersionApp() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                VersionAppTable._ID,
                VersionAppTable.COLUMN_VERSION_CODE,
                VersionAppTable.COLUMN_VERSION_NAME,
                VersionAppTable.COLUMN_PATH_NAME
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy = null;

        VersionApp allVC = new VersionApp();
        try {
            c = db.query(
                    VersionAppTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allVC.hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allVC;
    }

    public int syncUser(JSONArray userList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersTable.TABLE_NAME, null, null);
        int insertCount = 0;
        try {
            for (int i = 0; i < userList.length(); i++) {

                JSONObject jsonObjectUser = userList.getJSONObject(i);

                Users user = new Users();
                user.Sync(jsonObjectUser);
                ContentValues values = new ContentValues();

                values.put(UsersTable.COLUMN_USERNAME, user.getUserName());
                values.put(UsersTable.COLUMN_PASSWORD, user.getPassword());
                values.put(UsersTable.COLUMN_FULL_NAME, user.getFull_name());
                long rowID = db.insert(UsersTable.TABLE_NAME, null, values);
                if (rowID != -1) insertCount++;
            }

        } catch (Exception e) {
            Log.d(TAG, "syncUser(e): " + e);
            db.close();
        } finally {
            db.close();
        }
        return insertCount;
    }

    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersTable.TABLE_NAME + " WHERE " + UsersTable.COLUMN_USERNAME + "=? AND " + UsersTable.COLUMN_PASSWORD + "=?", new String[]{username, password});
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {

                if (mCursor.moveToFirst()) {
//                    MainApp.DIST_ID = mCursor.getString(mCursor.getColumnIndex(Users.UsersTable.ROW_USERNAME));
                }
                return true;
            }
        }
        return false;
    }

    public Long addForm(Form form) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_PROJECT_NAME, form.getProjectName());
        values.put(FormsTable.COLUMN_UID, form.get_UID());
        values.put(FormsTable.COLUMN_USERNAME, form.getUsername());
        values.put(FormsTable.COLUMN_SYSDATE, form.getSysdate());
        values.put(FormsTable.COLUMN_FORMDATE, form.getFormdate());
        values.put(FormsTable.COLUMN_FORMTYPE, form.getFormType());
        values.put(FormsTable.COLUMN_PID, form.getPid());
        values.put(FormsTable.COLUMN_S1Q0, form.getS1q0());
        values.put(FormsTable.COLUMN_S1Q1, form.getS1q1());
        values.put(FormsTable.COLUMN_S1Q2, form.getS1q2());
        values.put(FormsTable.COLUMN_S1Q3, form.getS1q3());
        values.put(FormsTable.COLUMN_S1Q4, form.getS1q4());
        values.put(FormsTable.COLUMN_S1Q5, form.getS1q5());
        values.put(FormsTable.COLUMN_S1Q6, form.getS1q6());
        values.put(FormsTable.COLUMN_SB, form.getsB());
        values.put(FormsTable.COLUMN_ISTATUS, form.getIstatus());
        values.put(FormsTable.COLUMN_ISTATUS96x, form.getIstatus96x());
        values.put(FormsTable.COLUMN_ENDINGDATETIME, form.getEndingdatetime());
        values.put(FormsTable.COLUMN_GPSLAT, form.getGpsLat());
        values.put(FormsTable.COLUMN_GPSLNG, form.getGpsLng());
        values.put(FormsTable.COLUMN_GPSDATE, form.getGpsDT());
        values.put(FormsTable.COLUMN_GPSACC, form.getGpsAcc());
        values.put(FormsTable.COLUMN_DEVICETAGID, form.getDevicetagID());
        values.put(FormsTable.COLUMN_DEVICEID, form.getDeviceID());
        values.put(FormsTable.COLUMN_APPVERSION, form.getAppversion());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsTable.TABLE_NAME_FORMS,
                FormsTable.COLUMN_NAME_NULLABLE,
                values);
        return newRowId;
    }

    public int updateFormID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_UID, MainApp.form.get_UID());

// Which row to update, based on the ID
        String selection = FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(MainApp.form.get_ID())};

        int count = db.update(FormsTable.TABLE_NAME_FORMS,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public Collection<Form> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<Form>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME_FORMS,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                allForms.add(form.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public Collection<Form> checkFormExist() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<Form>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME_FORMS,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                allForms.add(form.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public Collection<Form> getUnsyncedForms(int formType) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

        String whereClause = FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " == ''";
        String[] whereArgs = null;
        if (formType != 0) {
            if (formType == 1) {
                whereClause = "(" + FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " == '') AND (" + FormsTable.COLUMN_FORMTYPE + "=? OR " + FormsTable.COLUMN_FORMTYPE + " is null)";
                whereArgs = new String[]{String.valueOf(formType)};
            } else {
                whereClause = "(" + FormsTable.COLUMN_SYNCED + " is null OR " + FormsTable.COLUMN_SYNCED + " == '') AND " + FormsTable.COLUMN_FORMTYPE + "=?";
                whereArgs = new String[]{String.valueOf(formType)};
            }
        }
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME_FORMS,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allForms.add(new Form().Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public Collection<Form> getTodayForms(String sysdate) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_SYSDATE + " Like ? ";
        String[] whereArgs = new String[]{"%" + sysdate + " %"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME_FORMS,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                form.set_ID(c.getString(c.getColumnIndex(FormsTable.COLUMN_ID)));
                form.set_UID(c.getString(c.getColumnIndex(FormsTable.COLUMN_UID)));
                form.setUsername(c.getString(c.getColumnIndex(FormsTable.COLUMN_USERNAME)));
                form.setSysdate(c.getString(c.getColumnIndex(FormsTable.COLUMN_SYSDATE)));
                form.setFormdate(c.getString(c.getColumnIndex(FormsTable.COLUMN_FORMDATE)));
                String formValue = c.getString(c.getColumnIndex(FormsTable.COLUMN_FORMTYPE));
                form.setFormType(formValue == null ? "1" : formValue);
                form.setPid(c.getString(c.getColumnIndex(FormsTable.COLUMN_PID)));
                form.setS1q0(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q0)));
                form.setS1q1(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q1)));
                form.setS1q2(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q2)));
                form.setS1q3(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q3)));
                form.setS1q4(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q4)));
                form.setS1q5(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q5)));
                form.setS1q6(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q6)));
                form.setsB(c.getString(c.getColumnIndex(FormsTable.COLUMN_SB)));
                form.setIstatus(c.getString(c.getColumnIndex(FormsTable.COLUMN_ISTATUS)));
                form.setSynced(c.getString(c.getColumnIndex(FormsTable.COLUMN_SYNCED)));
                allForms.add(form);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public Collection<Form> getFormsByCluster(String cluster) {

        // String sysdate =  spDateT.substring(0, 8).trim()
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_PID + " = ? ";
        String[] whereArgs = new String[]{cluster};
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsTable.COLUMN_ID + " ASC";

        Collection<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME_FORMS,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                form.set_ID(c.getString(c.getColumnIndex(FormsTable.COLUMN_ID)));
                form.set_UID(c.getString(c.getColumnIndex(FormsTable.COLUMN_UID)));
                form.setSysdate(c.getString(c.getColumnIndex(FormsTable.COLUMN_SYSDATE)));
                form.setS1q0(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q0)));
                form.setS1q1(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q1)));
                form.setS1q2(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q2)));
                form.setPid(c.getString(c.getColumnIndex(FormsTable.COLUMN_PID)));
                form.setIstatus(c.getString(c.getColumnIndex(FormsTable.COLUMN_ISTATUS)));
                form.setSynced(c.getString(c.getColumnIndex(FormsTable.COLUMN_SYNCED)));
                allForms.add(form);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public ArrayList<Form> getUnclosedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;
        String whereClause = FormsTable.COLUMN_ISTATUS + " = ''";
        String[] whereArgs = null;
//        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable.COLUMN_ID + " ASC";
        ArrayList<Form> allForms = new ArrayList<>();
        try {
            c = db.query(
                    FormsTable.TABLE_NAME_FORMS,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Form form = new Form();
                form.set_ID(c.getString(c.getColumnIndex(FormsTable.COLUMN_ID)));
                form.set_UID(c.getString(c.getColumnIndex(FormsTable.COLUMN_UID)));
                form.setSysdate(c.getString(c.getColumnIndex(FormsTable.COLUMN_SYSDATE)));
                form.setS1q0(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q0)));
                form.setS1q1(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q1)));
                form.setS1q2(c.getString(c.getColumnIndex(FormsTable.COLUMN_S1Q2)));
                form.setPid(c.getString(c.getColumnIndex(FormsTable.COLUMN_PID)));
                form.setIstatus(c.getString(c.getColumnIndex(FormsTable.COLUMN_ISTATUS)));
                form.setSynced(c.getString(c.getColumnIndex(FormsTable.COLUMN_SYNCED)));
                allForms.add(form);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_ISTATUS, MainApp.form.getIstatus());
        values.put(FormsTable.COLUMN_ISTATUS96x, MainApp.form.getIstatus96x());
        values.put(FormsTable.COLUMN_ENDINGDATETIME, MainApp.form.getEndingdatetime());

        // Which row to update, based on the ID
        String selection = FormsTable.COLUMN_ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.get_ID())};

        return db.update(FormsTable.TABLE_NAME_FORMS,
                values,
                selection,
                selectionArgs);
    }

    //Get BLRandom data
    public BLRandom getHHFromBLRandom(String subAreaCode, String hh) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;

        String[] columns = {
                BLRandomTable.COLUMN_ID,
                BLRandomTable.COLUMN_LUID,
                BLRandomTable.COLUMN_STRUCTURE_NO,
                BLRandomTable.COLUMN_FAMILY_EXT_CODE,
                BLRandomTable.COLUMN_HH,
                BLRandomTable.COLUMN_P_CODE,
                BLRandomTable.COLUMN_EB_CODE,
                BLRandomTable.COLUMN_RANDOMDT,
                BLRandomTable.COLUMN_HH_SELECTED_STRUCT,
                BLRandomTable.COLUMN_CONTACT,
                BLRandomTable.COLUMN_HH_HEAD,
                BLRandomTable.COLUMN_SNO_HH
        };

        String whereClause = BLRandomTable.COLUMN_P_CODE + "=? AND " + BLRandomTable.COLUMN_HH + "=?";
        String[] whereArgs = new String[]{subAreaCode, hh};
        String groupBy = null;
        String having = null;

        String orderBy =
                BLRandomTable.COLUMN_ID + " ASC";

        BLRandom allBL = null;
        try {
            c = db.query(
                    BLRandomTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allBL = new BLRandom().hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allBL;
    }

    //Get FUP data
    public FUP getHHFromFUP(String pid) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;

        String[] columns = null;

        String whereClause = FUPContract.FUPTable.COLUMN_PID + "=?";
        String[] whereArgs = new String[]{pid};
        String groupBy = null;
        String having = null;

        String orderBy = FUPContract.FUPTable.COLUMN_LUID + " ASC";

        FUP allFUP = null;
        try {
            c = db.query(
                    FUPContract.FUPTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFUP = new FUP().HydrateFUP(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFUP;
    }

    //Get Form already exist
    public Form getFilledForm(String district, String refno) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = null;

//        String whereClause = "(" + FormsTable.COLUMN_ISTATUS + " is null OR " + FormsTable.COLUMN_ISTATUS + "='') AND " + FormsTable.COLUMN_CLUSTERCODE + "=? AND " + FormsTable.COLUMN_HHNO + "=?";
        String whereClause = FormsTable.COLUMN_S1Q1 + "=? AND " + FormsTable.COLUMN_PID + "=?";
        String[] whereArgs = {district, refno};
        String groupBy = null;
        String having = null;
        String orderBy = FormsTable._ID + " ASC";
        Form allForms = null;
        try {
            c = db.query(
                    FormsTable.TABLE_NAME_FORMS,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allForms = new Form().Hydrate(c);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allForms;
    }

    //Generic update FormColumn
    public int updatesFormColumn(String column, String value) {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(column, value);

        String selection = FormsTable._ID + " =? ";
        String[] selectionArgs = {String.valueOf(MainApp.form.get_ID())};

        return db.update(FormsTable.TABLE_NAME_FORMS,
                values,
                selection,
                selectionArgs);
    }


    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"message"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(Query, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (Exception sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }

    //Generic Un-Synced Forms
    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsTable.COLUMN_SYNCED, true);
        values.put(FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsTable.COLUMN_ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsTable.TABLE_NAME_FORMS,
                values,
                where,
                whereArgs);
    }
}