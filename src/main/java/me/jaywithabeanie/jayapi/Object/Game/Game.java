package me.jaywithabeanie.jayapi.Object.Game;


import me.jaywithabeanie.jayapi.Object.Minecraft.JPlayer;
import org.bukkit.Location;

import java.util.ArrayList;


public class Game {


    private JPlayer host;
    private Location location;
    private GameStatus gameStatus;
    private ArrayList<JPlayer> players = new ArrayList<>();


    public Game(JPlayer host) {
        this.host = host;
        this.setGameStatus(GameStatus.INITIATING);
    }

    public JPlayer getHost() {
        return host;
    }

    public void setHost(JPlayer host) {
        this.host = host;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public GameStatus getGameStatus() {
        return this.gameStatus;
    }

    public Game setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
        return this;
    }

    public ArrayList<JPlayer> getPlayers() {
        return this.players;
    }

    public Game addPlayer(JPlayer player) {
        this.players.add(player);
        return this;
    }

    public Game removePlayer(JPlayer player) {
        this.players.remove(player);
        return this;
    }


}
