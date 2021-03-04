package floey.bloodborne.gameObjs.items.consumables;

import floey.bloodborne.utils.BBEffects;
import floey.bloodborne.utils.BBTranslation;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBeastBloodPellet extends Item {

    public ItemBeastBloodPellet(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);

        if (!worldIn.isRemote) {
            entityLiving.addPotionEffect(new EffectInstance(BBEffects.BEASTHOOD.get(), 900, 0));
        }
        return itemstack;
    }

    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_EAT;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 32;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (Screen.hasShiftDown()) {
            tooltip.add(ITextComponent.getTextComponentOrEmpty(I18n.format(BBTranslation.TOOLTIP_ITEM_BEAST_BLOOD_PELLET.getLang())));
        } else
            tooltip.add(ITextComponent.getTextComponentOrEmpty(I18n.format(BBTranslation.SHIFT_INFORMATION.getLang())));
    }
}