package com.speedytman.customitemcreator.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AddEnchantmentsMenu {

    private Inventory inventory;

    public void createMenu(Player player) {

        inventory = Bukkit.createInventory(player, 54, ChatColor.BOLD + "Choose Enchantment");

        ItemStack protectionBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta protectionMeta = protectionBook.getItemMeta();
        protectionMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Protection");
        protectionBook.setItemMeta(protectionMeta);
        inventory.setItem(0, protectionBook);

        ItemStack fireProtectionBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta fireProtectionMeta = fireProtectionBook.getItemMeta();
        fireProtectionMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Fire Protection");
        fireProtectionBook.setItemMeta(fireProtectionMeta);
        inventory.setItem(1, fireProtectionBook);

        ItemStack blastProtectionBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta blastProtectionMeta = blastProtectionBook.getItemMeta();
        blastProtectionMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Blast Protection");
        blastProtectionBook.setItemMeta(blastProtectionMeta);
        inventory.setItem(2, blastProtectionBook);

        ItemStack projectileProtectionBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta projectileProtectionMeta = projectileProtectionBook.getItemMeta();
        projectileProtectionMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Projectile Protection");
        projectileProtectionBook.setItemMeta(projectileProtectionMeta);
        inventory.setItem(3, projectileProtectionBook);

        ItemStack featherFallingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta featherFallingMeta = featherFallingBook.getItemMeta();
        featherFallingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Feather Falling");
        featherFallingBook.setItemMeta(featherFallingMeta);
        inventory.setItem(4, featherFallingBook);

        ItemStack resperationBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta resperationMeta = resperationBook.getItemMeta();
        resperationMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Resperation");
        resperationBook.setItemMeta(resperationMeta);
        inventory.setItem(5, resperationBook);

        ItemStack aquaAffinityBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta aquaAffinityMeta = aquaAffinityBook.getItemMeta();
        aquaAffinityMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Aqua Affinity");
        aquaAffinityBook.setItemMeta(aquaAffinityMeta);
        inventory.setItem(6, aquaAffinityBook);

        ItemStack thornsBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta thornsMeta = thornsBook.getItemMeta();
        thornsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Thorns");
        thornsBook.setItemMeta(thornsMeta);
        inventory.setItem(7, thornsBook);

        ItemStack depthStriderBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta depthStriderMeta = depthStriderBook.getItemMeta();
        depthStriderMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Depth Strider");
        depthStriderBook.setItemMeta(depthStriderMeta);
        inventory.setItem(8, depthStriderBook);

        ItemStack frostWalkerBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta frostWalkerMeta = frostWalkerBook.getItemMeta();
        frostWalkerMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Frost Walker");
        frostWalkerBook.setItemMeta(frostWalkerMeta);
        inventory.setItem(9, frostWalkerBook);

        ItemStack bindingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta bindingMeta = bindingBook.getItemMeta();
        bindingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Curse of Binding");
        bindingBook.setItemMeta(bindingMeta);
        inventory.setItem(10, bindingBook);

        ItemStack soulSpeedBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta soulSpeedMeta = soulSpeedBook.getItemMeta();
        soulSpeedMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Soul Speed");
        soulSpeedBook.setItemMeta(soulSpeedMeta);
        inventory.setItem(11, soulSpeedBook);

        ItemStack swiftSneakBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta swiftSneakMeta = swiftSneakBook.getItemMeta();
        swiftSneakMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Swift Sneak");
        swiftSneakBook.setItemMeta(swiftSneakMeta);
        inventory.setItem(12, swiftSneakBook);

        ItemStack sharpnessBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta sharpnessMeta = sharpnessBook.getItemMeta();
        sharpnessMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Sharpness");
        sharpnessBook.setItemMeta(sharpnessMeta);
        inventory.setItem(13, sharpnessBook);

        ItemStack smiteBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta smiteMeta = smiteBook.getItemMeta();
        smiteMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Smite");
        smiteBook.setItemMeta(smiteMeta);
        inventory.setItem(14, smiteBook);

        ItemStack arthropodsBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta arthropodsMeta = arthropodsBook.getItemMeta();
        arthropodsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Bane of Arthropods");
        arthropodsBook.setItemMeta(arthropodsMeta);
        inventory.setItem(15, arthropodsBook);

        ItemStack knockbackBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta knockbackMeta = knockbackBook.getItemMeta();
        knockbackMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Knockback");
        knockbackBook.setItemMeta(knockbackMeta);
        inventory.setItem(16, knockbackBook);

        ItemStack fireAspectBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta fireAspectMeta = fireAspectBook.getItemMeta();
        fireAspectMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Fire Aspect");
        fireAspectBook.setItemMeta(fireAspectMeta);
        inventory.setItem(17, fireAspectBook);

        ItemStack lootingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta lootingMeta = lootingBook.getItemMeta();
        lootingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Looting");
        lootingBook.setItemMeta(lootingMeta);
        inventory.setItem(18, lootingBook);

        ItemStack sweepingEdgeBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta sweepingEdgeMeta = sweepingEdgeBook.getItemMeta();
        sweepingEdgeMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Sweeping Edge");
        sharpnessBook.setItemMeta(sweepingEdgeMeta);
        inventory.setItem(19, sharpnessBook);

        ItemStack efficiencyBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta efficiencyMeta = efficiencyBook.getItemMeta();
        efficiencyMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Efficiency");
        efficiencyBook.setItemMeta(efficiencyMeta);
        inventory.setItem(20, efficiencyBook);

        ItemStack silkTouchBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta silkTouchMeta = silkTouchBook.getItemMeta();
        silkTouchMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Silk Touch");
        silkTouchBook.setItemMeta(silkTouchMeta);
        inventory.setItem(21, silkTouchBook);

        ItemStack unbreakingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta unbreakingMeta = unbreakingBook.getItemMeta();
        unbreakingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Unbreaking");
        unbreakingBook.setItemMeta(unbreakingMeta);
        inventory.setItem(22, unbreakingBook);

        ItemStack fortuneBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta fortuneMeta = fortuneBook.getItemMeta();
        fortuneMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Fortune");
        fortuneBook.setItemMeta(fortuneMeta);
        inventory.setItem(23, fortuneBook);

        ItemStack powerBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta powerMeta = powerBook.getItemMeta();
        powerMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Power");
        powerBook.setItemMeta(powerMeta);
        inventory.setItem(24, powerBook);

        ItemStack punchBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta punchMeta = punchBook.getItemMeta();
        punchMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Punch");
        powerBook.setItemMeta(punchMeta);
        inventory.setItem(25, powerBook);

        ItemStack flameBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta flameMeta = flameBook.getItemMeta();
        flameMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Flame");
        flameBook.setItemMeta(flameMeta);
        inventory.setItem(26, flameBook);

        ItemStack infinityBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta infinityMeta = infinityBook.getItemMeta();
        infinityMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Infinity");
        infinityBook.setItemMeta(infinityMeta);
        inventory.setItem(27, infinityBook);

        ItemStack luckBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta luckMeta = luckBook.getItemMeta();
        luckMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Luck of the Sea");
        luckBook.setItemMeta(luckMeta);
        inventory.setItem(28, luckBook);

        ItemStack lureBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta lureMeta = lureBook.getItemMeta();
        lureMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Lure");
        lureBook.setItemMeta(lureMeta);
        inventory.setItem(29, lureBook);

        ItemStack loyaltyBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta loyaltyMeta = loyaltyBook.getItemMeta();
        loyaltyMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Loyalty");
        loyaltyBook.setItemMeta(loyaltyMeta);
        inventory.setItem(30, loyaltyBook);

        ItemStack impalingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta impalingMeta = impalingBook.getItemMeta();
        impalingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Impaling");
        impalingBook.setItemMeta(impalingMeta);
        inventory.setItem(31, impalingBook);

        ItemStack riptideBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta riptideMeta = riptideBook.getItemMeta();
        riptideMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Riptide");
        riptideBook.setItemMeta(riptideMeta);
        inventory.setItem(32, riptideBook);

        ItemStack channelingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta channelingMeta = channelingBook.getItemMeta();
        channelingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Channeling");
        channelingBook.setItemMeta(channelingMeta);
        inventory.setItem(33, channelingBook);

        ItemStack multishotBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta multishotMeta = multishotBook.getItemMeta();
        multishotMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Multi-shot");
        multishotBook.setItemMeta(multishotMeta);
        inventory.setItem(34, multishotBook);

        ItemStack quickChargeBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta quickChargeMeta = quickChargeBook.getItemMeta();
        quickChargeMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Quick Charge");
        quickChargeBook.setItemMeta(quickChargeMeta);
        inventory.setItem(35, quickChargeBook);

        ItemStack piercingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta piercingMeta = piercingBook.getItemMeta();
        piercingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Piercing");
        piercingBook.setItemMeta(piercingMeta);
        inventory.setItem(36, piercingBook);

        ItemStack mendingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta mendingMeta = mendingBook.getItemMeta();
        mendingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mending");
        mendingBook.setItemMeta(mendingMeta);
        inventory.setItem(37, mendingBook);

        ItemStack vanishingBook = new ItemStack(Material.ENCHANTED_BOOK, 1);
        ItemMeta vanishingMeta = vanishingBook.getItemMeta();
        vanishingMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Curse of Vanishing");
        vanishingBook.setItemMeta(vanishingMeta);
        inventory.setItem(38, vanishingBook);

        ItemStack backButton = new ItemStack(Material.RED_DYE, 1);
        ItemMeta backButtonMeta = backButton.getItemMeta();
        backButtonMeta.setDisplayName(ChatColor.RED + "Go Back");
        backButton.setItemMeta(backButtonMeta);
        inventory.setItem(53, backButton);


        player.openInventory(inventory);
    }
}
