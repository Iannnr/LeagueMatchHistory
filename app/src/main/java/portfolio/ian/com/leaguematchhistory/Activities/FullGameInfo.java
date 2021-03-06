package portfolio.ian.com.leaguematchhistory.Activities;

import android.content.Context;
import android.graphics.Color;
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

import portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling.SummonerStats;
import portfolio.ian.com.leaguematchhistory.R;

public class FullGameInfo extends Fragment {

    ListView gameInfo;
    TextView team1, team2;
    SummonerStats ss;
    FullGameInfoListAdapter gameAdapter;
    JSONObject fullGameData;
    JSONArray participants;
    ArrayList<SummonerStats> gameRows = new ArrayList<>();
    //static ArrayList<InGameItems> itemArrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_full_game_info, container, false);
        gameInfo = (ListView) v.findViewById(R.id.fullGameListView);
        team1 = (TextView) v.findViewById(R.id.team1Win);
        team2 = (TextView) v.findViewById(R.id.team2Win);
        Context c = getContext();
        gameAdapter = new FullGameInfoListAdapter(c);
        gameInfo.setAdapter(gameAdapter);

        updateUI();
        return v;
    }

    Boolean checkInternetConnection(Context mContext) {
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Boolean internetConnection = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        return internetConnection;
    }

    void updateUI() {
        clearArrayList();
        if (checkInternetConnection(getContext())) {
            try {
                ss = new SummonerStats(null, null, null, null, null, null, null, null, null, null, getContext());
                fullGameData = new JSONObject(SummonerStats.individualGameJSON);
                team1.setText(getWinner(fullGameData, 0));
                team2.setText(getWinner(fullGameData, 1));
                if (team1.getText().toString().contains("Defeat")) {
                    team1.setTextColor(Color.RED);
                    team2.setTextColor(Color.GREEN);
                } else {
                    team2.setTextColor(Color.RED);
                    team1.setTextColor(Color.GREEN);
                }
                participants = fullGameData.getJSONArray("participants");
                JSONArray participantIdentities = fullGameData.getJSONArray("participantIdentities");
                int x = participants.getJSONObject(0).getInt("championId");
                for (int i = 0; i < 5; i++) {
                    ss = new SummonerStats(ss.getSummonerIcon(participants.getJSONObject(i).getInt("championId")).icon, ss.getSummonerIcon(participants.getJSONObject(i + 5).getInt("championId")).icon,
                            participants.getJSONObject(i).getJSONObject("stats").getLong("kills"), participants.getJSONObject(i + 5).getJSONObject("stats").getLong("kills"),
                            participants.getJSONObject(i).getJSONObject("stats").getLong("deaths"), participants.getJSONObject(i + 5).getJSONObject("stats").getLong("deaths"),
                            participants.getJSONObject(i).getJSONObject("stats").getLong("assists"), participants.getJSONObject(i + 5).getJSONObject("stats").getLong("assists"),
                            participantIdentities.getJSONObject(i).getJSONObject("player").getString("summonerName"), participantIdentities.getJSONObject(i + 5).getJSONObject("player").getString("summonerName"), getContext());
                    gameRows.add(ss);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    String getWinner(JSONObject gameData, int team) {
        Boolean winLoss = false;
        try {
            winLoss = gameData.getJSONArray("teams").getJSONObject(team).getBoolean("winner");
        } catch (JSONException e) {
            e.printStackTrace();
            int x = 100;
        }
        if (!winLoss) {
            return "Defeat";
        } else {
            return "Victory";
        }
    }

    void clearArrayList() {
        gameRows = null;
        gameRows = new ArrayList<>();
    }

    class FullGameInfoListAdapter extends BaseAdapter {

        private Context mContext;
        private LayoutInflater inflater = null;

        public FullGameInfoListAdapter(Context c) {
            mContext = c;
            inflater = (LayoutInflater) c.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return gameRows.size();
        }

        @Override
        public Object getItem(int position) {
            return gameRows.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View rowView;
            rowView = inflater.inflate(R.layout.layout_full_game_row, null);
            try {
                //left side
                ImageView summoner1icon = (ImageView) rowView.findViewById(R.id.Summoner1Icon);
                summoner1icon.setImageDrawable(gameRows.get(position).summonerIcon1);

                TextView summoner1Champ = (TextView) rowView.findViewById(R.id.Summoner1Champ);
                summoner1Champ.setText(gameRows.get(position).getSummonerIcon(participants.getJSONObject(position).getInt("championId")).championName);


                TextView summoner1KDA = (TextView) rowView.findViewById(R.id.Summoner1KDA);
                summoner1KDA.setText(gameRows.get(position).kills1 + "/" + gameRows.get(position).deaths1 + "/" + gameRows.get(position).assists1);

                TextView summoner1Summoner = (TextView) rowView.findViewById(R.id.Summoner1IGN);
                summoner1Summoner.setText(gameRows.get(position).summonerName1);


                //right side
                ImageView summoner2icon = (ImageView) rowView.findViewById(R.id.Summoner2Icon);
                summoner2icon.setImageDrawable(gameRows.get(position).summonerIcon2);

                TextView summoner2Champ = (TextView) rowView.findViewById(R.id.Summoner2Champ);
                summoner2Champ.setText(gameRows.get(position).getSummonerIcon(participants.getJSONObject(position + 5).getInt("championId")).championName);

                TextView summoner2KDA = (TextView) rowView.findViewById(R.id.Summoner2KDA);
                summoner2KDA.setText(gameRows.get(position).kills2 + "/" + gameRows.get(position).deaths2 + "/" + gameRows.get(position).assists2);

                TextView summoner2Summoner = (TextView) rowView.findViewById(R.id.Summoner2IGN);
                summoner2Summoner.setText(gameRows.get(position).summonerName2);

            } catch (Exception e) {
                e.printStackTrace();
                int x = 100;
            }


            return rowView;
        }
    }
}
