package me.skywars;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
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

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!command.getName().equalsIgnoreCase("sw")) {
            return false;
        }

        if (!(sender instanceof Player player)) {
            sender.sendMessage("§cEsse comando só pode ser usado por um jogador.");
            return true;
        }

        if (args.length == 0) {
            player.sendMessage("§b§lSkyWars");
            player.sendMessage("§7Use §f/sw criar <nome>");
            player.sendMessage("§7Use §f/sw setlobby");
            player.sendMessage("§7Use §f/sw setspawn <nome> <numero>");
            return true;
        }

        switch (args[0].toLowerCase()) {

            case "criar":
                if (args.length < 2) {
                    player.sendMessage("§cUse: /sw criar <nome>");
                    return true;
                }

                player.sendMessage("§aArena §f" + args[1] + " §acriada!");
                return true;

            case "setlobby":
                player.sendMessage("§aLobby definido na sua posição!");
                return true;

            case "setspawn":
                if (args.length < 3) {
                    player.sendMessage("§cUse: /sw setspawn <nome> <numero>");
                    return true;
                }

                player.sendMessage("§aSpawn §f" + args[2] + " §ada arena §f" + args[1] + " §adefinido!");
                return true;

            default:
                player.sendMessage("§cComando desconhecido.");
                return true;
        }
    }
}