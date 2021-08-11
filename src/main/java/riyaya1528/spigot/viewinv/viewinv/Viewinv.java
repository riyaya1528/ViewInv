package riyaya1528.spigot.viewinv.viewinv;

import org.bukkit.plugin.java.JavaPlugin;

public final class Viewinv extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommandsListeners();
        System.out.println("§b[ViewInventory]プラグインが起動しました！");
    }

    @Override
    public void onDisable() {
        System.out.println("§c[ViewInventory]プラグインが停止しました！");
    }

    public void registerCommandsListeners() {
        getCommand("inv").setExecutor(new Commands());
    }
}

