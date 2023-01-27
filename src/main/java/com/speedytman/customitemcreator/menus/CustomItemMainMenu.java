package com.speedytman.customitemcreator.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItemMainMenu {

    private Inventory inventory;

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Item Type");

        ItemStack tool = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemStack weapon = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemStack armour = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemStack wood = new ItemStack(Material.OAK_LOG, 1);
        ItemStack stone = new ItemStack(Material.STONE, 1);
        ItemStack machines = new ItemStack(Material.FURNACE, 1);
        ItemStack dirt = new ItemStack(Material.GRASS_BLOCK, 1);
        ItemStack drops = new ItemStack(Material.ROTTEN_FLESH, 1);
        ItemStack other = new ItemStack(Material.END_CRYSTAL, 1);

        ItemMeta toolMeta = tool.getItemMeta();
        toolMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Tool/Utility");
        tool.setItemMeta(toolMeta);

        ItemMeta weaponMeta = weapon.getItemMeta();
        weaponMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Combat Item");
        weapon.setItemMeta(weaponMeta);

        ItemMeta armourMeta = armour.getItemMeta();
        armourMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Armour");
        armour.setItemMeta(armourMeta);

        ItemMeta woodMeta = wood.getItemMeta();
        woodMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Wood");
        wood.setItemMeta(woodMeta);

        ItemMeta stoneMeta = stone.getItemMeta();
        stoneMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Stone");
        stone.setItemMeta(stoneMeta);

        ItemMeta machinesMeta = machines.getItemMeta();
        machinesMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Machine");
        machines.setItemMeta(machinesMeta);

        ItemMeta dirtMeta = dirt.getItemMeta();
        dirtMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Dirt");
        dirt.setItemMeta(dirtMeta);

        ItemMeta dropsMeta = drops.getItemMeta();
        dropsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Drop");
        drops.setItemMeta(dropsMeta);

        ItemMeta otherMeta = other.getItemMeta();
        otherMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Other");
        other.setItemMeta(otherMeta);

        inventory.setItem(0, tool);
        inventory.setItem(1, weapon);
        inventory.setItem(2, armour);
        inventory.setItem(3, wood);
        inventory.setItem(4, stone);
        inventory.setItem(5, machines);
        inventory.setItem(6, dirt);
        inventory.setItem(7, drops);
        inventory.setItem(8, other);

        player.openInventory(inventory);




    }
}
