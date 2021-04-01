package kr.ohurjon;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
    private static Plugin instance = null;

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new EventListener(),this);
    }

    public static Plugin getInstance() {
        return instance;
    }
}
