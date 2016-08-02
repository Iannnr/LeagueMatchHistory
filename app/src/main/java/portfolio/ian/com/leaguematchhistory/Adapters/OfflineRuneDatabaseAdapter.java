package portfolio.ian.com.leaguematchhistory.Adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class OfflineRuneDatabaseAdapter {

    databaseHelper dbHelper;

    public OfflineRuneDatabaseAdapter(Context context) {
        dbHelper = new databaseHelper(context);
    }

    public long insertData(String data) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(databaseHelper.NAME, data);
        long id = db.insert(databaseHelper.TABLE_NAME, null, contentValues);
        db.close();
        return id;
    }

    public void resetData() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        String[] columns = {dbHelper.UID, dbHelper.NAME};
        Cursor cursor = db.query(databaseHelper.TABLE_NAME, columns, null, null, null, null, null);
        while (cursor.moveToNext()) //while there are fields in database, loop through to show all saved names
        {
            dbHelper.onUpgrade(db, databaseHelper.DATABASE_Version, databaseHelper.DATABASE_Version + 1);
        }
    }

    public ArrayList<String> getAllData() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ArrayList<String> data = new ArrayList<>();

        //select _id, Name FROM myUsernameTable
        String[] columns = {dbHelper.UID, dbHelper.NAME};
        Cursor cursor = db.query(databaseHelper.TABLE_NAME, columns, null, null, null, null, null);
        while (cursor.moveToNext()) //while there are fields in database, loop through to show all saved names
        {
            String name = cursor.getString(1);
            data.add(name);
        }
        return data;
    }

    public int getSize() {
        //int size = 0;
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String[] columns = {dbHelper.UID, dbHelper.NAME};
        Cursor cursor = db.query(databaseHelper.TABLE_NAME, columns, null, null, null, null, null);
        //size = cursor.getCount();
        return cursor.getCount();
    }

    //Inner class so that
    //Database parameters
    static class databaseHelper extends SQLiteOpenHelper {
        private static final String DATABASE_NAME = "myOfflineRuneDatabase";
        private static final String TABLE_NAME = "myOfflineRuneTable";
        private static final int DATABASE_Version = 1;
        private static final String UID = "_id";
        private static final String NAME = "Data"; //Only field needed to be saved
        private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + UID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + " VARCHAR(65535));"; //max of 30 characters will be saved to database even though maximum in game name is 16.
        private static final String DROP_TABLE = "DROP TABLE  IF EXISTS " + TABLE_NAME;
        private static final String QUERY_TABLE = "SELECT " + UID + " + NAME FROM " + TABLE_NAME + "";
        private Context context;

        public databaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_Version);
            this.context = context;
            //ToastMessage.message(context, "Constructor called!");
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE); //if onCreate statement is changed, change version number
                //ToastMessage.message(context, "Offline database created!");
            } catch (SQLiteException e) {

            }
        }

        //Let the user know that a change has been made to database including new rows/columns/names
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                db.execSQL(DROP_TABLE); //drop/remove old table
                onCreate(db); //create new table using updated parameters
                //ToastMessage.message(context, "Changes to database has been made!");
            } catch (SQLException e) {
                //add toast message
            }
        }
    }
}
