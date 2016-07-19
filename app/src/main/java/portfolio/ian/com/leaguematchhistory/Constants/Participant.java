package portfolio.ian.com.leaguematchhistory.Constants;


import portfolio.ian.com.leaguematchhistory.Activities.Rune;

import java.util.ArrayList;

/**
 * Created by Ian on 04/12/2015.
 */
public class Participant
{
    //Variables that will be shown in ResultsDisplay class in TableLayout
    public long kills, deaths, assists, goldEarned, champLevel;
    public int championId, spell1Id, spell2id;
    public String winner, champName;
    public ArrayList<Rune> runes = new ArrayList<>();



    //Change output from API call from "true/false" to "Win/Loss"
    public String changeWinner() {
        if (winner == "true") {
            winner ="Win";
        }
        else
        {
            winner = "Loss";
        }
        return winner;
    }
}
