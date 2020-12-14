import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin; 
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


//test just to make sure it works
@EventHandler
    public void onZombieDeath(EntityDeathEvent event) {
        if(event.getEntity().getKiller() instanceof Player) {
            if(event.getEntity().getType() == EntityType.ZOMBIE){
                verify(player).sendMessage("Killed a zombie!");
            }
        }
    }
//not a test
@EventHandler
    public void onBlazeDeath(EntityDeathEvent event){
        Entity e = event.getEntity();
        if (e instanceof Blaze) {
            double chance = random.nextDouble();
            if (chance <= 0.75) { //increase chance of drop from 0.50 >> 0.75
                event.getDrops().add(new ItemStack(Material.BLAZE_ROD, 1));
            }
        }
    }
//not sure if this is correct
