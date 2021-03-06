package floey.bloodborne.events;

import floey.bloodborne.Bloodborne;
import floey.bloodborne.utils.BloodborneEffects;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bloodborne.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BeasthoodEvent {

    @SubscribeEvent
    public static void attackEntityEvent(AttackEntityEvent event) {
        switch(event.getEntityLiving().getActivePotionEffect(BloodborneEffects.BEASTHOOD.get()).getEffectInstance().getAmplifier()) {
            case 0:
                event.getEntityLiving().addPotionEffect(new EffectInstance(BloodborneEffects.BEASTHOOD.get(), 900, 1));
                break;
            case 1:
                event.getEntityLiving().addPotionEffect(new EffectInstance(BloodborneEffects.BEASTHOOD.get(), 900, 2));
                break;
            case 2:
                event.getEntityLiving().addPotionEffect(new EffectInstance(BloodborneEffects.BEASTHOOD.get(), 900, 3));
                break;
            case 3:
                event.getEntityLiving().addPotionEffect(new EffectInstance(BloodborneEffects.BEASTHOOD.get(), 900, 4));
                break;
            case 4:
                event.getEntityLiving().addPotionEffect(new EffectInstance(BloodborneEffects.BEASTHOOD.get(), 900, 5));
                break;
        }
    }
}