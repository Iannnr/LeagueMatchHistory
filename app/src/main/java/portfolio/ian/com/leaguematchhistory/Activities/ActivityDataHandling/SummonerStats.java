package portfolio.ian.com.leaguematchhistory.Activities.ActivityDataHandling;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

import portfolio.ian.com.leaguematchhistory.DataHandling.ChampionList;
import portfolio.ian.com.leaguematchhistory.R;

/**
 * Created by Ian on 31/07/2016.
 */
public class SummonerStats {
    public Drawable summonerIcon1, summonerIcon2;
    public Long kills1, kills2, deaths1, deaths2, assists1, assists2;
    public String summonerName1, summonerName2;
    public static ArrayList<String> fullGameJson = new ArrayList<>();
    public static String individualGameJSON;
    static Context context;

    public SummonerStats(Drawable summonerIcon1, Drawable summonerIcon2, Long kills1, Long kills2, Long deaths1, Long deaths2, Long assists1, Long assists2, String summonerName1, String summonerName2, Context c) {
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
    }

    public Champion getSummonerIcon(int summonerID) {
        Champion champ = new Champion();
        champ.championName = "";
        champ.icon = null;
        ChampionList champList = new ChampionList();
        String champName = champList.championIDToName(summonerID);
        switch (champName) {
            case "Aatrox":
                champ.championName = "Aatrox";
                champ.icon = context.getResources().getDrawable(R.drawable.aatrox_square_);
                break;
            case "Ahri":
                champ.championName = "Ahri";
                champ.icon = context.getResources().getDrawable(R.drawable.ahri_square_);
                break;
            case "Akali":
                champ.championName = "Akali";
                champ.icon = context.getResources().getDrawable(R.drawable.akali_square_);
                break;
            case "Alistar":
                champ.championName = "Alistar";
                champ.icon = context.getResources().getDrawable(R.drawable.alistar_square_);
                break;
            case "Amumu":
                champ.championName = "Amumu";
                champ.icon = context.getResources().getDrawable(R.drawable.amumu_square_);
                break;
            case "Anivia":
                champ.championName = "Anivia";
                champ.icon = context.getResources().getDrawable(R.drawable.anivia_square_);
                break;
            case "Annie":
                champ.championName = "Annie";
                champ.icon = context.getResources().getDrawable(R.drawable.annie_square_);
                break;
            case "Ashe":
                champ.championName = "Ashe";
                champ.icon = context.getResources().getDrawable(R.drawable.ashe_square_);
                break;
            case "Aurelion Sol":
                champ.championName = "AurelionSol";
                champ.icon = context.getResources().getDrawable(R.drawable.aurelionsol_square_);
                break;
            case "Azir":
                champ.championName = "Azir";
                champ.icon = context.getResources().getDrawable(R.drawable.azir_square_);
                break;
            case "Bard":
                champ.championName = "Bard";
                champ.icon = context.getResources().getDrawable(R.drawable.bard_square_);
                break;
            case "Blitzcrank":
                champ.championName = "Blitzcrank";
                champ.icon = context.getResources().getDrawable(R.drawable.blitzcrank_square_);
                break;
            case "Brand":
                champ.championName = "Brand";
                champ.icon = context.getResources().getDrawable(R.drawable.brand_square_);
                break;
            case "Braum":
                champ.championName = "Braum";
                champ.icon = context.getResources().getDrawable(R.drawable.braum_square_);
                break;
            case "Caitlyn":
                champ.championName = "Caitlyn";
                champ.icon = context.getResources().getDrawable(R.drawable.caitlyn_square_);
                break;
            case "Cassiopeia":
                champ.championName = "Cassiopeia";
                champ.icon = context.getResources().getDrawable(R.drawable.cassiopeia_square_);
                break;
            case "Chogath":
                champ.championName = "Chogath";
                champ.icon = context.getResources().getDrawable(R.drawable.chogath_square_);
                break;
            case "Corki":
                champ.championName = "Corki";
                champ.icon = context.getResources().getDrawable(R.drawable.corki_square_);
                break;
            case "Darius":
                champ.championName = "Darius";
                champ.icon = context.getResources().getDrawable(R.drawable.darius_square_);
                break;
            case "Diana":
                champ.championName = "Diana";
                champ.icon = context.getResources().getDrawable(R.drawable.diana_square_);
                break;
            case "Draven":
                champ.championName = "Draven";
                champ.icon = context.getResources().getDrawable(R.drawable.draven_square_);
                break;
            case "Dr Mundo":
                champ.championName = "DrMundo";
                champ.icon = context.getResources().getDrawable(R.drawable.drmundo_square_);
                break;
            case "Ekko":
                champ.championName = "Ekko";
                champ.icon = context.getResources().getDrawable(R.drawable.ekko_square_);
                break;
            case "Elise":
                champ.championName = "Elise";
                champ.icon = context.getResources().getDrawable(R.drawable.elise_square_);
                break;
            case "Evelynn":
                champ.championName = "Evelynn";
                champ.icon = context.getResources().getDrawable(R.drawable.evelynn_square_);
                break;
            case "Ezreal":
                champ.championName = "Ezreal";
                champ.icon = context.getResources().getDrawable(R.drawable.ezreal_square_);
                break;
            case "FiddleSticks":
                champ.championName = "FiddleSticks";
                champ.icon = context.getResources().getDrawable(R.drawable.fiddlesticks_square_);
                break;
            case "Fiora":
                champ.championName = "Fiora";
                champ.icon = context.getResources().getDrawable(R.drawable.fiora_square_);
                break;
            case "Fizz":
                champ.championName = "Fizz";
                champ.icon = context.getResources().getDrawable(R.drawable.fizz_square_);
                break;
            case "Galio":
                champ.championName = "Galio";
                champ.icon = context.getResources().getDrawable(R.drawable.galio_square_);
                break;
            case "Gangplank":
                champ.championName = "Gangplank";
                champ.icon = context.getResources().getDrawable(R.drawable.gangplank_square_);
                break;
            case "Garen":
                champ.championName = "Garen";
                champ.icon = context.getResources().getDrawable(R.drawable.garen_square_);
                break;
            case "Gnar":
                champ.championName = "Gnar";
                champ.icon = context.getResources().getDrawable(R.drawable.gnar_square_);
                break;
            case "Gragas":
                champ.championName = "Gragas";
                champ.icon = context.getResources().getDrawable(R.drawable.gragas_square_);
                break;
            case "Graves":
                champ.championName = "Graves";
                champ.icon = context.getResources().getDrawable(R.drawable.graves_square_);
                break;
            case "Hecarim":
                champ.championName = "Hecarim";
                champ.icon = context.getResources().getDrawable(R.drawable.hecarim_square_);
                break;
            case "Heimerdinger":
                champ.championName = "Heimerdinger";
                champ.icon = context.getResources().getDrawable(R.drawable.heimerdinger_square_);
                break;
            case "Illaoi":
                champ.championName = "Illaoi";
                champ.icon = context.getResources().getDrawable(R.drawable.illaoi_square_);
                break;
            case "Irelia":
                champ.championName = "Irelia";
                champ.icon = context.getResources().getDrawable(R.drawable.irelia_square_);
                break;
            case "Janna":
                champ.championName = "Janna";
                champ.icon = context.getResources().getDrawable(R.drawable.janna_square_);
                break;
            case "JarvanIV":
                champ.championName = "JarvanIV";
                champ.icon = context.getResources().getDrawable(R.drawable.jarvaniv_square_);
                break;
            case "Jax":
                champ.championName = "Jax";
                champ.icon = context.getResources().getDrawable(R.drawable.jax_square_);
                break;
            case "Jayce":
                champ.championName = "Jayce";
                champ.icon = context.getResources().getDrawable(R.drawable.jayce_square_);
                break;
            case "Jhin":
                champ.championName = "Jhin";
                champ.icon = context.getResources().getDrawable(R.drawable.jhin_square_);
                break;
            case "Jinx":
                champ.championName = "Jinx";
                champ.icon = context.getResources().getDrawable(R.drawable.jinx_square_);
                break;
            case "Kalista":
                champ.championName = "Kalista";
                champ.icon = context.getResources().getDrawable(R.drawable.kalista_square_);
                break;
            case "Karma":
                champ.championName = "Karma";
                champ.icon = context.getResources().getDrawable(R.drawable.karma_square_);
                break;
            case "Karthus":
                champ.championName = "Karthus";
                champ.icon = context.getResources().getDrawable(R.drawable.karthus_square_);
                break;
            case "Kassadin":
                champ.championName = "Kassadin";
                champ.icon = context.getResources().getDrawable(R.drawable.kassadin_square_);
                break;
            case "Katarina":
                champ.championName = "Katarina";
                champ.icon = context.getResources().getDrawable(R.drawable.katarina_square_);
                break;
            case "Kayle":
                champ.championName = "Kayle";
                champ.icon = context.getResources().getDrawable(R.drawable.kayle_square_);
                break;
            case "Kennen":
                champ.championName = "Kennen";
                champ.icon = context.getResources().getDrawable(R.drawable.kennen_square_);
                break;
            case "Khazix":
                champ.championName = "Khazix";
                champ.icon = context.getResources().getDrawable(R.drawable.khazix_square_);
                break;
            case "Kindred":
                champ.championName = "Kindred";
                champ.icon = context.getResources().getDrawable(R.drawable.kindred_square_);
                break;
            case "Kog Maw":
                champ.championName = "KogMaw";
                champ.icon = context.getResources().getDrawable(R.drawable.kogmaw_square_);
                break;
            case "LeBlanc":
                champ.championName = "LeBlanc";
                champ.icon = context.getResources().getDrawable(R.drawable.leblanc_square_);
                break;
            case "Lee Sin":
                champ.championName = "LeeSin";
                champ.icon = context.getResources().getDrawable(R.drawable.leesin_square_);
                break;
            case "Leona":
                champ.championName = "Leona";
                champ.icon = context.getResources().getDrawable(R.drawable.leona_square_);
                break;
            case "Lissandra":
                champ.championName = "Lissandra";
                champ.icon = context.getResources().getDrawable(R.drawable.lissandra_square_);
                break;
            case "Lucian":
                champ.championName = "Lucian";
                champ.icon = context.getResources().getDrawable(R.drawable.lucian_square_);
                break;
            case "Lulu":
                champ.championName = "Lulu";
                champ.icon = context.getResources().getDrawable(R.drawable.lulu_square_);
                break;
            case "Lux":
                champ.championName = "Lux";
                champ.icon = context.getResources().getDrawable(R.drawable.lux_square_);
                break;
            case "Malphite":
                champ.championName = "Malphite";
                champ.icon = context.getResources().getDrawable(R.drawable.malphite_square_);
                break;
            case "Malzahar":
                champ.championName = "Malzahar";
                champ.icon = context.getResources().getDrawable(R.drawable.malzahar_square_);
                break;
            case "Maokai":
                champ.championName = "Maokai";
                champ.icon = context.getResources().getDrawable(R.drawable.maokai_square_);
                break;
            case "Master Yi":
                champ.championName = "Master Yi";
                champ.icon = context.getResources().getDrawable(R.drawable.masteryi_square_);
                break;
            case "Miss Fortune":
                champ.championName = "MissFortune";
                champ.icon = context.getResources().getDrawable(R.drawable.missfortune_square_);
                break;
            case "Wukong":
                champ.championName = "Wukong";
                champ.icon = context.getResources().getDrawable(R.drawable.monkeyking_square_);
                break;
            case "Mordekaiser":
                champ.championName = "Mordekaiser";
                champ.icon = context.getResources().getDrawable(R.drawable.mordekaiser_square_);
                break;
            case "Morgana":
                champ.championName = "Morgana";
                champ.icon = context.getResources().getDrawable(R.drawable.morgana_square_);
                break;
            case "Nami":
                champ.championName = "Nami";
                champ.icon = context.getResources().getDrawable(R.drawable.nami_square_);
                break;
            case "Nasus":
                champ.championName = "Nasus";
                champ.icon = context.getResources().getDrawable(R.drawable.nasus_square_);
                break;
            case "Nautilus":
                champ.championName = "Nautilus";
                champ.icon = context.getResources().getDrawable(R.drawable.nautilus_square_);
                break;
            case "Nidalee":
                champ.championName = "Nidalee";
                champ.icon = context.getResources().getDrawable(R.drawable.nidalee_square_);
                break;
            case "Nocturne":
                champ.championName = "Nocturne";
                champ.icon = context.getResources().getDrawable(R.drawable.nocturne_square_);
                break;
            case "Nunu":
                champ.championName = "Nunu";
                champ.icon = context.getResources().getDrawable(R.drawable.nunu_square_);
                break;
            case "Olaf":
                champ.championName = "Olaf";
                champ.icon = context.getResources().getDrawable(R.drawable.olaf_square_);
                break;
            case "Orianna":
                champ.championName = "Orianna";
                champ.icon = context.getResources().getDrawable(R.drawable.orianna_square_);
                break;
            case "Pantheon":
                champ.championName = "Pantheon";
                champ.icon = context.getResources().getDrawable(R.drawable.pantheon_square_);
                break;
            case "Poppy":
                champ.championName = "Poppy";
                champ.icon = context.getResources().getDrawable(R.drawable.poppy_square_);
                break;
            case "Quinn":
                champ.championName = "Quinn";
                champ.icon = context.getResources().getDrawable(R.drawable.quinn_square_);
                break;
            case "Rammus":
                champ.championName = "Rammus";
                champ.icon = context.getResources().getDrawable(R.drawable.rammus_square_);
                break;
            case "RekSai":
                champ.championName = "RekSai";
                champ.icon = context.getResources().getDrawable(R.drawable.reksai_square_);
                break;
            case "Renekton":
                champ.championName = "Renekton";
                champ.icon = context.getResources().getDrawable(R.drawable.renekton_square_);
                break;
            case "Rengar":
                champ.championName = "Rengar";
                champ.icon = context.getResources().getDrawable(R.drawable.rengar_square_);
                break;
            case "Riven":
                champ.championName = "Riven";
                champ.icon = context.getResources().getDrawable(R.drawable.riven_square_);
                break;
            case "Rumble":
                champ.championName = "Rumble";
                champ.icon = context.getResources().getDrawable(R.drawable.rumble_square_);
                break;
            case "Ryze":
                champ.championName = "Ryze";
                champ.icon = context.getResources().getDrawable(R.drawable.ryze_square_);
                break;
            case "Sejuani":
                champ.championName = "Sejuani";
                champ.icon = context.getResources().getDrawable(R.drawable.sejuani_square_);
                break;
            case "Shaco":
                champ.championName = "Shaco";
                champ.icon = context.getResources().getDrawable(R.drawable.shaco_square_);
                break;
            case "Shen":
                champ.championName = "Shen";
                champ.icon = context.getResources().getDrawable(R.drawable.shen_square_);
                break;
            case "Shyvana":
                champ.championName = "Shyvana";
                champ.icon = context.getResources().getDrawable(R.drawable.shyvana_square_);
                break;
            case "Singed":
                champ.championName = "Singed";
                champ.icon = context.getResources().getDrawable(R.drawable.singed_square_);
                break;
            case "Sion":
                champ.championName = "Sion";
                champ.icon = context.getResources().getDrawable(R.drawable.sion_square_);
                break;
            case "Sivir":
                champ.championName = "Sivir";
                champ.icon = context.getResources().getDrawable(R.drawable.sivir_square_);
                break;
            case "Skarner":
                champ.championName = "Skarner";
                champ.icon = context.getResources().getDrawable(R.drawable.skarner_square_);
                break;
            case "Sona":
                champ.championName = "Sona";
                champ.icon = context.getResources().getDrawable(R.drawable.sona_square_);
                break;
            case "Soraka":
                champ.championName = "Soraka";
                champ.icon = context.getResources().getDrawable(R.drawable.soraka_square_);
                break;
            case "Swain":
                champ.championName = "Swain";
                champ.icon = context.getResources().getDrawable(R.drawable.swain_square_);
                break;
            case "Syndra":
                champ.championName = "Syndra";
                champ.icon = context.getResources().getDrawable(R.drawable.syndra_square_);
                break;
            case "Tahm Kench":
                champ.championName = "TahmKench";
                champ.icon = context.getResources().getDrawable(R.drawable.tahmkench_square_);
                break;
            case "Taliyah":
                champ.championName = "Taliyah";
                champ.icon = context.getResources().getDrawable(R.drawable.taliyah_square_);
                break;
            case "Talon":
                champ.championName = "Talon";
                champ.icon = context.getResources().getDrawable(R.drawable.talon_square_);
                break;
            case "Taric":
                champ.championName = "Taric";
                champ.icon = context.getResources().getDrawable(R.drawable.taric_square_);
                break;
            case "Teemo":
                champ.championName = "Teemo";
                champ.icon = context.getResources().getDrawable(R.drawable.teemo_square_);
                break;
            case "Thresh":
                champ.championName = "Thresh";
                champ.icon = context.getResources().getDrawable(R.drawable.thresh_square_);
                break;
            case "Tristana":
                champ.championName = "Tristana";
                champ.icon = context.getResources().getDrawable(R.drawable.tristana_square_);
                break;
            case "Trundle":
                champ.championName = "Trundle";
                champ.icon = context.getResources().getDrawable(R.drawable.trundle_square_);
                break;
            case "Tryndamere":
                champ.championName = "Tryndamere";
                champ.icon = context.getResources().getDrawable(R.drawable.tryndamere_square_);
                break;
            case "Twisted Fate":
                champ.championName = "TwistedFate";
                champ.icon = context.getResources().getDrawable(R.drawable.twistedfate_square_);
                break;
            case "Twitch":
                champ.championName = "Twitch";
                champ.icon = context.getResources().getDrawable(R.drawable.twitch_square_);
                break;
            case "Udyr":
                champ.championName = "Udyr";
                champ.icon = context.getResources().getDrawable(R.drawable.udyr_square_);
                break;
            case "Urgot":
                champ.championName = "Urgot";
                champ.icon = context.getResources().getDrawable(R.drawable.urgot_square_);
                break;
            case "Varus":
                champ.championName = "Varus";
                champ.icon = context.getResources().getDrawable(R.drawable.varus_square_);
                break;
            case "Vayne":
                champ.championName = "Vayne";
                champ.icon = context.getResources().getDrawable(R.drawable.vayne_square_);
                break;
            case "Veigar":
                champ.championName = "Veigar";
                champ.icon = context.getResources().getDrawable(R.drawable.veigar_square_);
                break;
            case "Vel'Koz":
                champ.championName = "Vel'Koz";
                champ.icon = context.getResources().getDrawable(R.drawable.velkoz_square_);
                break;
            case "Vi":
                champ.championName = "Vi";
                champ.icon = context.getResources().getDrawable(R.drawable.vi_square_);
                break;
            case "Viktor":
                champ.championName = "Viktor";
                champ.icon = context.getResources().getDrawable(R.drawable.viktor_square_);
                break;
            case "Vladimir":
                champ.championName = "Vladimir";
                champ.icon = context.getResources().getDrawable(R.drawable.vladimir_square_);
                break;
            case "Volibear":
                champ.championName = "Volibear";
                champ.icon = context.getResources().getDrawable(R.drawable.volibear_square_);
                break;
            case "Warwick":
                champ.championName = "Warwick";
                champ.icon = context.getResources().getDrawable(R.drawable.warwick_square_);
                break;
            case "Xerath":
                champ.championName = "Xerath";
                champ.icon = context.getResources().getDrawable(R.drawable.xerath_square_);
                break;
            case "Xin Zhao":
                champ.championName = "XinZhao";
                champ.icon = context.getResources().getDrawable(R.drawable.xinzhao_square_);
                break;
            case "Yasuo":
                champ.championName = "Yasuo";
                champ.icon = context.getResources().getDrawable(R.drawable.yasuo_square_);
                break;
            case "Yorick":
                champ.championName = "Yorick";
                champ.icon = context.getResources().getDrawable(R.drawable.yorick_square_);
                break;
            case "Zac":
                champ.championName = "Zac";
                champ.icon = context.getResources().getDrawable(R.drawable.zac_square_);
                break;
            case "Zed":
                champ.championName = "Zed";
                champ.icon = context.getResources().getDrawable(R.drawable.zed_square_);
                break;
            case "Ziggs":
                champ.championName = "Ziggs";
                champ.icon = context.getResources().getDrawable(R.drawable.ziggs_square_);
                break;
            case "Zilean":
                champ.championName = "Zilean";
                champ.icon = context.getResources().getDrawable(R.drawable.zilean_square_);
                break;
            case "Zyra":
                champ.championName = "Zyra";
                champ.icon = context.getResources().getDrawable(R.drawable.zyra_square_);
                break;
            default:
                champ.championName = null;
                champ.icon = null;

        }
        return champ;
    }

    public class Champion {
        public String championName;
        public Drawable icon;
    }
}
