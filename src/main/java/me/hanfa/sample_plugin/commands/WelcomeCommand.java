package me.hanfa.sample_plugin.commands;

import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import me.hanfa.sample_plugin.SamplePlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class WelcomeCommand implements CommandExecutor {

    private SamplePlugin plugin;

    public WelcomeCommand(SamplePlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) sender.sendMessage(ChatColor.RED + "The sender is not a player.");
        assert sender instanceof Player;
        Player player = (Player) sender;


        if (command.getName().equals("hello")) {
            WorldEditPlugin we = getWorldEdit();
            player.sendMessage(ChatColor.GREEN + "welcome!");
        }
        return true;
    }

    public WorldEditPlugin getWorldEdit() {
        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("WorldEdit");
        if (plugin instanceof WorldEditPlugin) return (WorldEditPlugin) plugin;
        return null;
    }

}
