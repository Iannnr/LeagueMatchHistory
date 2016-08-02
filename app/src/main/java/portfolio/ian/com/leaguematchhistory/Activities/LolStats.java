package portfolio.ian.com.leaguematchhistory.Activities;


import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling.Match;
import portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling.gameStats;
import portfolio.ian.com.leaguematchhistory.Constants.GameStatsConstants;
import portfolio.ian.com.leaguematchhistory.Constants.ToastMessage;
import portfolio.ian.com.leaguematchhistory.DataHandling.ChampionList;
import portfolio.ian.com.leaguematchhistory.DataHandling.TinyDB;
import portfolio.ian.com.leaguematchhistory.R;


/**
 * Created by Ian on 26/05/2016.
 */
public class LolStats extends Fragment {

    ListView listView;
    StatsListViewAdapter newAdapter;
    Activity thisActivity;
    ImageView headerPhoto;
    ChampionList championList = new ChampionList();
    public ArrayList<HashMap<String, String>> listHash = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_lol_stats, container, false);

        listView = (ListView) v.findViewById(R.id.gameStatListView);

        thisActivity = getActivity();

        updateUI();

        return v;
    }


    Boolean checkInternetConnection(Context context) {
        Boolean internetConnection = true;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            internetConnection = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return internetConnection;
    }

    public void sortJSONData(String json, String username, Context thisContext, int position) {


        if (!checkInternetConnection(thisContext)) {
            json = Match.jsonData.get(position);
        }
        try {
            if (json != null) {
                //Save information from matchInformation API call
                JSONObject matchDetails = new JSONObject(json);

                if (matchDetails != null) {
                    try {

                        ArrayList<String> inGameStats = new ArrayList<>();
                        ArrayList<String> inGameRunes = new ArrayList<>();
                        ArrayList<String> inGameItems = new ArrayList<>();
                        //search the "stats" object in the request to find all the relevant variables to use
                        inGameStats.add(gameStats.summonerName = username);
                        inGameStats.add(gameStats.champName = championList.championIDToName(Integer.parseInt(matchDetails.getString("championId"))));
                        inGameStats.add(gameStats.kills = matchDetails.getJSONObject("stats").getString("kills"));
                        inGameStats.add(gameStats.deaths = matchDetails.getJSONObject("stats").getString("deaths"));
                        inGameStats.add(gameStats.assists = matchDetails.getJSONObject("stats").getString("assists"));
                        inGameStats.add(gameStats.minionsKills = matchDetails.getJSONObject("stats").getString("minionsKilled"));
                        inGameStats.add(gameStats.goldEarned = matchDetails.getJSONObject("stats").getString("goldEarned"));
                        inGameStats.add(gameStats.doubleKills = matchDetails.getJSONObject("stats").getString("doubleKills"));
                        inGameStats.add(gameStats.tripleKills = matchDetails.getJSONObject("stats").getString("tripleKills"));
                        inGameStats.add(gameStats.quadraKills = matchDetails.getJSONObject("stats").getString("quadraKills"));
                        inGameStats.add(gameStats.pentaKills = matchDetails.getJSONObject("stats").getString("pentaKills"));
                        inGameStats.add(gameStats.largestKillingSpree = matchDetails.getJSONObject("stats").getString("largestKillingSpree"));
                        inGameStats.add(gameStats.largestMultiKill = matchDetails.getJSONObject("stats").getString("largestMultiKill"));
                        inGameStats.add(gameStats.totalDamageDealtToChampions = matchDetails.getJSONObject("stats").getString("totalDamageDealtToChampions"));
                        inGameStats.add(gameStats.physicalDamageDealtToChampions = matchDetails.getJSONObject("stats").getString("physicalDamageDealtToChampions"));
                        inGameStats.add(gameStats.magicDamageDealtToChampions = matchDetails.getJSONObject("stats").getString("magicDamageDealtToChampions"));
                        inGameStats.add(gameStats.trueDamageDealtToChampions = matchDetails.getJSONObject("stats").getString("trueDamageDealtToChampions"));
                        inGameStats.add(gameStats.totalDamageDealt = matchDetails.getJSONObject("stats").getString("totalDamageDealt"));
                        inGameStats.add(gameStats.physicalDamageDealt = matchDetails.getJSONObject("stats").getString("physicalDamageDealt"));
                        inGameStats.add(gameStats.magicDamageDealt = matchDetails.getJSONObject("stats").getString("magicDamageDealt"));
                        inGameStats.add(gameStats.trueDamageDealt = matchDetails.getJSONObject("stats").getString("trueDamageDealt"));
                        inGameStats.add(gameStats.towerKills = matchDetails.getJSONObject("stats").getString("towerKills"));
                        inGameStats.add(gameStats.largestCriticalStrike = matchDetails.getJSONObject("stats").getString("largestCriticalStrike"));
                        inGameItems.add(String.valueOf(matchDetails.getJSONObject("stats").getLong("item0")));
                        inGameItems.add(String.valueOf(matchDetails.getJSONObject("stats").getLong("item1")));
                        inGameItems.add(String.valueOf(matchDetails.getJSONObject("stats").getLong("item2")));
                        inGameItems.add(String.valueOf(matchDetails.getJSONObject("stats").getLong("item3")));
                        inGameItems.add(String.valueOf(matchDetails.getJSONObject("stats").getLong("item4")));
                        inGameItems.add(String.valueOf(matchDetails.getJSONObject("stats").getLong("item5")));
                        inGameItems.add(String.valueOf(matchDetails.getJSONObject("stats").getLong("item6")));

                        JSONArray runeArray = (matchDetails.getJSONArray("runes"));
                        for (int i = 0; i < runeArray.length(); i++) {
                            inGameRunes.add(String.valueOf(runeArray.getJSONObject(i).getLong("runeId")));
                            inGameRunes.add(String.valueOf(runeArray.getJSONObject(i).getLong("rank")));
                        }
                        TinyDB tinydb = new TinyDB(thisContext);
                        tinydb.putListString("myInGameStats", inGameStats);
                        tinydb.putListString("inGameRunes", inGameRunes);
                        tinydb.putListString("inGameItems", inGameItems);


                    } catch (JSONException e) {
                        ToastMessage.message(this.getContext(), e.toString());
                    }
                }

            }
        } catch (Exception d) {
            d.printStackTrace();
        }
    }


    private void updateUI() {
        try {
            clearDataList();

            gameStats gS = new gameStats();

            ArrayList<String> inGameStats = new ArrayList<>();

            TinyDB tinydb = new TinyDB(this.getContext());
            //Map<String, ?> getAll = tinydb.getListString("myInGameStats");
            ArrayList<String> mInGameStats = tinydb.getListString("myInGameStats");
            int columnLength = gS.populatePrimaryColumn().size();
            for (int i = 0; i < columnLength; i++) {
                inGameStats.add(mInGameStats.get(i));
            }

            for (int i = 0; i < inGameStats.size(); i++) {
                HashMap<String, String> temp = new HashMap<>();
                temp.put(GameStatsConstants.FIRST_COLUMN, gS.populatePrimaryColumn().get(i));
                temp.put(GameStatsConstants.SECOND_COLUMN, inGameStats.get(i));
                listHash.add(temp);
            }
            newAdapter = new StatsListViewAdapter(thisActivity, listHash);
            listView.setAdapter(newAdapter);
            listView.setFocusable(false);
            listView.setFocusableInTouchMode(false);


            //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //    @Override
            //    public void onItemClick(AdapterView<?> parent, View view,
            //                            int position, long id) {
            //    }
            //});

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    void clearDataList() {
        try {
            listHash = null;
            listHash = new ArrayList<>();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}

class StatsListViewAdapter extends BaseAdapter {

    public ArrayList<HashMap<String, String>> list;
    Activity activity;

    public StatsListViewAdapter(Activity activity, ArrayList<HashMap<String, String>> list) {
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
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        LayoutInflater inflater = activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.layout_stats_columns, null);
            holder = new ViewHolder();

            holder.txtFirst = (TextView) convertView.findViewById(R.id.statsColumn);
            holder.txtSecond = (TextView) convertView.findViewById(R.id.valueColumn);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HashMap<String, String> map = list.get(position);
        holder.txtFirst.setText(map.get(GameStatsConstants.FIRST_COLUMN));
        holder.txtSecond.setText(map.get(GameStatsConstants.SECOND_COLUMN));

        return convertView;
    }
}
