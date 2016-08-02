package portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling;


import java.util.ArrayList;

import portfolio.ian.com.leaguematchhistory.Constants.Participant;

/**
 * Created by Ian on 04/12/2015.
 */
//Variables relating to the in-game information
public class Match {
    public static ArrayList<String> jsonData = new ArrayList<>();
    public String queueType, mapName, matchURL;
    public int mapId;
    public Participant participant;
}