package com.speedytman.customitemcreator.menus.combat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BowMaterialMenu {
    private Inventory inventory;

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Bow/Arrow");

        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemStack crossbow = new ItemStack(Material.CROSSBOW, 1);
        ItemStack arrow = new ItemStack(Material.ARROW, 1);
        ItemStack specialArrow = new ItemStack(Material.SPECTRAL_ARROW, 1);
        ItemStack back = new ItemStack(Material.SPAWNER, 1);


        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Bow");
        bow.setItemMeta(bowMeta);

        ItemMeta crossbowMeta = crossbow.getItemMeta();
        crossbowMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Crossbow");
        crossbow.setItemMeta(crossbowMeta);

        ItemMeta arrowMeta = arrow.getItemMeta();
        arrowMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Arrow");
        arrow.setItemMeta(arrowMeta);

        ItemMeta specialArrowMeta = specialArrow.getItemMeta();
        specialArrowMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Special Arrow");
        specialArrow.setItemMeta(specialArrowMeta);

        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.RED + "Go Back");
        back.setItemMeta(backMeta);

        inventory.setItem(0, bow);
        inventory.setItem(1, crossbow);
        inventory.setItem(2, arrow);
        inventory.setItem(3, specialArrow);
        inventory.setItem(8, back);

        player.openInventory(inventory);
    }
}
