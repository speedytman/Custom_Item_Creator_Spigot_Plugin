package com.speedytman.customitemcreator.menus.combat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ArmourPieceSubMenu {
    private Inventory inventory;

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Armour Piece");

        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemStack chestpiece = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemStack back = new ItemStack(Material.SPAWNER, 1);


        ItemMeta helmetMeta = helmet.getItemMeta();
        helmetMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Helmet");
        helmet.setItemMeta(helmetMeta);

        ItemMeta chestpieceMeta = chestpiece.getItemMeta();
        chestpieceMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Chestplate");
        chestpiece.setItemMeta(chestpieceMeta);

        ItemMeta leggingsMeta = leggings.getItemMeta();
        leggingsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Leggings");
        leggings.setItemMeta(leggingsMeta);

        ItemMeta bootsMeta = boots.getItemMeta();
        bootsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Boots");
        boots.setItemMeta(bootsMeta);

        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.RED + "Go Back");
        back.setItemMeta(backMeta);

        inventory.setItem(0, helmet);
        inventory.setItem(1, chestpiece);
        inventory.setItem(2, leggings);
        inventory.setItem(3, boots);
        inventory.setItem(8, back);

        player.openInventory(inventory);
    }
}
