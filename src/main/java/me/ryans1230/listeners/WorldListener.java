package me.ryans1230.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;

import me.ryans1230.PvPToggle;

public class WorldListener implements Listener {

    public static PvPToggle plugin;

    public WorldListener(PvPToggle instance) {
        plugin = instance;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onWorldLoad(WorldLoadEvent event) {
        plugin.loadWorld(event.getWorld());
    }
}