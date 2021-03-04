package floey.bloodborne.utils.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class BeasthoodEffect extends Effect {

    private double armorReduction = 0.1;
    private double armorToughnessReduction = 0.5;
    private double damageIncrease = 1.1;

    public BeasthoodEffect() {
        super(EffectType.NEUTRAL, 7033103);
    }

    @Override
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        this.addAttributesModifier(Attributes.ATTACK_DAMAGE, "535ad0a2-7c52-11eb-9439-0242ac130002", damageIncrease, AttributeModifier.Operation.MULTIPLY_BASE);
        this.addAttributesModifier(Attributes.ARMOR, "f8cddb4a-7c54-11eb-9439-0242ac130002", -armorReduction, AttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributesModifier(Attributes.ARMOR_TOUGHNESS, "512c1f38-7c5d-11eb-9439-0242ac130002", -armorToughnessReduction, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }
}