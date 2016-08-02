package portfolio.ian.com.leaguematchhistory.Activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling.Match;
import portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling.SummonerStats;
import portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling.gameStats;
import portfolio.ian.com.leaguematchhistory.Adapters.OfflineDatabaseAdapter;
import portfolio.ian.com.leaguematchhistory.Constants.Participant;
import portfolio.ian.com.leaguematchhistory.Constants.ToastMessage;
import portfolio.ian.com.leaguematchhistory.DataHandling.APIKeyEncryption;
import portfolio.ian.com.leaguematchhistory.DataHandling.ChampionList;
import portfolio.ian.com.leaguematchhistory.DataHandling.TinyDB;
import portfolio.ian.com.leaguematchhistory.DataHandling.httpConnect;
import portfolio.ian.com.leaguematchhistory.R;

import static portfolio.ian.com.leaguematchhistory.Constants.Constants.FIFTH_COLUMN;
import static portfolio.ian.com.leaguematchhistory.Constants.Constants.FIRST_COLUMN;
import static portfolio.ian.com.leaguematchhistory.Constants.Constants.FOURTH_COLUMN;
import static portfolio.ian.com.leaguematchhistory.Constants.Constants.SECOND_COLUMN;
import static portfolio.ian.com.leaguematchhistory.Constants.Constants.SIXTH_COLUMN;
import static portfolio.ian.com.leaguematchhistory.Constants.Constants.THIRD_COLUMN;

public class ResultsDisplayNew extends Activity {

