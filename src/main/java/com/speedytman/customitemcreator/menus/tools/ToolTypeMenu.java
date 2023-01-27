package com.speedytman.customitemcreator.menus.tools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ToolTypeMenu {
    private Inventory inventory;

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Tool Type");

        ItemStack pick = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemStack shovel = new ItemStack(Material.DIAMOND_SHOVEL, 1);
        ItemStack hoe = new ItemStack(Material.DIAMOND_HOE, 1);
        ItemStack other = new ItemStack(Material.SHEARS, 1);
        ItemStack back = new ItemStack(Material.SPAWNER, 1);

        ItemMeta pickMeta = pick.getItemMeta();
        pickMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Pickaxe");
        pick.setItemMeta(pickMeta);

        ItemMeta axeMeta = axe.getItemMeta();
        axeMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Axe");
        axe.setItemMeta(axeMeta);

        ItemMeta shovelMeta = shovel.getItemMeta();
        shovelMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Shovel");
        shovel.setItemMeta(shovelMeta);

        ItemMeta hoeMeta = hoe.getItemMeta();
        hoeMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Hoe");
        hoe.setItemMeta(hoeMeta);

        ItemMeta otherMeta = other.getItemMeta();
        otherMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Other");
        other.setItemMeta(otherMeta);

        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Go Back");
        back.setItemMeta(backMeta);

        inventory.setItem(0, pick);
        inventory.setItem(1, axe);
        inventory.setItem(2, shovel);
        inventory.setItem(3, hoe);
        inventory.setItem(4, other);
        inventory.setItem(8, back);

        player.openInventory(inventory);




    }
}
