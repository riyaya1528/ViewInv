package riyaya1528.spigot.viewinv.viewinv;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String commandLabel, String[] args) {

        Player player = null;
        if (sender instanceof Player) {
            if (sender.isOp()) {
                if (args[0] != null) {
                    player = (Player) sender;
                    Player e = player.getServer().getPlayer(args[0]);
                    player.openInventory(e.getInventory());
                }
            } else {
                // コンソールが実行
                sender.sendMessage("あたいはそこからは使えないよ～");
                // 処理を終わらせる
                return true;
            }
            return true;
        }
        return true;
    }
}
