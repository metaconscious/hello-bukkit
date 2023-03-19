package dev.metaconscious.hellobukkit;

import org.bukkit.plugin.java.JavaPlugin;

public final class HelloBukkit extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello Bukkit!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Bye Bukkit!");
    }
}
