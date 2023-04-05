package com.frish2021;

import com.frish2021.event.PlayerListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/*
* Author: Frish2021
* creat: 2023/4/5
*/

public class WelcomePlugin extends JavaPlugin {
    public static Logger log = LogManager.getLogger();
    public static String NAME = "FrishWelcome";
    FileConfiguration config = this.getConfig();
    @Override
    public void onEnable() {
        super.onEnable();
        config.addDefault("Chinese",true);
        config.options().copyDefaults(true);
        saveConfig();
        log.info("[" + NAME + "] Plugin Loader");
        if (config.getBoolean("Chinese")) {
            getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        } else if (!config.getBoolean("Chinese")) {
            log.info("由于没有配置启动所以没有中文");
        }

    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.saveConfig();
    }
}
