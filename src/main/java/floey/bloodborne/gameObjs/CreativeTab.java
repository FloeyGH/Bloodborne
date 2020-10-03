package floey.bloodborne.gameObjs;

import floey.bloodborne.Bloodborne;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CreativeTab extends ItemGroup {

    public CreativeTab(String name) {
        super(Bloodborne.MODID + "." + name);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.ITEM_FRAME);
    }
}
