# LeagueMatchHistory
Match History for League of Legends

Android app using different APIs available from Riot Games (http://www.riotgames.com/) to search a player's username and return a set amount of matches.
Current views include Match History in the format of:

1. End Game Level | Champion Name | Win/Loss | Queue | Kills/Deaths/Assists | Gold Earned

2. Full 5v5 View of all 10 players in the game with their username, champion played and KDA

3. In Game Stats including details about how much damage was dealth, towers kills, etc.

4. A show of what items the player ended the game with, with On-Click information about each individual item

5. The runes used by the player.

App currently shows use of:
- Custom list adapter including one use of Hashmaps
- Fragment adapter and manager to handle the scrolling between 3 fragments
- Constructors with ArrayLists of objects
- Use of JSON data handling
- Differing layouts for landscape and portrait views
