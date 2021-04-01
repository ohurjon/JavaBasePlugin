package kr.ohurjon;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EventListener implements Listener {
    private final Plugin plugin = Plugin.getInstance();

    private final FileConfiguration config = plugin.getConfig();

    @EventHandler
    public void onEvent(Event event){
        //TODO
    }
}
