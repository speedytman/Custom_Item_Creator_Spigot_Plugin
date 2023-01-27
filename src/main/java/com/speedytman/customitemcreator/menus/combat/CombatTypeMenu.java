package com.speedytman.customitemcreator.menus.combat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CombatTypeMenu {
    private Inventory inventory;

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Weapon/Armour Type");

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemStack armour = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemStack horseArmour = new ItemStack(Material.DIAMOND_HORSE_ARMOR, 1);
        ItemStack trident = new ItemStack(Material.TRIDENT, 1);
        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemStack other = new ItemStack(Material.END_CRYSTAL, 1);
        ItemStack back = new ItemStack(Material.SPAWNER, 1);

        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Sword");
        sword.setItemMeta(swordMeta);

        ItemMeta axeMeta = axe.getItemMeta();
        axeMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Axe");
        axe.setItemMeta(axeMeta);

        ItemMeta armourMeta = armour.getItemMeta();
        armourMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Armour");
        armour.setItemMeta(armourMeta);

        ItemMeta horseArmourMeta = horseArmour.getItemMeta();
        horseArmourMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Horse Armour");
        horseArmour.setItemMeta(horseArmourMeta);

        ItemMeta tridentMeta = trident.getItemMeta();
        tridentMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Trident");
        trident.setItemMeta(tridentMeta);

        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Bow");
        bow.setItemMeta(bowMeta);

        ItemMeta otherMeta = other.getItemMeta();
        otherMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Other");
        other.setItemMeta(otherMeta);

        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.RED + "Go Back");
        back.setItemMeta(backMeta);

        inventory.setItem(0, sword);
        inventory.setItem(1, axe);
        inventory.setItem(2, armour);
        inventory.setItem(3, horseArmour);
        inventory.setItem(4, trident);
        inventory.setItem(5, bow);
        inventory.setItem(6, other);
        inventory.setItem(8, back);

        player.openInventory(inventory);




    }
}
