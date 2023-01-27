package com.speedytman.customitemcreator.menus.combat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CombatMaterialMenu {
    private Inventory inventory;

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Weapon Material");

        ItemStack wood = new ItemStack(Material.OAK_PLANKS, 1);
        ItemStack stone = new ItemStack(Material.STONE, 1);
        ItemStack iron = new ItemStack(Material.IRON_INGOT, 1);
        ItemStack gold = new ItemStack(Material.GOLD_INGOT, 1);
        ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
        ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT, 1);
        ItemStack back = new ItemStack(Material.SPAWNER, 1);


        ItemMeta woodMeta = wood.getItemMeta();
        woodMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Wood Weapon");
        wood.setItemMeta(woodMeta);

        ItemMeta stoneMeta = stone.getItemMeta();
        stoneMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Stone Weapon");
        stone.setItemMeta(stoneMeta);

        ItemMeta ironMeta = iron.getItemMeta();
        ironMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Iron Weapon");
        iron.setItemMeta(ironMeta);

        ItemMeta goldMeta = gold.getItemMeta();
        goldMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Gold Weapon");
        gold.setItemMeta(goldMeta);

        ItemMeta diamondMeta = diamond.getItemMeta();
        diamondMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Diamond Weapon");
        diamond.setItemMeta(diamondMeta);

        ItemMeta netheriteMeta = netherite.getItemMeta();
        netheriteMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Netherite Weapon");
        netherite.setItemMeta(netheriteMeta);

        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Go Back");
        back.setItemMeta(backMeta);

        inventory.setItem(0, wood);
        inventory.setItem(1, stone);
        inventory.setItem(2, iron);
        inventory.setItem(3, gold);
        inventory.setItem(4, diamond);
        inventory.setItem(5, netherite);
        inventory.setItem(8, back);

        player.openInventory(inventory);




    }
}
