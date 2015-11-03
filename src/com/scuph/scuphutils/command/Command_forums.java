package com.scuph.scuphutils.command;

import com.scuph.scuphutils.ScuphUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.ANY, permission = "utils.forums")
public class Command_forums extends BukkitCommand<ScuphUtils> {

    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.GREEN + "http://ifreedom.forumized.com");
        return true;
    }

}
