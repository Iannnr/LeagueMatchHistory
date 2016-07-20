package portfolio.ian.com.leaguematchhistory.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import portfolio.ian.com.leaguematchhistory.*;
import portfolio.ian.com.leaguematchhistory.Adapters.*;
import portfolio.ian.com.leaguematchhistory.Constants.*;
import portfolio.ian.com.leaguematchhistory.DataHandling.*;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.*;


public class matchHistoryActivity extends FragmentActivity {
    String matchHistoryURL, username, region, champName;
    public ViewPager tabbedView;
    public List<Fragment> listFragments = new ArrayList<>();
    ArrayList<String> jsonData = new ArrayList<>();
    Boolean internetConnection;
    httpConnect parseJSON = new httpConnect();
    ImageView headerPhoto;
    APIKeyEncryption APIEncryption = new APIKeyEncryption();
    OfflineDatabaseAdapter offlineDbHelper;
    OfflineRuneDatabaseAdapter offlineRuneDbHelper;
    ChampionSplashHeader championHeader = new ChampionSplashHeader();
    int position;
    private String APIKey = "";
    static Boolean backgroundLoaded = false;
    static BitmapDrawable background;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_history);

        SharedPreferences prefs = getSharedPreferences("userData", Context.MODE_PRIVATE);
        offlineDbHelper = new OfflineDatabaseAdapter(this);
        offlineRuneDbHelper = new OfflineRuneDatabaseAdapter(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            matchHistoryURL = extras.getString("matchHistoryURL").split(" ")[0];
            position = extras.getInt("listPosition");
            username = prefs.getString("user", username);
            region = extras.getString("region");
            champName = extras.getString("champion");
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //DisplayMetrics metrics = new DisplayMetrics();
        //headerPhoto.setMaxHeight(getWindowManager().getDefaultDisplay().getWidth());
        headerPhoto = (ImageView) findViewById(R.id.imageView);
        relativeLayout = (RelativeLayout) findViewById(R.id.matchHistoryLayout);
        //setLayoutBackground(relativeLayout);

        tabbedView = (ViewPager) findViewById(R.id.view_pager);
        //tabbedView.setBackground(championHeader.champNamePhoto(getResources(), champName));

        new AsyncTaskParseJSON().execute();
        String test = StringUtils.capitalize(championHeader.getChampionSkinName(champName.replace(" ", "")));
        new DownloadImage().execute("http://ddragon.leagueoflegends.com/cdn/img/champion/splash/" + test + ".jpg");
    }

    void setLayoutBackground(RelativeLayout relativeLayout, BitmapDrawable bitmap) {
        try {

            if (getWindowManager().getDefaultDisplay().getRotation() == Surface.ROTATION_90
                    || getWindowManager().getDefaultDisplay().getRotation() == Surface.ROTATION_270) {
                if (!backgroundLoaded) {
                    //background = new BitmapDrawable(BitmapDecoding.decodeSampledBitmapFromResource(getResources(), championHeader.champNamePhoto(getApplicationContext(), champName.replace(" ", "")), getWindowManager().getDefaultDisplay().getWidth(), getWindowManager().getDefaultDisplay().getHeight()));
                    relativeLayout.setBackground(bitmap);
                    headerPhoto.setBackground(null);
                    backgroundLoaded = true;
                } else {
                    relativeLayout.setBackground(bitmap);
                }
            } else if (getWindowManager().getDefaultDisplay().getRotation() == Surface.ROTATION_0
                    || getWindowManager().getDefaultDisplay().getRotation() == Surface.ROTATION_180) {
                //background = new BitmapDrawable(bitmap);
                relativeLayout.setBackground(null);
                headerPhoto.setAdjustViewBounds(true);

                headerPhoto.setImageDrawable(bitmap);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void onPause() {
        super.onPause();
    }

    private Boolean getInternetConnection(Context mContext) {
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Boolean internetConnection = activeNetworkInfo != null && activeNetworkInfo.isConnected();

        return internetConnection;
    }

    public class AsyncTaskParseJSON extends AsyncTask<String, String, ArrayList<String>> {
        //ensures the fragment is only loaded once
        Boolean loaded = false;

        @Override
        protected ArrayList<String> doInBackground(String... params) {

            if (internetConnection) {
                jsonData.add(parseJSON.callAPI(matchHistoryURL));
            } else {
            }
            return jsonData;
        }

        @Override
        protected void onPreExecute() {
            APIKey = APIEncryption.decryptAPIKey(matchHistoryActivity.this, region);
            ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            internetConnection = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            if (!internetConnection) {
                if (Match.jsonData.isEmpty()) {
                    for (int i = 0; i < offlineDbHelper.getSize(); i++) {
                        Match.jsonData.add(offlineDbHelper.getAllData().get(i));
                    }
                } else {

                }
            }
        }

        @Override
        protected void onPostExecute(ArrayList<String> s) {
            try {
                if (!loaded) {

                    listFragments.add(new LolStats());

                    LolStats LS = new LolStats();
                    String individualGame = Match.jsonData.get(position);
                    LS.sortJSONData(individualGame, username, getApplicationContext(), position);
                    Participant partic = new Participant();
                    JSONObject jOGame = new JSONObject(individualGame);
                    JSONArray runeArray = (jOGame.getJSONArray("runes"));
                    for (int i = 0; i < runeArray.length(); i++) {
                        Rune rune = new Rune(runeArray.getJSONObject(i).getLong("runeId"),
                                runeArray.getJSONObject(i).getLong("rank"), null, null);
                        partic.runes.add(rune);
                    }
                    new AsyncTaskParseRuneData().execute(partic.runes);

                    listFragments.add(new LolItems());
                    listFragments.add(new LolRunes());

                    loaded = true;

                    FragmentPagerAdapter fragmentAdapter = new FragmentPagerAdapter(
                            getSupportFragmentManager(), listFragments);
                    tabbedView.setAdapter(fragmentAdapter);

                }
            } catch (Exception e) {
                e.getMessage();
                ToastMessage.message(getApplicationContext(), e.getMessage());
            }
        }
    }

    private class DownloadImage extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Bitmap doInBackground(String... URL) {

            String imageURL = URL[0];

            Bitmap bitmap = null;
            try {
                // Download Image from URL
                InputStream input = new java.net.URL(imageURL).openStream();
                // Decode Bitmap
                bitmap = BitmapFactory.decodeStream(input);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            // Set the bitmap into ImageView
            BitmapDrawable resultAsDrawable = new BitmapDrawable(result);
            setLayoutBackground(relativeLayout, resultAsDrawable);
        }
    }

    public class AsyncTaskParseRuneData extends AsyncTask<ArrayList<Rune>, String, String> {

        String runeJSON;

        @Override
        protected String doInBackground(ArrayList<Rune>... params) {
            try {
                clearArrayList();
                int count = 0, max = 30;
                if (getInternetConnection(matchHistoryActivity.this)) {
                    for (int i = 0; count < max; i++) {
                        runeJSON = parseJSON.callAPI("https://global.api.pvp.net/api/lol/static-data/euw/v1.2/rune/"
                                + params[0].get(i).runeId + "?api_key=" + APIKey);

                        JSONObject jsonRune = new JSONObject(runeJSON);
                        Rune mRunes = new Rune(params[0].get(i).runeId, params[0].get(i).rank,
                                jsonRune.getString("name"), jsonRune.getString("description"));
                        Rune.runes.add(mRunes);
                        //makes sure that only 30 runes get added
                        count += Integer.parseInt(params[0].get(i).rank.toString());
                    }
                    offlineRuneDbHelper.resetData();
                    for (int i = 0; i < Rune.runes.size(); i++) {
                        offlineRuneDbHelper.insertData("runeId: " + Rune.runes.get(i).runeId + " rank: "
                                + Rune.runes.get(i).rank + " name: " + Rune.runes.get(i).name
                                + " description: " + Rune.runes.get(i).description);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        void clearArrayList() {
            Rune.runes = null;
            Rune.runes = new ArrayList<>();
        }

        @Override
        protected void onPostExecute(String s) {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_match_history, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}





