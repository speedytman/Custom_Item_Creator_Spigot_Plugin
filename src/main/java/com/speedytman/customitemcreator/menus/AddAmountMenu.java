package com.speedytman.customitemcreator.menus;

import com.speedytman.customitemcreator.CustomItemCreator;
import com.speedytman.customitemcreator.events.MenuClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class AddAmountMenu {

    private Inventory inventory;
    private ItemStack[] items;
    private int amount;

    private final CustomItemCreator plugin;

    public AddAmountMenu(CustomItemCreator plugin){
        this.plugin = plugin;
        amount = plugin.getAmountClass().getAmount();
    }

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 9, ChatColor.BOLD + "Add Amount");
        fillSelectAmount();

        ItemStack subFive = new ItemStack(Material.GOLD_BLOCK, 1);
        ItemStack subOne = new ItemStack(Material.GOLD_BLOCK, 1);
        ItemStack addOne = new ItemStack(Material.GOLD_BLOCK, 1);
        ItemStack addFive = new ItemStack(Material.GOLD_BLOCK, 1);


        ItemMeta subFiveMeta = subFive.getItemMeta();
        subFiveMeta.setDisplayName(ChatColor.RED + "-5");
        subFive.setItemMeta(subFiveMeta);

        ItemMeta subOneMeta = subOne.getItemMeta();
        subOneMeta.setDisplayName(ChatColor.RED + "-1");
        subOne.setItemMeta(subOneMeta);

        ItemMeta addOneMeta = addOne.getItemMeta();
        addOneMeta.setDisplayName(ChatColor.GREEN + "+1");
        addOne.setItemMeta(addOneMeta);

        ItemMeta addFiveMeta = addFive.getItemMeta();
        addFiveMeta.setDisplayName(ChatColor.GREEN + "+5");
        addFive.setItemMeta(addFiveMeta);


        inventory.setItem(0, subFive);
        inventory.setItem(2, subOne);
        inventory.setItem(4, items[amount-1]);
        inventory.setItem(6, addOne);
        inventory.setItem(8, addFive);

        player.openInventory(inventory);
    }

    public void fillSelectAmount(){
        items = new ItemStack[64];

        for(int index = 0; index < 64; index++){
            items[index] = new ItemStack(Material.DIAMOND_BLOCK, index+1);
            ItemMeta meta = items[index].getItemMeta();
            meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Select Amount");
            items[index].setItemMeta(meta);
        }
    }

    public void increaseSelectAmount() {
        inventory.setItem(4, items[plugin.getAmountClass().getAmount()-1]);
    }
}
