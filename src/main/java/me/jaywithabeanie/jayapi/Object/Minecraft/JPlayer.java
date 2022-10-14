package me.jaywithabeanie.jayapi.Object.Minecraft;

import me.jaywithabeanie.jayapi.Object.Game.Game;
import org.bukkit.entity.Player;

import java.util.HashMap;


public class JPlayer {



    public static HashMap<Player, JPlayer> playerHashMap = new HashMap<>();

    private Player player;
    private Game game;

    public JPlayer(Player player) {
        this.player = player;
        playerHashMap.put(player, this);
    }

    public Player getPlayer() {
        return this.player;
    }

    public Game getGame() {
        return this.game;
    }

    public JPlayer setGame(Game game) {
        this.game = game;
        game.addPlayer(this);
        return this;
    }

    public boolean hasGame() {
        return this.game != null;
    }


}
