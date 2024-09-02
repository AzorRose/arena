package otnose.arena;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.HashMap;
import java.util.Map;

public class EventsHandler implements Listener {

    private final Arena plguin;
    private Map<Player, String> arenaCreation;

    public EventsHandler(Arena plugin)
    {
        this.plguin = plugin;
        this.arenaCreation = new HashMap<>();
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player)) return;

        Player player = (Player) event.getWhoClicked();

    }

    public void addToArenaCreation(Player player, String arenaName) {
        arenaCreation.put(player, arenaName);
    }
}
