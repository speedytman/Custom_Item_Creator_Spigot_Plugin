package com.speedytman.customitemcreator.menus;

import com.speedytman.customitemcreator.CustomItemCreator;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemDisplayMenu {
    private Inventory inventory;
    private ItemStack item;
    private ItemMeta addEnchantsMeta;
    private ItemStack addEnchants;
    private ItemMeta addNameMeta;
    private ItemStack addName;
    private int cat;
    private String typeHolder;
    private String materialHolder;

    private final CustomItemCreator plugin;

    public ItemDisplayMenu(CustomItemCreator plugin){
        this.plugin = plugin;
    }



    public void createMenu(Player player,int catagory, String type, String material, int... subType) {
        cat = catagory;
        typeHolder = type;
        materialHolder = material;
        inventory = Bukkit.createInventory(player, 18, ChatColor.BOLD + "Modify Your Item");

        switch(catagory) {
            case 1:
                switch (type) {
                    case "pick":
                        switch (material) {
                            case "wood" ->
                                    item = new ItemStack(Material.WOODEN_PICKAXE, plugin.getAmountClass().getAmount());
                            case "stone" ->
                                    item = new ItemStack(Material.STONE_PICKAXE, plugin.getAmountClass().getAmount());
                            case "iron" ->
                                    item = new ItemStack(Material.IRON_PICKAXE, plugin.getAmountClass().getAmount());
                            case "gold" ->
                                    item = new ItemStack(Material.GOLDEN_PICKAXE, plugin.getAmountClass().getAmount());
                            case "diamond" ->
                                    item = new ItemStack(Material.DIAMOND_PICKAXE, plugin.getAmountClass().getAmount());
                            case "netherite" ->
                                    item = new ItemStack(Material.NETHERITE_PICKAXE, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "axe":
                        switch (material) {
                            case "wood" ->
                                    item = new ItemStack(Material.WOODEN_AXE, plugin.getAmountClass().getAmount());
                            case "stone" ->
                                    item = new ItemStack(Material.STONE_AXE, plugin.getAmountClass().getAmount());
                            case "iron" -> item = new ItemStack(Material.IRON_AXE, plugin.getAmountClass().getAmount());
                            case "gold" ->
                                    item = new ItemStack(Material.GOLDEN_AXE, plugin.getAmountClass().getAmount());
                            case "diamond" ->
                                    item = new ItemStack(Material.DIAMOND_AXE, plugin.getAmountClass().getAmount());
                            case "netherite" ->
                                    item = new ItemStack(Material.NETHERITE_AXE, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "shovel":
                        switch (material) {
                            case "wood" ->
                                    item = new ItemStack(Material.WOODEN_SHOVEL, plugin.getAmountClass().getAmount());
                            case "stone" ->
                                    item = new ItemStack(Material.STONE_SHOVEL, plugin.getAmountClass().getAmount());
                            case "iron" ->
                                    item = new ItemStack(Material.IRON_SHOVEL, plugin.getAmountClass().getAmount());
                            case "gold" ->
                                    item = new ItemStack(Material.GOLDEN_SHOVEL, plugin.getAmountClass().getAmount());
                            case "diamond" ->
                                    item = new ItemStack(Material.DIAMOND_SHOVEL, plugin.getAmountClass().getAmount());
                            case "netherite" ->
                                    item = new ItemStack(Material.NETHERITE_SHOVEL, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "hoe":
                        switch (material) {
                            case "wood" ->
                                    item = new ItemStack(Material.WOODEN_HOE, plugin.getAmountClass().getAmount());
                            case "stone" ->
                                    item = new ItemStack(Material.STONE_HOE, plugin.getAmountClass().getAmount());
                            case "iron" -> item = new ItemStack(Material.IRON_HOE, plugin.getAmountClass().getAmount());
                            case "gold" ->
                                    item = new ItemStack(Material.GOLDEN_HOE, plugin.getAmountClass().getAmount());
                            case "diamond" ->
                                    item = new ItemStack(Material.DIAMOND_HOE, plugin.getAmountClass().getAmount());
                            case "netherite" ->
                                    item = new ItemStack(Material.NETHERITE_HOE, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "other":
                        item = new ItemStack(Material.SHEARS, plugin.getAmountClass().getAmount());
                        break;
                }
                break;
            case 2:
                switch (type) {
                    case "sword":
                        switch (material) {
                            case "wood" ->
                                    item = new ItemStack(Material.WOODEN_SWORD, plugin.getAmountClass().getAmount());
                            case "stone" ->
                                    item = new ItemStack(Material.STONE_SWORD, plugin.getAmountClass().getAmount());
                            case "iron" ->
                                    item = new ItemStack(Material.IRON_SWORD, plugin.getAmountClass().getAmount());
                            case "gold" ->
                                    item = new ItemStack(Material.GOLDEN_SWORD, plugin.getAmountClass().getAmount());
                            case "diamond" ->
                                    item = new ItemStack(Material.DIAMOND_SWORD, plugin.getAmountClass().getAmount());
                            case "netherite" ->
                                    item = new ItemStack(Material.NETHERITE_SWORD, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "axe":
                        switch (material) {
                            case "wood" ->
                                    item = new ItemStack(Material.WOODEN_AXE, plugin.getAmountClass().getAmount());
                            case "stone" ->
                                    item = new ItemStack(Material.STONE_AXE, plugin.getAmountClass().getAmount());
                            case "iron" -> item = new ItemStack(Material.IRON_AXE, plugin.getAmountClass().getAmount());
                            case "gold" ->
                                    item = new ItemStack(Material.GOLDEN_AXE, plugin.getAmountClass().getAmount());
                            case "diamond" ->
                                    item = new ItemStack(Material.DIAMOND_AXE, plugin.getAmountClass().getAmount());
                            case "netherite" ->
                                    item = new ItemStack(Material.NETHERITE_AXE, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "armour":
                        switch (material) {
                            case "leather":
                                    if(subType[0] == 1){
                                        item = new ItemStack(Material.LEATHER_HELMET, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 2){
                                        item = new ItemStack(Material.LEATHER_CHESTPLATE, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 3){
                                        item = new ItemStack(Material.LEATHER_LEGGINGS, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 4){
                                        item = new ItemStack(Material.LEATHER_BOOTS, plugin.getAmountClass().getAmount());
                                    } break;
                            case "chain":
                                    if(subType[0] == 1){
                                        item = new ItemStack(Material.CHAINMAIL_HELMET, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 2){
                                        item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 3){
                                        item = new ItemStack(Material.CHAINMAIL_LEGGINGS, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 4){
                                        item = new ItemStack(Material.CHAINMAIL_BOOTS, plugin.getAmountClass().getAmount());
                                    } break;
                            case "iron":
                                    if(subType[0] == 1){
                                        item = new ItemStack(Material.IRON_HELMET, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 2){
                                        item = new ItemStack(Material.IRON_CHESTPLATE, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 3){
                                        item = new ItemStack(Material.IRON_LEGGINGS, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 4){
                                        item = new ItemStack(Material.IRON_BOOTS, plugin.getAmountClass().getAmount());
                                    } break;
                            case "gold":
                                    if(subType[0] == 1){
                                        item = new ItemStack(Material.GOLDEN_HELMET, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 2){
                                        item = new ItemStack(Material.GOLDEN_CHESTPLATE, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 3){
                                        item = new ItemStack(Material.GOLDEN_LEGGINGS, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 4){
                                        item = new ItemStack(Material.GOLDEN_BOOTS, plugin.getAmountClass().getAmount());
                                    } break;
                            case "diamond":
                                    if(subType[0] == 1){
                                        item = new ItemStack(Material.DIAMOND_HELMET, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 2){
                                        item = new ItemStack(Material.DIAMOND_CHESTPLATE, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 3){
                                        item = new ItemStack(Material.DIAMOND_LEGGINGS, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 4){
                                        item = new ItemStack(Material.DIAMOND_BOOTS, plugin.getAmountClass().getAmount());
                                    } break;
                            case "netherite":
                                    if(subType[0] == 1){
                                        item = new ItemStack(Material.NETHERITE_HELMET, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 2){
                                        item = new ItemStack(Material.NETHERITE_CHESTPLATE, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 3){
                                        item = new ItemStack(Material.NETHERITE_LEGGINGS, plugin.getAmountClass().getAmount());
                                    } else if(subType[0] == 4){
                                        item = new ItemStack(Material.NETHERITE_BOOTS, plugin.getAmountClass().getAmount());
                                    } break;
                            case "turtle":
                                item = new ItemStack(Material.TURTLE_HELMET, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "horse":
                        switch (material) {
                            case "leather" ->
                                    item = new ItemStack(Material.LEATHER_HORSE_ARMOR, plugin.getAmountClass().getAmount());
                            case "iron" ->
                                    item = new ItemStack(Material.IRON_HORSE_ARMOR, plugin.getAmountClass().getAmount());
                            case "gold" ->
                                    item = new ItemStack(Material.GOLDEN_HORSE_ARMOR, plugin.getAmountClass().getAmount());
                            case "diamond" ->
                                    item = new ItemStack(Material.DIAMOND_HORSE_ARMOR, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "trident":
                        if ("trident".equals(material)) {
                            item = new ItemStack(Material.TRIDENT, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "bow":
                        switch (material) {
                            case "bow" -> item = new ItemStack(Material.BOW, plugin.getAmountClass().getAmount());
                            case "crossbow" ->
                                    item = new ItemStack(Material.CROSSBOW, plugin.getAmountClass().getAmount());
                            case "arrow" -> item = new ItemStack(Material.ARROW, plugin.getAmountClass().getAmount());
                            case "sparrow" ->
                                    item = new ItemStack(Material.SPECTRAL_ARROW, plugin.getAmountClass().getAmount());
                        }
                        break;
                    case "other":
                        item = new ItemStack(Material.END_CRYSTAL, plugin.getAmountClass().getAmount());
                        break;
                }
                break;
            case 3:
                switch (type) {

                }
                break;
            case 4:
                switch (type) {

                }
                break;
            case 5:
                switch (type) {

                }
                break;
            case 6:
                switch (type) {

                }
                break;
            case 7:
                switch (type) {

                }
                break;
            case 8:
                switch (type) {

                }
                break;
            case 9:
                switch (type) {

                }
                break;
        }



        addEnchants = new ItemStack(Material.GOLD_BLOCK, 1);
        addName = new ItemStack(Material.GOLD_BLOCK, 1);
        ItemStack addLore = new ItemStack(Material.GOLD_BLOCK, 1);
        ItemStack addAmount = new ItemStack(Material.GOLD_BLOCK, 1);
        ItemStack createItem = new ItemStack(Material.DIAMOND_BLOCK, 1);
        ItemStack cancel = new ItemStack(Material.RED_DYE, 1);


        addEnchantsMeta = addEnchants.getItemMeta();
        addEnchantsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Add Enchantments");
        addEnchants.setItemMeta(addEnchantsMeta);

        addNameMeta = addName.getItemMeta();
        addNameMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Add Name");
        addName.setItemMeta(addNameMeta);

        ItemMeta addLoreMeta = addLore.getItemMeta();
        addLoreMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Add Lore");
        addLore.setItemMeta(addLoreMeta);

        ItemMeta addAmountMeta = addAmount.getItemMeta();
        addAmountMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Add Amount");
        addAmount.setItemMeta(addAmountMeta);

        ItemMeta createItemMeta = createItem.getItemMeta();
        createItemMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Create Item");
        createItem.setItemMeta(createItemMeta);

        ItemMeta cancelMeta = cancel.getItemMeta();
        cancelMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "cancel");
        cancel.setItemMeta(cancelMeta);



        inventory.setItem(4, item);
        inventory.setItem(8, cancel);
        inventory.setItem(9, addEnchants);
        inventory.setItem(11, addName);
        inventory.setItem(13, createItem);
        inventory.setItem(15, addLore);
        inventory.setItem(17, addAmount);


        player.openInventory(inventory);

    }

    public void setEnchantment(Enchantment ench, int level, boolean restriction){
        addEnchantsMeta = addEnchants.getItemMeta();
        addEnchantsMeta.addEnchant(ench, level, restriction);
        addEnchants.setItemMeta(addEnchantsMeta);
    }
    public void setName(Enchantment ench, int level, boolean restriction){
        addEnchantsMeta = addEnchants.getItemMeta();
        addEnchantsMeta.addEnchant(ench, level, restriction);
        addEnchants.setItemMeta(addEnchantsMeta);
    }
    public int getCat() {
        return cat;
    }
    public String getType(){
        return typeHolder;
    }
    public String getMaterialHolder(){
        return materialHolder;
    }
    public void giveItem(Player player){
        player.getInventory().setItem(player.getInventory().firstEmpty(), item);
    }
}