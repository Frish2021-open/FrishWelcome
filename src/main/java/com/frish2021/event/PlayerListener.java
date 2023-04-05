package com.frish2021.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void join(PlayerJoinEvent e) {
        e.setJoinMessage("欢迎 " + e.getPlayer().getName() + " 加入服务器");
    }

    @EventHandler
    public void left(PlayerQuitEvent e) {
        e.setQuitMessage(e.getPlayer().getName() + " 离开了服务器");
    }
}
