package floey.bloodborne.gameObjs.items.weapons;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public abstract class ItemBloodborneWeapon extends SwordItem {

    public ItemBloodborneWeapon(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    protected abstract Item setTransformation();

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        if (!worldIn.isRemote) {
            playerIn.setHeldItem(handIn, new ItemStack(setTransformation()));
            playerIn.getCooldownTracker().setCooldown(setTransformation(), 20);
            worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }
        return ActionResult.resultPass(playerIn.getHeldItem(handIn));
    }
}