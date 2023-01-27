package com.speedytman.customitemcreator;

import com.speedytman.customitemcreator.commands.CreateCustomItem;
import com.speedytman.customitemcreator.events.MenuClickEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class CustomItemCreator extends JavaPlugin {

    private Amount amountClass;

    @Override
    public void onEnable() {
        // Plugin startup logic
        amountClass = new Amount();
        getServer().getPluginManager().registerEvents(new MenuClickEvent(this), this);

        getCommand("createitem").setExecutor(new CreateCustomItem());


    }

    public Amount getAmountClass() {
        return amountClass;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
