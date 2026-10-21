package org.Cry_Legende.sHNoLavaBurn;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SHNoLavaBurn extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("SHNoLavaBurn activé !");
    }

    @Override
    public void onDisable() {
        getLogger().info("SHNoLavaBurn désactivé !");
    }

    @EventHandler
    public void onItemSpawn(ItemSpawnEvent event) {
        Item item = event.getEntity();
        // Ne pas rendre invulnérable l'item s'il s'agit d'un cactus
        if (item.getItemStack().getType() != Material.CACTUS) {
            item.setInvulnerable(true);
        }
    }
}
