package com.speedytman.customitemcreator.commands;

import com.speedytman.customitemcreator.menus.CustomItemMainMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreateCustomItem implements CommandExecutor {
    private final CustomItemMainMenu mainMenu = new CustomItemMainMenu();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player player){
            mainMenu.createMenu(player);
        }


        return true;
    }
}
