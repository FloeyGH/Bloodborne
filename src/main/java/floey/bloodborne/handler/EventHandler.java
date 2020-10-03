package floey.bloodborne.handler;

import floey.bloodborne.Bloodborne;
import floey.bloodborne.utils.FullArmor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bloodborne.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {


    @SubscribeEvent
    public static void livingFall(LivingFallEvent event) {
        FullArmor fullArmor = new FullArmor();

        if (event.getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntity();
            if (fullArmor.fullHunterArmor(player)) {
                event.setDistance(0F);
            }
        }
    }
}