
// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {

    ArrayList<Player> getPlayers();

    Player getPlayer(int id);

    Player addPlayer(Player player);

    Player updatePlayer(Player player, int playerId);

    void deletePlayer(int playerId);
}
