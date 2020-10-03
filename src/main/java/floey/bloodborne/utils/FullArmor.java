package floey.bloodborne.utils;

import floey.bloodborne.gameObjs.ObjHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class FullArmor {

    public boolean fullHunterArmor(PlayerEntity player) {
        return player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == ObjHandler.ITEM_HUNTER_ARMOR_HEAD.getItem() && player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == ObjHandler.ITEM_HUNTER_ARMOR_CHEST.getItem() && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == ObjHandler.ITEM_HUNTER_ARMOR_LEGS.getItem() && player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == ObjHandler.ITEM_HUNTER_ARMOR_FEET.getItem();
    }
}