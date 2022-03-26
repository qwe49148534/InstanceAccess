package com.cookie;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class Listeners implements Listener {

    public void PlayerDead(PlayerDeathEvent event) {
        final Player entity = event.getEntity();
        new BukkitRunnable() {
            @Override
            public void run() {
                entity.sendTitle("You are dead" , "" , 1 , 20 ,1);
            }
        }.runTaskLater(InstanceAccess.getPlugin() , 20L);
    }

}
