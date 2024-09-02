package otnose.arena;

import org.bukkit.plugin.java.JavaPlugin;

import java.sql.SQLException;

public final class Arena extends JavaPlugin {

    private CommandHandler commandHandler;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabling " + this.getName());
        commandHandler = new CommandHandler(this);
        //try {
        //    getLogger().info(this.getName() + " trying to connect db");
        //    con = new DBconnector(configManager, configManager.getPoolSize());
        //    con.createFactionTable();
        //    getLogger().info("Success");
        //} catch (SQLException e) {
        //    getLogger().info("Error while trying to connect db: " + e.getMessage());
        //    e.printStackTrace();
       //     throw new RuntimeException(e);
        //} catch (Exception ex) {
        //    getLogger().info("Unexpected error: " + ex.getMessage());
        //    ex.printStackTrace();
        //    throw new RuntimeException(ex);
        //}

        this.getCommand("arena").setExecutor(commandHandler);

        getLogger().info(this.getName() + " has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //try {
        //    con.closeAllConnections();
        //} catch (SQLException e) {
        //    e.printStackTrace();
       //}

        getLogger().info(this.getName() + " has been disabled!");
    }
}
