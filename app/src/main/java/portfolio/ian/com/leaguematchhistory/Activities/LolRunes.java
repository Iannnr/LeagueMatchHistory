package portfolio.ian.com.leaguematchhistory.Activities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import portfolio.ian.com.leaguematchhistory.*;
import portfolio.ian.com.leaguematchhistory.Adapters.*;

import java.util.ArrayList;


/**
 * Created by Ian on 26/05/2016.
 */
public class LolRunes extends Fragment {

    static ArrayList<Rune> runeArrayList = new ArrayList<>();
    RunesViewAdapter newAdapter;
    ListView listView;
    ArrayList<String> runes = new ArrayList<>();
    OfflineRuneDatabaseAdapter offlineRuneDbHelper;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_lol_runes, container, false);

        listView = (ListView) v.findViewById(R.id.runeList);

        offlineRuneDbHelper = new OfflineRuneDatabaseAdapter(getContext());

        updateUI();
        return v;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        try {
            updateUI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Boolean checkInternetConnection(Context mContext)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        Boolean internetConnection = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        return internetConnection;
    }

    void updateUI() {
        try {
            clearArrayList();

                if (checkInternetConnection(getContext())) {
                    for (int i = 0; i < Rune.runes.size(); i++) {
                        Rune rune = new Rune(Rune.runes.get(i).runeId,Rune.runes.get(i).rank,
                                Rune.runes.get(i).name, Rune.runes.get(i).description);
                        runeArrayList.add(rune);
                    }
                } else if (!checkInternetConnection(getContext())) {
                    runes = offlineRuneDbHelper.getAllData();
                    for (int i = 0; i < runes.size(); i++) {
                        Rune rune = new Rune(Long.valueOf(runes.get(i).split("runeId: ")[1].split(" rank: ")[0]),
                                Long.valueOf(runes.get(i).split("rank: ")[1].split(" name: ")[0]),
                                        runes.get(i).split("name: ")[1].split(" description: ")[0],
                                        runes.get(i).split("description: ")[1]);
                        runeArrayList.add(rune);
                    }
                }

            newAdapter = new RunesViewAdapter(getContext());
            listView.setAdapter(newAdapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void clearArrayList()
    {
        runeArrayList = null;
        runeArrayList = new ArrayList<>();
    }

    class RunesViewAdapter extends BaseAdapter {

        private Context mContext;
        private LayoutInflater inflater = null;


        public RunesViewAdapter(Context c) {
            mContext = c;
            inflater = (LayoutInflater) c.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return runeArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return runeArrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View rowView;
            rowView = inflater.inflate(R.layout.layout_runes, null);

            try {

                ImageView runeImage = (ImageView) rowView.findViewById(R.id.runeImage);
                TextView runeAmount = (TextView) rowView.findViewById(R.id.Amount);
                TextView runeName = (TextView) rowView.findViewById(R.id.Name);
                TextView runeInfo = (TextView) rowView.findViewById(R.id.Info);

                Display display = ((WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
                int rotation = display.getRotation();
                if (rotation == Surface.ROTATION_0 || rotation == Surface.ROTATION_180) {

                    runeAmount.setPadding(-1, 0, 0, 0);
                    //runeName.setPadding(16, 32, 0, 0);
                    //runeName.setTextAlignment();
                }

                runeImage.setImageDrawable(Rune.runeIdToImage(getResources(), runeArrayList.get((position)).runeId));
                runeAmount.setText(String.valueOf(runeArrayList.get(position).rank));
                runeName.setText(runeArrayList.get(position).name);
                runeInfo.setText(runeArrayList.get(position).description);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return rowView;
        }
    }
}
