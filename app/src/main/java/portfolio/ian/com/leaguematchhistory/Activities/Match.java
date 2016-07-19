package portfolio.ian.com.leaguematchhistory.Activities;


import portfolio.ian.com.leaguematchhistory.Constants.*;

import java.util.ArrayList;

/**
 * Created by Ian on 04/12/2015.
 */
//Variables relating to the in-game information
public class Match {
    static ArrayList<String> jsonData = new ArrayList<>();
    public String queueType, mapName, matchURL;
    public int mapId;
    public Participant participant;
}