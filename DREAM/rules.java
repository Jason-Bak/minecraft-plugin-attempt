 @EventHandler
    public void onMobDeath(EntityDeathEvent event){
        if(event.getEntity().getKiller() instanceof Player){
            if(event.getEntity().getType() == EntityType.BLAZE){
                event.getDrops().add(new ItemStack(Material.BLAZE_ROD, 1));
            }
        }
    }