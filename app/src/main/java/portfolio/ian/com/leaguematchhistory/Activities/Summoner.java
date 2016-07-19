package portfolio.ian.com.leaguematchhistory.Activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;

import portfolio.ian.com.leaguematchhistory.*;
import portfolio.ian.com.leaguematchhistory.Adapters.*;
import portfolio.ian.com.leaguematchhistory.Constants.*;
import portfolio.ian.com.leaguematchhistory.DataHandling.*;

import java.util.ArrayList;

public class Summoner extends Activity {

    DatabaseAdapter dbHelper;
    int maxResults = 10;
    String chosenResults, region, errorMessage;
    ArrayList<String> resultsValues = new ArrayList<>(), regions = new ArrayList<>();
    String[] searchRegions = { "EUW", "NA" };
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

    void changeViewElements(int visibility)
    {
        if (visibility == 4) {
            loadingBar.setVisibility(View.VISIBLE);
        }
        else
        {
            loadingBar.setVisibility(View.INVISIBLE);
        }
        mainLogo.setVisibility(visibility);
        resultsSpinner.setVisibility(visibility);
        regionSpinner.setVisibility(visibility);
        usernameText.setVisibility(visibility);
        submitButton.setVisibility(visibility);

    }

    void populateSpinners()
    {
        for (int i = 1; i <= maxResults; i++)
        {
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

        for (int i = 0; i < searchRegions.length; i++)
        {
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
            if (usernameText.getText().toString().isEmpty()) {
                ToastMessage.message(getApplicationContext(), "Username too short!");
            }
            //Check if EditText has even had its values changed...
            if (usernameText.getText().toString().contains("Username")) {
                ToastMessage.message(this, "Username must be changed from original!");
            }
            if (!usernameText.getText().toString().isEmpty() && !usernameText.getText().toString().contains("Username"))
            {
                editor.apply();
                final Intent showResults = new Intent(this, ResultsDisplayNew.class);

                if (dbHelper.getAllData().contains(usernameText.getText())) {

                }
                else {
                    long id = dbHelper.insertData(username.trim());
                }
                showResults.putExtra("resultsVariable", chosenResults).putExtra("region", region);
                startActivity(showResults);
            }
        }
        catch (Exception e) {
            ToastMessage.message(this, "Error in name input!");
        }
    }

    public void showPreviousNames(View view)
    {
        String data = dbHelper.getAllData();
        ToastMessage.message(this, "Previous entries\n" + data);
    }

    private class decryptAsyncTask extends AsyncTask<String, String, String>
    {

        @Override
        protected String doInBackground(String... params) {
            //populateSpinners();
            //encryptAPIKey();
            return null;
        }



        @Override
        protected void onPostExecute(String s)
        {
            changeViewElements(View.VISIBLE);

        }
    }

}



