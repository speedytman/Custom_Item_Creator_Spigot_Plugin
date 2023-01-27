package com.speedytman.customitemcreator.events;

import com.speedytman.customitemcreator.CustomItemCreator;
import com.speedytman.customitemcreator.menus.*;
import com.speedytman.customitemcreator.menus.combat.*;
import com.speedytman.customitemcreator.menus.tools.ToolMaterialMenu;
import com.speedytman.customitemcreator.menus.tools.ToolTypeMenu;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

public class MenuClickEvent implements Listener {

    private int catagory;
    private String type;
    private String material;
    private int subType;

    private final ToolTypeMenu toolTypeMenu = new ToolTypeMenu();
    private final CombatTypeMenu combatTypeMenu = new CombatTypeMenu();
    private final ToolMaterialMenu toolMaterialMenu = new ToolMaterialMenu();
    private final CombatMaterialMenu combatMaterialMenu = new CombatMaterialMenu();
    private final ArmourMaterialMenu armourMaterialMenu = new ArmourMaterialMenu();
    private final ArmourPieceSubMenu armourPieceSubMenu = new ArmourPieceSubMenu();
    private final BowMaterialMenu bowMaterialMenu = new BowMaterialMenu();
    private final CustomItemMainMenu mainMenu = new CustomItemMainMenu();
    private final AddEnchantmentsMenu addEnchantmentsMenu = new AddEnchantmentsMenu();
    private final ItemDisplayMenu itemMenu;
    private final AddAmountMenu addAmountMenu;
    private final CustomItemCreator plugin;


    public MenuClickEvent(CustomItemCreator plugin){
        this.plugin = plugin;
        itemMenu = new ItemDisplayMenu(plugin);
        addAmountMenu = new AddAmountMenu(plugin);
    }



