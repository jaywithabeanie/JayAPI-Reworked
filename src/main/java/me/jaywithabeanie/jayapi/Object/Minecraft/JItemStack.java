package me.jaywithabeanie.jayapi.Object.Minecraft;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class JItemStack extends ItemStack {


    public JItemStack(ItemStack itemStack) {
        this.setType(itemStack.getType());
        this.setAmount(itemStack.getAmount());
        this.setItemMeta(itemStack.getItemMeta());
    }

    public JItemStack(Material material) {
        this.setType(material);
        this.setAmount(1);
    }

    public JItemStack(Material material, int amount) {
        this.setType(material);
        this.setAmount(amount);
    }

    public JItemStack(Material material, int amount, String name) {
        this.setType(material);
        this.setAmount(amount);
        ItemMeta itemMeta = this.getItemMeta();
        itemMeta.setDisplayName(name);
        this.setItemMeta(itemMeta);
    }

    public JItemStack setItemFlag(ItemFlag itemFlag, boolean hidden) {

        // Initiate variables
        ItemMeta itemMeta = this.getItemMeta();

        // Toggle itemflag
        if (hidden) {
            itemMeta.addItemFlags(itemFlag);
        }
        else {
            itemMeta.removeItemFlags(itemFlag);
        }

        // Set item meta
        this.setItemMeta(itemMeta);

        // Return
        return this;

    }

    public JItemStack setEnchanted(boolean enchanted) {

        // Toggle enchantment glint
        if (enchanted) {
            this.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        }
        else {
            this.removeEnchantment(Enchantment.DURABILITY);
        }

        // Return
        return this;

    }

    public JItemStack setCustomModelData(int data) {
        ItemMeta itemMeta = this.getItemMeta();
        assert itemMeta != null;
        itemMeta.setCustomModelData(data);
        this.setItemMeta(itemMeta);
        return this;
    }


}
