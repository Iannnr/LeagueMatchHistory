package portfolio.ian.com.leaguematchhistory.Activities;

import java.util.ArrayList;

/**
 * Created by Ian on 27/05/2016.
 */
public class gameStats {
    //Summoner-related information
    static String summonerName, champName, largestKillingSpree,
        //Damage dealt
        totalDamageDealtToChampions, physicalDamageDealtToChampions, magicDamageDealtToChampions,
        trueDamageDealtToChampions, totalDamageDealt, physicalDamageDealt, magicDamageDealt,
        trueDamageDealt, largestCriticalStrike,
        //money related stats
        goldEarned, minionsKills, towerKills, kills, deaths, assists,
        //multikills
        largestMultiKill, doubleKills, tripleKills, quadraKills, pentaKills;
    private ArrayList<String> primaryColumns = new ArrayList<>();

    /*public gameStats(String summonerName, String champName, String largestKillingSpree, String totalDamageDealtToChampions,
    String physicalDamageDealtToChampions, String magicDamageDealtToChampions, String trueDamageDealtToChampions,
                     String totalDamageDealt, String physicalDamageDealt, String magicDamageDealt, String trueDamageDealt,
                     String largestCriticalStrike, String goldEarned, String minionsKills, String towerKills,
                     String kills, String deaths, String assists, String largestMultiKill, String doubleKills,
                     String tripleKills, String quadraKills, String pentaKills)
    {

    }*/


    public ArrayList<String> populatePrimaryColumn()
    {
        primaryColumns.add("Summoner Name");
        primaryColumns.add("Champion Name");
        primaryColumns.add("Kills");
        primaryColumns.add("Deaths");
        primaryColumns.add("Assists");
        primaryColumns.add("Minions Killed");
        primaryColumns.add("Gold Earned");
        primaryColumns.add("Double Kills");
        primaryColumns.add("Triple Kills");
        primaryColumns.add("Quadra Kills");
        primaryColumns.add("Penta Kills");
        primaryColumns.add("Largest Killing Spree");
        primaryColumns.add("Largest MultiKill");
        primaryColumns.add("Total Damage Dealt To Champions");
        primaryColumns.add("Physical Damage Dealt To Champions");
        primaryColumns.add("Magic Damage Dealt To Champions");
        primaryColumns.add("True Damage Dealt To Champions");
        primaryColumns.add("Total Damage Dealt");
        primaryColumns.add("Physical Damage Dealt");
        primaryColumns.add("Magic Damage Dealt");
        primaryColumns.add("True Damage Dealt");
        primaryColumns.add("Towers Killed");
        primaryColumns.add("Largest Critical Strike");
        return primaryColumns;
    }

}