    public ArrayList<Match> matchHistory = new ArrayList<>();
    private ArrayList<HashMap<String, String>> listHash;
    ArrayList<String> matchID, matchHistoryIDs, matchHistoryText;
    ListViewAdapter newAdapter;
    private String username, region = "", APIKey = "", summonerID = "", URLUsername = "", matchInformationURL;
    int startResults = 0, chosenResults = 0;
    Intent matchHistoryActivity;
    Boolean internetConnection;
    ChampionList champList = new ChampionList();
    APIKeyEncryption APIEncryption = new APIKeyEncryption();
    httpConnect jParser;
    TinyDB tinyDB;
    ProgressBar loadingSpinner;
    OfflineDatabaseAdapter offlineDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_display_new2);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        loadingSpinner = (ProgressBar) findViewById(R.id.progressBar);
        loadingSpinner.setVisibility(View.VISIBLE);

        offlineDbHelper = new OfflineDatabaseAdapter(this);
        tinyDB = new TinyDB(getApplicationContext());

        SharedPreferences prefs = getSharedPreferences("userData", Context.MODE_PRIVATE);

        matchHistoryActivity = new Intent(this, portfolio.ian.com.leaguematchhistory.Activities.matchHistoryActivity.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            chosenResults = Integer.valueOf(extras.getString("resultsVariable"));
            region = extras.getString("region").toLowerCase();
            username = prefs.getString("user", username);
            URLUsername = prefs.getString("user", username).replace(" ", "%20");
        }

        Match.jsonData.clear();
        matchHistory.clear();
        SummonerStats.fullGameJson.clear();
        populateFirstRowOfList();

        if (!getInternetStatus(getApplicationContext())) {

            try {
                Match.jsonData.clear();
                new AlertDialog.Builder(ResultsDisplayNew.this)
                        .setTitle("No Internet Connection Detected")
                        .setMessage("Would you like to load data from cache?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                int size = offlineDbHelper.getSize();
                                for (int i = 0; i < size; i++) {
                                    Match.jsonData.add(offlineDbHelper.getAllData().get(i));
                                }
                                //for (int i = 0; i < Match.jsonData.size(); i++)

                                displayGameDetails();
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            //execute JSON parsing Asynchronously
            new AsyncTaskParseJSON().execute();
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();

    }


    private void populateFirstRowOfList() {
        listHash = new ArrayList<>();
        HashMap<String, String> temp = new HashMap<>();
        temp.put(FIRST_COLUMN, "Level");
        temp.put(SECOND_COLUMN, "Champion");
        temp.put(THIRD_COLUMN, "Win/Loss");
        temp.put(FOURTH_COLUMN, "Queue");
        temp.put(FIFTH_COLUMN, "KDA");
        temp.put(SIXTH_COLUMN, "Gold");
        listHash.add(temp);
    }


    private void displayGameDetails() {
        //Once onPostExecute is called, populate all textviews with their information, there must be a better way of doing this..

        final ListView list = (ListView) findViewById(R.id.listView2);
        list.setVisibility(View.VISIBLE);
        loadingSpinner.setVisibility(View.INVISIBLE);
        if (!getInternetStatus(getApplicationContext())) {
            try {
                for (int i = 0; i < Match.jsonData.size(); i++) {
                    JSONObject jO = new JSONObject(Match.jsonData.get(i));
                    //Save information from matchInformation API call
                    if (Match.jsonData != null) {

                        //search the "stats" object in the request to find all the relevant variables to use
                        Participant partic = new Participant();
                        Match m = new Match();
                        partic.kills = Long.valueOf(jO.getJSONObject("stats").getString("kills"));
                        partic.deaths = Long.valueOf(jO.getJSONObject("stats").getString("deaths"));
                        partic.assists = Long.valueOf(jO.getJSONObject("stats").getString("assists"));
                        partic.championId = Integer.parseInt(jO.getString("championId"));
                        partic.champLevel = Long.valueOf(jO.getJSONObject("stats").getString("champLevel"));
                        partic.goldEarned = Long.valueOf(jO.getJSONObject("stats").getString("goldEarned"));
                        partic.winner = jO.getJSONObject("stats").getString("winner");
                        partic.changeWinner();
                        partic.champName = champList.championIDToName(partic.championId);
                        gameStats.champName = partic.champName;
                        //Match.jsonData = jO.toString();
                        m.mapName = Match.jsonData.get(i).split("\"map\":")[1].split(",")[0];
                        m.queueType = StringUtils.capitalize(Match.jsonData.get(i).split("\"queue\":")[1]);
                        m.matchURL = Match.jsonData.get(i).split("\"matchURL\":")[1].split(",")[0];
                        m.participant = partic;
                        matchHistory.add(m);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        listHash.clear();
        populateFirstRowOfList();

        for (int i = 0; i < matchHistory.size(); i++) {
            HashMap<String, String> temp = new HashMap<>();

            temp.put(FIRST_COLUMN, Long.toString(matchHistory.get(i).participant.champLevel));
            temp.put(SECOND_COLUMN, matchHistory.get(i).participant.champName);
            temp.put(THIRD_COLUMN, matchHistory.get(i).participant.winner);
            temp.put(FOURTH_COLUMN, matchHistory.get(i).queueType);
            temp.put(FIFTH_COLUMN, Long.toString(matchHistory.get(i).participant.kills) +
                    " / " + Long.toString(matchHistory.get(i).participant.deaths) +
                    " / " + Long.toString(matchHistory.get(i).participant.assists));
            temp.put(SIXTH_COLUMN, Long.toString(matchHistory.get(i).participant.goldEarned));

            listHash.add(temp);
        }

        HashMap<String, String> temp = new HashMap<>();
        temp.put(FOURTH_COLUMN, "Load more results");
        listHash.add(temp);


        newAdapter = new ListViewAdapter(this, listHash);

        list.setAdapter(newAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position + 1 == listHash.size()) {
                    listHash.remove(listHash.size() - 1);
                    newAdapter.notifyDataSetChanged();
                    startResults = chosenResults + 1;
                    chosenResults += 5;
                    new AsyncTaskExtendMatches().execute();
                } else if (position == 0) {

                } else {
                    String extraInformation = matchHistory.get(position - 1).matchURL + " " + username + " " + position;
                    int listPosition = position - 1;
                    Toast.makeText(getApplicationContext(),
                            "Showing individual game", Toast.LENGTH_SHORT)
                            .show();
                    matchHistoryActivity.putExtra("matchHistoryURL", extraInformation).putExtra("listPosition", listPosition)
                            .putExtra("region", region).putExtra("champion", matchHistory.get(listPosition).participant.champName)
                            .putExtra("matchJSON", SummonerStats.fullGameJson.get(listPosition));
                    startActivity(matchHistoryActivity);
                }
            }
        });

    }

    Boolean getInternetStatus(Context mContext) {
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Boolean internetConnection = activeNetworkInfo != null && activeNetworkInfo.isConnected();

        return internetConnection;
    }

    public class AsyncTaskParseJSON extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            internetConnection = getInternetStatus(getApplicationContext());
            APIKey = APIEncryption.decryptAPIKey(ResultsDisplayNew.this, region);
            if (!internetConnection)
                if (offlineDbHelper.getAllData() != null) {
                    {
                        for (int i = 0; i < offlineDbHelper.getSize(); i++) {
                            Match.jsonData.add(offlineDbHelper.getAllData().get(i));
                        }
                    }
                }
        }

        @Override
        //Used to call UI thread after data has been successfully retrieved
        protected void onPostExecute(String s) {

            if (getInternetStatus(getApplicationContext())) {

                if (!Match.jsonData.isEmpty()) {
                    offlineDbHelper.resetData();
                    for (int i = 0; i < Match.jsonData.size(); i++) {
                        long id = offlineDbHelper.insertData(Match.jsonData.get(i));
                    }
                }
            } else {

            }
            displayGameDetails();
        }

        @Override
        protected String doInBackground(String... arg0) {
            //get username from shared preferences to be used to search the Riot API with
            if (!getInternetStatus(getApplicationContext())) {

            } else {
                SharedPreferences newUsername = getSharedPreferences("userData", Context.MODE_PRIVATE);
                username = newUsername.getString("user", "");
                getMatchHistory(username);
            }
            return null;
        }

        //Gets list of matches and searches inside the JSON object for specific data like their kills, deaths and assists for that game
        public ArrayList<Match> getMatchHistory(String name) {
            //make sure a redefined/empty matchHistory ArrayList is defined to avoid old data being displayed

            matchID = getMatchHistoryByName(name); //declare ArrayList of Strings that will contain all the matchIDs
            //executes all other functions before returning to this so that it has all the correct data to personalise the match history URL
            jParser = new httpConnect(); //connect to the JSONparser

            for (int i = 0; i < matchID.size(); i++) {
                matchInformationURL = "https://" + region + ".api.pvp.net/api/lol/" + region + "/v2.2/match/" +
                        matchID.get(i) + "?api_key=" + APIKey; //concatenated string to declare unique match history IDs
                String json = jParser.callAPI(matchInformationURL);

                //Fixes the problem where a secondary search would always crash the application, json would sometimes be null
                while (json == null) {
                    json = jParser.callAPI(matchInformationURL);
                    //try {
                    //    Thread.sleep(5000);
                    //} catch (InterruptedException e) {
                    //    e.printStackTrace();
                    //}
                }
                //handling that includes all JSON-related data
                SummonerStats.fullGameJson.add(json);
                try {
                    //Save information from matchInformation API call
                    JSONObject matchDetails = new JSONObject(json);
                    if (matchDetails != null) //check if matchDetails is populated first
                    {
                        Match m = new Match();

                        //A lot of JSON data being handled here, requires exception handling if any data fields are null by chance
                        try {
                            //find the data related to the mapID within the
                            m.mapId = Integer.parseInt(matchDetails.getString("mapId"));
                            m.queueType = matchDetails.getString("queueType").replace("_", " ");

                            JSONArray participantIdentities = matchDetails.getJSONArray("participantIdentities"); //find the IDs of all players within a chosen game
                            int participantIndex = 0;

                            if (participantIdentities != null) {
                                for (int pI = 0; pI < participantIdentities.length(); pI++) {
                                    JSONObject jOPlayerId = participantIdentities.getJSONObject(pI);
                                    JSONObject jOPlayer = participantIdentities.getJSONObject(pI).getJSONObject("player");
                                    //convert both the user input and the participant ID to lower case before comparing
                                    if (name.toLowerCase().equals(jOPlayer.getString("summonerName").toLowerCase())) {

                                        participantIndex = Integer.parseInt(jOPlayerId.getString("participantId"));
                                        break;
                                    }
                                }
                            }

                            //Search JSON data for all arrays including participant data
                            JSONArray Participants = matchDetails.getJSONArray("participants");
                            if (Participants != null) {
                                for (int x = 0; x < Participants.length(); x++) //loop through the participant IDs to find the ID = the player's ID
                                {
                                    JSONObject jO = Participants.getJSONObject(x);
                                    int index = Integer.parseInt(jO.getString("participantId"));
                                    //if the participantID is equal to the ID input by the user, then search that Object
                                    if (index == participantIndex) {
                                        if (jO != null) {
                                            //search the "stats" object in the request to find all the relevant variables to use
                                            Participant partic = new Participant();
                                            Date date = new Date();
                                            //date.getTime(Long.getLong(jO.getString("matchCreation")));
                                            partic.kills = Long.valueOf(jO.getJSONObject("stats").getString("kills"));
                                            partic.deaths = Long.valueOf(jO.getJSONObject("stats").getString("deaths"));
                                            partic.assists = Long.valueOf(jO.getJSONObject("stats").getString("assists"));
                                            partic.championId = Integer.parseInt(jO.getString("championId"));
                                            partic.champLevel = Long.valueOf(jO.getJSONObject("stats").getString("champLevel"));
                                            partic.goldEarned = Long.valueOf(jO.getJSONObject("stats").getString("goldEarned"));
                                            partic.winner = jO.getJSONObject("stats").getString("winner");
                                            partic.changeWinner();
                                            partic.champName = champList.championIDToName(partic.championId);

                                            m.mapName = champList.mapIdName(m.mapId);
                                            m.matchURL = matchInformationURL;
                                            m.participant = partic;

                                            Match.jsonData.add(jO.toString() + ",\"map\":" + m.mapName + ",\"matchURL\":" + m.matchURL + ",\"mapId\":" + m.mapId + ",\"queue\":" + m.queueType);

                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            ToastMessage.message(ResultsDisplayNew.this, "Tell the developer");
                            try {
                                // Sleep for 10 milliseconds.
                                //Just to display the progress slowly
                                Thread.sleep(5000);
                            } catch (InterruptedException d) {
                                e.printStackTrace();
                            }

                        }
                        matchHistory.add(m);
                    }
                } catch (JSONException e) {
                    ToastMessage.message(ResultsDisplayNew.this, "Tell the developer");
                    try {
                        // Sleep for 10 milliseconds.
                        //Just to display the progress slowly
                        Thread.sleep(5000);
                    } catch (InterruptedException d) {
                        e.printStackTrace();
                    }

                    System.exit(0);
                }

            }
            return matchHistory;
        }

        //Uses the SummonerID from "getSummonerIdByName" method to make an API call which returns a limited amount of matches related to that player
        private ArrayList<String> getMatchHistoryByName(String name) {
            matchHistoryIDs = new ArrayList<>(); //ArrayList of match histories by their ID
            summonerID = getSummonerIdByName(name); //send getSummonerIdByName method the required name value for the API call

            //API call to get last 6 matches for the user based on their name/summonerID
            String matchHistoryURL = "https://" + region + ".api.pvp.net/api/lol/" + region + "/v2.2/matchlist/by-summoner/"
                    + summonerID + "?beginIndex=" + startResults + "&endIndex=" + chosenResults + "&api_key=" + APIKey;
            jParser = new httpConnect();
            String json = jParser.callAPI(matchHistoryURL);

            try {

                //error handling for any JSONExceptions
                try {
                    JSONObject matches = new JSONObject(json); //save JSONObject that is retrieved from jParser
                    JSONArray matchesArray = matches.getJSONArray("matches"); //find Array in JSONObject called "matches"

                    for (int i = 0; i < matchesArray.length(); i++) {
                        JSONObject s = matchesArray.getJSONObject(i);
                        if (s != null) {
                            matchHistoryIDs.add(s.getString("matchId")); //If there is data in the JSONObject, find matchId's and add them to matchHistoryIDs ArrayList
                        }
                    }
                } catch (JSONException e) {
                    ToastMessage.message(ResultsDisplayNew.this, "Tell the developer");
                    try {
                        // Sleep for 10 milliseconds.
                        //Just to display the progress slowly
                        Thread.sleep(5000);
                    } catch (InterruptedException d) {
                        e.printStackTrace();
                    }

                }
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } catch (NullPointerException e) {
                //ToastMessage.message(ResultsDisplayNew.this, "Tell the developer");
                try {
                    // Sleep for 10 milliseconds.
                    //Just to display the progress slowly
                    Thread.sleep(5000);
                } catch (InterruptedException d) {
                    e.printStackTrace();
                }

            }
            if (matchHistoryIDs.size() == 0) {
                getMatchHistoryByName(URLUsername);
            }
            return matchHistoryIDs;
        }


        //Used to convert input from EditText widget to a unique ID related to a player
        private String getSummonerIdByName(String Name) {
            //Use username from EditText widget to complete API URL
            String summonerIdURL = "https://" + region + ".api.pvp.net/api/lol/" + region + "/v1.4/summoner/by-name/" + URLUsername +
                    "?api_key=" + APIKey; //URL to get the data that can be used for summoner ID to put into match history

            String id = "";
            jParser = new httpConnect(); //jParser code from workshop week 6, no changes made
            String json = jParser.callAPI(summonerIdURL); //send URL to class to return data
            if (json == null) {
                //ToastMessage.message(ResultsDisplayNew.this, "invalid username");
                Intent returnClass = new Intent(getApplicationContext(), Summoner.class);
                returnClass.putExtra("Error", "Invalid Summoner Name");
                startActivity(returnClass);

            } else {


                //split after the second colon and before the first comma to get the relevant ID
                if (json == null) {
                    //Exits application due to not being able to access Context for toast message during Async function
                    System.exit(0);
                } else {
                    try {
                        JSONObject summonerIDJSONObject = new JSONObject(json);
                        id = summonerIDJSONObject.getJSONObject(username.toLowerCase().replace(" ", "")).getString("id");
                        //id = s[2].split(",")[0];
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            return id;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_results_display, menu);
        menu.add("About This App");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == 0) {
            new AlertDialog.Builder(ResultsDisplayNew.this)
                    .setTitle("Disclaimer")
                    .setMessage("League Match History isn't endorsed by Riot Games and doesn't reflect " +
                            "the views or opinions of Riot Games or anyone officially involved in " +
                            "producing or managing League of Legends. League of Legends and Riot Games " +
                            "are trademarks or registered trademarks of Riot Games, Inc. League of Legends © Riot Games, Inc." +
                            "more can be found it https://developer.riotgames.com/terms#statement")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .show();
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class AsyncTaskExtendMatches extends AsyncTask<String, String, String> {

        ArrayList<String> matchInformationURLs = new ArrayList<>();

        @Override
        protected void onPreExecute() {
            if (!getInternetStatus(getApplicationContext())) {
                try {
                    new AlertDialog.Builder(ResultsDisplayNew.this)
                            .setTitle("No Internet Connection Detected")
                            .setMessage("Unable to load more results")
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        protected String doInBackground(String... params) {
            if (getInternetStatus(getApplicationContext())) {
                matchHistory = extendMatchHistory();
            }
            return null;
        }

        @Override
        //Used to call UI thread after data has been successfully retrieved
        protected void onPostExecute(String s) {
            if (!getInternetStatus(getApplicationContext())) {

            }
            if (getInternetStatus(getApplicationContext())) {
                if (!Match.jsonData.isEmpty()) {
                    offlineDbHelper.resetData();
                    for (int i = 0; i < Match.jsonData.size(); i++) {
                        long id = offlineDbHelper.insertData(Match.jsonData.get(i));
                    }
                }
                displayGameDetails();
            }
        }

        private ArrayList<Match> extendMatchHistory() {
            jParser = new httpConnect(); //connect to the JSONparser
            getMatchHistoryByName();


            for (int i = 0; i < matchHistoryText.size(); i++) {
                String json = matchHistoryText.get(i);

                if (matchHistoryIDs.size() == 0) {
                    extendMatchHistory();

                    //Fixes the problem where a secondary search would always crash the application, json would sometimes be null
                    while (json == null) {
                        //json = jParser.callAPI(matchInformationURL);
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                //handling that includes all JSON-related data
                try {
                    //Save information from matchInformation API call
                    JSONObject matchDetails = new JSONObject(json);
                    if (matchDetails != null) //check if matchDetails is populated first
                    {
                        Match m = new Match();

                        //A lot of JSON data being handled here, requires exception handling if any data fields are null by chance
                        try {
                            //find the data related to the mapID within the
                            m.mapId = Integer.parseInt(matchDetails.getString("mapId"));
                            m.queueType = matchDetails.getString("queueType");

                            JSONArray participantIdentities = matchDetails.getJSONArray("participantIdentities"); //find the IDs of all players within a chosen game
                            int participantIndex = 0;

                            if (participantIdentities != null) {
                                for (int pI = 0; pI < participantIdentities.length(); pI++) {
                                    JSONObject jOPlayerId = participantIdentities.getJSONObject(pI);
                                    JSONObject jOPlayer = participantIdentities.getJSONObject(pI).getJSONObject("player");
                                    //convert both the user input and the participant ID to lower case before comparing
                                    if (username.toLowerCase().equals(jOPlayer.getString("summonerName").toLowerCase())) {
                                        participantIndex = Integer.parseInt(jOPlayerId.getString("participantId"));
                                        break;
                                    }
                                }
                            }

                            //Search JSON data for all arrays including participant data
                            JSONArray Participants = matchDetails.getJSONArray("participants");
                            if (Participants != null) {
                                for (int x = 0; x < Participants.length(); x++) //loop through the participant IDs to find the ID = the player's ID
                                {
                                    JSONObject jO = Participants.getJSONObject(x);
                                    int index = Integer.parseInt(jO.getString("participantId"));
                                    //if the participantID is equal to the ID input by the user, then search that Object
                                    if (index == participantIndex) {
                                        if (jO != null) {
                                            //search the "stats" object in the request to find all the relevant variables to use
                                            Participant partic = new Participant();
                                            partic.kills = Long.valueOf(jO.getJSONObject("stats").getString("kills"));
                                            partic.deaths = Long.valueOf(jO.getJSONObject("stats").getString("deaths"));
                                            partic.assists = Long.valueOf(jO.getJSONObject("stats").getString("assists"));
                                            partic.championId = Integer.parseInt(jO.getString("championId"));
                                            partic.champLevel = Long.valueOf(jO.getJSONObject("stats").getString("champLevel"));
                                            partic.goldEarned = Long.valueOf(jO.getJSONObject("stats").getString("goldEarned"));
                                            partic.winner = jO.getJSONObject("stats").getString("winner");
                                            partic.changeWinner();
                                            partic.champName = champList.championIDToName(partic.championId);
                                            m.mapName = champList.mapIdName(m.mapId);
                                            m.matchURL = matchInformationURLs.get(i);
                                            m.participant = partic;

                                            Match.jsonData.add(jO.toString() + ",\"map\":" + m.mapName + ",\"matchURL\":" + m.matchURL + ",\"mapId\":" + m.mapId + ",\"queue\":" + m.queueType);

                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            ToastMessage.message(getApplicationContext(), "Tell the developer");
                            try {
                                // Sleep for 10 milliseconds.
                                //Just to display the progress slowly
                                Thread.sleep(5000);
                            } catch (InterruptedException d) {
                                e.printStackTrace();
                            }

                        }
                        matchHistory.add(m);
                    }
                } catch (JSONException e) {
                    ToastMessage.message(getApplicationContext(), "Tell the developer");
                    try {
                        // Sleep for 10 milliseconds.
                        //Just to display the progress slowly
                        Thread.sleep(5000);
                    } catch (InterruptedException d) {
                        e.printStackTrace();
                    }

                    System.exit(0);
                }

            }

            return matchHistory;
        }

        private ArrayList<String> getMatchHistoryByName() {
            matchHistoryIDs = new ArrayList<>(); //ArrayList of match histories by their ID
            matchHistoryText = new ArrayList<>();
            //API call to get last 6 matches for the user based on their name/summonerID
            String matchHistoryURL = "https://" + region + ".api.pvp.net/api/lol/" + region + "/v2.2/matchlist/by-summoner/"
                    + summonerID + "?beginIndex=" + startResults + "&endIndex=" + chosenResults + "&api_key=" + APIKey;
            jParser = new httpConnect();
            String json = jParser.callAPI(matchHistoryURL);

            try {

                //error handling for any JSONExceptions
                try {
                    JSONObject matches = new JSONObject(json); //save JSONObject that is retrieved from jParser
                    JSONArray matchesArray = matches.getJSONArray("matches"); //find Array in JSONObject called "matches"

                    for (int i = 0; i < matchesArray.length(); i++) {
                        JSONObject s = matchesArray.getJSONObject(i);
                        if (s != null) {
                            matchHistoryIDs.add(s.getString("matchId")); //If there is data in the JSONObject, find matchId's and add them to matchHistoryIDs ArrayList

                        }
                    }
                    for (int i = 0; i < matchHistoryIDs.size(); i++) {
                        String matchInformationURL = "https://" + region + ".api.pvp.net/api/lol/" + region + "/v2.2/match/" +
                                matchHistoryIDs.get(i) + "?api_key=" + APIKey; //concatenated string to declare unique match history IDs
                        String matchJSON = jParser.callAPI(matchInformationURL);
                        matchHistoryText.add(matchJSON);
                        matchInformationURLs.add(matchInformationURL);
                    }
                } catch (JSONException e) {
                    ToastMessage.message(getApplicationContext(), "Tell the developer");
                    try {
                        // Sleep for 10 milliseconds.
                        //Just to display the progress slowly
                        Thread.sleep(5000);
                    } catch (InterruptedException d) {
                    }

                }
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                }

            } catch (NullPointerException e) {
                ToastMessage.message(getApplicationContext(), "Tell the developer");
                try {
                    // Sleep for 10 milliseconds.
                    //Just to display the progress slowly
                    Thread.sleep(5000);
                } catch (InterruptedException d) {
                }

            }
            return matchHistoryText;
        }
    }
}

class ListViewAdapter extends BaseAdapter {

    public ArrayList<HashMap<String, String>> list;
    Activity activity;

    public ListViewAdapter(Activity activity, ArrayList<HashMap<String, String>> list) {
        super();
        this.activity = activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        TextView txtFirst;
        TextView txtSecond;
        TextView txtThird;
        TextView txtFourth;
        TextView txtFifth;
        TextView txtSixth;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        LayoutInflater inflater = activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.layout_results_columns, null);
            holder = new ViewHolder();

            holder.txtFirst = (TextView) convertView.findViewById(R.id.ChampLvl);
            holder.txtSecond = (TextView) convertView.findViewById(R.id.Champion);
            holder.txtThird = (TextView) convertView.findViewById(R.id.WinLoss);
            holder.txtFourth = (TextView) convertView.findViewById(R.id.QueueType);
            holder.txtFifth = (TextView) convertView.findViewById(R.id.KDA);
            holder.txtSixth = (TextView) convertView.findViewById(R.id.GoldEarned);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HashMap<String, String> map = list.get(position);
        holder.txtFirst.setText(map.get(FIRST_COLUMN));
        holder.txtSecond.setText(map.get(SECOND_COLUMN));
        holder.txtThird.setText(map.get(THIRD_COLUMN));
        holder.txtFourth.setText(map.get(FOURTH_COLUMN));
        holder.txtFifth.setText(map.get(FIFTH_COLUMN));
        holder.txtSixth.setText(map.get(SIXTH_COLUMN));

        return convertView;
    }
}
