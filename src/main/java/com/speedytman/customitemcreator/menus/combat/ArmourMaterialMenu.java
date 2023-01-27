package com.speedytman.customitemcreator.menus.combat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ArmourMaterialMenu {
    private Inventory inventory;

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Armour Material");

        ItemStack leather = new ItemStack(Material.LEATHER, 1);
        ItemStack chain = new ItemStack(Material.IRON_BARS, 1);
        ItemStack iron = new ItemStack(Material.IRON_INGOT, 1);
        ItemStack gold = new ItemStack(Material.GOLD_INGOT, 1);
        ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
        ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT, 1);
        ItemStack turtleHelmet = new ItemStack(Material.TURTLE_HELMET, 1);
        ItemStack back = new ItemStack(Material.SPAWNER, 1);


        ItemMeta leatherMeta = leather.getItemMeta();
        leatherMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Leather Weapon");
        leather.setItemMeta(leatherMeta);

        ItemMeta chainMeta = chain.getItemMeta();
        chainMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create chain Weapon");
        chain.setItemMeta(chainMeta);

        ItemMeta ironMeta = iron.getItemMeta();
        ironMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Iron Weapon");
        iron.setItemMeta(ironMeta);

        ItemMeta goldMeta = gold.getItemMeta();
        goldMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Gold Weapon");
        gold.setItemMeta(goldMeta);

        ItemMeta diamondMeta = diamond.getItemMeta();
        diamondMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Diamond Tool");
        diamond.setItemMeta(diamondMeta);

        ItemMeta netheriteMeta = netherite.getItemMeta();
        netheriteMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Netherite Tool");
        netherite.setItemMeta(netheriteMeta);

        ItemMeta turtleHelmetMeta = turtleHelmet.getItemMeta();
        turtleHelmetMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Turtle Helmet");
        turtleHelmet.setItemMeta(turtleHelmetMeta);

        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.RED + "Go Back");
        back.setItemMeta(backMeta);

        inventory.setItem(0, leather);
        inventory.setItem(1, chain);
        inventory.setItem(2, iron);
        inventory.setItem(3, gold);
        inventory.setItem(4, diamond);
        inventory.setItem(5, netherite);
        inventory.setItem(8, back);

        player.openInventory(inventory);
    }

    public void createMenu(Player player, boolean removeNetherite) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Armour Material");

        ItemStack leather = new ItemStack(Material.LEATHER, 1);
        ItemStack chain = new ItemStack(Material.IRON_BARS, 1);
        ItemStack iron = new ItemStack(Material.IRON_INGOT, 1);
        ItemStack gold = new ItemStack(Material.GOLD_INGOT, 1);
        ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
        ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT, 1);
        ItemStack turtleHelmet = new ItemStack(Material.TURTLE_HELMET, 1);
        ItemStack back = new ItemStack(Material.SPAWNER, 1);


        ItemMeta leatherMeta = leather.getItemMeta();
        leatherMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Leather Weapon");
        leather.setItemMeta(leatherMeta);

        ItemMeta chainMeta = chain.getItemMeta();
        chainMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create chain Weapon");
        chain.setItemMeta(chainMeta);

        ItemMeta ironMeta = iron.getItemMeta();
        ironMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Iron Weapon");
        iron.setItemMeta(ironMeta);

        ItemMeta goldMeta = gold.getItemMeta();
        goldMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Gold Weapon");
        gold.setItemMeta(goldMeta);

        ItemMeta diamondMeta = diamond.getItemMeta();
        diamondMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Diamond Tool");
        diamond.setItemMeta(diamondMeta);

        ItemMeta netheriteMeta = netherite.getItemMeta();
        netheriteMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Netherite Tool");
        netherite.setItemMeta(netheriteMeta);

        ItemMeta turtleHelmetMeta = turtleHelmet.getItemMeta();
        turtleHelmetMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Turtle Helmet");
        turtleHelmet.setItemMeta(turtleHelmetMeta);

        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.RED + "Go Back");
        back.setItemMeta(backMeta);

        inventory.setItem(0, leather);
        inventory.setItem(1, chain);
        inventory.setItem(2, iron);
        inventory.setItem(3, gold);
        inventory.setItem(4, diamond);
        inventory.setItem(8, back);

        player.openInventory(inventory);
    }
    public void createMenu(Player player, int hasTurtleHemet) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Choose Armour Material");

        ItemStack leather = new ItemStack(Material.LEATHER, 1);
        ItemStack chain = new ItemStack(Material.IRON_BARS, 1);
        ItemStack iron = new ItemStack(Material.IRON_INGOT, 1);
        ItemStack gold = new ItemStack(Material.GOLD_INGOT, 1);
        ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
        ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT, 1);
        ItemStack turtleHelmet = new ItemStack(Material.TURTLE_HELMET, 1);
        ItemStack back = new ItemStack(Material.SPAWNER, 1);


        ItemMeta leatherMeta = leather.getItemMeta();
        leatherMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Leather Weapon");
        leather.setItemMeta(leatherMeta);

        ItemMeta chainMeta = chain.getItemMeta();
        chainMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create chain Weapon");
        chain.setItemMeta(chainMeta);

        ItemMeta ironMeta = iron.getItemMeta();
        ironMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Iron Weapon");
        iron.setItemMeta(ironMeta);

        ItemMeta goldMeta = gold.getItemMeta();
        goldMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Gold Weapon");
        gold.setItemMeta(goldMeta);

        ItemMeta diamondMeta = diamond.getItemMeta();
        diamondMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Diamond Tool");
        diamond.setItemMeta(diamondMeta);

        ItemMeta netheriteMeta = netherite.getItemMeta();
        netheriteMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Netherite Tool");
        netherite.setItemMeta(netheriteMeta);

        ItemMeta turtleHelmetMeta = turtleHelmet.getItemMeta();
        turtleHelmetMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Turtle Helmet");
        turtleHelmet.setItemMeta(turtleHelmetMeta);

        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.RED + "Go Back");
        back.setItemMeta(backMeta);

        inventory.setItem(0, leather);
        inventory.setItem(1, chain);
        inventory.setItem(2, iron);
        inventory.setItem(3, gold);
        inventory.setItem(4, diamond);
        inventory.setItem(5, netherite);
        inventory.setItem(6, turtleHelmet);
        inventory.setItem(8, back);

        player.openInventory(inventory);
    }

}
