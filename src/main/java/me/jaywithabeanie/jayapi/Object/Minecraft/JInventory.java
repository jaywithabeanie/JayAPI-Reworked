package me.jaywithabeanie.jayapi.Object.Minecraft;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class JInventory {


    private Inventory inventory;

    public JInventory(int size, String title) {

        Inventory inventory = Bukkit.createInventory(null, size * 9, title);
        this.inventory = inventory;

    }

    public Inventory getInventory() {
        return inventory;
    }

    public JInventory setItem(int slot, ItemStack itemStack) {
        this.inventory.setItem(slot, itemStack);
        return this;
    }

}
