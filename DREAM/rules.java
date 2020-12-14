import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin; 
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.junit.Test;


//test
@EventHandler
    public void onMobDeath(EntityDeathEvent event) {
        if(event.getEntity().getKiller() instanceof Player) {
            if(event.getEntity().getType() == EntityType.ZOMBIE){
                event.getDrops().add(new ItemStack(Material.DIAMOND, 1));
                verify(player).sendMessage("Killed a zombie!");
            }
        }
    }
//not a test
@EventHandler
    public void onMobDeath(EntityDeathEvent event){
        if(event.getEntity().getKiller() instanceof Player){
            if(event.getEntity().getType() == EntityType.BLAZE){
                event.getDrops().add(new ItemStack(Material.BLAZE_ROD, 1));
            }
        }
    }
