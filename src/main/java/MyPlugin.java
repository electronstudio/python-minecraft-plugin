import io.papermc.lib.PaperLib;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    public void onEnable() {
        PaperLib.suggestPaper(this);
    }

//    public void doSomething(Entity entity, Location location) {
//        PaperLib.teleportAsync(entity, location).thenAccept(result -> {
//            if (result) {
//                player.sendMessage("Teleported!");
//            } else {
//                player.sendMessage("Something went wrong!");
//            }
//        });
//    }
}