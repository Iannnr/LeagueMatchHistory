package portfolio.ian.com.leaguematchhistory.DataHandling;

/**
 * Created by Ian on 04/12/2015.
 */
public class ChampionList {

    public String championIDToName(int championID) {

        //do I add a break; after each case statement?
        switch (championID) {
            case 1:
                return "Annie";
            case 2:
                return "Olaf";
            case 3:
                return "Galio";
            case 4:
                return "Twisted Fate";
            case 5:
                return "Xin Zhao";
            case 6:
                return "Urgot";
            case 7:
                return "LeBlanc";
            case 8:
                return "Vladimir";
            case 9:
                return "Fiddlesticks";
            case 10:
                return "Kayle";
            case 11:
                return "Master Yi";
            case 12:
                return "Alistar";
            case 13:
                return "Ryze";
            case 14:
                return "Sion";
            case 15:
                return "Sivir";
            case 16:
                return "Soraka";
            case 17:
                return "Teemo";
            case 18:
                return "Tristana";
            case 19:
                return "Warwick";
            case 20:
                return "Nunu";
            case 21:
                return "Miss Fortune";
            case 22:
                return "Ashe";
            case 23:
                return "Tryndamere";
            case 24:
                return "Jax";
            case 25:
                return "Morgana";
            case 26:
                return "Zilean";
            case 27:
                return "Singed";
            case 28:
                return "Evelynn";
            case 29:
                return "Twitch";
            case 30:
                return "Karthus";
            case 31:
                return "Cho'Gath";
            case 32:
                return "Amumu";
            case 33:
                return "Rammus";
            case 34:
                return "Anivia";
            case 35:
                return "Shaco";
            case 36:
                return "Dr. Mundo";
            case 37:
                return "Sona";
            case 38:
                return "Kassadin";
            case 39:
                return "Irelia";
            case 40:
                return "Janna";
            case 41:
                return "Gangplank";
            case 42:
                return "Corki";
            case 43:
                return "Karma";
            case 44:
                return "Taric";
            case 45:
                return "Veigar";
            case 48:
                return "Trundle";
            case 50:
                return "Swain";
            case 51:
                return "Caitlyn";
            case 53:
                return "Blitzcrank";
            case 54:
                return "Malphite";
            case 55:
                return "Katarina";
            case 56:
                return "Nocturne";
            case 57:
                return "Maokai";
            case 58:
                return "Renekton";
            case 59:
                return "Jarvan IV";
            case 61:
                return "Orianna";
            case 62:
                return "Wukong";
            case 63:
                return "Brand";
            case 64:
                return "Lee Sin";
            case 67:
                return "Vayne";
            case 68:
                return "Rumble";
            case 69:
                return "Cassiopeia";
            case 72:
                return "Skarner";
            case 74:
                return "Heimerdinger";
            case 75:
                return "Nasus";
            case 76:
                return "Nidalee";
            case 77:
                return "Udyr";
            case 78:
                return "Poppy";
            case 79:
                return "Gragas";
            case 80:
                return "Pantheon";
            case 81:
                return "Ezreal";
            case 82:
                return "Mordekaiser";
            case 83:
                return "Yorick";
            case 84:
                return "Akali";
            case 85:
                return "Kennen";
            case 86:
                return "Garen";
            case 89:
                return "Leona";
            case 90:
                return "Malzahar";
            case 91:
                return "Talon";
            case 92:
                return "Riven";
            case 96:
                return "Kog'Maw";
            case 98:
                return "Shen";
            case 99:
                return "Lux";
            case 101:
                return "Xerath";
            case 236:
                return "Lucian";
            case 102:
                return "Shyvana";
            case 103:
                return "Ahri";
            case 104:
                return "Graves";
            case 105:
                return "Fizz";
            case 106:
                return "Volibear";
            case 107:
                return "Rengar";
            case 110:
                return "Varus";
            case 111:
                return "Nautilus";
            case 112:
                return "Viktor";
            case 113:
                return "Sejuani";
            case 114:
                return "Fiora";
            case 115:
                return "Ziggs";
            case 117:
                return "Lulu";
            case 119:
                return "Draven";
            case 120:
                return "Hecarim";
            case 122:
                return "Darius";
            case 126:
                return "Jayce";
            case 131:
                return "Diana";
            case 136:
                return "Aurelion Sol";
            case 143:
                return "Zyra";
            case 163:
                return "Taliyah";
            case 202:
                return "Jhin";
            case 256:
                return "Azir";
            case 420:
                return "Illaoi";
            case 432:
                return "Bard";
            case 201:
                return "Braum";
            case 245:
                return "Ekko";
            case 60:
                return "Elise";
            case 150:
                return "Gnar";
            case 429:
                return "Kalista";
            case 222:
                return "Jinx";
            case 121:
                return "Kha'Zix";
            case 266:
                return "Aatrox";
            case 203:
                return "Kindred";
            case 127:
                return "Lissandra";
            case 267:
                return "Nami";
            case 134:
                return "Syndra";
            case 223:
                return "Tahm Kench";
            case 412:
                return "Thresh";
            case 161:
                return "Vel'Koz";
            case 254:
                return "Vi";
            case 157:
                return "Yasuo";
            case 154:
                return "Zac";
            case 133:
                return "Quinn";
            case 421:
                return "Rek'Sai";
            case 238:
                return "Zed";
            default:
                return "Unknown";
        }
    }

    public String mapIdName(int mapId)
    {
        switch(mapId) {
            case 10:
                return "Twisted Treeline";
            case 11:
                return "Summoner's Rift";
            case 12:
                return "Howling Abyss";
            case 14:
                return "Butcher's Bridge";
            default:
                return "Unknown";
        }
    }
}
