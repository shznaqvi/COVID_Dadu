package edu.aku.hassannaqvi.covid_dadu.contracts;


import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

public class FUPContract {

    private static final String TAG = "FUP_CONTRACT";

    public static String CONTENT_AUTHORITY = "edu.aku.hassannaqvi.covid_dadu";


    public static abstract class FUPTable implements BaseColumns {

        public static final String TABLE_NAME = "covidfup";

        public static final String _ID = "_id";
        public static final String COLUMN_LUID = "luid";
        public static final String COLUMN_SYSDATE = "sysdate";
        public static final String COLUMN_PID = "pid";
        public static final String COLUMN_PATIENT = "patient";
        public static final String COLUMN_SEX = "sex";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_S2Q7 = "s2q7";

        public static String PATH = "fup";

        public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH;
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH;
        public static Uri CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY)
                .buildUpon().appendPath(PATH).build();

        public static String getMovieKeyFromUri(Uri uri) {
            return uri.getPathSegments().get(1);
        }

        public static Uri buildUriWithId(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }
}