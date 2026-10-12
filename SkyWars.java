package me.skywars;

import org.bukkit.plugin.java.JavaPlugin;

public final class SkyWars extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SkyWars iniciado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SkyWars desligado!");
    }
}