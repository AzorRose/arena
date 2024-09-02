package otnose.arena;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {

    private final Arena plugin;

    public CommandHandler(Arena plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player))
        {
            return false;
        }

        Player player = (Player) sender;

        if (args.length == 0)
        {
            player.sendMessage("Доступные команды: ");
            player.sendMessage("");
            return true;
        }

        switch (args[0])
        {
            case "create":

                if (ArenaManager.checkArenaExisting(args[1]))
                {
                    player.sendMessage("Арена с таким названием уже существует");
                    return false;
                }

                if (!ArenaManager.getFormatList().contains(args[2])) {
                    player.sendMessage("Указанного формата нет в списке допустимых форматов");
                    return false;
                }

                ArenaData arenaData = new ArenaData(args[1], player, args[2]);
                ArenaManager.putToArenas(args[1], arenaData);
                player.sendMessage("Арена успешно создана!");
                return true;

            case "add":


        }

        return false;
    }

}
