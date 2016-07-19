package portfolio.ian.com.leaguematchhistory.DataHandling;

import android.content.Context;
import android.content.SharedPreferences;

import se.simbio.encryption.Encryption;

/**
 * Created by Ian on 04/07/2016.
 */
public class APIKeyEncryption {

    public static final String SHAREDPREFFILE = "APIKEY", DEFVALUE = "";
    static String encryptedKey = "";

    public void encryptAPIKey(Context mContext, String key, String prefFile)
    {
        Encryption encryption = Encryption.getDefault("TokenEncryption", "Salt", new byte[16]);
        SharedPreferences prefs = mContext.getSharedPreferences(prefFile, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        encryptedKey = encryption.encryptOrNull(key);
        editor.putString(prefFile, encryptedKey);
        editor.apply();
    }

    public void finalChoice(Context mContext, String prefFile)
    {
        SharedPreferences prefs = mContext.getSharedPreferences(prefFile, Context.MODE_PRIVATE);
        String encryptedAPIKey = prefs.getString(prefFile, DEFVALUE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(prefFile, encryptedAPIKey);
        editor.apply();
    }

    public String decryptAPIKey(Context mContext, String prefFile)
    {
        String APIkey;
        Encryption encryption = Encryption.getDefault("TokenEncryption", "Salt", new byte[16]);
        SharedPreferences prefs = mContext.getSharedPreferences(prefFile, Context.MODE_PRIVATE);
        String encryptedAPIKey = prefs.getString(prefFile, DEFVALUE);
        APIkey = encryption.decryptOrNull(encryptedAPIKey);

        return APIkey;
    }

}
