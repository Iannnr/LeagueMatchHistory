package portfolio.ian.com.leaguematchhistory.Activities;

import android.content.Context;
import android.graphics.Bitmap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import portfolio.ian.com.leaguematchhistory.Constants.BitmapDecoding;
import portfolio.ian.com.leaguematchhistory.R;


/**
 * Created by Ian on 16/07/2016.
 */
public class ChampionSplashHeader {

    String getChampionSkinName(String champName) {
        ArrayList<String> championSkinId = new ArrayList<>();
        switch (champName) {
            case "Aatrox":
                championSkinId.add("aatrox_0");
                championSkinId.add("aatrox_1");
                championSkinId.add("aatrox_2");
                championSkinId.add("aatrox_3");
                break;
            case "Ahri":
                championSkinId.add("ahri_0");
                championSkinId.add("ahri_1");
                championSkinId.add("ahri_2");
                championSkinId.add("ahri_3");
                championSkinId.add("ahri_4");
                championSkinId.add("ahri_5");
                championSkinId.add("ahri_6");
                break;
            case "Akali":
                championSkinId.add("akali_0");
                championSkinId.add("akali_1");
                championSkinId.add("akali_2");
                championSkinId.add("akali_3");
                championSkinId.add("akali_4");
                championSkinId.add("akali_5");
                championSkinId.add("akali_6");
                championSkinId.add("akali_7");
                break;
            case "Alistar":
                championSkinId.add("alistar_0");
                championSkinId.add("alistar_1");
                championSkinId.add("alistar_2");
                championSkinId.add("alistar_3");
                championSkinId.add("alistar_4");
                championSkinId.add("alistar_5");
                championSkinId.add("alistar_6");
                championSkinId.add("alistar_7");
                championSkinId.add("alistar_8");
                break;
            case "Amumu":
                championSkinId.add("amumu_0");
                championSkinId.add("amumu_1");
                championSkinId.add("amumu_2");
                championSkinId.add("amumu_3");
                championSkinId.add("amumu_4");
                championSkinId.add("amumu_5");
                championSkinId.add("amumu_6");
                championSkinId.add("amumu_7");
                championSkinId.add("amumu_8");
                break;
            case "Anivia":
                championSkinId.add("anivia_0");
                championSkinId.add("anivia_1");
                championSkinId.add("anivia_2");
                championSkinId.add("anivia_3");
                championSkinId.add("anivia_4");
                championSkinId.add("anivia_5");
                championSkinId.add("anivia_6");
                break;
            case "Annie":
                championSkinId.add("annie_0");
                championSkinId.add("annie_1");
                championSkinId.add("annie_2");
                championSkinId.add("annie_3");
                championSkinId.add("annie_4");
                championSkinId.add("annie_5");
                championSkinId.add("annie_6");
                championSkinId.add("annie_7");
                championSkinId.add("annie_8");
                championSkinId.add("annie_9");
                championSkinId.add("annie_10");
                break;
            case "Ashe":
                championSkinId.add("ashe_0");
                championSkinId.add("ashe_1");
                championSkinId.add("ashe_2");
                championSkinId.add("ashe_3");
                championSkinId.add("ashe_4");
                championSkinId.add("ashe_5");
                championSkinId.add("ashe_6");
                championSkinId.add("ashe_7");
                break;
            case "AurelionSol":
                championSkinId.add("aurelionsol_0");
                championSkinId.add("aurelionsol_1");
                break;
            case "Azir":
                championSkinId.add("azir_0");
                championSkinId.add("azir_1");
                championSkinId.add("azir_2");
                break;
            case "BaR.d":
                championSkinId.add("bard_0");
                championSkinId.add("bard_1");
                championSkinId.add("bard_5");
                break;
            case "Blitzcrank":
                championSkinId.add("blitzcrank_0");
                championSkinId.add("blitzcrank_1");
                championSkinId.add("blitzcrank_2");
                championSkinId.add("blitzcrank_3");
                championSkinId.add("blitzcrank_4");
                championSkinId.add("blitzcrank_5");
                championSkinId.add("blitzcrank_6");
                championSkinId.add("blitzcrank_7");
                championSkinId.add("blitzcrank_11");
                break;
            case "Brand":
                championSkinId.add("brand_0");
                championSkinId.add("brand_1");
                championSkinId.add("brand_2");
                championSkinId.add("brand_3");
                championSkinId.add("brand_4");
                championSkinId.add("brand_5");
                break;
            case "Braum":
                championSkinId.add("braum_0");
                championSkinId.add("braum_1");
                championSkinId.add("braum_2");
                championSkinId.add("braum_3");
                break;
            case "Caitlyn":
                championSkinId.add("caitlyn_0");
                championSkinId.add("caitlyn_1");
                championSkinId.add("caitlyn_2");
                championSkinId.add("caitlyn_3");
                championSkinId.add("caitlyn_4");
                championSkinId.add("caitlyn_5");
                championSkinId.add("caitlyn_6");
                championSkinId.add("caitlyn_10");
                break;
            case "Cassiopeia":
                championSkinId.add("cassiopeia_0");
                championSkinId.add("cassiopeia_1");
                championSkinId.add("cassiopeia_2");
                championSkinId.add("cassiopeia_3");
                championSkinId.add("cassiopeia_4");
                break;
            case "Chogath":
                championSkinId.add("chogath_0");
                championSkinId.add("chogath_1");
                championSkinId.add("chogath_2");
                championSkinId.add("chogath_3");
                championSkinId.add("chogath_4");
                championSkinId.add("chogath_5");
                championSkinId.add("chogath_6");
                break;
            case "Corki":
                championSkinId.add("corki_0");
                championSkinId.add("corki_1");
                championSkinId.add("corki_2");
                championSkinId.add("corki_3");
                championSkinId.add("corki_4");
                championSkinId.add("corki_5");
                championSkinId.add("corki_6");
                championSkinId.add("corki_7");
                break;
            case "Darius":
                championSkinId.add("darius_0");
                championSkinId.add("darius_1");
                championSkinId.add("darius_2");
                championSkinId.add("darius_3");
                championSkinId.add("darius_4");
                championSkinId.add("darius_8");
                break;
            case "Diana":
                championSkinId.add("diana_0");
                championSkinId.add("diana_1");
                championSkinId.add("diana_2");
                championSkinId.add("diana_3");
                break;
            case "Draven":
                championSkinId.add("draven_0");
                championSkinId.add("draven_1");
                championSkinId.add("draven_2");
                championSkinId.add("draven_3");
                championSkinId.add("draven_4");
                championSkinId.add("draven_5");
                championSkinId.add("draven_6");
                break;
            case "DrMundo":
                championSkinId.add("drmundo_0");
                championSkinId.add("drmundo_1");
                championSkinId.add("drmundo_2");
                championSkinId.add("drmundo_3");
                championSkinId.add("drmundo_4");
                championSkinId.add("drmundo_5");
                championSkinId.add("drmundo_6");
                championSkinId.add("drmundo_7");
                championSkinId.add("drmundo_8");
                championSkinId.add("drmundo_9");
                break;
            case "Ekko":
                championSkinId.add("ekko_0");
                championSkinId.add("ekko_1");
                championSkinId.add("ekko_2");
                break;
            case "Elise":
                championSkinId.add("elise_0");
                championSkinId.add("elise_1");
                championSkinId.add("elise_2");
                championSkinId.add("elise_3");
                break;
            case "Evelynn":
                championSkinId.add("evelynn_0");
                championSkinId.add("evelynn_1");
                championSkinId.add("evelynn_2");
                championSkinId.add("evelynn_3");
                championSkinId.add("evelynn_4");
                break;
            case "Ezreal":
                championSkinId.add("ezreal_0");
                championSkinId.add("ezreal_1");
                championSkinId.add("ezreal_2");
                championSkinId.add("ezreal_3");
                championSkinId.add("ezreal_4");
                championSkinId.add("ezreal_5");
                championSkinId.add("ezreal_6");
                championSkinId.add("ezreal_7");
                championSkinId.add("ezreal_8");
                break;
            case "FiddleSticks":
                championSkinId.add("fiddlesticks_0");
                championSkinId.add("fiddlesticks_1");
                championSkinId.add("fiddlesticks_2");
                championSkinId.add("fiddlesticks_3");
                championSkinId.add("fiddlesticks_4");
                championSkinId.add("fiddlesticks_5");
                championSkinId.add("fiddlesticks_6");
                championSkinId.add("fiddlesticks_7");
                championSkinId.add("fiddlesticks_8");
                break;
            case "Fiora":
                championSkinId.add("fiora_0");
                championSkinId.add("fiora_1");
                championSkinId.add("fiora_2");
                championSkinId.add("fiora_3");
                championSkinId.add("fiora_4");
                championSkinId.add("fiora_5");
                break;
            case "Fizz":
                championSkinId.add("fizz_0");
                championSkinId.add("fizz_1");
                championSkinId.add("fizz_2");
                championSkinId.add("fizz_3");
                championSkinId.add("fizz_4");
                championSkinId.add("fizz_8");
                championSkinId.add("fizz_9");
                break;
            case "Galio":
                championSkinId.add("galio_0");
                championSkinId.add("galio_1");
                championSkinId.add("galio_2");
                championSkinId.add("galio_3");
                championSkinId.add("galio_4");
                championSkinId.add("galio_5");
                break;
            case "Gangplank":
                championSkinId.add("gangplank_0");
                championSkinId.add("gangplank_1");
                championSkinId.add("gangplank_2");
                championSkinId.add("gangplank_3");
                championSkinId.add("gangplank_4");
                championSkinId.add("gangplank_5");
                championSkinId.add("gangplank_6");
                championSkinId.add("gangplank_7");
                break;
            case "Garen":
                championSkinId.add("garen_0");
                championSkinId.add("garen_1");
                championSkinId.add("garen_2");
                championSkinId.add("garen_3");
                championSkinId.add("garen_4");
                championSkinId.add("garen_5");
                championSkinId.add("garen_6");
                championSkinId.add("garen_10");
                break;
            case "Gnar":
                championSkinId.add("gnar_0");
                championSkinId.add("gnar_1");
                championSkinId.add("gnar_2");
                championSkinId.add("gnar_3");
                championSkinId.add("gnar_4");
                break;
            case "Gragas":
                championSkinId.add("gragas_0");
                championSkinId.add("gragas_1");
                championSkinId.add("gragas_2");
                championSkinId.add("gragas_3");
                championSkinId.add("gragas_4");
                championSkinId.add("gragas_5");
                championSkinId.add("gragas_6");
                championSkinId.add("gragas_7");
                championSkinId.add("gragas_8");
                championSkinId.add("gragas_9");
                break;
            case "Graves":
                championSkinId.add("graves_0");
                championSkinId.add("graves_1");
                championSkinId.add("graves_2");
                championSkinId.add("graves_3");
                championSkinId.add("graves_4");
                championSkinId.add("graves_5");
                championSkinId.add("graves_6");
                break;
            case "Hecarim":
                championSkinId.add("hecarim_0");
                championSkinId.add("hecarim_1");
                championSkinId.add("hecarim_2");
                championSkinId.add("hecarim_3");
                championSkinId.add("hecarim_4");
                championSkinId.add("hecarim_5");
                break;
            case "Heimerdinger":
                championSkinId.add("heimerdinger_0");
                championSkinId.add("heimerdinger_1");
                championSkinId.add("heimerdinger_2");
                championSkinId.add("heimerdinger_3");
                championSkinId.add("heimerdinger_4");
                championSkinId.add("heimerdinger_5");
                break;
            case "Illaoi":
                championSkinId.add("illaoi_0");
                championSkinId.add("illaoi_1");
                break;
            case "Irelia":
                championSkinId.add("irelia_0");
                championSkinId.add("irelia_1");
                championSkinId.add("irelia_2");
                championSkinId.add("irelia_3");
                championSkinId.add("irelia_4");
                championSkinId.add("irelia_5");
                break;
            case "Janna":
                championSkinId.add("janna_0");
                championSkinId.add("janna_1");
                championSkinId.add("janna_2");
                championSkinId.add("janna_3");
                championSkinId.add("janna_4");
                championSkinId.add("janna_5");
                championSkinId.add("janna_6");
                break;
            case "JarvanIV":
                championSkinId.add("jarvaniv_0");
                championSkinId.add("jarvaniv_1");
                championSkinId.add("jarvaniv_2");
                championSkinId.add("jarvaniv_3");
                championSkinId.add("jarvaniv_4");
                championSkinId.add("jarvaniv_5");
                championSkinId.add("jarvaniv_6");
                break;
            case "Jax":
                championSkinId.add("jax_0");
                championSkinId.add("jax_1");
                championSkinId.add("jax_2");
                championSkinId.add("jax_3");
                championSkinId.add("jax_4");
                championSkinId.add("jax_5");
                championSkinId.add("jax_6");
                championSkinId.add("jax_7");
                championSkinId.add("jax_12");
                break;
            case "Jayce":
                championSkinId.add("jayce_0");
                championSkinId.add("jayce_1");
                championSkinId.add("jayce_2");
                championSkinId.add("jayce_3");
                break;
            case "Jhin":
                championSkinId.add("jhin_0");
                championSkinId.add("jhin_1");
                break;
            case "Jinx":
                championSkinId.add("jinx_0");
                championSkinId.add("jinx_1");
                championSkinId.add("jinx_2");
                championSkinId.add("jinx_3");
                break;
            case "Kalista":
                championSkinId.add("kalista_0");
                championSkinId.add("kalista_1");
                championSkinId.add("kalista_2");
                break;
            case "Karma":
                championSkinId.add("karma_0");
                championSkinId.add("karma_1");
                championSkinId.add("karma_2");
                championSkinId.add("karma_3");
                championSkinId.add("karma_4");
                championSkinId.add("karma_5");
                break;
            case "Karthus":
                championSkinId.add("karthus_0");
                championSkinId.add("karthus_1");
                championSkinId.add("karthus_2");
                championSkinId.add("karthus_3");
                championSkinId.add("karthus_4");
                championSkinId.add("karthus_5");
                break;
            case "Kassadin":
                championSkinId.add("kassadin_0");
                championSkinId.add("kassadin_1");
                championSkinId.add("kassadin_2");
                championSkinId.add("kassadin_3");
                championSkinId.add("kassadin_4");
                championSkinId.add("kassadin_5");
                break;
            case "Katarina":
                championSkinId.add("katarina_0");
                championSkinId.add("katarina_1");
                championSkinId.add("katarina_2");
                championSkinId.add("katarina_3");
                championSkinId.add("katarina_4");
                championSkinId.add("katarina_5");
                championSkinId.add("katarina_6");
                championSkinId.add("katarina_7");
                championSkinId.add("katarina_8");
                break;
            case "Kayle":
                championSkinId.add("kayle_0");
                championSkinId.add("kayle_1");
                championSkinId.add("kayle_2");
                championSkinId.add("kayle_3");
                championSkinId.add("kayle_4");
                championSkinId.add("kayle_5");
                championSkinId.add("kayle_6");
                championSkinId.add("kayle_7");
                championSkinId.add("kayle_8");
                break;
            case "Kennen":
                championSkinId.add("kennen_0");
                championSkinId.add("kennen_1");
                championSkinId.add("kennen_2");
                championSkinId.add("kennen_3");
                championSkinId.add("kennen_4");
                championSkinId.add("kennen_5");
                championSkinId.add("kennen_6");
                break;
            case "Khazix":
                championSkinId.add("khazix_0");
                championSkinId.add("khazix_1");
                championSkinId.add("khazix_2");
                championSkinId.add("khazix_3");
                break;
            case "Kindred":
                championSkinId.add("kindred_0");
                championSkinId.add("kindred_1");
                championSkinId.add("kindred_2");
                break;
            case "KogMaw":
                championSkinId.add("kogmaw_0");
                championSkinId.add("kogmaw_1");
                championSkinId.add("kogmaw_2");
                championSkinId.add("kogmaw_3");
                championSkinId.add("kogmaw_4");
                championSkinId.add("kogmaw_5");
                championSkinId.add("kogmaw_6");
                championSkinId.add("kogmaw_7");
                championSkinId.add("kogmaw_8");
                break;
            case "Leblanc":
                championSkinId.add("leblanc_0");
                championSkinId.add("leblanc_1");
                championSkinId.add("leblanc_2");
                championSkinId.add("leblanc_3");
                championSkinId.add("leblanc_4");
                championSkinId.add("leblanc_5");
                break;
            case "LeeSin":
                championSkinId.add("leesin_0");
                championSkinId.add("leesin_1");
                championSkinId.add("leesin_2");
                championSkinId.add("leesin_3");
                championSkinId.add("leesin_4");
                championSkinId.add("leesin_5");
                championSkinId.add("leesin_10");
                break;
            case "Leona":
                championSkinId.add("leona_0");
                championSkinId.add("leona_1");
                championSkinId.add("leona_2");
                championSkinId.add("leona_3");
                championSkinId.add("leona_4");
                championSkinId.add("leona_8");
                break;
            case "Lissandra":
                championSkinId.add("lissandra_0");
                championSkinId.add("lissandra_1");
                championSkinId.add("lissandra_2");
                championSkinId.add("lissandra_3");
                break;
            case "Lucian":
                championSkinId.add("lucian_0");
                championSkinId.add("lucian_1");
                championSkinId.add("lucian_2");
                championSkinId.add("lucian_6");
                break;
            case "Lulu":
                championSkinId.add("lulu_0");
                championSkinId.add("lulu_1");
                championSkinId.add("lulu_2");
                championSkinId.add("lulu_3");
                championSkinId.add("lulu_4");
                championSkinId.add("lulu_5");
                break;
            case "Lux":
                championSkinId.add("lux_0");
                championSkinId.add("lux_1");
                championSkinId.add("lux_2");
                championSkinId.add("lux_3");
                championSkinId.add("lux_4");
                championSkinId.add("lux_5");
                championSkinId.add("lux_6");
                break;
            case "Malphite":
                championSkinId.add("malphite_0");
                championSkinId.add("malphite_1");
                championSkinId.add("malphite_2");
                championSkinId.add("malphite_3");
                championSkinId.add("malphite_4");
                championSkinId.add("malphite_5");
                championSkinId.add("malphite_6");
                championSkinId.add("malphite_7");
                break;
            case "Malzahar":
                championSkinId.add("malzahar_0");
                championSkinId.add("malzahar_1");
                championSkinId.add("malzahar_2");
                championSkinId.add("malzahar_3");
                championSkinId.add("malzahar_4");
                championSkinId.add("malzahar_5");
                break;
            case "Maokai":
                championSkinId.add("maokai_0");
                championSkinId.add("maokai_1");
                championSkinId.add("maokai_2");
                championSkinId.add("maokai_3");
                championSkinId.add("maokai_4");
                championSkinId.add("maokai_5");
                championSkinId.add("maokai_6");
                break;
            case "MasterYi":
                championSkinId.add("masteryi_0");
                championSkinId.add("masteryi_1");
                championSkinId.add("masteryi_2");
                championSkinId.add("masteryi_3");
                championSkinId.add("masteryi_4");
                championSkinId.add("masteryi_5");
                championSkinId.add("masteryi_9");
                break;
            case "MissFortune":
                championSkinId.add("missfortune_0");
                championSkinId.add("missfortune_1");
                championSkinId.add("missfortune_2");
                championSkinId.add("missfortune_3");
                championSkinId.add("missfortune_4");
                championSkinId.add("missfortune_5");
                championSkinId.add("missfortune_6");
                championSkinId.add("missfortune_7");
                championSkinId.add("missfortune_8");
                championSkinId.add("missfortune_9");
                break;
            case "MonkeyKing":
                championSkinId.add("monkeyking_0");
                championSkinId.add("monkeyking_1");
                championSkinId.add("monkeyking_2");
                championSkinId.add("monkeyking_3");
                championSkinId.add("monkeyking_4");
                championSkinId.add("monkeyking_5");
                break;
            case "Mordekaiser":
                championSkinId.add("mordekaiser_0");
                championSkinId.add("mordekaiser_1");
                championSkinId.add("mordekaiser_2");
                championSkinId.add("mordekaiser_3");
                championSkinId.add("mordekaiser_4");
                championSkinId.add("mordekaiser_5");
                break;
            case "Morgana":
                championSkinId.add("morgana_0");
                championSkinId.add("morgana_1");
                championSkinId.add("morgana_2");
                championSkinId.add("morgana_3");
                championSkinId.add("morgana_4");
                championSkinId.add("morgana_5");
                championSkinId.add("morgana_6");
                championSkinId.add("morgana_10");
                break;
            case "Nami":
                championSkinId.add("nami_0");
                championSkinId.add("nami_1");
                championSkinId.add("nami_2");
                championSkinId.add("nami_3");
                championSkinId.add("nami_7");
                break;
            case "Nasus":
                championSkinId.add("nasus_0");
                championSkinId.add("nasus_1");
                championSkinId.add("nasus_2");
                championSkinId.add("nasus_3");
                championSkinId.add("nasus_4");
                championSkinId.add("nasus_5");
                championSkinId.add("nasus_6");
                break;
            case "Nautilus":
                championSkinId.add("nautilus_0");
                championSkinId.add("nautilus_1");
                championSkinId.add("nautilus_2");
                championSkinId.add("nautilus_3");
                championSkinId.add("nautilus_4");
                break;
            case "Nidalee":
                championSkinId.add("nidalee_0");
                championSkinId.add("nidalee_1");
                championSkinId.add("nidalee_2");
                championSkinId.add("nidalee_3");
                championSkinId.add("nidalee_4");
                championSkinId.add("nidalee_5");
                championSkinId.add("nidalee_6");
                championSkinId.add("nidalee_7");
                championSkinId.add("nidalee_8");
                break;
            case "Nocturne":
                championSkinId.add("nocturne_0");
                championSkinId.add("nocturne_1");
                championSkinId.add("nocturne_2");
                championSkinId.add("nocturne_3");
                championSkinId.add("nocturne_4");
                championSkinId.add("nocturne_5");
                championSkinId.add("nocturne_6");
                break;
            case "Nunu":
                championSkinId.add("nunu_0");
                championSkinId.add("nunu_1");
                championSkinId.add("nunu_2");
                championSkinId.add("nunu_3");
                championSkinId.add("nunu_4");
                championSkinId.add("nunu_5");
                championSkinId.add("nunu_6");
                championSkinId.add("nunu_7");
                break;
            case "Olaf":
                championSkinId.add("olaf_0");
                championSkinId.add("olaf_1");
                championSkinId.add("olaf_2");
                championSkinId.add("olaf_3");
                championSkinId.add("olaf_4");
                championSkinId.add("olaf_5");
                break;
            case "Orianna":
                championSkinId.add("orianna_0");
                championSkinId.add("orianna_1");
                championSkinId.add("orianna_2");
                championSkinId.add("orianna_3");
                championSkinId.add("orianna_4");
                championSkinId.add("orianna_5");
                championSkinId.add("orianna_6");
                break;
            case "Pantheon":
                championSkinId.add("pantheon_0");
                championSkinId.add("pantheon_1");
                championSkinId.add("pantheon_2");
                championSkinId.add("pantheon_3");
                championSkinId.add("pantheon_4");
                championSkinId.add("pantheon_5");
                championSkinId.add("pantheon_6");
                championSkinId.add("pantheon_7");
                break;
            case "Poppy":
                championSkinId.add("poppy_0");
                championSkinId.add("poppy_1");
                championSkinId.add("poppy_2");
                championSkinId.add("poppy_3");
                championSkinId.add("poppy_4");
                championSkinId.add("poppy_5");
                championSkinId.add("poppy_6");
                break;
            case "Quinn":
                championSkinId.add("quinn_0");
                championSkinId.add("quinn_1");
                championSkinId.add("quinn_2");
                championSkinId.add("quinn_3");
                break;
            case "Rammus":
                championSkinId.add("rammus_0");
                championSkinId.add("rammus_1");
                championSkinId.add("rammus_2");
                championSkinId.add("rammus_3");
                championSkinId.add("rammus_4");
                championSkinId.add("rammus_5");
                championSkinId.add("rammus_6");
                championSkinId.add("rammus_7");
                break;
            case "RekSai":
                championSkinId.add("reksai_0");
                championSkinId.add("reksai_1");
                championSkinId.add("reksai_2");
                break;
            case "Renekton":
                championSkinId.add("renekton_0");
                championSkinId.add("renekton_1");
                championSkinId.add("renekton_2");
                championSkinId.add("renekton_3");
                championSkinId.add("renekton_4");
                championSkinId.add("renekton_5");
                championSkinId.add("renekton_6");
                championSkinId.add("renekton_7");
                break;
            case "Rengar":
                championSkinId.add("rengar_0");
                championSkinId.add("rengar_1");
                championSkinId.add("rengar_2");
                championSkinId.add("rengar_3");
                break;
            case "Riven":
                championSkinId.add("riven_0");
                championSkinId.add("riven_1");
                championSkinId.add("riven_2");
                championSkinId.add("riven_3");
                championSkinId.add("riven_4");
                championSkinId.add("riven_5");
                championSkinId.add("riven_6");
                break;
            case "Rumble":
                championSkinId.add("rumble_0");
                championSkinId.add("rumble_1");
                championSkinId.add("rumble_2");
                championSkinId.add("rumble_3");
                break;
            case "Ryze":
                championSkinId.add("ryze_0");
                championSkinId.add("ryze_1");
                championSkinId.add("ryze_2");
                championSkinId.add("ryze_3");
                championSkinId.add("ryze_4");
                championSkinId.add("ryze_5");
                championSkinId.add("ryze_6");
                championSkinId.add("ryze_7");
                championSkinId.add("ryze_8");
                championSkinId.add("ryze_9");
                break;
            case "Sejuani":
                championSkinId.add("sejuani_0");
                championSkinId.add("sejuani_1");
                championSkinId.add("sejuani_2");
                championSkinId.add("sejuani_3");
                championSkinId.add("sejuani_4");
                championSkinId.add("sejuani_5");
                championSkinId.add("sejuani_6");
                break;
            case "Shaco":
                championSkinId.add("shaco_0");
                championSkinId.add("shaco_1");
                championSkinId.add("shaco_2");
                championSkinId.add("shaco_3");
                championSkinId.add("shaco_4");
                championSkinId.add("shaco_5");
                championSkinId.add("shaco_6");
                championSkinId.add("shaco_7");
                break;
            case "Shen":
                championSkinId.add("shen_0");
                championSkinId.add("shen_1");
                championSkinId.add("shen_2");
                championSkinId.add("shen_3");
                championSkinId.add("shen_4");
                championSkinId.add("shen_5");
                championSkinId.add("shen_6");
                break;
            case "Shyvana":
                championSkinId.add("shyvana_0");
                championSkinId.add("shyvana_1");
                championSkinId.add("shyvana_2");
                championSkinId.add("shyvana_3");
                championSkinId.add("shyvana_4");
                championSkinId.add("shyvana_5");
                championSkinId.add("shyvana_6");
                break;
            case "Singed":
                championSkinId.add("singed_0");
                championSkinId.add("singed_1");
                championSkinId.add("singed_2");
                championSkinId.add("singed_3");
                championSkinId.add("singed_4");
                championSkinId.add("singed_5");
                championSkinId.add("singed_6");
                championSkinId.add("singed_7");
                championSkinId.add("singed_8");
                break;
            case "Sion":
                championSkinId.add("sion_0");
                championSkinId.add("sion_1");
                championSkinId.add("sion_2");
                championSkinId.add("sion_3");
                championSkinId.add("sion_4");
                championSkinId.add("sion_5");
                break;
            case "Sivir":
                championSkinId.add("sivir_0");
                championSkinId.add("sivir_1");
                championSkinId.add("sivir_2");
                championSkinId.add("sivir_3");
                championSkinId.add("sivir_4");
                championSkinId.add("sivir_5");
                championSkinId.add("sivir_6");
                championSkinId.add("sivir_7");
                championSkinId.add("sivir_8");
                break;
            case "Skarner":
                championSkinId.add("skarner_0");
                championSkinId.add("skarner_1");
                championSkinId.add("skarner_2");
                championSkinId.add("skarner_3");
                championSkinId.add("skarner_4");
                break;
            case "Sona":
                championSkinId.add("sona_0");
                championSkinId.add("sona_1");
                championSkinId.add("sona_2");
                championSkinId.add("sona_3");
                championSkinId.add("sona_4");
                championSkinId.add("sona_5");
                championSkinId.add("sona_6");
                championSkinId.add("sona_7");
                break;
            case "Soraka":
                championSkinId.add("soraka_0");
                championSkinId.add("soraka_1");
                championSkinId.add("soraka_2");
                championSkinId.add("soraka_3");
                championSkinId.add("soraka_4");
                championSkinId.add("soraka_5");
                championSkinId.add("soraka_6");
                break;
            case "Swain":
                championSkinId.add("swain_0");
                championSkinId.add("swain_1");
                championSkinId.add("swain_2");
                championSkinId.add("swain_3");
                break;
            case "Syndra":
                championSkinId.add("syndra_0");
                championSkinId.add("syndra_1");
                championSkinId.add("syndra_2");
                championSkinId.add("syndra_3");
                championSkinId.add("syndra_4");
                break;
            case "TahmKench":
                championSkinId.add("tahmkench_0");
                championSkinId.add("tahmkench_1");
                championSkinId.add("tahmkench_2");
                break;
            case "Taliyah":
                championSkinId.add("taliyah_0");
                championSkinId.add("taliyah_1");
                break;
            case "Talon":
                championSkinId.add("talon_0");
                championSkinId.add("talon_1");
                championSkinId.add("talon_2");
                championSkinId.add("talon_3");
                championSkinId.add("talon_4");
                break;
            case "Taric":
                championSkinId.add("taric_0");
                championSkinId.add("taric_1");
                championSkinId.add("taric_2");
                championSkinId.add("taric_3");
                championSkinId.add("taric_4");
                break;
            case "Teemo":
                championSkinId.add("teemo_0");
                championSkinId.add("teemo_1");
                championSkinId.add("teemo_2");
                championSkinId.add("teemo_3");
                championSkinId.add("teemo_4");
                championSkinId.add("teemo_5");
                championSkinId.add("teemo_6");
                championSkinId.add("teemo_7");
                championSkinId.add("teemo_8");
                break;
            case "Thresh":
                championSkinId.add("thresh_0");
                championSkinId.add("thresh_1");
                championSkinId.add("thresh_2");
                championSkinId.add("thresh_3");
                championSkinId.add("thresh_4");
                championSkinId.add("thresh_5");
                break;
            case "Tristana":
                championSkinId.add("tristana_0");
                championSkinId.add("tristana_1");
                championSkinId.add("tristana_2");
                championSkinId.add("tristana_3");
                championSkinId.add("tristana_4");
                championSkinId.add("tristana_5");
                championSkinId.add("tristana_6");
                championSkinId.add("tristana_10");
                break;
            case "Trundle":
                championSkinId.add("trundle_0");
                championSkinId.add("trundle_1");
                championSkinId.add("trundle_2");
                championSkinId.add("trundle_3");
                championSkinId.add("trundle_4");
                break;
            case "Tryndamere":
                championSkinId.add("tryndamere_0");
                championSkinId.add("tryndamere_1");
                championSkinId.add("tryndamere_2");
                championSkinId.add("tryndamere_3");
                championSkinId.add("tryndamere_4");
                championSkinId.add("tryndamere_5");
                championSkinId.add("tryndamere_6");
                championSkinId.add("tryndamere_7");
                championSkinId.add("tryndamere_8");
                break;
            case "TwistedFate":
                championSkinId.add("twistedfate_0");
                championSkinId.add("twistedfate_1");
                championSkinId.add("twistedfate_2");
                championSkinId.add("twistedfate_3");
                championSkinId.add("twistedfate_4");
                championSkinId.add("twistedfate_5");
                championSkinId.add("twistedfate_6");
                championSkinId.add("twistedfate_7");
                championSkinId.add("twistedfate_8");
                championSkinId.add("twistedfate_9");
                break;
            case "Twitch":
                championSkinId.add("twitch_0");
                championSkinId.add("twitch_1");
                championSkinId.add("twitch_2");
                championSkinId.add("twitch_3");
                championSkinId.add("twitch_4");
                championSkinId.add("twitch_5");
                championSkinId.add("twitch_6");
                championSkinId.add("twitch_7");
                break;
            case "Udyr":
                championSkinId.add("udyr_0");
                championSkinId.add("udyr_1");
                championSkinId.add("udyr_2");
                championSkinId.add("udyr_3");
                championSkinId.add("udyr_4");
                break;
            case "Urgot":
                championSkinId.add("urgot_0");
                championSkinId.add("urgot_1");
                championSkinId.add("urgot_2");
                championSkinId.add("urgot_3");
                break;
            case "Varus":
                championSkinId.add("varus_0");
                championSkinId.add("varus_1");
                championSkinId.add("varus_2");
                championSkinId.add("varus_3");
                championSkinId.add("varus_4");
                championSkinId.add("varus_5");
                championSkinId.add("varus_6");
                break;
            case "Vayne":
                championSkinId.add("vayne_0");
                championSkinId.add("vayne_1");
                championSkinId.add("vayne_2");
                championSkinId.add("vayne_3");
                championSkinId.add("vayne_4");
                championSkinId.add("vayne_6");
                championSkinId.add("vayne_10");
                break;
            case "Veigar":
                championSkinId.add("veigar_0");
                championSkinId.add("veigar_1");
                championSkinId.add("veigar_2");
                championSkinId.add("veigar_3");
                championSkinId.add("veigar_4");
                championSkinId.add("veigar_5");
                championSkinId.add("veigar_6");
                championSkinId.add("veigar_7");
                championSkinId.add("veigar_8");
                break;
            case "Velkoz":
                championSkinId.add("velkoz_0");
                championSkinId.add("velkoz_1");
                championSkinId.add("velkoz_2");
                championSkinId.add("velkoz_3");
                break;
            case "Vi":
                championSkinId.add("vi_0");
                championSkinId.add("vi_1");
                championSkinId.add("vi_2");
                championSkinId.add("vi_3");
                championSkinId.add("vi_4");
                break;
            case "Viktor":
                championSkinId.add("viktor_0");
                championSkinId.add("viktor_1");
                championSkinId.add("viktor_2");
                championSkinId.add("viktor_3");
                break;
            case "Vladimir":
                championSkinId.add("vladimir_0");
                championSkinId.add("vladimir_1");
                championSkinId.add("vladimir_2");
                championSkinId.add("vladimir_3");
                championSkinId.add("vladimir_4");
                championSkinId.add("vladimir_5");
                championSkinId.add("vladimir_6");
                championSkinId.add("vladimir_7");
                break;
            case "Volibear":
                championSkinId.add("volibear_0");
                championSkinId.add("volibear_1");
                championSkinId.add("volibear_2");
                championSkinId.add("volibear_3");
                championSkinId.add("volibear_4");
                championSkinId.add("volibear_5");
                break;
            case "Warwick":
                championSkinId.add("warwick_0");
                championSkinId.add("warwick_1");
                championSkinId.add("warwick_2");
                championSkinId.add("warwick_3");
                championSkinId.add("warwick_4");
                championSkinId.add("warwick_5");
                championSkinId.add("warwick_6");
                championSkinId.add("warwick_7");
                championSkinId.add("warwick_8");
                break;
            case "Xerath":
                championSkinId.add("xerath_0");
                championSkinId.add("xerath_1");
                championSkinId.add("xerath_2");
                championSkinId.add("xerath_3");
                championSkinId.add("xerath_4");
                break;
            case "XinZhao":
                championSkinId.add("xinzhao_0");
                championSkinId.add("xinzhao_1");
                championSkinId.add("xinzhao_2");
                championSkinId.add("xinzhao_3");
                championSkinId.add("xinzhao_4");
                championSkinId.add("xinzhao_5");
                championSkinId.add("xinzhao_6");
                break;
            case "Yasuo":
                championSkinId.add("yasuo_0");
                championSkinId.add("yasuo_1");
                championSkinId.add("yasuo_2");
                championSkinId.add("yasuo_3");
                break;
            case "Yorick":
                championSkinId.add("yorick_0");
                championSkinId.add("yorick_1");
                championSkinId.add("yorick_2");
                break;
            case "Zac":
                championSkinId.add("zac_0");
                championSkinId.add("zac_1");
                championSkinId.add("zac_2");
                break;
            case "Zed":
                championSkinId.add("zed_0");
                championSkinId.add("zed_1");
                championSkinId.add("zed_3");
                break;
            case "Ziggs":
                championSkinId.add("ziggs_0");
                championSkinId.add("ziggs_1");
                championSkinId.add("ziggs_2");
                championSkinId.add("ziggs_3");
                championSkinId.add("ziggs_4");
                championSkinId.add("ziggs_5");
                break;
            case "Zilean":
                championSkinId.add("zilean_0");
                championSkinId.add("zilean_1");
                championSkinId.add("zilean_2");
                championSkinId.add("zilean_3");
                championSkinId.add("zilean_4");
                championSkinId.add("zilean_5");
                break;
            case "Zyra":
                championSkinId.add("zyra_0");
                championSkinId.add("zyra_1");
                championSkinId.add("zyra_2");
                break;
        }
        String result = championSkinId.get(getRandomNumber(championSkinId.size()));
        return result;
    }

    Integer getRandomNumber(Integer size)
    {
        Random rng = new Random();
        int max = size;
        int min = 0;
        int chosenPhoto = rng.nextInt((max - min) + 1) + min;
        return chosenPhoto;
    }
}

