package portfolio.ian.com.leaguematchhistory.Activities;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import portfolio.ian.com.leaguematchhistory.*;

import java.util.ArrayList;

/**
 * Created by Ian on 29/06/2016.
 */
public class InGameItems {

    public Long item1, item2, item3, item4, item5, item6, item7;
    public Drawable image;
    public String name, plaintext;

    public static ArrayList<Long> items = new ArrayList<>();

    itemInfo itemIdToImage(Resources resource, long runeID) {
        String runeId = String.valueOf(runeID);
        itemInfo item = new itemInfo();
        switch (runeId) {

            case "0":
                item.itemImage = resource.getDrawable(R.drawable.default_item);
                item.name = "";
                item.plaintext = "";
                break;
            case "1001":
                item.itemImage = resource.getDrawable(R.drawable.boots_of_speed);
                item.name = "Boots of Speed";
                item.plaintext = "Slightly increases Movement Speed";
                break;
            case "1004":
                item.itemImage = resource.getDrawable(R.drawable.faerie_charm);
                item.name = "Faerie Charm";
                item.plaintext = "Slightly increases Mana Regen";
                break;
            case "1006":
                item.itemImage = resource.getDrawable(R.drawable.rejuvenation_bead);
                item.name = "Rejuvenation Bead";
                item.plaintext = "Slightly increases Health Regen";
                break;
            case "1011":
                item.itemImage = resource.getDrawable(R.drawable.giants_belt);
                item.name = "Giant's Belt";
                item.plaintext = "Greatly increases Health";
                break;
            case "1018":
                item.itemImage = resource.getDrawable(R.drawable.cloak_of_agility);
                item.name = "Cloak of Agility";
                item.plaintext = "Increases critical strike chance";
                break;
            case "1026":
                item.itemImage = resource.getDrawable(R.drawable.blasting_wand);
                item.name = "Blasting Wand";
                item.plaintext = "Moderately increases Ability Power";
                break;
            case "1027":
                item.itemImage = resource.getDrawable(R.drawable.sapphire_crystal);
                item.name = "Sapphire Crystal";
                item.plaintext = "Increases Mana";
                break;
            case "1028":
                item.itemImage = resource.getDrawable(R.drawable.ruby_crystal);
                item.name = "Ruby Crystal";
                item.plaintext = "Increases Health";
                break;
            case "1029":
                item.itemImage = resource.getDrawable(R.drawable.cloth_armor);
                item.name = "Cloth Armor";
                item.plaintext = "Slightly increases Armor";
                break;
            case "1031":
                item.itemImage = resource.getDrawable(R.drawable.chain_vest);
                item.name = "Chain Vest";
                item.plaintext = "Greatly increases Armor";
                break;
            case "1033":
                item.itemImage = resource.getDrawable(R.drawable.null_magic_mantle);
                item.name = "Null-Magic Mantle";
                item.plaintext = "Slightly increases Magic Resist";
                break;
            case "1036":
                item.itemImage = resource.getDrawable(R.drawable.long_sword);
                item.name = "Long Sword";
                item.plaintext = "Slightly increases Attack Damage";
                break;
            case "1037":
                item.itemImage = resource.getDrawable(R.drawable.pickaxe);
                item.name = "Pickaxe";
                item.plaintext = "Moderately increases Attack Damage";
                break;
            case "1038":
                item.itemImage = resource.getDrawable(R.drawable.b_f_sword);
                item.name = "B. F. Sword";
                item.plaintext = "Greatly increases Attack Damage";
                break;
            case "1039":
                item.itemImage = resource.getDrawable(R.drawable.hunters_talisman);
                item.name = "Hunter's Talisman";
                item.plaintext = "Provides damage against Monsters and Mana Regen in the Jungle";
                break;
            case "1041":
                item.itemImage = resource.getDrawable(R.drawable.hunters_machete);
                item.name = "Hunter's Machete";
                item.plaintext = "Provides damage and life steal versus Monsters";
                break;
            case "1042":
                item.itemImage = resource.getDrawable(R.drawable.dagger);
                item.name = "Dagger";
                item.plaintext = "Slightly increases Attack Speed";
                break;
            case "1043":
                item.itemImage = resource.getDrawable(R.drawable.recurve_bow);
                item.name = "Recurve Bow";
                item.plaintext = "Greatly increases Attack Speed";
                break;
            case "1051":
                item.itemImage = resource.getDrawable(R.drawable.brawlers_gloves);
                item.name = "Brawler's Gloves";
                item.plaintext = "Slightly increases Critical Strike Chance";
                break;
            case "1052":
                item.itemImage = resource.getDrawable(R.drawable.amplifying_tome);
                item.name = "Amplifying Tome";
                item.plaintext = "Slightly increases Ability Power";
                break;
            case "1053":
                item.itemImage = resource.getDrawable(R.drawable.vampiric_scepter);
                item.name = "Vampiric Scepter";
                item.plaintext = "Basic attacks restore Health";
                break;
            case "1054":
                item.itemImage = resource.getDrawable(R.drawable.dorans_shield);
                item.name = "Doran's Shield";
                item.plaintext = "Good defensive starting item";
                break;
            case "1055":
                item.itemImage = resource.getDrawable(R.drawable.dorans_blade);
                item.name = "Doran's Blade";
                item.plaintext = "Good starting item for attackers";
                break;
            case "1056":
                item.itemImage = resource.getDrawable(R.drawable.dorans_ring);
                item.name = "Doran's Ring";
                item.plaintext = "Good starting item for casters";
                break;
            case "1057":
                item.itemImage = resource.getDrawable(R.drawable.negatron_cloak);
                item.name = "Negatron Cloak";
                item.plaintext = "Moderately increases Magic Resist";
                break;
            case "1058":
                item.itemImage = resource.getDrawable(R.drawable.needlessly_large_rod);
                item.name = "Needlessly Large Rod";
                item.plaintext = "Greatly increases Ability Power";
                break;
            case "1082":
                item.itemImage = resource.getDrawable(R.drawable.the_dark_seal);
                item.name = "The Dark Seal";
                item.plaintext = "Provides Ability Power and Mana.  Increases in power as you kill enemies.";
                break;
            case "1083":
                item.itemImage = resource.getDrawable(R.drawable.cull);
                item.name = "Cull";
                item.plaintext = "Provides damage and Life Steal on hit - Killing minions grant bonus Gold";
                break;
            case "1400":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_warrior);
                item.name = "Enchantment: Warrior";
                item.plaintext = "Grants Attack Damage and Cooldown Reduction";
                break;
            case "1401":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_cinderhulk);
                item.name = "Enchantment: Cinderhulk";
                item.plaintext = "Grants Health and Immolate Aura";
                break;
            case "1402":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_runic_echoes);
                item.name = "Enchantment: Runic Echoes";
                item.plaintext = "Grants Ability Power and periodically empowers your Spells";
                break;
            case "1408":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_warrior);
                item.name = "Enchantment: Warrior";
                item.plaintext = "Grants Attack Damage and Cooldown Reduction";
                break;
            case "1409":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_cinderhulk);
                item.name = "Enchantment: Cinderhulk";
                item.plaintext = "Grants Health and Immolate Aura";
                break;
            case "1410":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_runic_echoes);
                item.name = "Enchantment: Runic Echoes";
                item.plaintext = "Grants Ability Power and periodically empowers your Spells";
                break;
            case "1412":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_warrior);
                item.name = "Enchantment: Warrior";
                item.plaintext = "Grants Attack Damage and Cooldown Reduction";
                break;
            case "1413":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_cinderhulk);
                item.name = "Enchantment: Cinderhulk";
                item.plaintext = "Grants Health and Immolate Aura";
                break;
            case "1414":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_runic_echoes);
                item.name = "Enchantment: Runic Echoes";
                item.plaintext = "Grants Ability Power and periodically empowers your Spells";
                break;
            case "1416":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_bloodrazor);
                item.name = "Enchantment: Bloodrazor";
                item.plaintext = "Increases Attack Speed and deals damage based on the target's Health";
                break;
            case "1418":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_bloodrazor);
                item.name = "Enchantment: Bloodrazor";
                item.plaintext = "Increases Attack Speed and deals damage based on the target's Health";
                break;
            case "1419":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_bloodrazor);
                item.name = "Enchantment: Bloodrazor";
                item.plaintext = "Increases Attack Speed and deals damage based on the target's Health";
                break;
            case "2003":
                item.itemImage = resource.getDrawable(R.drawable.health_potion);
                item.name = "Health Potion";
                item.plaintext = "Consume to restore Health over time";
                break;
            case "2009":
                item.itemImage = resource.getDrawable(R.drawable.total_biscuit_of_rejuvenation);
                item.name = "Total Biscuit of Rejuvenation";
                item.plaintext = "";
                break;
            case "2010":
                item.itemImage = resource.getDrawable(R.drawable.total_biscuit_of_rejuvenation);
                item.name = "Total Biscuit of Rejuvenation";
                item.plaintext = "";
                break;
            case "2015":
                item.itemImage = resource.getDrawable(R.drawable.kircheis_shard);
                item.name = "Kircheis Shard";
                item.plaintext = "Attack speed and a chargable magic hit";
                break;
            case "2031":
                item.itemImage = resource.getDrawable(R.drawable.refillable_potion);
                item.name = "Refillable Potion";
                item.plaintext = "Restores Health over time. Refills at shop.";
                break;
            case "2032":
                item.itemImage = resource.getDrawable(R.drawable.hunters_potion);
                item.name = "Hunter's Potion";
                item.plaintext = "Restores Health and Mana over time - Refills at shop and has increased capacity";
                break;
            case "2033":
                item.itemImage = resource.getDrawable(R.drawable.corrupting_potion);
                item.name = "Corrupting Potion";
                item.plaintext = "Restores Health and Mana over time and boosts combat power - Refills at Shop";
                break;
            case "2043":
                item.itemImage = resource.getDrawable(R.drawable.vision_ward);
                item.name = "Vision Ward";
                item.plaintext = "Use to provide vision and stealth detection in an area until destroyed";
                break;
            case "2045":
                item.itemImage = resource.getDrawable(R.drawable.ruby_sightstone);
                item.name = "Ruby Sightstone";
                item.plaintext = "Greatly increases Health and provides Stealth Wards over time";
                break;
            case "2047":
                item.itemImage = resource.getDrawable(R.drawable.oracles_extract);
                item.name = "Oracle's Extract";
                item.plaintext = "Allows champion to see invisible units";
                break;
            case "2049":
                item.itemImage = resource.getDrawable(R.drawable.sightstone);
                item.name = "Sightstone";
                item.plaintext = "Increases Health and provides Stealth Wards over time";
                break;
            case "2050":
                item.itemImage = resource.getDrawable(R.drawable.explorers_ward);
                item.name = "Explorer's Ward";
                item.plaintext = "";
                break;
            case "2051":
                item.itemImage = resource.getDrawable(R.drawable.guardians_horn);
                item.name = "Guardian's Horn";
                item.plaintext = "Good starting item for tanks";
                break;
            case "2052":
                item.itemImage = resource.getDrawable(R.drawable.poro_snax);
                item.name = "Poro-Snax";
                item.plaintext = "";
                break;
            case "2053":
                item.itemImage = resource.getDrawable(R.drawable.raptor_cloak);
                item.name = "Raptor Cloak";
                item.plaintext = "Enhances Movement Speed near turrets";
                break;
            case "2054":
                item.itemImage = resource.getDrawable(R.drawable.diet_poro_snax);
                item.name = "Diet Poro-Snax";
                item.plaintext = "";
                break;
            case "2138":
                item.itemImage = resource.getDrawable(R.drawable.elixir_of_iron);
                item.name = "Elixir of Iron";
                item.plaintext = "Temporarily increases defenses. Leaves a trail for allies to follow.";
                break;
            case "2139":
                item.itemImage = resource.getDrawable(R.drawable.elixir_of_sorcery);
                item.name = "Elixir of Sorcery";
                item.plaintext = "Temporarily grants Ability Power and Bonus Damage to champions and turrets.";
                break;
            case "2140":
                item.itemImage = resource.getDrawable(R.drawable.elixir_of_wrath);
                item.name = "Elixir of Wrath";
                item.plaintext = "Temporarily grants Attack Damage and heals you when dealing physical damage to champions.";
                break;
            case "2301":
                item.itemImage = resource.getDrawable(R.drawable.eye_of_the_watchers);
                item.name = "Eye of the Watchers";
                item.plaintext = "Provides Ability Power and Stealth Wards over time";
                break;
            case "2302":
                item.itemImage = resource.getDrawable(R.drawable.eye_of_the_oasis);
                item.name = "Eye of the Oasis";
                item.plaintext = "Provides Regeneration and Stealth Wards over time";
                break;
            case "2303":
                item.itemImage = resource.getDrawable(R.drawable.eye_of_the_equinox);
                item.name = "Eye of the Equinox";
                item.plaintext = "Provides Health and Stealth Wards over time";
                break;
            case "3001":
                item.itemImage = resource.getDrawable(R.drawable.abyssal_scepter);
                item.name = "Abyssal Scepter";
                item.plaintext = "Reduces Magic Resist of nearby enemies";
                break;
            case "3003":
                item.itemImage = resource.getDrawable(R.drawable.archangels_staff);
                item.name = "Archangel's Staff";
                item.plaintext = "Increases Ability Power based on maximum Mana";
                break;
            case "3004":
                item.itemImage = resource.getDrawable(R.drawable.manamune);
                item.name = "Manamune";
                item.plaintext = "Increases Attack Damage based on maximum Mana";
                break;
            case "3006":
                item.itemImage = resource.getDrawable(R.drawable.berserkers_greaves);
                item.name = "Berserker's Greaves";
                item.plaintext = "Enhances Movement Speed and Attack Speed";
                break;
            case "3007":
                item.itemImage = resource.getDrawable(R.drawable.archangels_staff_crystal_scar);
                item.name = "Archangel's Staff (Crystal Scar)";
                item.plaintext = "Increases Ability Power based on maximum Mana";
                break;
            case "3008":
                item.itemImage = resource.getDrawable(R.drawable.manamune_crystal_scar);
                item.name = "Manamune (Crystal Scar)";
                item.plaintext = "Increases Attack Damage based on maximum Mana";
                break;
            case "3009":
                item.itemImage = resource.getDrawable(R.drawable.boots_of_swiftness);
                item.name = "Boots of Swiftness";
                item.plaintext = "Enhances Movement Speed and reduces the effect of slows";
                break;
            case "3010":
                item.itemImage = resource.getDrawable(R.drawable.catalyst_of_aeons);
                item.name = "Catalyst of Aeons";
                item.plaintext = "Spend Mana to recover Health";
                break;
            case "3020":
                item.itemImage = resource.getDrawable(R.drawable.sorcerers_shoes);
                item.name = "Sorcerer's Shoes";
                item.plaintext = "Enhances Movement Speed and magic damage";
                break;
            case "3022":
                item.itemImage = resource.getDrawable(R.drawable.frozen_mallet);
                item.name = "Frozen Mallet";
                item.plaintext = "Basic attacks slow enemies";
                break;
            case "3024":
                item.itemImage = resource.getDrawable(R.drawable.glacial_shroud);
                item.name = "Glacial Shroud";
                item.plaintext = "Increases Armor and Cooldown Reduction";
                break;
            case "3025":
                item.itemImage = resource.getDrawable(R.drawable.iceborn_gauntlet);
                item.name = "Iceborn Gauntlet";
                item.plaintext = "Basic attacks create a slow field after spell cast";
                break;
            case "3026":
                item.itemImage = resource.getDrawable(R.drawable.guardian_angel);
                item.name = "Guardian Angel";
                item.plaintext = "Periodically revives champion upon death";
                break;
            case "3027":
                item.itemImage = resource.getDrawable(R.drawable.rod_of_ages);
                item.name = "Rod of Ages";
                item.plaintext = "Greatly increases Health, Mana, and Ability Power";
                break;
            case "3028":
                item.itemImage = resource.getDrawable(R.drawable.chalice_of_harmony);
                item.name = "Chalice of Harmony";
                item.plaintext = "Increases Mana and Health Regeneration";
                break;
            case "3029":
                item.itemImage = resource.getDrawable(R.drawable.rod_of_ages_crystal_scar);
                item.name = "Rod of Ages (Crystal Scar)";
                item.plaintext = "Greatly increases Health, Mana, and Ability Power";
                break;
            case "3030":
                item.itemImage = resource.getDrawable(R.drawable.hextech_glp_800);
                item.name = "Hextech GLP-800";
                item.plaintext = "Activate to fire icy bolts to slow enemies";
                break;
            case "3031":
                item.itemImage = resource.getDrawable(R.drawable.infinity_edge);
                item.name = "Infinity Edge";
                item.plaintext = "Massively enhances critical strikes";
                break;
            case "3033":
                item.itemImage = resource.getDrawable(R.drawable.mortal_reminder);
                item.name = "Mortal Reminder";
                item.plaintext = "Overcomes enemies with high Health recovery and Armor";
                break;
            case "3034":
                item.itemImage = resource.getDrawable(R.drawable.giant_slayer);
                item.name = "Giant Slayer";
                item.plaintext = "Overcomes enemies with high Health";
                break;
            case "3035":
                item.itemImage = resource.getDrawable(R.drawable.last_whisper);
                item.name = "Last Whisper";
                item.plaintext = "Overcomes enemies with high Armor";
                break;
            case "3036":
                item.itemImage = resource.getDrawable(R.drawable.lord_dominiks_regards);
                item.name = "Lord Dominik's Regards";
                item.plaintext = "Overcomes enemies with high health and armor";
                break;
            case "3040":
                item.itemImage = resource.getDrawable(R.drawable.seraphs_embrace);
                item.name = "Seraph's Embrace";
                item.plaintext = "";
                break;
            case "3041":
                item.itemImage = resource.getDrawable(R.drawable.mejais_soulstealer);
                item.name = "Mejai's Soulstealer";
                item.plaintext = "Grants Ability Power for kills and assists";
                break;
            case "3042":
                item.itemImage = resource.getDrawable(R.drawable.muramana);
                item.name = "Muramana";
                item.plaintext = "";
                break;
            case "3043":
                item.itemImage = resource.getDrawable(R.drawable.muramana);
                item.name = "Muramana";
                item.plaintext = "";
                break;
            case "3044":
                item.itemImage = resource.getDrawable(R.drawable.phage);
                item.name = "Phage";
                item.plaintext = "Attacks and kills give a small burst of speed";
                break;
            case "3046":
                item.itemImage = resource.getDrawable(R.drawable.phantom_dancer);
                item.name = "Phantom Dancer";
                item.plaintext = "Move faster near enemies and reduce incoming damage";
                break;
            case "3047":
                item.itemImage = resource.getDrawable(R.drawable.ninja_tabi);
                item.name = "Ninja Tabi";
                item.plaintext = "Enhances Movement Speed and reduces incoming basic attack damage";
                break;
            case "3048":
                item.itemImage = resource.getDrawable(R.drawable.seraphs_embrace);
                item.name = "Seraph's Embrace";
                item.plaintext = "";
                break;
            case "3050":
                item.itemImage = resource.getDrawable(R.drawable.zekes_harbinger);
                item.name = "Zeke's Harbinger";
                item.plaintext = "Grants an ally bursts of Critical Strike Chance and Ability Power";
                break;
            case "3052":
                item.itemImage = resource.getDrawable(R.drawable.jaurims_fist);
                item.name = "Jaurim's Fist";
                item.plaintext = "Attack Damage and stacking Health on Unit Kill";
                break;
            case "3053":
                item.itemImage = resource.getDrawable(R.drawable.steraks_gage);
                item.name = "Sterak's Gage";
                item.plaintext = "Shields against large bursts of damage";
                break;
            case "3056":
                item.itemImage = resource.getDrawable(R.drawable.ohmwrecker);
                item.name = "Ohmwrecker";
                item.plaintext = "Temporarily disables enemy turrets";
                break;
            case "3057":
                item.itemImage = resource.getDrawable(R.drawable.sheen);
                item.name = "Sheen";
                item.plaintext = "Grants a bonus to next attack after spell cast";
                break;
            case "3060":
                item.itemImage = resource.getDrawable(R.drawable.banner_of_command);
                item.name = "Banner of Command";
                item.plaintext = "Promotes a siege minion to a more powerful unit";
                break;
            case "3065":
                item.itemImage = resource.getDrawable(R.drawable.spirit_visage);
                item.name = "Spirit Visage";
                item.plaintext = "Increases Health and healing effects";
                break;
            case "3067":
                item.itemImage = resource.getDrawable(R.drawable.kindlegem);
                item.name = "Kindlegem";
                item.plaintext = "Increases Health and Cooldown Reduction";
                break;
            case "3068":
                item.itemImage = resource.getDrawable(R.drawable.sunfire_cape);
                item.name = "Sunfire Cape";
                item.plaintext = "Constantly deals damage to nearby enemies";
                break;
            case "3069":
                item.itemImage = resource.getDrawable(R.drawable.talisman_of_ascension);
                item.name = "Talisman of Ascension";
                item.plaintext = "Increases Health / Mana Regeneration and Cooldown Reduction. Activate to speed up nearby allies.";
                break;
            case "3070":
                item.itemImage = resource.getDrawable(R.drawable.tear_of_the_goddess);
                item.name = "Tear of the Goddess";
                item.plaintext = "Increases maximum Mana as Mana is spent";
                break;
            case "3071":
                item.itemImage = resource.getDrawable(R.drawable.the_black_cleaver);
                item.name = "The Black Cleaver";
                item.plaintext = "Dealing physical damage to enemy champions reduces their Armor";
                break;
            case "3072":
                item.itemImage = resource.getDrawable(R.drawable.the_bloodthirster);
                item.name = "The Bloodthirster";
                item.plaintext = "Grants Attack Damage, Life Steal and Life Steal now overheals";
                break;
            case "3073":
                item.itemImage = resource.getDrawable(R.drawable.tear_of_the_goddess_crystal_scar);
                item.name = "Tear of the Goddess (Crystal Scar)";
                item.plaintext = "Increases maximum Mana as Mana is spent";
                break;
            case "3074":
                item.itemImage = resource.getDrawable(R.drawable.ravenous_hydra);
                item.name = "Ravenous Hydra";
                item.plaintext = "Melee attacks hit nearby enemies, dealing damage and restoring Health";
                break;
            case "3075":
                item.itemImage = resource.getDrawable(R.drawable.thornmail);
                item.name = "Thornmail";
                item.plaintext = "Returns damage taken from basic attacks as magic damage";
                break;
            case "3077":
                item.itemImage = resource.getDrawable(R.drawable.tiamat);
                item.name = "Tiamat";
                item.plaintext = "Melee attacks hit nearby enemies";
                break;
            case "3078":
                item.itemImage = resource.getDrawable(R.drawable.trinity_force);
                item.name = "Trinity Force";
                item.plaintext = "Tons of Damage";
                break;
            case "3082":
                item.itemImage = resource.getDrawable(R.drawable.wardens_mail);
                item.name = "Warden's Mail";
                item.plaintext = "Slows Attack Speed of enemy champions when receiving basic attacks";
                break;
            case "3083":
                item.itemImage = resource.getDrawable(R.drawable.warmogs_armor);
                item.name = "Warmog's Armor";
                item.plaintext = "Grants massive Health and Health Regen";
                break;
            case "3084":
                item.itemImage = resource.getDrawable(R.drawable.overlords_bloodmail);
                item.name = "Overlord's Bloodmail";
                item.plaintext = "Restores Health on kill or assist";
                break;
            case "3085":
                item.itemImage = resource.getDrawable(R.drawable.runaans_hurricane);
                item.name = "Runaan's Hurricane";
                item.plaintext = "Ranged attacks fire two bolts at nearby enemies";
                break;
            case "3086":
                item.itemImage = resource.getDrawable(R.drawable.zeal);
                item.name = "Zeal";
                item.plaintext = "Slight bonuses to Critical Strike Chance, Movement Speed and Attack Speed";
                break;
            case "3087":
                item.itemImage = resource.getDrawable(R.drawable.statikk_shiv);
                item.name = "Statikk Shiv";
                item.plaintext = "Movement builds charges that release chain lightning on basic attack";
                break;
            case "3089":
                item.itemImage = resource.getDrawable(R.drawable.rabadons_deathcap);
                item.name = "Rabadon's Deathcap";
                item.plaintext = "Massively increases Ability Power";
                break;
            case "3090":
                item.itemImage = resource.getDrawable(R.drawable.wooglets_witchcap);
                item.name = "Wooglet's Witchcap";
                item.plaintext = "Massively increases Ability Power and can be activated to enter stasis";
                break;
            case "3091":
                item.itemImage = resource.getDrawable(R.drawable.wits_end);
                item.name = "Wit's End";
                item.plaintext = "Deals bonus magic damage on basic attacks";
                break;
            case "3092":
                item.itemImage = resource.getDrawable(R.drawable.frost_queens_claim);
                item.name = "Frost Queen's Claim";
                item.plaintext = "Sends out seeking wraiths that track hidden enemies and slow them";
                break;
            case "3094":
                item.itemImage = resource.getDrawable(R.drawable.rapid_firecannon);
                item.name = "Rapid Firecannon";
                item.plaintext = "Movement builds charges that release a sieging fire attack on release";
                break;
            case "3096":
                item.itemImage = resource.getDrawable(R.drawable.nomads_medallion);
                item.name = "Nomad's Medallion";
                item.plaintext = "Grants gold when nearby enemy minions die, Health Regen and Mana Regen";
                break;
            case "3097":
                item.itemImage = resource.getDrawable(R.drawable.targons_brace);
                item.name = "Targon's Brace";
                item.plaintext = "Periodically kill enemy minions to heal and grant gold to a nearby ally";
                break;
            case "3098":
                item.itemImage = resource.getDrawable(R.drawable.frostfang);
                item.name = "Frostfang";
                item.plaintext = "Grants gold when you damage an enemy with a Spell or Attack";
                break;
            case "3100":
                item.itemImage = resource.getDrawable(R.drawable.lich_bane);
                item.name = "Lich Bane";
                item.plaintext = "Grants a bonus to next attack after spell cast";
                break;
            case "3101":
                item.itemImage = resource.getDrawable(R.drawable.stinger);
                item.name = "Stinger";
                item.plaintext = "Increased Attack Speed and Cooldown Reduction";
                break;
            case "3102":
                item.itemImage = resource.getDrawable(R.drawable.banshees_veil);
                item.name = "Banshee's Veil";
                item.plaintext = "Periodically blocks enemy abilities";
                break;
            case "3104":
                item.itemImage = resource.getDrawable(R.drawable.lord_van_damms_pillager);
                item.name = "Lord Van Damm's Pillager";
                item.plaintext = "Massively enhances critical strikes";
                break;
            case "3105":
                item.itemImage = resource.getDrawable(R.drawable.aegis_of_the_legion);
                item.name = "Aegis of the Legion";
                item.plaintext = "Improves defenses for nearby allies";
                break;
            case "3108":
                item.itemImage = resource.getDrawable(R.drawable.fiendish_codex);
                item.name = "Fiendish Codex";
                item.plaintext = "Increases Ability Power and Cooldown Reduction";
                break;
            case "3110":
                item.itemImage = resource.getDrawable(R.drawable.frozen_heart);
                item.name = "Frozen Heart";
                item.plaintext = "Massively increases Armor and slows enemy basic attacks";
                break;
            case "3111":
                item.itemImage = resource.getDrawable(R.drawable.mercurys_treads);
                item.name = "Mercury's Treads";
                item.plaintext = "Increases Movement Speed and reduces duration of disabling effects";
                break;
            case "3112":
                item.itemImage = resource.getDrawable(R.drawable.guardians_orb);
                item.name = "Guardian's Orb";
                item.plaintext = "Good starting item for mages";
                break;
            case "3113":
                item.itemImage = resource.getDrawable(R.drawable.aether_wisp);
                item.name = "Aether Wisp";
                item.plaintext = "Increases Ability Power and Movement Speed";
                break;
            case "3114":
                item.itemImage = resource.getDrawable(R.drawable.forbidden_idol);
                item.name = "Forbidden Idol";
                item.plaintext = "Increases Mana Regeneration and Cooldown Reduction";
                break;
            case "3115":
                item.itemImage = resource.getDrawable(R.drawable.nashors_tooth);
                item.name = "Nashor's Tooth";
                item.plaintext = "Increases Attack Speed, Ability Power, and Cooldown Reduction";
                break;
            case "3116":
                item.itemImage = resource.getDrawable(R.drawable.rylais_crystal_scepter);
                item.name = "Rylai's Crystal Scepter";
                item.plaintext = "Abilities slow enemies";
                break;
            case "3117":
                item.itemImage = resource.getDrawable(R.drawable.boots_of_mobility);
                item.name = "Boots of Mobility";
                item.plaintext = "Greatly enhances Movement Speed when out of combat";
                break;
            case "3122":
                item.itemImage = resource.getDrawable(R.drawable.wicked_hatchet);
                item.name = "Wicked Hatchet";
                item.plaintext = "Critical Strikes cause your target to bleed";
                break;
            case "3123":
                item.itemImage = resource.getDrawable(R.drawable.executioners_calling);
                item.name = "Executioner's Calling";
                item.plaintext = "Overcomes enemies with high health gain";
                break;
            case "3124":
                item.itemImage = resource.getDrawable(R.drawable.guinsoos_rageblade);
                item.name = "Guinsoo's Rageblade";
                item.plaintext = "Increases Ability Power and Attack Damage";
                break;
            case "3133":
                item.itemImage = resource.getDrawable(R.drawable.caulfields_warhammer);
                item.name = "Caulfield's Warhammer";
                item.plaintext = "Attack Damage and Cooldown Reduction";
                break;
            case "3134":
                item.itemImage = resource.getDrawable(R.drawable.serrated_dirk);
                item.name = "Serrated Dirk";
                item.plaintext = "Increases Attack Damage and Armor Penetration";
                break;
            case "3135":
                item.itemImage = resource.getDrawable(R.drawable.void_staff);
                item.name = "Void Staff";
                item.plaintext = "Increases magic damage";
                break;
            case "3136":
                item.itemImage = resource.getDrawable(R.drawable.haunting_guise);
                item.name = "Haunting Guise";
                item.plaintext = "Increases magic damage";
                break;
            case "3137":
                item.itemImage = resource.getDrawable(R.drawable.dervish_blade);
                item.name = "Dervish Blade";
                item.plaintext = "Activate to remove all debuffs and grant massive Movement Speed";
                break;
            case "3139":
                item.itemImage = resource.getDrawable(R.drawable.mercurial_scimitar);
                item.name = "Mercurial Scimitar";
                item.plaintext = "Activate to remove all crowd control debuffs and grant massive Movement Speed";
                break;
            case "3140":
                item.itemImage = resource.getDrawable(R.drawable.quicksilver_sash);
                item.name = "Quicksilver Sash";
                item.plaintext = "Activate to remove all crowd control debuffs";
                break;
            case "3142":
                item.itemImage = resource.getDrawable(R.drawable.youmuus_ghostblade);
                item.name = "Youmuu's Ghostblade";
                item.plaintext = "Activate to greatly increase Movement Speed and Attack Speed";
                break;
            case "3143":
                item.itemImage = resource.getDrawable(R.drawable.randuins_omen);
                item.name = "Randuin's Omen";
                item.plaintext = "Greatly increases defenses, activate to slow nearby enemies";
                break;
            case "3144":
                item.itemImage = resource.getDrawable(R.drawable.bilgewater_cutlass);
                item.name = "Bilgewater Cutlass";
                item.plaintext = "Activate to deal magic damage and slow target champion";
                break;
            case "3145":
                item.itemImage = resource.getDrawable(R.drawable.hextech_revolver);
                item.name = "Hextech Revolver";
                item.plaintext = "Increases Ability Power. Deal bonus magic damage on attack periodically.";
                break;
            case "3146":
                item.itemImage = resource.getDrawable(R.drawable.hextech_gunblade);
                item.name = "Hextech Gunblade";
                item.plaintext = "Increases Attack Damage and Ability Power, activate to slow a target";
                break;
            case "3147":
                item.itemImage = resource.getDrawable(R.drawable.duskblade_of_draktharr);
                item.name = "Duskblade of Draktharr";
                item.plaintext = "Deals a delayed burst of damage on hit.";
                break;
            case "3151":
                item.itemImage = resource.getDrawable(R.drawable.liandrys_torment);
                item.name = "Liandry's Torment";
                item.plaintext = "Spell damage burns enemies for a portion of their Health";
                break;
            case "3152":
                item.itemImage = resource.getDrawable(R.drawable.hextech_protobelt_01);
                item.name = "Hextech Protobelt-01";
                item.plaintext = "Activate to dash forward and unleash a fiery explosion";
                break;
            case "3153":
                item.itemImage = resource.getDrawable(R.drawable.blade_of_the_ruined_king);
                item.name = "Blade of the Ruined King";
                item.plaintext = "Deals damage based on target's Health, can steal Health and Movement Speed";
                break;
            case "3155":
                item.itemImage = resource.getDrawable(R.drawable.hexdrinker);
                item.name = "Hexdrinker";
                item.plaintext = "Increases Attack Damage and Magic Resist";
                break;
            case "3156":
                item.itemImage = resource.getDrawable(R.drawable.maw_of_malmortius);
                item.name = "Maw of Malmortius";
                item.plaintext = "Grants bonus Attack Damage when Health is low";
                break;
            case "3157":
                item.itemImage = resource.getDrawable(R.drawable.zhonyas_hourglass);
                item.name = "Zhonya's Hourglass";
                item.plaintext = "Activate to become invincible but unable to take actions";
                break;
            case "3158":
                item.itemImage = resource.getDrawable(R.drawable.ionian_boots_of_lucidity);
                item.name = "Ionian Boots of Lucidity";
                item.plaintext = "Increases Movement Speed and Cooldown Reduction";
                break;
            case "3165":
                item.itemImage = resource.getDrawable(R.drawable.morellonomicon);
                item.name = "Morellonomicon";
                item.plaintext = "Greatly increases Ability Power and Cooldown Reduction";
                break;
            case "3170":
                item.itemImage = resource.getDrawable(R.drawable.moonflair_spellblade);
                item.name = "Moonflair Spellblade";
                item.plaintext = "Improves defense and reduces duration of disabling effects";
                break;
            case "3174":
                item.itemImage = resource.getDrawable(R.drawable.athenes_unholy_grail);
                item.name = "Athene's Unholy Grail";
                item.plaintext = "Deal damage to empower your heals and shields";
                break;
            case "3181":
                item.itemImage = resource.getDrawable(R.drawable.sanguine_blade);
                item.name = "Sanguine Blade";
                item.plaintext = "Greatly increases Attack Damage and Life Steal";
                break;
            case "3184":
                item.itemImage = resource.getDrawable(R.drawable.guardians_hammer);
                item.name = "Guardian's Hammer";
                item.plaintext = "Good starting item for attackers";
                break;
            case "3185":
                item.itemImage = resource.getDrawable(R.drawable.the_lightbringer);
                item.name = "The Lightbringer";
                item.plaintext = "Critical Strikes cause your target to bleed and be revealed";
                break;
            case "3187":
                item.itemImage = resource.getDrawable(R.drawable.arcane_sweeper);
                item.name = "Arcane Sweeper";
                item.plaintext = "Activate to reveal a nearby area of the map";
                break;
            case "3190":
                item.itemImage = resource.getDrawable(R.drawable.locket_of_the_iron_solari);
                item.name = "Locket of the Iron Solari";
                item.plaintext = "Activate to shield nearby allies from damage";
                break;
            case "3191":
                item.itemImage = resource.getDrawable(R.drawable.seekers_armguard);
                item.name = "Seeker's Armguard";
                item.plaintext = "Increases Armor and Ability Power";
                break;
            case "3196":
                item.itemImage = resource.getDrawable(R.drawable.the_hex_core_mk_1);
                item.name = "The Hex Core mk-1";
                item.plaintext = "Allows Viktor to improve an ability of his choice";
                break;
            case "3197":
                item.itemImage = resource.getDrawable(R.drawable.the_hex_core_mk_2);
                item.name = "The Hex Core mk-2";
                item.plaintext = "Allows Viktor to improve an ability of his choice";
                break;
            case "3198":
                item.itemImage = resource.getDrawable(R.drawable.perfect_hex_core);
                item.name = "Perfect Hex Core";
                item.plaintext = "Allows Viktor to improve an ability of his choice";
                break;
            case "3200":
                item.itemImage = resource.getDrawable(R.drawable.prototype_hex_core);
                item.name = "Prototype Hex Core";
                item.plaintext = "Increases Ability Power and can be upgraded to improve Viktor's abilities";
                break;
            case "3211":
                item.itemImage = resource.getDrawable(R.drawable.spectres_cowl);
                item.name = "Spectre's Cowl";
                item.plaintext = "Improves defense and grants regeneration upon being damaged";
                break;
            case "3222":
                item.itemImage = resource.getDrawable(R.drawable.mikaels_crucible);
                item.name = "Mikael's Crucible";
                item.plaintext = "Activate to heal and remove all disabling effects from an allied champion";
                break;
            case "3285":
                item.itemImage = resource.getDrawable(R.drawable.ludens_echo);
                item.name = "Luden's Echo";
                item.plaintext = "Movement and casting builds charges that release chain lightning on next spell hit";
                break;
            case "3301":
                item.itemImage = resource.getDrawable(R.drawable.ancient_coin);
                item.name = "Ancient Coin";
                item.plaintext = "Grants gold when nearby minions die that you didn't kill";
                break;
            case "3302":
                item.itemImage = resource.getDrawable(R.drawable.relic_shield);
                item.name = "Relic Shield";
                item.plaintext = "Kill minions periodically to heal and grant gold to a nearby ally";
                break;
            case "3303":
                item.itemImage = resource.getDrawable(R.drawable.spellthiefs_edge);
                item.name = "Spellthief's Edge";
                item.plaintext = "Grants gold when you attack enemies";
                break;
            case "3340":
                item.itemImage = resource.getDrawable(R.drawable.warding_totem_trinket);
                item.name = "Warding Totem trinket";
                item.plaintext = "Periodically place a Stealth Ward";
                break;
            case "3341":
                item.itemImage = resource.getDrawable(R.drawable.sweeping_lens_trinket);
                item.name = "Sweeping Lens trinket";
                item.plaintext = "Detects and disables nearby invisible wards and traps";
                break;
            case "3345":
                item.itemImage = resource.getDrawable(R.drawable.soul_anchor_trinket);
                item.name = "Soul Anchor trinket";
                item.plaintext = "Consumes charge to revive champion.";
                break;
            case "3348":
                item.itemImage = resource.getDrawable(R.drawable.arcane_sweeper);
                item.name = "Arcane Sweeper";
                item.plaintext = "Activate to reveal a nearby area of the map";
                break;
            case "3361":
                item.itemImage = resource.getDrawable(R.drawable.greater_stealth_totem_trinket);
                item.name = "Greater Stealth Totem trinket";
                item.plaintext = "Periodically place a Stealth Ward";
                break;
            case "3362":
                item.itemImage = resource.getDrawable(R.drawable.greater_vision_totem_trinket);
                item.name = "Greater Vision Totem trinket";
                item.plaintext = "Periodically place a Vision Ward";
                break;
            case "3363":
                item.itemImage = resource.getDrawable(R.drawable.farsight_alteration);
                item.name = "Farsight Alteration";
                item.plaintext = "Grants increased range and reveals the targetted area";
                break;
            case "3364":
                item.itemImage = resource.getDrawable(R.drawable.oracle_alteration);
                item.name = "Oracle Alteration";
                item.plaintext = "Disables nearby invisible wards and traps for a duration";
                break;
            case "3401":
                item.itemImage = resource.getDrawable(R.drawable.face_of_the_mountain);
                item.name = "Face of the Mountain";
                item.plaintext = "Shield an ally from damage based on your Health";
                break;
            case "3460":
                item.itemImage = resource.getDrawable(R.drawable.golden_transcendence);
                item.name = "Golden Transcendence";
                item.plaintext = "";
                break;
            case "3462":
                item.itemImage = resource.getDrawable(R.drawable.seer_stone_trinket);
                item.name = "Seer Stone trinket";
                item.plaintext = "Briefly reveals a nearby targeted area";
                break;
            case "3504":
                item.itemImage = resource.getDrawable(R.drawable.ardent_censer);
                item.name = "Ardent Censer";
                item.plaintext = "Shield and heal effects on other units grant them Attack Speed and bonus damage briefly";
                break;
            case "3508":
                item.itemImage = resource.getDrawable(R.drawable.essence_reaver);
                item.name = "Essence Reaver";
                item.plaintext = "Critical Strike provides Cooldown Reduction and Mana";
                break;
            case "3512":
                item.itemImage = resource.getDrawable(R.drawable.zzrot_portal);
                item.name = "Zz'Rot Portal";
                item.plaintext = "Makes a Voidspawn generating Void Gate to push a lane with.";
                break;
            case "3599":
                item.itemImage = resource.getDrawable(R.drawable.the_black_spear);
                item.name = "The Black Spear";
                item.plaintext = "Kalista's spear that binds an Oathsworn Ally.";
                break;
            case "3630":
                item.itemImage = resource.getDrawable(R.drawable.siege_warp);
                item.name = "Siege Warp";
                item.plaintext = "";
                break;
            case "3631":
                item.itemImage = resource.getDrawable(R.drawable.siege_ballista);
                item.name = "Siege Ballista";
                item.plaintext = "Place a long range anti-turret ballista";
                break;
            case "3633":
                item.itemImage = resource.getDrawable(R.drawable.siege_warp);
                item.name = "Siege Warp";
                item.plaintext = "";
                break;
            case "3634":
                item.itemImage = resource.getDrawable(R.drawable.tower_surge_beam_of_ruination);
                item.name = "Tower Surge: Beam of Ruination";
                item.plaintext = "Attaches a three shot beam to a turret which can then be aimed and fired";
                break;
            case "3635":
                item.itemImage = resource.getDrawable(R.drawable.port_pad);
                item.name = "Port Pad";
                item.plaintext = "Creates another point for your team to warp to";
                break;
            case "3636":
                item.itemImage = resource.getDrawable(R.drawable.tower_surge_firestorm_bulwark);
                item.name = "Tower Surge: Firestorm Bulwark";
                item.plaintext = "Make a turret go invulnerable while charging a powerful barrage";
                break;
            case "3640":
                item.itemImage = resource.getDrawable(R.drawable.flash_zone);
                item.name = "Flash Zone";
                item.plaintext = "Allows you and allies to repeatedly flash while in a zone";
                break;
            case "3641":
                item.itemImage = resource.getDrawable(R.drawable.vanguard_banner);
                item.name = "Vanguard Banner";
                item.plaintext = "Strengthens nearby minions";
                break;
            case "3642":
                item.itemImage = resource.getDrawable(R.drawable.siege_refund);
                item.name = "Siege Refund";
                item.plaintext = "Refunds all current Siege Weapons";
                break;
            case "3643":
                item.itemImage = resource.getDrawable(R.drawable.entropy_field);
                item.name = "Entropy Field";
                item.plaintext = "Places a field that stuns enemy minions and slows champions";
                break;
            case "3645":
                item.itemImage = resource.getDrawable(R.drawable.seer_stone_trinket);
                item.name = "Seer Stone trinket";
                item.plaintext = "Briefly reveals a nearby targeted area";
                break;
            case "3647":
                item.itemImage = resource.getDrawable(R.drawable.shield_totem);
                item.name = "Shield Totem";
                item.plaintext = "Grants bonus health to nearby Siege Weapons";
                break;
            case "3649":
                item.itemImage = resource.getDrawable(R.drawable.siege_sight_warder);
                item.name = "Siege Sight Warder";
                item.plaintext = "";
                break;
            case "3671":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_warrior);
                item.name = "Enchantment: Warrior";
                item.plaintext = "";
                break;
            case "3672":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_cinderhulk);
                item.name = "Enchantment: Cinderhulk";
                item.plaintext = "";
                break;
            case "3673":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_runic_echoes);
                item.name = "Enchantment: Runic Echoes";
                item.plaintext = "";
                break;
            case "3675":
                item.itemImage = resource.getDrawable(R.drawable.enchantment_bloodrazor);
                item.name = "Enchantment: Bloodrazor";
                item.plaintext = "";
                break;
            case "3706":
                item.itemImage = resource.getDrawable(R.drawable.stalkers_blade);
                item.name = "Stalker's Blade";
                item.plaintext = "Lets your Smite slow Champions";
                break;
            case "3711":
                item.itemImage = resource.getDrawable(R.drawable.trackers_knife);
                item.name = "Tracker's Knife";
                item.plaintext = "Provides Stealth Wards over time";
                break;
            case "3715":
                item.itemImage = resource.getDrawable(R.drawable.skirmishers_sabre);
                item.name = "Skirmisher's Sabre";
                item.plaintext = "Lets your Smite mark Champions, giving you combat power against them.";
                break;
            case "3742":
                item.itemImage = resource.getDrawable(R.drawable.dead_mans_plate);
                item.name = "Dead Man's Plate";
                item.plaintext = "Build momentum as you move around then smash into enemies.";
                break;
            case "3748":
                item.itemImage = resource.getDrawable(R.drawable.titanic_hydra);
                item.name = "Titanic Hydra";
                item.plaintext = "Deals area of effect damage based on owner's health";
                break;
            case "3751":
                item.itemImage = resource.getDrawable(R.drawable.bamis_cinder);
                item.name = "Bami's Cinder";
                item.plaintext = "Grants Health and Immolate Aura";
                break;
            case "3800":
                item.itemImage = resource.getDrawable(R.drawable.righteous_glory);
                item.name = "Righteous Glory";
                item.plaintext = "Grants Health, Mana. Activate to speed towards enemies and slow them.";
                break;
            case "3801":
                item.itemImage = resource.getDrawable(R.drawable.crystalline_bracer);
                item.name = "Crystalline Bracer";
                item.plaintext = "Grants Health and Health Regen";
                break;
            case "3802":
                item.itemImage = resource.getDrawable(R.drawable.lost_chapter);
                item.name = "Lost Chapter";
                item.plaintext = "Restores Mana upon levelling up.";
                break;
            case "3812":
                item.itemImage = resource.getDrawable(R.drawable.deaths_dance);
                item.name = "Death's Dance";
                item.plaintext = "Trades incoming damage now for incoming damage later";
                break;
            case "3901":
                item.itemImage = resource.getDrawable(R.drawable.fire_at_will);
                item.name = "Fire at Will";
                item.plaintext = "Cannon Barrage gains extra waves";
                break;
            case "3902":
                item.itemImage = resource.getDrawable(R.drawable.deaths_daughter);
                item.name = "Death's Daughter";
                item.plaintext = "Cannon Barrage fires a mega-cannonball";
                break;
            case "3903":
                item.itemImage = resource.getDrawable(R.drawable.raise_morale);
                item.name = "Raise Morale";
                item.plaintext = "Cannon Barrage hastes allies";
                break;

        }
        return item;
    }
    public class itemInfo
    {
        public Drawable itemImage;
        public String name, description, plaintext;

    }

}


