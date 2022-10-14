package me.jaywithabeanie.jayapi;

import com.onarandombox.MultiverseCore.MultiverseCore;
import me.jaywithabeanie.jayapi.Event.PlayerJoin;
import me.jaywithabeanie.jayapi.Object.Minecraft.JPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class JayAPI extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoin(), this);

        // TODO Make online players into JPlayer
        for ( Player player : Bukkit.getOnlinePlayers()) {
            JPlayer jPlayer = new JPlayer(player);
            JPlayer.playerHashMap.put(player, jPlayer);
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static MultiverseCore getMultiverseCoreAPI() {
        return (MultiverseCore) Bukkit.getServer().getPluginManager().getPlugin("Multiverse-Core");
    }

}
