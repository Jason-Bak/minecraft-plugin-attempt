import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin; 


//test
@EventHandler
    public void onMobDeath(EntityDeathEvent event) {
        if(event.getEntity().getKiller() instanceof Player) {
            if(event.getEntity().getType() == EntityType.ZOMBIE){
                event.getDrops().add(new ItemStack(Material.DIAMOND, 1));
                verify(player).sendMessage("Have a random " + Material.TORCH);
            }
        }
    }

@EventHandler
    public void onMobDeath(EntityDeathEvent event){
        if(event.getEntity().getKiller() instanceof Player){
            if(event.getEntity().getType() == EntityType.BLAZE){
                event.getDrops().add(new ItemStack(Material.BLAZE_ROD, 1));
            }
        }
    }
