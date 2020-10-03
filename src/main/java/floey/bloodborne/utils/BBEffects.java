package floey.bloodborne.utils;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;

public class BBEffects {

    public static void addEffect(LivingEntity living, Effect effect, int amplifier) {
        EffectInstance effectInstance = living.getActivePotionEffect(effect);
        if (effectInstance == null || (effectInstance.getAmplifier() == 0 && effectInstance.getDuration() == 1)) {
            EffectInstance newEffect = new EffectInstance(effect, 100, amplifier, true, true);
            living.addPotionEffect(newEffect);
        }
    }
}