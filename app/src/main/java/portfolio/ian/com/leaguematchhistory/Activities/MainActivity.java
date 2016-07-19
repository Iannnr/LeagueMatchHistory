package portfolio.ian.com.leaguematchhistory.Activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import portfolio.ian.com.leaguematchhistory.*;
import portfolio.ian.com.leaguematchhistory.Constants.*;
import portfolio.ian.com.leaguematchhistory.DataHandling.*;

import java.util.ArrayList;

public class MainActivity extends Activity {

    TextView progressText;
    int progressStatus = 0;
    private Handler handler = new Handler();
    ProgressBar mProgressBar;
    ListView list;
    Boolean executed = false;
    Intent facebook,twitter, matchHistory, camera, sensors, other;
    APIKeyEncryption APIEncryption;
    BitmapDecoding decodeBitmap = new BitmapDecoding();
    final int MAXPROGRESS = 35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);
        list = (ListView) findViewById(R.id.listView);
        progressText = (TextView) findViewById(R.id.textView5);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar1);

        matchHistory = new Intent(this, Summoner.class);
        APIEncryption = new APIKeyEncryption();
        //sensors = new Intent(this, Sensors.class);
        //showMenu();
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        BitmapDrawable background = new BitmapDrawable(BitmapDecoding.decodeSampledBitmapFromResource(getResources(), R.drawable.background, 500, 500));
        relativeLayout.setBackground(background);

        mProgressBar.setVisibility(View.VISIBLE);
        mProgressBar.bringToFront();
        mProgressBar.setMax(MAXPROGRESS);
        new Thread(new Runnable() {
            public void run() {
                //for (progressStatus = 0; progressStatus < 50; progressStatus++)
                while (progressStatus <= mProgressBar.getMax())
                {
                    progressStatus += 1;
                    // Update the progress bar and display the
                    //current value in the text view
                    handler.post(new Runnable() {
                        public void run() {
                            mProgressBar.setProgress(progressStatus);
                            if (progressStatus >= 1) {
                                if (!executed) {
                                    new encryptAsyncTask().execute();
                                    executed = true;
                                }
                            }
                            if (progressStatus >= mProgressBar.getMax()) {
                                mProgressBar.setVisibility(View.GONE);
                                //startActivity(matchHistory);
                            }
                        }
                    });
                    try {
                        // Sleep for X milliseconds.
                        //Just to display the progress slowly
                        Thread.sleep(100);
                    } catch (InterruptedException d) {
                    }
                }

            }
        }).start();

    }
    void showMenu()
    {
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Click ListItem Number " + position, Toast.LENGTH_LONG)
                        .show();
            }
        });

        String[] activities = new String[] { "Facebook", "Twitter", "Match History", "Camera", "Sensors", "Other","Other","Other","Other","Other","Other","Other",};

        final ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < activities.length; ++i) {
            arrayList.add(activities[i]);
        }
        final ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = String.valueOf(parent.getItemIdAtPosition(position));
                view.animate().setDuration(100).alpha(1)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                //ToastMessage.message(getApplicationContext(), item);
                                switch (item) {
                                    //case "Facebook":
                                    case "0":
                                        startActivity(facebook);
                                        break;
                                    case "1":
                                        startActivity(twitter);
                                        break;
                                    case "2":
                                        startActivity(matchHistory);
                                        break;
                                    case "3":
                                        startActivity(camera);
                                        break;
                                    case "4":
                                        startActivity(sensors);
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
            }

        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_page, menu);
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

    private class encryptAsyncTask extends AsyncTask<String, String, String>
    {

        @Override
        protected String doInBackground(String... params) {
            APIEncryption.encryptAPIKey(getApplicationContext(), "", "na");
            APIEncryption.encryptAPIKey(getApplicationContext(), "", "euw");
            return null;
        }

        @Override
        protected void onPreExecute()
        {
            progressText.setText("Encypting API keys...");
        }

        @Override
        protected void onPostExecute(String s)
        {
            progressText.setVisibility(View.GONE);
            startActivity(matchHistory);
        }
    }
}

