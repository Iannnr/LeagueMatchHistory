package portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling;

import android.content.Context;
import android.graphics.drawable.Drawable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import portfolio.ian.com.leaguematchhistory.*;
import portfolio.ian.com.leaguematchhistory.DataHandling.ChampionList;

/**
 * Created by Ian on 31/07/2016.
 */
public class SummonerStats {
    public Drawable summonerIcon1, summonerIcon2;
    public Long kills1, kills2, deaths1, deaths2, assists1, assists2;
    public String summonerName1, summonerName2;
    public static String fullGameJson;
    static Context context;

    public SummonerStats(Drawable summonerIcon1, Drawable summonerIcon2, Long kills1, Long kills2, Long deaths1, Long deaths2, Long assists1, Long assists2, String summonerName1, String summonerName2, Context c)
    {
        this.summonerIcon1 = summonerIcon1;
        this.summonerIcon2 = summonerIcon2;
        this.kills1 = kills1;
        this.kills2 = kills2;
        this.deaths1 = deaths1;
        this.deaths2 = deaths2;
        this.assists1 = assists1;
        this.assists2 = assists2;
        this.summonerName1 = summonerName1;
        this.summonerName2 = summonerName2;
        context = c;
        //getStatsFromData();
    }

    SummonerStats getStatsFromData()
    {

        SummonerStats ss = null;
        try {
            JSONObject fullGameData = new JSONObject(fullGameJson);
            JSONArray participants = fullGameData.getJSONArray("participants");
            JSONArray participantIdentities = fullGameData.getJSONArray("participantIdentities");
            for (int i = 0; i < 10; i++) {

                //ss = new SummonerStats(getSummonerIcon(participants.getJSONObject(i).getInt("championID")), getSummonerIcon(participants.getJSONObject(i+5).getInt("championID")),
                //        participants.getJSONObject(i).getJSONObject("stats").getLong("kills"), participants.getJSONObject(i+5).getJSONObject("stats").getLong("kills"),
                //        participants.getJSONObject(i).getJSONObject("stats").getLong("deaths"), participants.getJSONObject(i+5).getJSONObject("stats").getLong("deaths"),
                //        participants.getJSONObject(i).getJSONObject("stats").getLong("assists"), participants.getJSONObject(i+5).getJSONObject("stats").getLong("deaths"),
                //        participantIdentities.getJSONObject(i).getJSONObject("player").getString("summonerName"), participantIdentities.getJSONObject(i+5).getJSONObject("player").getString("summonerName"), null);
            }
        }
        catch (JSONException e)
        {

        }
        //SummonerStats ss = new SummonerStats(null, null, null, null, null, null, null, null, null);
        return ss;
    }

