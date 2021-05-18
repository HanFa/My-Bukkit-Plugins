package me.hanfa.sample_plugin;

import me.hanfa.sample_plugin.commands.WelcomeCommand;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

/**
 * Hello world!
 */
public class SamplePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("hello")).setExecutor(new WelcomeCommand(this));
    }
}