    @EventHandler
    public void clickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Item Type")) {
            switch (event.getCurrentItem().getType()) {
                case DIAMOND_PICKAXE:
                    player.closeInventory();
                    toolTypeMenu.createMenu(player);
                    catagory = 1;
                    break;
                case DIAMOND_SWORD:
                    player.closeInventory();
                    combatTypeMenu.createMenu(player);
                    catagory = 2;
                    break;
                case DIAMOND_CHESTPLATE:
                    player.closeInventory();
                    catagory = 3;
                    break;
                case OAK_LOG:
                    player.closeInventory();
                    catagory = 4;
                    break;
                case STONE:
                    player.closeInventory();
                    catagory = 5;
                    break;
                case FURNACE:
                    player.closeInventory();
                    catagory = 6;
                    break;
                case GRASS_BLOCK:
                    player.closeInventory();
                    catagory = 7;
                    break;
                case ROTTEN_FLESH:
                    player.closeInventory();
                    catagory = 8;
                    break;
                case END_CRYSTAL:
                    player.closeInventory();
                    catagory = 9;
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Tool Type")) {
            switch (event.getCurrentItem().getType()) {
                case DIAMOND_PICKAXE:
                    player.closeInventory();
                    toolMaterialMenu.createMenu(player);
                    type = "pick";
                    break;
                case DIAMOND_AXE:
                    player.closeInventory();
                    toolMaterialMenu.createMenu(player);
                    type = "axe";
                    break;
                case DIAMOND_SHOVEL:
                    player.closeInventory();
                    toolMaterialMenu.createMenu(player);
                    type = "shovel";
                    break;
                case DIAMOND_HOE:
                    player.closeInventory();
                    toolMaterialMenu.createMenu(player);
                    type = "hoe";
                    break;
                case SHEARS:
                    player.closeInventory();
                    toolMaterialMenu.createMenu(player);
                    type = "other";
                    break;
                case SPAWNER:
                    player.closeInventory();
                    mainMenu.createMenu(player);
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Weapon/Armour Type")) {
            switch (event.getCurrentItem().getType()) {
                case DIAMOND_SWORD:
                    player.closeInventory();
                    combatMaterialMenu.createMenu(player);
                    type = "sword";
                    break;
                case DIAMOND_AXE:
                    player.closeInventory();
                    combatMaterialMenu.createMenu(player);
                    type = "axe";
                    break;
                case DIAMOND_CHESTPLATE:
                    player.closeInventory();
                    armourPieceSubMenu.createMenu(player);
                    type = "armour";
                    break;
                case DIAMOND_HORSE_ARMOR:
                    player.closeInventory();
                    armourMaterialMenu.createMenu(player, false);
                    type = "horse";
                    break;
                case TRIDENT:
                    player.closeInventory();
                    type = "trident";
                    material = "trident";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case BOW:
                    player.closeInventory();
                    bowMaterialMenu.createMenu(player);
                    type = "bow";
                    break;
                case END_CRYSTAL:
                    player.closeInventory();
                    toolMaterialMenu.createMenu(player);
                    type = "other";
                    break;
                case SPAWNER:
                    player.closeInventory();
                    mainMenu.createMenu(player);
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Armour Piece")) {
            switch (event.getCurrentItem().getType()) {
                case DIAMOND_HELMET:
                    player.closeInventory();
                    armourMaterialMenu.createMenu(player, 1);
                    subType = 1;
                    break;
                case DIAMOND_CHESTPLATE:
                    player.closeInventory();
                    armourMaterialMenu.createMenu(player);
                    subType = 2;
                    break;
                case DIAMOND_LEGGINGS:
                    player.closeInventory();
                    armourMaterialMenu.createMenu(player);
                    subType = 3;
                    break;
                case DIAMOND_BOOTS:
                    player.closeInventory();
                    armourMaterialMenu.createMenu(player);
                    subType = 4;
                    break;
                case SPAWNER:
                    player.closeInventory();
                    mainMenu.createMenu(player);
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Tool Material")) {
            switch (event.getCurrentItem().getType()) {
                case OAK_PLANKS:
                    player.closeInventory();
                    material = "wood";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case STONE:
                    player.closeInventory();
                    material = "stone";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case IRON_INGOT:
                    player.closeInventory();
                    material = "iron";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case GOLD_INGOT:
                    player.closeInventory();
                    material = "gold";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case DIAMOND:
                    player.closeInventory();
                    material = "diamond";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case NETHERITE_INGOT:
                    player.closeInventory();
                    material = "netherite";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case SPAWNER:
                    player.closeInventory();
                    toolTypeMenu.createMenu(player);
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Weapon Material")) {
            switch (event.getCurrentItem().getType()) {
                case OAK_PLANKS:
                    player.closeInventory();
                    material = "wood";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case STONE:
                    player.closeInventory();
                    material = "stone";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case IRON_INGOT:
                    player.closeInventory();
                    material = "iron";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case GOLD_INGOT:
                    player.closeInventory();
                    material = "gold";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case DIAMOND:
                    player.closeInventory();
                    material = "diamond";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case NETHERITE_INGOT:
                    player.closeInventory();
                    material = "netherite";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case SPAWNER:
                    player.closeInventory();
                    combatTypeMenu.createMenu(player);
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Armour Material")) {
            switch (event.getCurrentItem().getType()) {
                case LEATHER:
                    player.closeInventory();
                    material = "leather";
                    itemMenu.createMenu(player, catagory, type, material, subType);
                    break;
                case IRON_BARS:
                    player.closeInventory();
                    material = "chain";
                    itemMenu.createMenu(player, catagory, type, material, subType);
                    break;
                case IRON_INGOT:
                    player.closeInventory();
                    material = "iron";
                    itemMenu.createMenu(player, catagory, type, material, subType);
                    break;
                case GOLD_INGOT:
                    player.closeInventory();
                    material = "gold";
                    itemMenu.createMenu(player, catagory, type, material, subType);
                    break;
                case DIAMOND:
                    player.closeInventory();
                    material = "diamond";
                    itemMenu.createMenu(player, catagory, type, material, subType);
                    break;
                case NETHERITE_INGOT:
                    player.closeInventory();
                    material = "netherite";
                    itemMenu.createMenu(player, catagory, type, material, subType);
                    break;
                case TURTLE_HELMET:
                    player.closeInventory();
                    material = "turtle";
                    itemMenu.createMenu(player, catagory, type, material);
                case SPAWNER:
                    player.closeInventory();
                    armourPieceSubMenu.createMenu(player);
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Bow/Arrow")) {
            switch (event.getCurrentItem().getType()) {
                case BOW:
                    player.closeInventory();
                    material = "bow";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case CROSSBOW:
                    player.closeInventory();
                    material = "crossbow";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case ARROW:
                    player.closeInventory();
                    material = "arrow";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case SPECTRAL_ARROW:
                    player.closeInventory();
                    material = "sparrow";
                    itemMenu.createMenu(player, catagory, type, material);
                    break;
                case SPAWNER:
                    player.closeInventory();
                    combatTypeMenu.createMenu(player);
                    break;
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Modify Your Item")) {
            if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Add Enchantments")) {
                player.closeInventory();
                addEnchantmentsMenu.createMenu(player);
                System.out.println("Add Enchantments");
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Add Name")) {
                player.closeInventory();
                System.out.println("Add Name");
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Add Lore")) {
                player.closeInventory();
                System.out.println("Add Lore");
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Add Amount")) {
                player.closeInventory();
                addAmountMenu.createMenu(player);
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Create Item")) {
                player.closeInventory();
                if(player.getInventory().firstEmpty() == -1){
                    player.sendMessage(ChatColor.RED + "Action Not Completed(Inventory Full)");
                }else {
                    itemMenu.giveItem(player);
                }
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Cancel")) {
                player.closeInventory();
                System.out.println("Cancel");
            } else {
                System.out.println("Do Nothing");
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Add Amount")) {
            if (Objects.requireNonNull(Objects.requireNonNull(event.getCurrentItem()).getItemMeta()).getDisplayName().equalsIgnoreCase(ChatColor.RED + "-5")) {
                if(plugin.getAmountClass().getAmount() >= 6){
                    plugin.getAmountClass().setAmount(plugin.getAmountClass().getAmount() - 5);
                    addAmountMenu.increaseSelectAmount();
                } else if (plugin.getAmountClass().getAmount() < 6){
                    plugin.getAmountClass().setAmount(1);
                    addAmountMenu.increaseSelectAmount();
                }
                System.out.println(plugin.getAmountClass().getAmount() - 5);
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.RED + "-1")) {
                if(plugin.getAmountClass().getAmount() > 1){
                    plugin.getAmountClass().setAmount(plugin.getAmountClass().getAmount() - 1);
                    addAmountMenu.increaseSelectAmount();
                }
                System.out.println(plugin.getAmountClass().getAmount()-1);
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "Select Amount")) {
                player.closeInventory();
                itemMenu.createMenu(player, itemMenu.getCat(), itemMenu.getType(), itemMenu.getMaterialHolder());
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.GREEN + "+1")) {
                if(plugin.getAmountClass().getAmount() < 64){
                    plugin.getAmountClass().setAmount(plugin.getAmountClass().getAmount() + 1);
                    addAmountMenu.increaseSelectAmount();
                }
            } else if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.GREEN + "+5")) {
                if(plugin.getAmountClass().getAmount() <= 59){
                    plugin.getAmountClass().setAmount(plugin.getAmountClass().getAmount() + 5);
                    addAmountMenu.increaseSelectAmount();
                }
            }
            event.setCancelled(true);
        }
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BOLD + "Choose Enchantment")) {
            if (event.getCurrentItem().getItemMeta().getDisplayName()
                    .equalsIgnoreCase(ChatColor.RED + "Go Back")) {
                player.closeInventory();
                itemMenu.createMenu(player, itemMenu.getCat(), itemMenu.getType(), itemMenu.getMaterialHolder());
            }
            event.setCancelled(true);
        }
    }
}