    public Champion getSummonerIcon(int summonerID)
    {
        Champion champ = new Champion();
        ChampionList champList = new ChampionList();
        String champName = champList.championIDToName(summonerID);
        switch(champName)
        {
            case "Aatrox":
                champ.championName = "Aatrox";
                champ.icon = context.getResources().getDrawable(R.drawable.aatrox_square_);
            case "Ahri":
                champ.championName = "Ahri";
                champ.icon = context.getResources().getDrawable(R.drawable.ahri_square_);
            case "Akali":
                champ.championName = "Akali";
                champ.icon = context.getResources().getDrawable(R.drawable.akali_square_);
            case "Alistar":
                champ.championName = "Alistar";
                champ.icon = context.getResources().getDrawable(R.drawable.alistar_square_);
            case "Amumu":
                champ.championName = "Amumu";
                champ.icon = context.getResources().getDrawable(R.drawable.amumu_square_);
            case "Anivia":
                champ.championName = "Anivia";
                champ.icon = context.getResources().getDrawable(R.drawable.anivia_square_);
            case "Annie":
                champ.championName = "Annie";
                champ.icon = context.getResources().getDrawable(R.drawable.annie_square_);
            case "Ashe":
                champ.championName = "Ashe";
                champ.icon = context.getResources().getDrawable(R.drawable.ashe_square_);
            case "AurelionSol":
                champ.championName = "AurelionSol";
                champ.icon = context.getResources().getDrawable(R.drawable.aurelionsol_square_);
            case "Azir":
                champ.championName = "Azir";
                champ.icon = context.getResources().getDrawable(R.drawable.azir_square_);
            case "Bard":
                champ.championName = "Bard";
                champ.icon = context.getResources().getDrawable(R.drawable.bard_square_);
            case "Blitzcrank":
                champ.championName = "Blitzcrank";
                champ.icon = context.getResources().getDrawable(R.drawable.blitzcrank_square_);
            case "Brand":
                champ.championName = "Brand";
                champ.icon = context.getResources().getDrawable(R.drawable.brand_square_);
            case "Braum":
                champ.championName = "Braum";
                champ.icon = context.getResources().getDrawable(R.drawable.braum_square_);
            case "Caitlyn":
                champ.championName = "Caitlyn";
                champ.icon = context.getResources().getDrawable(R.drawable.caitlyn_square_);
            case "Cassiopeia":
                champ.championName = "Cassiopeia";
                champ.icon = context.getResources().getDrawable(R.drawable.cassiopeia_square_);
            case "Chogath":
                champ.championName = "Chogath";
                champ.icon = context.getResources().getDrawable(R.drawable.chogath_square_);
            case "Corki":
                champ.championName = "Corki";
                champ.icon = context.getResources().getDrawable(R.drawable.corki_square_);
            case "Darius":
                champ.championName = "Darius";
                champ.icon = context.getResources().getDrawable(R.drawable.darius_square_);
            case "Diana":
                champ.championName = "Diana";
                champ.icon = context.getResources().getDrawable(R.drawable.diana_square_);
            case "Draven":
                champ.championName = "Draven";
                champ.icon = context.getResources().getDrawable(R.drawable.draven_square_);
            case "DrMundo":
                champ.championName = "DrMundo";
                champ.icon = context.getResources().getDrawable(R.drawable.drmundo_square_);
            case "Ekko":
                champ.championName = "Ekko";
                champ.icon = context.getResources().getDrawable(R.drawable.ekko_square_);
            case "Elise":
                champ.championName = "Elise";
                champ.icon = context.getResources().getDrawable(R.drawable.elise_square_);
            case "Evelynn":
                champ.championName = "Evelynn";
                champ.icon = context.getResources().getDrawable(R.drawable.evelynn_square_);
            case "Ezreal":
                champ.championName = "Ezreal";
                champ.icon = context.getResources().getDrawable(R.drawable.ezreal_square_);
            case "FiddleSticks":
                champ.championName = "FiddleSticks";
                champ.icon = context.getResources().getDrawable(R.drawable.fiddlesticks_square_);
            case "Fiora":
                champ.championName = "Fiora";
                champ.icon = context.getResources().getDrawable(R.drawable.fiora_square_);
            case "Fizz":
                champ.championName = "Fizz";
                champ.icon = context.getResources().getDrawable(R.drawable.fizz_square_);
            case "Galio":
                champ.championName = "Galio";
                champ.icon = context.getResources().getDrawable(R.drawable.galio_square_);
            case "Gangplank":
                champ.championName = "Gangplank";
                champ.icon = context.getResources().getDrawable(R.drawable.gangplank_square_);
            case "Garen":
                champ.championName = "Garen";
                champ.icon = context.getResources().getDrawable(R.drawable.garen_square_);
            case "Gnar":
                champ.championName = "Gnar";
                champ.icon = context.getResources().getDrawable(R.drawable.gnar_square_);
            case "Gragas":
                champ.championName = "Gragas";
                champ.icon = context.getResources().getDrawable(R.drawable.gragas_square_);
            case "Graves":
                champ.championName = "Graves";
                champ.icon = context.getResources().getDrawable(R.drawable.graves_square_);
            case "Hecarim":
                champ.championName = "Hecarim";
                champ.icon = context.getResources().getDrawable(R.drawable.hecarim_square_);
            case "Heimerdinger":
                champ.championName = "Heimerdinger";
                champ.icon = context.getResources().getDrawable(R.drawable.heimerdinger_square_);
            case "Illaoi":
                champ.championName = "Illaoi";
                champ.icon = context.getResources().getDrawable(R.drawable.illaoi_square_);
            case "Irelia":
                champ.championName = "Irelia";
                champ.icon = context.getResources().getDrawable(R.drawable.irelia_square_);
            case "Janna":
                champ.championName = "Janna";
                champ.icon = context.getResources().getDrawable(R.drawable.janna_square_);
            case "JarvanIV":
                champ.championName = "JarvanIV";
                champ.icon = context.getResources().getDrawable(R.drawable.jarvaniv_square_);
            case "Jax":
                champ.championName = "Jax";
                champ.icon = context.getResources().getDrawable(R.drawable.jax_square_);
            case "Jayce":
                champ.championName = "Jayce";
                champ.icon = context.getResources().getDrawable(R.drawable.jayce_square_);
            case "Jhin":
                champ.championName = "Jhin";
                champ.icon = context.getResources().getDrawable(R.drawable.jhin_square_);
            case "Jinx":
                champ.championName = "Jinx";
                champ.icon = context.getResources().getDrawable(R.drawable.jinx_square_);
            case "Kalista":
                champ.championName = "Kalista";
                champ.icon = context.getResources().getDrawable(R.drawable.kalista_square_);
            case "Karma":
                champ.championName = "Karma";
                champ.icon = context.getResources().getDrawable(R.drawable.karma_square_);
            case "Karthus":
                champ.championName = "Karthus";
                champ.icon = context.getResources().getDrawable(R.drawable.karthus_square_);
            case "Kassadin":
                champ.championName = "Kassadin";
                champ.icon = context.getResources().getDrawable(R.drawable.kassadin_square_);
            case "Katarina":
                champ.championName = "Katarina";
                champ.icon = context.getResources().getDrawable(R.drawable.katarina_square_);
            case "Kayle":
                champ.championName = "Kayle";
                champ.icon = context.getResources().getDrawable(R.drawable.kayle_square_);
            case "Kennen":
                champ.championName = "Kennen";
                champ.icon = context.getResources().getDrawable(R.drawable.kennen_square_);
            case "Khazix":
                champ.championName = "Khazix";
                champ.icon = context.getResources().getDrawable(R.drawable.khazix_square_);
            case "Kindred":
                champ.championName = "Kindred";
                champ.icon = context.getResources().getDrawable(R.drawable.kindred_square_);
            case "KogMaw":
                champ.championName = "KogMaw";
                champ.icon = context.getResources().getDrawable(R.drawable.kogmaw_square_);
            case "Leblanc":
                champ.championName = "Leblanc";
                champ.icon = context.getResources().getDrawable(R.drawable.leblanc_square_);
            case "LeeSin":
                champ.championName = "LeeSin";
                champ.icon = context.getResources().getDrawable(R.drawable.leesin_square_);
            case "Leona":
                champ.championName = "Leona";
                champ.icon = context.getResources().getDrawable(R.drawable.leona_square_);
            case "Lissandra":
                champ.championName = "Lissandra";
                champ.icon = context.getResources().getDrawable(R.drawable.lissandra_square_);
            case "Lucian":
                champ.championName = "Lucian";
                champ.icon = context.getResources().getDrawable(R.drawable.lucian_square_);
            case "Lulu":
                champ.championName = "Lulu";
                champ.icon = context.getResources().getDrawable(R.drawable.lulu_square_);
            case "Lux":
                champ.championName = "Lux";
                champ.icon = context.getResources().getDrawable(R.drawable.lux_square_);
            case "Malphite":
                champ.championName = "Malphite";
                champ.icon = context.getResources().getDrawable(R.drawable.malphite_square_);
            case "Malzahar":
                champ.championName = "Malzahar";
                champ.icon = context.getResources().getDrawable(R.drawable.malzahar_square_);
            case "Maokai":
                champ.championName = "Maokai";
                champ.icon = context.getResources().getDrawable(R.drawable.maokai_square_);
            case "MasterYi":
                champ.championName = "MasterYi";
                champ.icon = context.getResources().getDrawable(R.drawable.masteryi_square_);
            case "MissFortune":
                champ.championName = "MissFortune";
                champ.icon = context.getResources().getDrawable(R.drawable.missfortune_square_);
            case "MonkeyKing":
                champ.championName = "MonkeyKing";
                champ.icon = context.getResources().getDrawable(R.drawable.monkeyking_square_);
            case "Mordekaiser":
                champ.championName = "Mordekaiser";
                champ.icon = context.getResources().getDrawable(R.drawable.mordekaiser_square_);
            case "Morgana":
                champ.championName = "Morgana";
                champ.icon = context.getResources().getDrawable(R.drawable.morgana_square_);
            case "Nami":
                champ.championName = "Nami";
                champ.icon = context.getResources().getDrawable(R.drawable.nami_square_);
            case "Nasus":
                champ.championName = "Nasus";
                champ.icon = context.getResources().getDrawable(R.drawable.nasus_square_);
            case "Nautilus":
                champ.championName = "Nautilus";
                champ.icon = context.getResources().getDrawable(R.drawable.nautilus_square_);
            case "Nidalee":
                champ.championName = "Nidalee";
                champ.icon = context.getResources().getDrawable(R.drawable.nidalee_square_);
            case "Nocturne":
                champ.championName = "Nocturne";
                champ.icon = context.getResources().getDrawable(R.drawable.nocturne_square_);
            case "Nunu":
                champ.championName = "Nunu";
                champ.icon = context.getResources().getDrawable(R.drawable.nunu_square_);
            case "Olaf":
                champ.championName = "Olaf";
                champ.icon = context.getResources().getDrawable(R.drawable.olaf_square_);
            case "Orianna":
                champ.championName = "Orianna";
                champ.icon = context.getResources().getDrawable(R.drawable.orianna_square_);
            case "Pantheon":
                champ.championName = "Pantheon";
                champ.icon = context.getResources().getDrawable(R.drawable.pantheon_square_);
            case "Poppy":
                champ.championName = "Poppy";
                champ.icon = context.getResources().getDrawable(R.drawable.poppy_square_);
            case "Quinn":
                champ.championName = "Quinn";
                champ.icon = context.getResources().getDrawable(R.drawable.quinn_square_);
            case "Rammus":
                champ.championName = "Rammus";
                champ.icon = context.getResources().getDrawable(R.drawable.rammus_square_);
            case "RekSai":
                champ.championName = "RekSai";
                champ.icon = context.getResources().getDrawable(R.drawable.reksai_square_);
            case "Renekton":
                champ.championName = "Renekton";
                champ.icon = context.getResources().getDrawable(R.drawable.renekton_square_);
            case "Rengar":
                champ.championName = "Rengar";
                champ.icon = context.getResources().getDrawable(R.drawable.rengar_square_);
            case "Riven":
                champ.championName = "Riven";
                champ.icon = context.getResources().getDrawable(R.drawable.riven_square_);
            case "Rumble":
                champ.championName = "Rumble";
                champ.icon = context.getResources().getDrawable(R.drawable.rumble_square_);
            case "Ryze":
                champ.championName = "Ryze";
                champ.icon = context.getResources().getDrawable(R.drawable.ryze_square_);
            case "Sejuani":
                champ.championName = "Sejuani";
                champ.icon = context.getResources().getDrawable(R.drawable.sejuani_square_);
            case "Shaco":
                champ.championName = "Shaco";
                champ.icon = context.getResources().getDrawable(R.drawable.shaco_square_);
            case "Shen":
                champ.championName = "Shen";
                champ.icon = context.getResources().getDrawable(R.drawable.shen_square_);
            case "Shyvana":
                champ.championName = "Shyvana";
                champ.icon = context.getResources().getDrawable(R.drawable.shyvana_square_);
            case "Singed":
                champ.championName = "Singed";
                champ.icon = context.getResources().getDrawable(R.drawable.singed_square_);
            case "Sion":
                champ.championName = "Sion";
                champ.icon = context.getResources().getDrawable(R.drawable.sion_square_);
            case "Sivir":
                champ.championName = "Sivir";
                champ.icon = context.getResources().getDrawable(R.drawable.sivir_square_);
            case "Skarner":
                champ.championName = "Skarner";
                champ.icon = context.getResources().getDrawable(R.drawable.skarner_square_);
            case "Sona":
                champ.championName = "Sona";
                champ.icon = context.getResources().getDrawable(R.drawable.sona_square_);
            case "Soraka":
                champ.championName = "Soraka";
                champ.icon = context.getResources().getDrawable(R.drawable.soraka_square_);
            case "Swain":
                champ.championName = "Swain";
                champ.icon = context.getResources().getDrawable(R.drawable.swain_square_);
            case "Syndra":
                champ.championName = "Syndra";
                champ.icon = context.getResources().getDrawable(R.drawable.syndra_square_);
            case "TahmKench":
                champ.championName = "TahmKench";
                champ.icon = context.getResources().getDrawable(R.drawable.tahmkench_square_);
            case "Taliyah":
                champ.championName = "Taliyah";
                champ.icon = context.getResources().getDrawable(R.drawable.taliyah_square_);
            case "Talon":
                champ.championName = "Talon";
                champ.icon = context.getResources().getDrawable(R.drawable.talon_square_);
            case "Taric":
                champ.championName = "Taric";
                champ.icon = context.getResources().getDrawable(R.drawable.taric_square_);
            case "Teemo":
                champ.championName = "Teemo";
                champ.icon = context.getResources().getDrawable(R.drawable.teemo_square_);
            case "Thresh":
                champ.championName = "Thresh";
                champ.icon = context.getResources().getDrawable(R.drawable.thresh_square_);
            case "Tristana":
                champ.championName = "Tristana";
                champ.icon = context.getResources().getDrawable(R.drawable.tristana_square_);
            case "Trundle":
                champ.championName = "Trundle";
                champ.icon = context.getResources().getDrawable(R.drawable.trundle_square_);
            case "Tryndamere":
                champ.championName = "Tryndamere";
                champ.icon = context.getResources().getDrawable(R.drawable.tryndamere_square_);
            case "TwistedFate":
                champ.championName = "TwistedFate";
                champ.icon = context.getResources().getDrawable(R.drawable.twistedfate_square_);
            case "Twitch":
                champ.championName = "Twitch";
                champ.icon = context.getResources().getDrawable(R.drawable.twitch_square_);
            case "Udyr":
                champ.championName = "Udyr";
                champ.icon = context.getResources().getDrawable(R.drawable.udyr_square_);
            case "Urgot":
                champ.championName = "Urgot";
                champ.icon = context.getResources().getDrawable(R.drawable.urgot_square_);
            case "Varus":
                champ.championName = "Varus";
                champ.icon = context.getResources().getDrawable(R.drawable.varus_square_);
            case "Vayne":
                champ.championName = "Vayne";
                champ.icon = context.getResources().getDrawable(R.drawable.vayne_square_);
            case "Veigar":
                champ.championName = "Veigar";
                champ.icon = context.getResources().getDrawable(R.drawable.veigar_square_);
            case "Velkoz":
                champ.championName = "Velkoz";
                champ.icon = context.getResources().getDrawable(R.drawable.velkoz_square_);
            case "Vi":
                champ.championName = "Vi";
                champ.icon = context.getResources().getDrawable(R.drawable.vi_square_);
            case "Viktor":
                champ.championName = "Viktor";
                champ.icon = context.getResources().getDrawable(R.drawable.viktor_square_);
            case "Vladimir":
                champ.championName = "Vladimir";
                champ.icon = context.getResources().getDrawable(R.drawable.vladimir_square_);
            case "Volibear":
                champ.championName = "Volibear";
                champ.icon = context.getResources().getDrawable(R.drawable.volibear_square_);
            case "Warwick":
                champ.championName = "Warwick";
                champ.icon = context.getResources().getDrawable(R.drawable.warwick_square_);
            case "Xerath":
                champ.championName = "Xerath";
                champ.icon = context.getResources().getDrawable(R.drawable.xerath_square_);
            case "XinZhao":
                champ.championName = "XinZhao";
                champ.icon = context.getResources().getDrawable(R.drawable.xinzhao_square_);
            case "Yasuo":
                champ.championName = "Yasuo";
                champ.icon = context.getResources().getDrawable(R.drawable.yasuo_square_);
            case "Yorick":
                champ.championName = "Yorick";
                champ.icon = context.getResources().getDrawable(R.drawable.yorick_square_);
            case "Zac":
                champ.championName = "Zac";
                champ.icon = context.getResources().getDrawable(R.drawable.zac_square_);
            case "Zed":
                champ.championName = "Zed";
                champ.icon = context.getResources().getDrawable(R.drawable.zed_square_);
            case "Ziggs":
                champ.championName = "Ziggs";
                champ.icon = context.getResources().getDrawable(R.drawable.ziggs_square_);
            case "Zilean":
                champ.championName = "Zilean";
                champ.icon = context.getResources().getDrawable(R.drawable.zilean_square_);
            case "Zyra":
                champ.championName = "Zyra";
                champ.icon = context.getResources().getDrawable(R.drawable.zyra_square_);
            default:
                champ.championName = null;
                champ.icon = null;

        }
        return champ;
    }

    public class Champion
    {
        public String championName;
        public Drawable icon;
    }
}
