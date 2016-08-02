package portfolio.ian.com.leaguematchhistory.Adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import portfolio.ian.com.leaguematchhistory.Constants.ToastMessage;

/**
 * Created by Ian on 03/12/2015.
 */


public class DatabaseAdapter {
    databaseHelper dbHelper;

    public DatabaseAdapter(Context context) {
        dbHelper = new databaseHelper(context);
    }

    public long insertData(String name) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(databaseHelper.NAME, name);
        long id = db.insert(databaseHelper.TABLE_NAME, null, contentValues);
        db.close();
        return id;
    }

    public String getAllData() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        //select _id, Name FROM myUsernameTable
        String[] columns = {dbHelper.UID, dbHelper.NAME};
        Cursor cursor = db.query(databaseHelper.TABLE_NAME, columns, null, null, null, null, null);
        StringBuffer stringBuffer = new StringBuffer();
        while (cursor.moveToNext()) //while there are fields in database, loop through to show all saved names
        {
            int columnID = cursor.getInt(0);
            String name = cursor.getString(1);
            stringBuffer.append(columnID + " " + name + "\n");
        }
        return stringBuffer.toString();
    }

    public String deleteAllEntries() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.execSQL(dbHelper.DROP_TABLE); //drop/remove old table
        dbHelper.onCreate(db); //create new table using updated parameters
        return "All entries deleted";
    }

    //Inner class so that
    //Database parameters
    static class databaseHelper extends SQLiteOpenHelper {
        private static final String DATABASE_NAME = "myUsernamesDatabase";
        private static final String TABLE_NAME = "myUsernamesTable";
        private static final int DATABASE_Version = 9; //Version 7 had to be used on Home PC, would it be different for lab machines?
        private static final String UID = "_id";
        private static final String NAME = "Username"; //Only field needed to be saved
        private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + UID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + " VARCHAR(30));"; //max of 30 characters will be saved to database even though maximum in game name is 16.
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
                //ToastMessage.message(context, "New database created!");
            } catch (SQLiteException e) {

            }
        }

        //Let the user know that a change has been made to database including new rows/columns/names
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                db.execSQL(DROP_TABLE); //drop/remove old table
                onCreate(db); //create new table using updated parameters
                ToastMessage.message(context, "Change to database has been made!");
            } catch (SQLException e) {
                //add toast message
            }
        }
    }

}