package me.jaywithabeanie.jayapi.Object.Minecraft;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;


public class JHologram {


    private ArmorStand armorStand;
    private String hologramText;


    // Creates the hologram
    public JHologram(Location location, String hologramText) {
        armorStand = (ArmorStand) Bukkit.getWorld(location.getWorld().getUID()).spawnEntity(location, EntityType.ARMOR_STAND);
        armorStand.setInvisible(true);
        armorStand.setInvulnerable(true);
        armorStand.setSilent(true);
        armorStand.setCollidable(false);
        armorStand.setGravity(false);
        armorStand.setCustomName(hologramText);
        armorStand.setCustomNameVisible(true);
        this.hologramText = hologramText;
    }


    // Gets the armor stand linked to the hologram
    public ArmorStand getArmorStand() {
        return armorStand;
    }

    // Returns the hologram text
    public String getHologramText() {
        return hologramText;
    }


    // Destroys the armor stand
    public void destroy() {
        this.armorStand.remove();
    }


}
