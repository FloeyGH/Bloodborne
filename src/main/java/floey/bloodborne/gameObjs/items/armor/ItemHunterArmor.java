package floey.bloodborne.gameObjs.items.armor;

import floey.bloodborne.utils.BBTranslation;
import floey.bloodborne.utils.FullArmor;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

import static floey.bloodborne.utils.BBEffects.addEffect;

public class ItemHunterArmor extends ArmorItem {

    public ItemHunterArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
        super(materialIn, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        FullArmor fullArmor = new FullArmor();

        if (!world.isRemote) {
            if (fullArmor.fullHunterArmor(player)) {
                addEffect(player, Effects.JUMP_BOOST, 1);
            }
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (Screen.func_231173_s_()) {
            tooltip.add(ITextComponent.func_244388_a(I18n.format(BBTranslation.TOOLTIP_HUNTER_ARMOR.getLang())));
        } else
            tooltip.add(ITextComponent.func_244388_a(I18n.format(BBTranslation.SHIFT_INFORMATION.getLang())));
    }
}