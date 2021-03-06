package floey.bloodborne.gameObjs.items;

import floey.bloodborne.utils.BloodborneTranslation;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBoldHuntersMark extends Item {

    public ItemBoldHuntersMark(Properties properties) {
        super(properties);
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
        PlayerEntity playerEntity = (PlayerEntity) entityLiving;
        int i = this.getUseDuration(stack) - timeLeft;

        //WIP
        /*if (!worldIn.isRemote) {
            if (i >= 25) {
                BlockPos blockPos = playerEntity.getBedPosition().get();
                blockPos = playerEntity.getBedPosition().get();
                playerEntity.teleportKeepLoaded(blockPos.getX(), blockPos.getY(), blockPos.getZ());
            }

            if (playerEntity != null) {
                playerEntity.addStat(Stats.ITEM_USED.get(this));
                if (!playerEntity.abilities.isCreativeMode) {
                    stack.shrink(1);
                }
            }
        }*/
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        playerIn.setActiveHand(handIn);
        return ActionResult.resultConsume(itemStack);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (Screen.hasShiftDown()) {
            tooltip.add(ITextComponent.getTextComponentOrEmpty(I18n.format(BloodborneTranslation.TOOLTIP_ITEM_BOLD_HUNTERS_MARK.getLang())));
        } else
            tooltip.add(ITextComponent.getTextComponentOrEmpty(I18n.format(BloodborneTranslation.SHIFT_INFORMATION.getLang())));
    }
}