package floey.bloodborne.gameObjs.items.weapons;

import floey.bloodborne.gameObjs.ObjHandler;
import floey.bloodborne.utils.BloodborneTranslation;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSawCleaverTransformed extends ItemBloodborneWeapon {

    public ItemSawCleaverTransformed(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    protected Item setTransformation() {
        return ObjHandler.ITEM_SAW_CLEAVER;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent(BloodborneTranslation.TOOLTIP_ITEM_SAW_CLEAVER_TRANSFORMED.getLang()).mergeStyle(TextFormatting.DARK_GRAY));
        } else
            tooltip.add(new TranslationTextComponent(BloodborneTranslation.SHIFT_INFORMATION.getLang()).mergeStyle(TextFormatting.DARK_GRAY));
    }
}