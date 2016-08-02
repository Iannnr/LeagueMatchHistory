package portfolio.ian.com.leaguematchhistory.Activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

import portfolio.ian.com.leaguematchhistory.Adapters.DatabaseAdapter;
import portfolio.ian.com.leaguematchhistory.Constants.BitmapDecoding;
import portfolio.ian.com.leaguematchhistory.Constants.ToastMessage;
import portfolio.ian.com.leaguematchhistory.DataHandling.APIKeyEncryption;
import portfolio.ian.com.leaguematchhistory.R;

public class Summoner extends Activity {

    DatabaseAdapter dbHelper;
    int maxResults = 10;
    String chosenResults, region, errorMessage;
    ArrayList<String> resultsValues = new ArrayList<>(), regions = new ArrayList<>();
    String[] searchRegions = {"EUW", "NA"};
    Spinner resultsSpinner, regionSpinner;
    APIKeyEncryption APIEncryption = new APIKeyEncryption();
    ProgressBar loadingBar;
    EditText usernameText;
    Button submitButton;
    ImageView mainLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            errorMessage = extras.getString("Error");
            ToastMessage.message(this, errorMessage);
        }

        dbHelper = new DatabaseAdapter(this);
        resultsSpinner = (Spinner) findViewById(R.id.spinner);
        regionSpinner = (Spinner) findViewById(R.id.spinner2);
        loadingBar = (ProgressBar) findViewById(R.id.progressBar);
        usernameText = (EditText) findViewById(R.id.editText);
        loadingBar.setVisibility(View.VISIBLE);
        submitButton = (Button) findViewById(R.id.submitButton);
        mainLogo = (ImageView) findViewById(R.id.lolImageView);
        BitmapDrawable background = new BitmapDrawable(BitmapDecoding.decodeSampledBitmapFromResource(getResources(), R.drawable.lol_logo, 889, 500));
        mainLogo.setImageDrawable(background);
        changeViewElements(View.INVISIBLE);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        populateSpinners();
        //new decryptAsyncTask().execute();
    }

    void changeViewElements(int visibility) {
        if (visibility == 4) {
            loadingBar.setVisibility(View.VISIBLE);
        } else {
            loadingBar.setVisibility(View.INVISIBLE);
        }
        mainLogo.setVisibility(visibility);
        resultsSpinner.setVisibility(visibility);
        regionSpinner.setVisibility(visibility);
        usernameText.setVisibility(visibility);
        submitButton.setVisibility(visibility);

    }

    void populateSpinners() {
        for (int i = 1; i <= maxResults; i++) {
            resultsValues.add(String.valueOf(i));
        }

        ArrayAdapter<String> resultsAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, resultsValues);

        resultsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        resultsSpinner.setAdapter(resultsAdapter);

        resultsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                chosenResults = parent.getItemAtPosition(pos).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        for (int i = 0; i < searchRegions.length; i++) {
            regions.add(searchRegions[i]);
        }

        ArrayAdapter<String> regionAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, regions);

        regionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        regionSpinner.setAdapter(regionAdapter);
        region = regionSpinner.getItemAtPosition(0).toString();
        new decryptAsyncTask().execute();
        regionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                region = parent.getItemAtPosition(pos).toString();
                APIEncryption.finalChoice(getApplicationContext(), region.toLowerCase());
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    public void submitButtonClick(final View view) {
        //get input text from EditText field

        final String username = usernameText.getText().toString();


        //error handling for saving to Shared preferences
        try {
            final SharedPreferences userInfo = getSharedPreferences("userData", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = userInfo.edit();
            //put the values of the EditText widget name into the shared preferences file
            editor.putString("user", usernameText.getText().toString().trim());

            //check if EditText is empty
            if (!usernameText.getText().toString().isEmpty() && !usernameText.getText().toString().contains("Username")) {
                editor.apply();
                final Intent showResults = new Intent(this, ResultsDisplayNew.class);

                if (dbHelper.getAllData().contains(StringUtils.capitalize(StringUtils.lowerCase(username.trim())))) {

                } else {
                    long id = (dbHelper.insertData(StringUtils.capitalize(StringUtils.lowerCase(username.trim()))));
                }
                showResults.putExtra("resultsVariable", chosenResults).putExtra("region", region);
                startActivity(showResults);
            } else {
                ToastMessage.message(getApplicationContext(), "Invalid username!");
            }
        } catch (Exception e) {
            ToastMessage.message(this, "Error in name input!");
        }
    }

    public void showPreviousNames(View view) {
        String data = dbHelper.getAllData();
        ToastMessage.message(this, "Previous entries\n" + data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_results_display, menu);
        menu.add("Delete database");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == 0) {
            new AlertDialog.Builder(Summoner.this)
                    .setTitle("Remove All Previous Entries?")
                    .setMessage("By selecting OK all previously saved entries to the database" +
                            "will be deleted and irretrievable, do you wish to continue?")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            ToastMessage.message(Summoner.this, dbHelper.deleteAllEntries());
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .show();
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class decryptAsyncTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            //populateSpinners();
            //encryptAPIKey();
            return null;
        }


        @Override
        protected void onPostExecute(String s) {
            changeViewElements(View.VISIBLE);

        }
    }

}



