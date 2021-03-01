package floey.bloodborne.gameObjs;

import floey.bloodborne.Bloodborne;
import floey.bloodborne.gameObjs.items.ItemBloodStoneShard;
import floey.bloodborne.gameObjs.items.ItemColdblood;
import floey.bloodborne.gameObjs.items.ItemGreatOnesWisdom;
import floey.bloodborne.gameObjs.items.ItemMadMansKnowledge;
import floey.bloodborne.gameObjs.items.consumables.ItemBloodVial;
import net.minecraft.block.Block;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Bloodborne.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ObjHandler {

    public static final CreativeTab CREATIVE_TAB = new CreativeTab("Creative_Tab");

    //Upgrade Material
    public static final ItemColdblood ITEM_COLDBLOOD_DEW = new ItemColdblood(propertiesBase());
    public static final ItemColdblood ITEM_COLDBLOOD_THICK = new ItemColdblood(propertiesBase());
    public static final ItemColdblood ITEM_COLDBLOOD_FRENZIED = new ItemColdblood(propertiesBase());
    public static final ItemColdblood ITEM_COLDBLOOD_KIN = new ItemColdblood(propertiesBase());

    public static final ItemBloodStoneShard ITEM_BLOOD_STONE_SHARD = new ItemBloodStoneShard(propertiesBase());
    public static final ItemBloodStoneShard ITEM_TWIN_BLOOD_STONE_SHARD = new ItemBloodStoneShard(propertiesBase());
    public static final ItemBloodStoneShard ITEM_BLOOD_STONE_CHUNK = new ItemBloodStoneShard(propertiesBase());
    public static final ItemBloodStoneShard ITEM_BLOOD_ROCK = new ItemBloodStoneShard(propertiesBase());

    public static final ItemMadMansKnowledge ITEM_MAD_MANS_KNOWLEDGE = new ItemMadMansKnowledge(propertiesNoStack().maxDamage(256));
    public static final ItemGreatOnesWisdom ITEM_GREAT_ONES_WISDOM = new ItemGreatOnesWisdom(propertiesNoStack().maxDamage(64));


    //Consumables Items
    public static final ItemBloodVial ITEM_BLOOD_VIAL = new ItemBloodVial(propertiesBase().food(new Food.Builder().setAlwaysEdible().build()));

    @SubscribeEvent
    public static void itemRegister(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(ITEM_MAD_MANS_KNOWLEDGE.setRegistryName("item_mad_mans_knowledge"));
        registry.register(ITEM_GREAT_ONES_WISDOM.setRegistryName("item_great_ones_wisdom"));
        registry.register(ITEM_BLOOD_STONE_SHARD.setRegistryName("item_blood_stone_shard"));
        registry.register(ITEM_TWIN_BLOOD_STONE_SHARD.setRegistryName("item_twin_blood_stone_shard"));
        registry.register(ITEM_BLOOD_STONE_CHUNK.setRegistryName("item_blood_stone_chunk"));
        registry.register(ITEM_BLOOD_ROCK.setRegistryName("item_blood_rock"));
        registry.register(ITEM_COLDBLOOD_DEW.setRegistryName("item_coldblood_dew"));
        registry.register(ITEM_COLDBLOOD_THICK.setRegistryName("item_coldblood_thick"));
        registry.register(ITEM_COLDBLOOD_FRENZIED.setRegistryName("item_coldblood_frenzied"));
        registry.register(ITEM_COLDBLOOD_KIN.setRegistryName("item_coldblood_kin"));
        registry.register(ITEM_BLOOD_VIAL.setRegistryName("item_blood_vial"));
    }

    @SubscribeEvent
    public static void blockRegister(RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();

    }

    private static Item.Properties propertiesBase() {
        return new Item.Properties().group(CREATIVE_TAB);
    }

    private static Item.Properties propertiesNoStack() {
        return new Item.Properties().group(CREATIVE_TAB).maxStackSize(1);
    }
}