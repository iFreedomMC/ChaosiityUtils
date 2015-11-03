package com.scuph.scuphutils;

import com.scuph.scuphutils.command.Command_forums;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import net.pravian.bukkitlib.implementation.BukkitLogger;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import org.apache.commons.lang.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.HandlerList;

public class ScuphUtils extends BukkitPlugin {

    public static ScuphUtils plugin;
    //
    public YamlConfig config;
    public BukkitLogger logger;
    public BukkitCommandHandler<ScuphUtils> handler;
    //
 

    @Override
    public void onLoad() {
        plugin = this;
        //
        this.config = new YamlConfig(plugin, "config.yml", true);
        this.logger = new BukkitLogger(plugin);
        this.handler = new BukkitCommandHandler<>(plugin);
        //

    }

    @Override
    public void onEnable() {
        plugin = this;
        BukkitLib.init(plugin);

        // Load config
        config.load();

        // Start services

        // Register events

        // Setup command handler
        handler.setCommandLocation(Command_forums.class.getPackage());

        logger.info(plugin.getName() + " v" + plugin.getVersion() + " by " + StringUtils.join(getAuthors(), ", ") + " is enabled");
    }

    @Override
    public void onDisable() {

        plugin = this;

        // Unregister events
        HandlerList.unregisterAll(plugin);


        logger.info(plugin.getName() + " v" + plugin.getVersion() + " disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        return handler.handleCommand(sender, cmd, commandLabel, args);
    }

}
