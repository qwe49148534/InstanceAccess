package com.cookie;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class InstanceAccess extends JavaPlugin {

    private static InstanceAccess plugin;

    public static InstanceAccess getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Listeners() , this);
    }
}
