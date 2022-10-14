package me.jaywithabeanie.jayapi.Event;

import me.jaywithabeanie.jayapi.Object.Minecraft.JPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerJoin implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        if (!JPlayer.playerHashMap.containsKey(player)) {
            new JPlayer(player);
        }

    }


}
