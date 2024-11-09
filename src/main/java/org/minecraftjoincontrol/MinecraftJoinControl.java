package org.minecraftjoincontrol;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftJoinControl extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register the event listener when the plugin is enabled
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic (optional cleanup if needed)
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Get the world the player is joining
        World world = event.getPlayer().getWorld();

        // Check if the world is not one of the allowed worlds
        if (!isApprovedWorld(world.getName())) {
            // Get the spawn location in the "world_spawn" world
            Location spawnLocation = Bukkit.getWorld("world_spawn").getSpawnLocation();

            // Teleport the player to the "world_spawn" spawn location
            event.getPlayer().teleport(spawnLocation);
        }
    }

    // Helper method to check if a world is approved
    private boolean isApprovedWorld(String worldName) {
        return worldName.equals("world") || worldName.equals("world_nether")
                || worldName.equals("world_spawn") || worldName.equals("world_the_end");
    }
}
