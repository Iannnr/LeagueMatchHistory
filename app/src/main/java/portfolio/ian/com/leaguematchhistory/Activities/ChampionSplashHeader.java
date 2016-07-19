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

    BitmapDecoding decodeBitmap = new BitmapDecoding();

    Integer champNamePhoto(Context context, String champName) throws IOException {
        ArrayList<Integer> championPhotos = new ArrayList<>();
        switch(champName)
        {
            case "Aatrox":
                championPhotos.add(R.drawable.aatrox_0);
                championPhotos.add(R.drawable.aatrox_1);
                championPhotos.add(R.drawable.aatrox_2);
                championPhotos.add(R.drawable.aatrox_3);
                break;
            case "Ahri":
                championPhotos.add(R.drawable.ahri_0);
                championPhotos.add(R.drawable.ahri_1);
                championPhotos.add(R.drawable.ahri_2);
                championPhotos.add(R.drawable.ahri_3);
                championPhotos.add(R.drawable.ahri_4);
                championPhotos.add(R.drawable.ahri_5);
                championPhotos.add(R.drawable.ahri_6);
                break;
            case "Akali":
                championPhotos.add(R.drawable.akali_0);
                championPhotos.add(R.drawable.akali_1);
                championPhotos.add(R.drawable.akali_2);
                championPhotos.add(R.drawable.akali_3);
                championPhotos.add(R.drawable.akali_4);
                championPhotos.add(R.drawable.akali_5);
                championPhotos.add(R.drawable.akali_6);
                championPhotos.add(R.drawable.akali_7);
                break;
            case "Alistar":
                championPhotos.add(R.drawable.alistar_0);
                championPhotos.add(R.drawable.alistar_1);
                championPhotos.add(R.drawable.alistar_2);
                championPhotos.add(R.drawable.alistar_3);
                championPhotos.add(R.drawable.alistar_4);
                championPhotos.add(R.drawable.alistar_5);
                championPhotos.add(R.drawable.alistar_6);
                championPhotos.add(R.drawable.alistar_7);
                championPhotos.add(R.drawable.alistar_8);
                break;
            case "Amumu":
                championPhotos.add(R.drawable.amumu_0);
                championPhotos.add(R.drawable.amumu_1);
                championPhotos.add(R.drawable.amumu_2);
                championPhotos.add(R.drawable.amumu_3);
                championPhotos.add(R.drawable.amumu_4);
                championPhotos.add(R.drawable.amumu_5);
                championPhotos.add(R.drawable.amumu_6);
                championPhotos.add(R.drawable.amumu_7);
                championPhotos.add(R.drawable.amumu_8);
                break;
            case "Anivia":
                championPhotos.add(R.drawable.anivia_0);
                championPhotos.add(R.drawable.anivia_1);
                championPhotos.add(R.drawable.anivia_2);
                championPhotos.add(R.drawable.anivia_3);
                championPhotos.add(R.drawable.anivia_4);
                championPhotos.add(R.drawable.anivia_5);
                championPhotos.add(R.drawable.anivia_6);
                break;
            case "Annie":
                championPhotos.add(R.drawable.annie_0);
                championPhotos.add(R.drawable.annie_1);
                championPhotos.add(R.drawable.annie_2);
                championPhotos.add(R.drawable.annie_3);
                championPhotos.add(R.drawable.annie_4);
                championPhotos.add(R.drawable.annie_5);
                championPhotos.add(R.drawable.annie_6);
                championPhotos.add(R.drawable.annie_7);
                championPhotos.add(R.drawable.annie_8);
                championPhotos.add(R.drawable.annie_9);
                championPhotos.add(R.drawable.annie_10);
                break;
            case "Ashe":
                championPhotos.add(R.drawable.ashe_0);
                championPhotos.add(R.drawable.ashe_1);
                championPhotos.add(R.drawable.ashe_2);
                championPhotos.add(R.drawable.ashe_3);
                championPhotos.add(R.drawable.ashe_4);
                championPhotos.add(R.drawable.ashe_5);
                championPhotos.add(R.drawable.ashe_6);
                championPhotos.add(R.drawable.ashe_7);
                break;
            case "AurelionSol":
                championPhotos.add(R.drawable.aurelionsol_0);
                championPhotos.add(R.drawable.aurelionsol_1);
                break;
            case "Azir":
                championPhotos.add(R.drawable.azir_0);
                championPhotos.add(R.drawable.azir_1);
                championPhotos.add(R.drawable.azir_2);
                break;
            case "BaR.d":
                championPhotos.add(R.drawable.bard_0);
                championPhotos.add(R.drawable.bard_1);
                championPhotos.add(R.drawable.bard_5);
                break;
            case "Blitzcrank":
                championPhotos.add(R.drawable.blitzcrank_0);
                championPhotos.add(R.drawable.blitzcrank_1);
                championPhotos.add(R.drawable.blitzcrank_2);
                championPhotos.add(R.drawable.blitzcrank_3);
                championPhotos.add(R.drawable.blitzcrank_4);
                championPhotos.add(R.drawable.blitzcrank_5);
                championPhotos.add(R.drawable.blitzcrank_6);
                championPhotos.add(R.drawable.blitzcrank_7);
                championPhotos.add(R.drawable.blitzcrank_11);
                break;
            case "Brand":
                championPhotos.add(R.drawable.brand_0);
                championPhotos.add(R.drawable.brand_1);
                championPhotos.add(R.drawable.brand_2);
                championPhotos.add(R.drawable.brand_3);
                championPhotos.add(R.drawable.brand_4);
                championPhotos.add(R.drawable.brand_5);
                break;
            case "Braum":
                championPhotos.add(R.drawable.braum_0);
                championPhotos.add(R.drawable.braum_1);
                championPhotos.add(R.drawable.braum_2);
                championPhotos.add(R.drawable.braum_3);
                break;
            case "Caitlyn":
                championPhotos.add(R.drawable.caitlyn_0);
                championPhotos.add(R.drawable.caitlyn_1);
                championPhotos.add(R.drawable.caitlyn_2);
                championPhotos.add(R.drawable.caitlyn_3);
                championPhotos.add(R.drawable.caitlyn_4);
                championPhotos.add(R.drawable.caitlyn_5);
                championPhotos.add(R.drawable.caitlyn_6);
                championPhotos.add(R.drawable.caitlyn_10);
                break;
            case "Cassiopeia":
                championPhotos.add(R.drawable.cassiopeia_0);
                championPhotos.add(R.drawable.cassiopeia_1);
                championPhotos.add(R.drawable.cassiopeia_2);
                championPhotos.add(R.drawable.cassiopeia_3);
                championPhotos.add(R.drawable.cassiopeia_4);
                break;
            case "Chogath":
                championPhotos.add(R.drawable.chogath_0);
                championPhotos.add(R.drawable.chogath_1);
                championPhotos.add(R.drawable.chogath_2);
                championPhotos.add(R.drawable.chogath_3);
                championPhotos.add(R.drawable.chogath_4);
                championPhotos.add(R.drawable.chogath_5);
                championPhotos.add(R.drawable.chogath_6);
                break;
            case "Corki":
                championPhotos.add(R.drawable.corki_0);
                championPhotos.add(R.drawable.corki_1);
                championPhotos.add(R.drawable.corki_2);
                championPhotos.add(R.drawable.corki_3);
                championPhotos.add(R.drawable.corki_4);
                championPhotos.add(R.drawable.corki_5);
                championPhotos.add(R.drawable.corki_6);
                championPhotos.add(R.drawable.corki_7);
                break;
            case "Darius":
                championPhotos.add(R.drawable.darius_0);
                championPhotos.add(R.drawable.darius_1);
                championPhotos.add(R.drawable.darius_2);
                championPhotos.add(R.drawable.darius_3);
                championPhotos.add(R.drawable.darius_4);
                championPhotos.add(R.drawable.darius_8);
                break;
            case "Diana":
                championPhotos.add(R.drawable.diana_0);
                championPhotos.add(R.drawable.diana_1);
                championPhotos.add(R.drawable.diana_2);
                championPhotos.add(R.drawable.diana_3);
                break;
            case "Draven":
                championPhotos.add(R.drawable.draven_0);
                championPhotos.add(R.drawable.draven_1);
                championPhotos.add(R.drawable.draven_2);
                championPhotos.add(R.drawable.draven_3);
                championPhotos.add(R.drawable.draven_4);
                championPhotos.add(R.drawable.draven_5);
                championPhotos.add(R.drawable.draven_6);
                break;
            case "DrMundo":
                championPhotos.add(R.drawable.drmundo_0);
                championPhotos.add(R.drawable.drmundo_1);
                championPhotos.add(R.drawable.drmundo_2);
                championPhotos.add(R.drawable.drmundo_3);
                championPhotos.add(R.drawable.drmundo_4);
                championPhotos.add(R.drawable.drmundo_5);
                championPhotos.add(R.drawable.drmundo_6);
                championPhotos.add(R.drawable.drmundo_7);
                championPhotos.add(R.drawable.drmundo_8);
                championPhotos.add(R.drawable.drmundo_9);
                break;
            case "Ekko":
                championPhotos.add(R.drawable.ekko_0);
                championPhotos.add(R.drawable.ekko_1);
                championPhotos.add(R.drawable.ekko_2);
                break;
            case "Elise":
                championPhotos.add(R.drawable.elise_0);
                championPhotos.add(R.drawable.elise_1);
                championPhotos.add(R.drawable.elise_2);
                championPhotos.add(R.drawable.elise_3);
                break;
            case "Evelynn":
                championPhotos.add(R.drawable.evelynn_0);
                championPhotos.add(R.drawable.evelynn_1);
                championPhotos.add(R.drawable.evelynn_2);
                championPhotos.add(R.drawable.evelynn_3);
                championPhotos.add(R.drawable.evelynn_4);
                break;
            case "Ezreal":
                championPhotos.add(R.drawable.ezreal_0);
                championPhotos.add(R.drawable.ezreal_1);
                championPhotos.add(R.drawable.ezreal_2);
                championPhotos.add(R.drawable.ezreal_3);
                championPhotos.add(R.drawable.ezreal_4);
                championPhotos.add(R.drawable.ezreal_5);
                championPhotos.add(R.drawable.ezreal_6);
                championPhotos.add(R.drawable.ezreal_7);
                championPhotos.add(R.drawable.ezreal_8);
                break;
            case "FiddleSticks":
                championPhotos.add(R.drawable.fiddlesticks_0);
                championPhotos.add(R.drawable.fiddlesticks_1);
                championPhotos.add(R.drawable.fiddlesticks_2);
                championPhotos.add(R.drawable.fiddlesticks_3);
                championPhotos.add(R.drawable.fiddlesticks_4);
                championPhotos.add(R.drawable.fiddlesticks_5);
                championPhotos.add(R.drawable.fiddlesticks_6);
                championPhotos.add(R.drawable.fiddlesticks_7);
                championPhotos.add(R.drawable.fiddlesticks_8);
                break;
            case "Fiora":
                championPhotos.add(R.drawable.fiora_0);
                championPhotos.add(R.drawable.fiora_1);
                championPhotos.add(R.drawable.fiora_2);
                championPhotos.add(R.drawable.fiora_3);
                championPhotos.add(R.drawable.fiora_4);
                championPhotos.add(R.drawable.fiora_5);
                break;
            case "Fizz":
                championPhotos.add(R.drawable.fizz_0);
                championPhotos.add(R.drawable.fizz_1);
                championPhotos.add(R.drawable.fizz_2);
                championPhotos.add(R.drawable.fizz_3);
                championPhotos.add(R.drawable.fizz_4);
                championPhotos.add(R.drawable.fizz_8);
                championPhotos.add(R.drawable.fizz_9);
                break;
            case "Galio":
                championPhotos.add(R.drawable.galio_0);
                championPhotos.add(R.drawable.galio_1);
                championPhotos.add(R.drawable.galio_2);
                championPhotos.add(R.drawable.galio_3);
                championPhotos.add(R.drawable.galio_4);
                championPhotos.add(R.drawable.galio_5);
                break;
            case "Gangplank":
                championPhotos.add(R.drawable.gangplank_0);
                championPhotos.add(R.drawable.gangplank_1);
                championPhotos.add(R.drawable.gangplank_2);
                championPhotos.add(R.drawable.gangplank_3);
                championPhotos.add(R.drawable.gangplank_4);
                championPhotos.add(R.drawable.gangplank_5);
                championPhotos.add(R.drawable.gangplank_6);
                championPhotos.add(R.drawable.gangplank_7);
                break;
            case "Garen":
                championPhotos.add(R.drawable.garen_0);
                championPhotos.add(R.drawable.garen_1);
                championPhotos.add(R.drawable.garen_2);
                championPhotos.add(R.drawable.garen_3);
                championPhotos.add(R.drawable.garen_4);
                championPhotos.add(R.drawable.garen_5);
                championPhotos.add(R.drawable.garen_6);
                championPhotos.add(R.drawable.garen_10);
                break;
            case "Gnar":
                championPhotos.add(R.drawable.gnar_0);
                championPhotos.add(R.drawable.gnar_1);
                championPhotos.add(R.drawable.gnar_2);
                championPhotos.add(R.drawable.gnar_3);
                championPhotos.add(R.drawable.gnar_4);
                break;
            case "Gragas":
                championPhotos.add(R.drawable.gragas_0);
                championPhotos.add(R.drawable.gragas_1);
                championPhotos.add(R.drawable.gragas_2);
                championPhotos.add(R.drawable.gragas_3);
                championPhotos.add(R.drawable.gragas_4);
                championPhotos.add(R.drawable.gragas_5);
                championPhotos.add(R.drawable.gragas_6);
                championPhotos.add(R.drawable.gragas_7);
                championPhotos.add(R.drawable.gragas_8);
                championPhotos.add(R.drawable.gragas_9);
                break;
            case "Graves":
                championPhotos.add(R.drawable.graves_0);
                championPhotos.add(R.drawable.graves_1);
                championPhotos.add(R.drawable.graves_2);
                championPhotos.add(R.drawable.graves_3);
                championPhotos.add(R.drawable.graves_4);
                championPhotos.add(R.drawable.graves_5);
                championPhotos.add(R.drawable.graves_6);
                break;
            case "Hecarim":
                championPhotos.add(R.drawable.hecarim_0);
                championPhotos.add(R.drawable.hecarim_1);
                championPhotos.add(R.drawable.hecarim_2);
                championPhotos.add(R.drawable.hecarim_3);
                championPhotos.add(R.drawable.hecarim_4);
                championPhotos.add(R.drawable.hecarim_5);
                break;
            case "Heimerdinger":
                championPhotos.add(R.drawable.heimerdinger_0);
                championPhotos.add(R.drawable.heimerdinger_1);
                championPhotos.add(R.drawable.heimerdinger_2);
                championPhotos.add(R.drawable.heimerdinger_3);
                championPhotos.add(R.drawable.heimerdinger_4);
                championPhotos.add(R.drawable.heimerdinger_5);
                break;
            case "Illaoi":
                championPhotos.add(R.drawable.illaoi_0);
                championPhotos.add(R.drawable.illaoi_1);
                break;
            case "Irelia":
                championPhotos.add(R.drawable.irelia_0);
                championPhotos.add(R.drawable.irelia_1);
                championPhotos.add(R.drawable.irelia_2);
                championPhotos.add(R.drawable.irelia_3);
                championPhotos.add(R.drawable.irelia_4);
                championPhotos.add(R.drawable.irelia_5);
                break;
            case "Janna":
                championPhotos.add(R.drawable.janna_0);
                championPhotos.add(R.drawable.janna_1);
                championPhotos.add(R.drawable.janna_2);
                championPhotos.add(R.drawable.janna_3);
                championPhotos.add(R.drawable.janna_4);
                championPhotos.add(R.drawable.janna_5);
                championPhotos.add(R.drawable.janna_6);
                break;
            case "JarvanIV":
                championPhotos.add(R.drawable.jarvaniv_0);
                championPhotos.add(R.drawable.jarvaniv_1);
                championPhotos.add(R.drawable.jarvaniv_2);
                championPhotos.add(R.drawable.jarvaniv_3);
                championPhotos.add(R.drawable.jarvaniv_4);
                championPhotos.add(R.drawable.jarvaniv_5);
                championPhotos.add(R.drawable.jarvaniv_6);
                break;
            case "Jax":
                championPhotos.add(R.drawable.jax_0);
                championPhotos.add(R.drawable.jax_1);
                championPhotos.add(R.drawable.jax_2);
                championPhotos.add(R.drawable.jax_3);
                championPhotos.add(R.drawable.jax_4);
                championPhotos.add(R.drawable.jax_5);
                championPhotos.add(R.drawable.jax_6);
                championPhotos.add(R.drawable.jax_7);
                championPhotos.add(R.drawable.jax_12);
                break;
            case "Jayce":
                championPhotos.add(R.drawable.jayce_0);
                championPhotos.add(R.drawable.jayce_1);
                championPhotos.add(R.drawable.jayce_2);
                championPhotos.add(R.drawable.jayce_3);
                break;
            case "Jhin":
                championPhotos.add(R.drawable.jhin_0);
                championPhotos.add(R.drawable.jhin_1);
                break;
            case "Jinx":
                championPhotos.add(R.drawable.jinx_0);
                championPhotos.add(R.drawable.jinx_1);
                championPhotos.add(R.drawable.jinx_2);
                championPhotos.add(R.drawable.jinx_3);
                break;
            case "Kalista":
                championPhotos.add(R.drawable.kalista_0);
                championPhotos.add(R.drawable.kalista_1);
                championPhotos.add(R.drawable.kalista_2);
                break;
            case "Karma":
                championPhotos.add(R.drawable.karma_0);
                championPhotos.add(R.drawable.karma_1);
                championPhotos.add(R.drawable.karma_2);
                championPhotos.add(R.drawable.karma_3);
                championPhotos.add(R.drawable.karma_4);
                championPhotos.add(R.drawable.karma_5);
                break;
            case "Karthus":
                championPhotos.add(R.drawable.karthus_0);
                championPhotos.add(R.drawable.karthus_1);
                championPhotos.add(R.drawable.karthus_2);
                championPhotos.add(R.drawable.karthus_3);
                championPhotos.add(R.drawable.karthus_4);
                championPhotos.add(R.drawable.karthus_5);
                break;
            case "Kassadin":
                championPhotos.add(R.drawable.kassadin_0);
                championPhotos.add(R.drawable.kassadin_1);
                championPhotos.add(R.drawable.kassadin_2);
                championPhotos.add(R.drawable.kassadin_3);
                championPhotos.add(R.drawable.kassadin_4);
                championPhotos.add(R.drawable.kassadin_5);
                break;
            case "Katarina":
                championPhotos.add(R.drawable.katarina_0);
                championPhotos.add(R.drawable.katarina_1);
                championPhotos.add(R.drawable.katarina_2);
                championPhotos.add(R.drawable.katarina_3);
                championPhotos.add(R.drawable.katarina_4);
                championPhotos.add(R.drawable.katarina_5);
                championPhotos.add(R.drawable.katarina_6);
                championPhotos.add(R.drawable.katarina_7);
                championPhotos.add(R.drawable.katarina_8);
                break;
            case "Kayle":
                championPhotos.add(R.drawable.kayle_0);
                championPhotos.add(R.drawable.kayle_1);
                championPhotos.add(R.drawable.kayle_2);
                championPhotos.add(R.drawable.kayle_3);
                championPhotos.add(R.drawable.kayle_4);
                championPhotos.add(R.drawable.kayle_5);
                championPhotos.add(R.drawable.kayle_6);
                championPhotos.add(R.drawable.kayle_7);
                championPhotos.add(R.drawable.kayle_8);
                break;
            case "Kennen":
                championPhotos.add(R.drawable.kennen_0);
                championPhotos.add(R.drawable.kennen_1);
                championPhotos.add(R.drawable.kennen_2);
                championPhotos.add(R.drawable.kennen_3);
                championPhotos.add(R.drawable.kennen_4);
                championPhotos.add(R.drawable.kennen_5);
                championPhotos.add(R.drawable.kennen_6);
                break;
            case "Khazix":
                championPhotos.add(R.drawable.khazix_0);
                championPhotos.add(R.drawable.khazix_1);
                championPhotos.add(R.drawable.khazix_2);
                championPhotos.add(R.drawable.khazix_3);
                break;
            case "Kindred":
                championPhotos.add(R.drawable.kindred_0);
                championPhotos.add(R.drawable.kindred_1);
                championPhotos.add(R.drawable.kindred_2);
                break;
            case "KogMaw":
                championPhotos.add(R.drawable.kogmaw_0);
                championPhotos.add(R.drawable.kogmaw_1);
                championPhotos.add(R.drawable.kogmaw_2);
                championPhotos.add(R.drawable.kogmaw_3);
                championPhotos.add(R.drawable.kogmaw_4);
                championPhotos.add(R.drawable.kogmaw_5);
                championPhotos.add(R.drawable.kogmaw_6);
                championPhotos.add(R.drawable.kogmaw_7);
                championPhotos.add(R.drawable.kogmaw_8);
                break;
            case "Leblanc":
                championPhotos.add(R.drawable.leblanc_0);
                championPhotos.add(R.drawable.leblanc_1);
                championPhotos.add(R.drawable.leblanc_2);
                championPhotos.add(R.drawable.leblanc_3);
                championPhotos.add(R.drawable.leblanc_4);
                championPhotos.add(R.drawable.leblanc_5);
                break;
            case "LeeSin":
                championPhotos.add(R.drawable.leesin_0);
                championPhotos.add(R.drawable.leesin_1);
                championPhotos.add(R.drawable.leesin_2);
                championPhotos.add(R.drawable.leesin_3);
                championPhotos.add(R.drawable.leesin_4);
                championPhotos.add(R.drawable.leesin_5);
                championPhotos.add(R.drawable.leesin_10);
                break;
            case "Leona":
                championPhotos.add(R.drawable.leona_0);
                championPhotos.add(R.drawable.leona_1);
                championPhotos.add(R.drawable.leona_2);
                championPhotos.add(R.drawable.leona_3);
                championPhotos.add(R.drawable.leona_4);
                championPhotos.add(R.drawable.leona_8);
                break;
            case "Lissandra":
                championPhotos.add(R.drawable.lissandra_0);
                championPhotos.add(R.drawable.lissandra_1);
                championPhotos.add(R.drawable.lissandra_2);
                championPhotos.add(R.drawable.lissandra_3);
                break;
            case "Lucian":
                championPhotos.add(R.drawable.lucian_0);
                championPhotos.add(R.drawable.lucian_1);
                championPhotos.add(R.drawable.lucian_2);
                championPhotos.add(R.drawable.lucian_6);
                break;
            case "Lulu":
                championPhotos.add(R.drawable.lulu_0);
                championPhotos.add(R.drawable.lulu_1);
                championPhotos.add(R.drawable.lulu_2);
                championPhotos.add(R.drawable.lulu_3);
                championPhotos.add(R.drawable.lulu_4);
                championPhotos.add(R.drawable.lulu_5);
                break;
            case "Lux":
                championPhotos.add(R.drawable.lux_0);
                championPhotos.add(R.drawable.lux_1);
                championPhotos.add(R.drawable.lux_2);
                championPhotos.add(R.drawable.lux_3);
                championPhotos.add(R.drawable.lux_4);
                championPhotos.add(R.drawable.lux_5);
                championPhotos.add(R.drawable.lux_6);
                break;
            case "Malphite":
                championPhotos.add(R.drawable.malphite_0);
                championPhotos.add(R.drawable.malphite_1);
                championPhotos.add(R.drawable.malphite_2);
                championPhotos.add(R.drawable.malphite_3);
                championPhotos.add(R.drawable.malphite_4);
                championPhotos.add(R.drawable.malphite_5);
                championPhotos.add(R.drawable.malphite_6);
                championPhotos.add(R.drawable.malphite_7);
                break;
            case "Malzahar":
                championPhotos.add(R.drawable.malzahar_0);
                championPhotos.add(R.drawable.malzahar_1);
                championPhotos.add(R.drawable.malzahar_2);
                championPhotos.add(R.drawable.malzahar_3);
                championPhotos.add(R.drawable.malzahar_4);
                championPhotos.add(R.drawable.malzahar_5);
                break;
            case "Maokai":
                championPhotos.add(R.drawable.maokai_0);
                championPhotos.add(R.drawable.maokai_1);
                championPhotos.add(R.drawable.maokai_2);
                championPhotos.add(R.drawable.maokai_3);
                championPhotos.add(R.drawable.maokai_4);
                championPhotos.add(R.drawable.maokai_5);
                championPhotos.add(R.drawable.maokai_6);
                break;
            case "MasterYi":
                championPhotos.add(R.drawable.masteryi_0);
                championPhotos.add(R.drawable.masteryi_1);
                championPhotos.add(R.drawable.masteryi_2);
                championPhotos.add(R.drawable.masteryi_3);
                championPhotos.add(R.drawable.masteryi_4);
                championPhotos.add(R.drawable.masteryi_5);
                championPhotos.add(R.drawable.masteryi_9);
                break;
            case "MissFortune":
                championPhotos.add(R.drawable.missfortune_0);
                championPhotos.add(R.drawable.missfortune_1);
                championPhotos.add(R.drawable.missfortune_2);
                championPhotos.add(R.drawable.missfortune_3);
                championPhotos.add(R.drawable.missfortune_4);
                championPhotos.add(R.drawable.missfortune_5);
                championPhotos.add(R.drawable.missfortune_6);
                championPhotos.add(R.drawable.missfortune_7);
                championPhotos.add(R.drawable.missfortune_8);
                championPhotos.add(R.drawable.missfortune_9);
                break;
            case "MonkeyKing":
                championPhotos.add(R.drawable.monkeyking_0);
                championPhotos.add(R.drawable.monkeyking_1);
                championPhotos.add(R.drawable.monkeyking_2);
                championPhotos.add(R.drawable.monkeyking_3);
                championPhotos.add(R.drawable.monkeyking_4);
                championPhotos.add(R.drawable.monkeyking_5);
                break;
            case "Mordekaiser":
                championPhotos.add(R.drawable.mordekaiser_0);
                championPhotos.add(R.drawable.mordekaiser_1);
                championPhotos.add(R.drawable.mordekaiser_2);
                championPhotos.add(R.drawable.mordekaiser_3);
                championPhotos.add(R.drawable.mordekaiser_4);
                championPhotos.add(R.drawable.mordekaiser_5);
                break;
            case "Morgana":
                championPhotos.add(R.drawable.morgana_0);
                championPhotos.add(R.drawable.morgana_1);
                championPhotos.add(R.drawable.morgana_2);
                championPhotos.add(R.drawable.morgana_3);
                championPhotos.add(R.drawable.morgana_4);
                championPhotos.add(R.drawable.morgana_5);
                championPhotos.add(R.drawable.morgana_6);
                championPhotos.add(R.drawable.morgana_10);
                break;
            case "Nami":
                championPhotos.add(R.drawable.nami_0);
                championPhotos.add(R.drawable.nami_1);
                championPhotos.add(R.drawable.nami_2);
                championPhotos.add(R.drawable.nami_3);
                championPhotos.add(R.drawable.nami_7);
                break;
            case "Nasus":
                championPhotos.add(R.drawable.nasus_0);
                championPhotos.add(R.drawable.nasus_1);
                championPhotos.add(R.drawable.nasus_2);
                championPhotos.add(R.drawable.nasus_3);
                championPhotos.add(R.drawable.nasus_4);
                championPhotos.add(R.drawable.nasus_5);
                championPhotos.add(R.drawable.nasus_6);
                break;
            case "Nautilus":
                championPhotos.add(R.drawable.nautilus_0);
                championPhotos.add(R.drawable.nautilus_1);
                championPhotos.add(R.drawable.nautilus_2);
                championPhotos.add(R.drawable.nautilus_3);
                championPhotos.add(R.drawable.nautilus_4);
                break;
            case "Nidalee":
                championPhotos.add(R.drawable.nidalee_0);
                championPhotos.add(R.drawable.nidalee_1);
                championPhotos.add(R.drawable.nidalee_2);
                championPhotos.add(R.drawable.nidalee_3);
                championPhotos.add(R.drawable.nidalee_4);
                championPhotos.add(R.drawable.nidalee_5);
                championPhotos.add(R.drawable.nidalee_6);
                championPhotos.add(R.drawable.nidalee_7);
                championPhotos.add(R.drawable.nidalee_8);
                break;
            case "Nocturne":
                championPhotos.add(R.drawable.nocturne_0);
                championPhotos.add(R.drawable.nocturne_1);
                championPhotos.add(R.drawable.nocturne_2);
                championPhotos.add(R.drawable.nocturne_3);
                championPhotos.add(R.drawable.nocturne_4);
                championPhotos.add(R.drawable.nocturne_5);
                championPhotos.add(R.drawable.nocturne_6);
                break;
            case "Nunu":
                championPhotos.add(R.drawable.nunu_0);
                championPhotos.add(R.drawable.nunu_1);
                championPhotos.add(R.drawable.nunu_2);
                championPhotos.add(R.drawable.nunu_3);
                championPhotos.add(R.drawable.nunu_4);
                championPhotos.add(R.drawable.nunu_5);
                championPhotos.add(R.drawable.nunu_6);
                championPhotos.add(R.drawable.nunu_7);
                break;
            case "Olaf":
                championPhotos.add(R.drawable.olaf_0);
                championPhotos.add(R.drawable.olaf_1);
                championPhotos.add(R.drawable.olaf_2);
                championPhotos.add(R.drawable.olaf_3);
                championPhotos.add(R.drawable.olaf_4);
                championPhotos.add(R.drawable.olaf_5);
                break;
            case "Orianna":
                championPhotos.add(R.drawable.orianna_0);
                championPhotos.add(R.drawable.orianna_1);
                championPhotos.add(R.drawable.orianna_2);
                championPhotos.add(R.drawable.orianna_3);
                championPhotos.add(R.drawable.orianna_4);
                championPhotos.add(R.drawable.orianna_5);
                championPhotos.add(R.drawable.orianna_6);
                break;
            case "Pantheon":
                championPhotos.add(R.drawable.pantheon_0);
                championPhotos.add(R.drawable.pantheon_1);
                championPhotos.add(R.drawable.pantheon_2);
                championPhotos.add(R.drawable.pantheon_3);
                championPhotos.add(R.drawable.pantheon_4);
                championPhotos.add(R.drawable.pantheon_5);
                championPhotos.add(R.drawable.pantheon_6);
                championPhotos.add(R.drawable.pantheon_7);
                break;
            case "Poppy":
                championPhotos.add(R.drawable.poppy_0);
                championPhotos.add(R.drawable.poppy_1);
                championPhotos.add(R.drawable.poppy_2);
                championPhotos.add(R.drawable.poppy_3);
                championPhotos.add(R.drawable.poppy_4);
                championPhotos.add(R.drawable.poppy_5);
                championPhotos.add(R.drawable.poppy_6);
                break;
            case "Quinn":
                championPhotos.add(R.drawable.quinn_0);
                championPhotos.add(R.drawable.quinn_1);
                championPhotos.add(R.drawable.quinn_2);
                championPhotos.add(R.drawable.quinn_3);
                break;
            case "Rammus":
                championPhotos.add(R.drawable.rammus_0);
                championPhotos.add(R.drawable.rammus_1);
                championPhotos.add(R.drawable.rammus_2);
                championPhotos.add(R.drawable.rammus_3);
                championPhotos.add(R.drawable.rammus_4);
                championPhotos.add(R.drawable.rammus_5);
                championPhotos.add(R.drawable.rammus_6);
                championPhotos.add(R.drawable.rammus_7);
                break;
            case "RekSai":
                championPhotos.add(R.drawable.reksai_0);
                championPhotos.add(R.drawable.reksai_1);
                championPhotos.add(R.drawable.reksai_2);
                break;
            case "Renekton":
                championPhotos.add(R.drawable.renekton_0);
                championPhotos.add(R.drawable.renekton_1);
                championPhotos.add(R.drawable.renekton_2);
                championPhotos.add(R.drawable.renekton_3);
                championPhotos.add(R.drawable.renekton_4);
                championPhotos.add(R.drawable.renekton_5);
                championPhotos.add(R.drawable.renekton_6);
                championPhotos.add(R.drawable.renekton_7);
                break;
            case "Rengar":
                championPhotos.add(R.drawable.rengar_0);
                championPhotos.add(R.drawable.rengar_1);
                championPhotos.add(R.drawable.rengar_2);
                championPhotos.add(R.drawable.rengar_3);
                break;
            case "Riven":
                championPhotos.add(R.drawable.riven_0);
                championPhotos.add(R.drawable.riven_1);
                championPhotos.add(R.drawable.riven_2);
                championPhotos.add(R.drawable.riven_3);
                championPhotos.add(R.drawable.riven_4);
                championPhotos.add(R.drawable.riven_5);
                championPhotos.add(R.drawable.riven_6);
                break;
            case "Rumble":
                championPhotos.add(R.drawable.rumble_0);
                championPhotos.add(R.drawable.rumble_1);
                championPhotos.add(R.drawable.rumble_2);
                championPhotos.add(R.drawable.rumble_3);
                break;
            case "Ryze":
                championPhotos.add(R.drawable.ryze_0);
                championPhotos.add(R.drawable.ryze_1);
                championPhotos.add(R.drawable.ryze_2);
                championPhotos.add(R.drawable.ryze_3);
                championPhotos.add(R.drawable.ryze_4);
                championPhotos.add(R.drawable.ryze_5);
                championPhotos.add(R.drawable.ryze_6);
                championPhotos.add(R.drawable.ryze_7);
                championPhotos.add(R.drawable.ryze_8);
                championPhotos.add(R.drawable.ryze_9);
                break;
            case "Sejuani":
                championPhotos.add(R.drawable.sejuani_0);
                championPhotos.add(R.drawable.sejuani_1);
                championPhotos.add(R.drawable.sejuani_2);
                championPhotos.add(R.drawable.sejuani_3);
                championPhotos.add(R.drawable.sejuani_4);
                championPhotos.add(R.drawable.sejuani_5);
                championPhotos.add(R.drawable.sejuani_6);
                break;
            case "Shaco":
                championPhotos.add(R.drawable.shaco_0);
                championPhotos.add(R.drawable.shaco_1);
                championPhotos.add(R.drawable.shaco_2);
                championPhotos.add(R.drawable.shaco_3);
                championPhotos.add(R.drawable.shaco_4);
                championPhotos.add(R.drawable.shaco_5);
                championPhotos.add(R.drawable.shaco_6);
                championPhotos.add(R.drawable.shaco_7);
                break;
            case "Shen":
                championPhotos.add(R.drawable.shen_0);
                championPhotos.add(R.drawable.shen_1);
                championPhotos.add(R.drawable.shen_2);
                championPhotos.add(R.drawable.shen_3);
                championPhotos.add(R.drawable.shen_4);
                championPhotos.add(R.drawable.shen_5);
                championPhotos.add(R.drawable.shen_6);
                break;
            case "Shyvana":
                championPhotos.add(R.drawable.shyvana_0);
                championPhotos.add(R.drawable.shyvana_1);
                championPhotos.add(R.drawable.shyvana_2);
                championPhotos.add(R.drawable.shyvana_3);
                championPhotos.add(R.drawable.shyvana_4);
                championPhotos.add(R.drawable.shyvana_5);
                championPhotos.add(R.drawable.shyvana_6);
                break;
            case "Singed":
                championPhotos.add(R.drawable.singed_0);
                championPhotos.add(R.drawable.singed_1);
                championPhotos.add(R.drawable.singed_2);
                championPhotos.add(R.drawable.singed_3);
                championPhotos.add(R.drawable.singed_4);
                championPhotos.add(R.drawable.singed_5);
                championPhotos.add(R.drawable.singed_6);
                championPhotos.add(R.drawable.singed_7);
                championPhotos.add(R.drawable.singed_8);
                break;
            case "Sion":
                championPhotos.add(R.drawable.sion_0);
                championPhotos.add(R.drawable.sion_1);
                championPhotos.add(R.drawable.sion_2);
                championPhotos.add(R.drawable.sion_3);
                championPhotos.add(R.drawable.sion_4);
                championPhotos.add(R.drawable.sion_5);
                break;
            case "Sivir":
                championPhotos.add(R.drawable.sivir_0);
                championPhotos.add(R.drawable.sivir_1);
                championPhotos.add(R.drawable.sivir_2);
                championPhotos.add(R.drawable.sivir_3);
                championPhotos.add(R.drawable.sivir_4);
                championPhotos.add(R.drawable.sivir_5);
                championPhotos.add(R.drawable.sivir_6);
                championPhotos.add(R.drawable.sivir_7);
                championPhotos.add(R.drawable.sivir_8);
                break;
            case "Skarner":
                championPhotos.add(R.drawable.skarner_0);
                championPhotos.add(R.drawable.skarner_1);
                championPhotos.add(R.drawable.skarner_2);
                championPhotos.add(R.drawable.skarner_3);
                championPhotos.add(R.drawable.skarner_4);
                break;
            case "Sona":
                championPhotos.add(R.drawable.sona_0);
                championPhotos.add(R.drawable.sona_1);
                championPhotos.add(R.drawable.sona_2);
                championPhotos.add(R.drawable.sona_3);
                championPhotos.add(R.drawable.sona_4);
                championPhotos.add(R.drawable.sona_5);
                championPhotos.add(R.drawable.sona_6);
                championPhotos.add(R.drawable.sona_7);
                break;
            case "Soraka":
                championPhotos.add(R.drawable.soraka_0);
                championPhotos.add(R.drawable.soraka_1);
                championPhotos.add(R.drawable.soraka_2);
                championPhotos.add(R.drawable.soraka_3);
                championPhotos.add(R.drawable.soraka_4);
                championPhotos.add(R.drawable.soraka_5);
                championPhotos.add(R.drawable.soraka_6);
                break;
            case "Swain":
                championPhotos.add(R.drawable.swain_0);
                championPhotos.add(R.drawable.swain_1);
                championPhotos.add(R.drawable.swain_2);
                championPhotos.add(R.drawable.swain_3);
                break;
            case "Syndra":
                championPhotos.add(R.drawable.syndra_0);
                championPhotos.add(R.drawable.syndra_1);
                championPhotos.add(R.drawable.syndra_2);
                championPhotos.add(R.drawable.syndra_3);
                championPhotos.add(R.drawable.syndra_4);
                break;
            case "TahmKench":
                championPhotos.add(R.drawable.tahmkench_0);
                championPhotos.add(R.drawable.tahmkench_1);
                championPhotos.add(R.drawable.tahmkench_2);
                break;
            case "Taliyah":
                championPhotos.add(R.drawable.taliyah_0);
                championPhotos.add(R.drawable.taliyah_1);
                break;
            case "Talon":
                championPhotos.add(R.drawable.talon_0);
                championPhotos.add(R.drawable.talon_1);
                championPhotos.add(R.drawable.talon_2);
                championPhotos.add(R.drawable.talon_3);
                championPhotos.add(R.drawable.talon_4);
                break;
            case "Taric":
                championPhotos.add(R.drawable.taric_0);
                championPhotos.add(R.drawable.taric_1);
                championPhotos.add(R.drawable.taric_2);
                championPhotos.add(R.drawable.taric_3);
                championPhotos.add(R.drawable.taric_4);
                break;
            case "Teemo":
                championPhotos.add(R.drawable.teemo_0);
                championPhotos.add(R.drawable.teemo_1);
                championPhotos.add(R.drawable.teemo_2);
                championPhotos.add(R.drawable.teemo_3);
                championPhotos.add(R.drawable.teemo_4);
                championPhotos.add(R.drawable.teemo_5);
                championPhotos.add(R.drawable.teemo_6);
                championPhotos.add(R.drawable.teemo_7);
                championPhotos.add(R.drawable.teemo_8);
                break;
            case "Thresh":
                championPhotos.add(R.drawable.thresh_0);
                championPhotos.add(R.drawable.thresh_1);
                championPhotos.add(R.drawable.thresh_2);
                championPhotos.add(R.drawable.thresh_3);
                championPhotos.add(R.drawable.thresh_4);
                championPhotos.add(R.drawable.thresh_5);
                break;
            case "Tristana":
                championPhotos.add(R.drawable.tristana_0);
                championPhotos.add(R.drawable.tristana_1);
                championPhotos.add(R.drawable.tristana_2);
                championPhotos.add(R.drawable.tristana_3);
                championPhotos.add(R.drawable.tristana_4);
                championPhotos.add(R.drawable.tristana_5);
                championPhotos.add(R.drawable.tristana_6);
                championPhotos.add(R.drawable.tristana_10);
                break;
            case "Trundle":
                championPhotos.add(R.drawable.trundle_0);
                championPhotos.add(R.drawable.trundle_1);
                championPhotos.add(R.drawable.trundle_2);
                championPhotos.add(R.drawable.trundle_3);
                championPhotos.add(R.drawable.trundle_4);
                break;
            case "Tryndamere":
                championPhotos.add(R.drawable.tryndamere_0);
                championPhotos.add(R.drawable.tryndamere_1);
                championPhotos.add(R.drawable.tryndamere_2);
                championPhotos.add(R.drawable.tryndamere_3);
                championPhotos.add(R.drawable.tryndamere_4);
                championPhotos.add(R.drawable.tryndamere_5);
                championPhotos.add(R.drawable.tryndamere_6);
                championPhotos.add(R.drawable.tryndamere_7);
                championPhotos.add(R.drawable.tryndamere_8);
                break;
            case "TwistedFate":
                championPhotos.add(R.drawable.twistedfate_0);
                championPhotos.add(R.drawable.twistedfate_1);
                championPhotos.add(R.drawable.twistedfate_2);
                championPhotos.add(R.drawable.twistedfate_3);
                championPhotos.add(R.drawable.twistedfate_4);
                championPhotos.add(R.drawable.twistedfate_5);
                championPhotos.add(R.drawable.twistedfate_6);
                championPhotos.add(R.drawable.twistedfate_7);
                championPhotos.add(R.drawable.twistedfate_8);
                championPhotos.add(R.drawable.twistedfate_9);
                break;
            case "Twitch":
                championPhotos.add(R.drawable.twitch_0);
                championPhotos.add(R.drawable.twitch_1);
                championPhotos.add(R.drawable.twitch_2);
                championPhotos.add(R.drawable.twitch_3);
                championPhotos.add(R.drawable.twitch_4);
                championPhotos.add(R.drawable.twitch_5);
                championPhotos.add(R.drawable.twitch_6);
                championPhotos.add(R.drawable.twitch_7);
                break;
            case "Udyr":
                championPhotos.add(R.drawable.udyr_0);
                championPhotos.add(R.drawable.udyr_1);
                championPhotos.add(R.drawable.udyr_2);
                championPhotos.add(R.drawable.udyr_3);
                championPhotos.add(R.drawable.udyr_4);
                break;
            case "Urgot":
                championPhotos.add(R.drawable.urgot_0);
                championPhotos.add(R.drawable.urgot_1);
                championPhotos.add(R.drawable.urgot_2);
                championPhotos.add(R.drawable.urgot_3);
                break;
            case "Varus":
                championPhotos.add(R.drawable.varus_0);
                championPhotos.add(R.drawable.varus_1);
                championPhotos.add(R.drawable.varus_2);
                championPhotos.add(R.drawable.varus_3);
                championPhotos.add(R.drawable.varus_4);
                championPhotos.add(R.drawable.varus_5);
                championPhotos.add(R.drawable.varus_6);
                break;
            case "Vayne":
                championPhotos.add(R.drawable.vayne_0);
                championPhotos.add(R.drawable.vayne_1);
                championPhotos.add(R.drawable.vayne_2);
                championPhotos.add(R.drawable.vayne_3);
                championPhotos.add(R.drawable.vayne_4);
                championPhotos.add(R.drawable.vayne_6);
                championPhotos.add(R.drawable.vayne_10);
                break;
            case "Veigar":
                championPhotos.add(R.drawable.veigar_0);
                championPhotos.add(R.drawable.veigar_1);
                championPhotos.add(R.drawable.veigar_2);
                championPhotos.add(R.drawable.veigar_3);
                championPhotos.add(R.drawable.veigar_4);
                championPhotos.add(R.drawable.veigar_5);
                championPhotos.add(R.drawable.veigar_6);
                championPhotos.add(R.drawable.veigar_7);
                championPhotos.add(R.drawable.veigar_8);
                break;
            case "Velkoz":
                championPhotos.add(R.drawable.velkoz_0);
                championPhotos.add(R.drawable.velkoz_1);
                championPhotos.add(R.drawable.velkoz_2);
                championPhotos.add(R.drawable.velkoz_3);
                break;
            case "Vi":
                championPhotos.add(R.drawable.vi_0);
                championPhotos.add(R.drawable.vi_1);
                championPhotos.add(R.drawable.vi_2);
                championPhotos.add(R.drawable.vi_3);
                championPhotos.add(R.drawable.vi_4);
                break;
            case "Viktor":
                championPhotos.add(R.drawable.viktor_0);
                championPhotos.add(R.drawable.viktor_1);
                championPhotos.add(R.drawable.viktor_2);
                championPhotos.add(R.drawable.viktor_3);
                break;
            case "Vladimir":
                championPhotos.add(R.drawable.vladimir_0);
                championPhotos.add(R.drawable.vladimir_1);
                championPhotos.add(R.drawable.vladimir_2);
                championPhotos.add(R.drawable.vladimir_3);
                championPhotos.add(R.drawable.vladimir_4);
                championPhotos.add(R.drawable.vladimir_5);
                championPhotos.add(R.drawable.vladimir_6);
                championPhotos.add(R.drawable.vladimir_7);
                break;
            case "Volibear":
                championPhotos.add(R.drawable.volibear_0);
                championPhotos.add(R.drawable.volibear_1);
                championPhotos.add(R.drawable.volibear_2);
                championPhotos.add(R.drawable.volibear_3);
                championPhotos.add(R.drawable.volibear_4);
                championPhotos.add(R.drawable.volibear_5);
                break;
            case "Warwick":
                championPhotos.add(R.drawable.warwick_0);
                championPhotos.add(R.drawable.warwick_1);
                championPhotos.add(R.drawable.warwick_2);
                championPhotos.add(R.drawable.warwick_3);
                championPhotos.add(R.drawable.warwick_4);
                championPhotos.add(R.drawable.warwick_5);
                championPhotos.add(R.drawable.warwick_6);
                championPhotos.add(R.drawable.warwick_7);
                championPhotos.add(R.drawable.warwick_8);
                break;
            case "Xerath":
                championPhotos.add(R.drawable.xerath_0);
                championPhotos.add(R.drawable.xerath_1);
                championPhotos.add(R.drawable.xerath_2);
                championPhotos.add(R.drawable.xerath_3);
                championPhotos.add(R.drawable.xerath_4);
                break;
            case "XinZhao":
                championPhotos.add(R.drawable.xinzhao_0);
                championPhotos.add(R.drawable.xinzhao_1);
                championPhotos.add(R.drawable.xinzhao_2);
                championPhotos.add(R.drawable.xinzhao_3);
                championPhotos.add(R.drawable.xinzhao_4);
                championPhotos.add(R.drawable.xinzhao_5);
                championPhotos.add(R.drawable.xinzhao_6);
                break;
            case "Yasuo":
                championPhotos.add(R.drawable.yasuo_0);
                championPhotos.add(R.drawable.yasuo_1);
                championPhotos.add(R.drawable.yasuo_2);
                championPhotos.add(R.drawable.yasuo_3);
                break;
            case "Yorick":
                championPhotos.add(R.drawable.yorick_0);
                championPhotos.add(R.drawable.yorick_1);
                championPhotos.add(R.drawable.yorick_2);
                break;
            case "Zac":
                championPhotos.add(R.drawable.zac_0);
                championPhotos.add(R.drawable.zac_1);
                championPhotos.add(R.drawable.zac_2);
                break;
            case "Zed":
                championPhotos.add(R.drawable.zed_0);
                championPhotos.add(R.drawable.zed_1);
                championPhotos.add(R.drawable.zed_3);
                break;
            case "Ziggs":
                championPhotos.add(R.drawable.ziggs_0);
                championPhotos.add(R.drawable.ziggs_1);
                championPhotos.add(R.drawable.ziggs_2);
                championPhotos.add(R.drawable.ziggs_3);
                championPhotos.add(R.drawable.ziggs_4);
                championPhotos.add(R.drawable.ziggs_5);
                break;
            case "Zilean":
                championPhotos.add(R.drawable.zilean_0);
                championPhotos.add(R.drawable.zilean_1);
                championPhotos.add(R.drawable.zilean_2);
                championPhotos.add(R.drawable.zilean_3);
                championPhotos.add(R.drawable.zilean_4);
                championPhotos.add(R.drawable.zilean_5);
                break;
            case "Zyra":
                championPhotos.add(R.drawable.zyra_0);
                championPhotos.add(R.drawable.zyra_1);
                championPhotos.add(R.drawable.zyra_2);
                break;
        }
        Random rng = new Random();
        int max = championPhotos.size();
        int min = 0;
        int chosenPhoto = rng.nextInt((max - min) + 1) + min;

        //Bitmap championPhoto = decodeBitmap.decodeSampledBitmapFromResource(context.getResources(), championPhotos.get(chosenPhoto), 500, 500);
        context.getResources().getDrawable(R.drawable.a3748b72501);
        return championPhotos.get(chosenPhoto);
    }
}
