package otnose.arena;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

public class ArenaData {
    private String name;
    private List<Location> posFans;
    private List<Location> posFighters;
    private Player owner;
    private Player renter;
    private String format;

    public ArenaData(String name, Player owner, String format) {
        this.name = name;
        this.format = format;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getPosFans() {
        return posFans;
    }

    public void addToPosFans(Location location) {
        this.posFans.add(location);
    }

    public List<Location> getPosFighters() {
        return posFighters;
    }

    public void addToPosFighters(Location location) {
        this.posFighters.add(location);
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Player getRenter() {
        return renter;
    }

    public void setRenter(Player renter) {
        this.renter = renter;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
