package floey.bloodborne.gameObjs;

import floey.bloodborne.Bloodborne;
import floey.bloodborne.gameObjs.items.ItemColdblood;
import floey.bloodborne.gameObjs.items.ItemGreatOnesWisdom;
import floey.bloodborne.gameObjs.items.ItemMadMansKnowledge;
import floey.bloodborne.gameObjs.items.armor.BBArmorMaterial;
import floey.bloodborne.gameObjs.items.armor.ItemHunterArmor;
import floey.bloodborne.gameObjs.items.consumables.ItemAntidotePowder;
import floey.bloodborne.gameObjs.items.consumables.ItemBiteDown;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Bloodborne.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ObjHandler {

    public static final CreativeTab CREATIVE_TAB = new CreativeTab("Creative_Tab");

    //Items
    public static final ItemMadMansKnowledge ITEM_MAD_MANS_KNOWLEDGE = new ItemMadMansKnowledge(properties());
    public static final ItemGreatOnesWisdom ITEM_GREAT_ONES_WISDOM = new ItemGreatOnesWisdom(properties());
    
    public static final ItemColdblood ITEM_COLDBLOOD_DEW = new ItemColdblood(properties());
    public static final ItemColdblood ITEM_COLDBLOOD_THICK = new ItemColdblood(properties());
    public static final ItemColdblood ITEM_COLDBLOOD_FRENZIED = new ItemColdblood(properties());
    public static final ItemColdblood ITEM_COLDBLOOD_KIN = new ItemColdblood(properties());

    public static final ItemBiteDown ITEM_BITE_DOWN = new ItemBiteDown(properties().food(new Food.Builder().setAlwaysEdible().build()));
    public static final ItemAntidotePowder ITEM_ANTIDOTE_POWDER = new ItemAntidotePowder(properties().food(new Food.Builder().setAlwaysEdible().build()));

    //Armor
    public static final ItemHunterArmor ITEM_HUNTER_ARMOR_HEAD = new ItemHunterArmor(BBArmorMaterial.HUNTER, EquipmentSlotType.HEAD, new Item.Properties().group(CREATIVE_TAB).func_234689_a_());
    public static final ItemHunterArmor ITEM_HUNTER_ARMOR_CHEST = new ItemHunterArmor(BBArmorMaterial.HUNTER, EquipmentSlotType.CHEST, new Item.Properties().group(CREATIVE_TAB).func_234689_a_());
    public static final ItemHunterArmor ITEM_HUNTER_ARMOR_LEGS = new ItemHunterArmor(BBArmorMaterial.HUNTER, EquipmentSlotType.LEGS, new Item.Properties().group(CREATIVE_TAB).func_234689_a_());
    public static final ItemHunterArmor ITEM_HUNTER_ARMOR_FEET = new ItemHunterArmor(BBArmorMaterial.HUNTER, EquipmentSlotType.FEET, new Item.Properties().group(CREATIVE_TAB).func_234689_a_());

    @SubscribeEvent
    public static void itemRegister(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(ITEM_MAD_MANS_KNOWLEDGE.setRegistryName("item_mad_mans_knowledge"));
        registry.register(ITEM_GREAT_ONES_WISDOM.setRegistryName("item_great_ones_wisdom"));
        registry.register(ITEM_COLDBLOOD_DEW.setRegistryName("item_coldblood_dew"));
        registry.register(ITEM_COLDBLOOD_THICK.setRegistryName("item_coldblood_thick"));
        registry.register(ITEM_COLDBLOOD_FRENZIED.setRegistryName("item_coldblood_frenzied"));
        registry.register(ITEM_COLDBLOOD_KIN.setRegistryName("item_coldblood_kin"));
        registry.register(ITEM_BITE_DOWN.setRegistryName("item_bite_down"));
        registry.register(ITEM_ANTIDOTE_POWDER.setRegistryName("item_antidote_powder"));

        registry.register(ITEM_HUNTER_ARMOR_HEAD.setRegistryName("item_hunter_armor_head"));
        registry.register(ITEM_HUNTER_ARMOR_CHEST.setRegistryName("item_hunter_armor_chest"));
        registry.register(ITEM_HUNTER_ARMOR_LEGS.setRegistryName("item_hunter_armor_legs"));
        registry.register(ITEM_HUNTER_ARMOR_FEET.setRegistryName("item_hunter_armor_feet"));
    }

    @SubscribeEvent
    public static void blockRegister(RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();

    }

    private static Item.Properties properties() {
        return new Item.Properties().group(CREATIVE_TAB);
    }
}