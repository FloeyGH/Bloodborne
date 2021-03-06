package floey.bloodborne.gameObjs;

import floey.bloodborne.Bloodborne;
import floey.bloodborne.gameObjs.items.*;
import floey.bloodborne.gameObjs.items.consumables.ItemBeastBloodPellet;
import floey.bloodborne.gameObjs.items.consumables.ItemBloodVial;
import floey.bloodborne.gameObjs.items.consumables.ItemIosefkasBloodVial;
import floey.bloodborne.gameObjs.items.weapons.*;
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

    //Material
    public static final ItemMadMansKnowledge ITEM_MAD_MANS_KNOWLEDGE = new ItemMadMansKnowledge(properties().maxDamage(256));
    public static final ItemGreatOnesWisdom ITEM_GREAT_ONES_WISDOM = new ItemGreatOnesWisdom(properties().maxDamage(64));

    public static final ItemColdblood ITEM_COLDBLOOD_DEW = new ItemColdblood(properties());
    public static final ItemColdblood ITEM_COLDBLOOD_THICK = new ItemColdblood(properties());
    public static final ItemColdblood ITEM_COLDBLOOD_FRENZIED = new ItemColdblood(properties());
    public static final ItemColdblood ITEM_COLDBLOOD_KIN = new ItemColdblood(properties());

    public static final ItemBloodStoneShard ITEM_BLOOD_STONE_SHARD = new ItemBloodStoneShard(properties());
    public static final ItemBloodStoneShard ITEM_TWIN_BLOOD_STONE_SHARD = new ItemBloodStoneShard(properties());
    public static final ItemBloodStoneShard ITEM_BLOOD_STONE_CHUNK = new ItemBloodStoneShard(properties());
    public static final ItemBloodStoneShard ITEM_BLOOD_ROCK = new ItemBloodStoneShard(properties());

    //Consumables
    public static final ItemBloodVial ITEM_BLOOD_VIAL = new ItemBloodVial(properties());
    public static final ItemIosefkasBloodVial ITEM_IOSEFKAS_BLOOD_VIAL = new ItemIosefkasBloodVial(properties());
    public static final ItemBeastBloodPellet ITEM_BEAST_BLOOD_PELLET = new ItemBeastBloodPellet(properties().food(new Food.Builder().setAlwaysEdible().build()));
    public static final ItemBoldHuntersMark ITEM_BOLD_HUNTERS_MARK = new ItemBoldHuntersMark(properties());

    //Weapons
    public static final ItemSawCleaver ITEM_SAW_CLEAVER = new ItemSawCleaver(BloodborneItemTier.SAWCLEAVER, 1, -2, properties());
    public static final ItemSawCleaverTransformed ITEM_SAW_CLEAVER_TRANSFORMED = new ItemSawCleaverTransformed(BloodborneItemTier.SAWCLEAVER, 1, -2, properties());
    public static final ItemHunterAxe ITEM_HUNTER_AXE = new ItemHunterAxe(BloodborneItemTier.SAWCLEAVER, 1, -2, properties());
    public static final ItemHunterAxeTransformed ITEM_HUNTER_AXE_TRANSFORMED = new ItemHunterAxeTransformed(BloodborneItemTier.SAWCLEAVER, 1, -2, properties());

    @SubscribeEvent
    public static void itemRegister(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(ITEM_MAD_MANS_KNOWLEDGE.setRegistryName("item_mad_mans_knowledge"));
        registry.register(ITEM_GREAT_ONES_WISDOM.setRegistryName("item_great_ones_wisdom"));
        registry.register(ITEM_COLDBLOOD_DEW.setRegistryName("item_coldblood_dew"));
        registry.register(ITEM_COLDBLOOD_THICK.setRegistryName("item_coldblood_thick"));
        registry.register(ITEM_COLDBLOOD_FRENZIED.setRegistryName("item_coldblood_frenzied"));
        registry.register(ITEM_COLDBLOOD_KIN.setRegistryName("item_coldblood_kin"));
        registry.register(ITEM_BLOOD_STONE_SHARD.setRegistryName("item_blood_stone_shard"));
        registry.register(ITEM_TWIN_BLOOD_STONE_SHARD.setRegistryName("item_twin_blood_stone_shard"));
        registry.register(ITEM_BLOOD_STONE_CHUNK.setRegistryName("item_blood_stone_chunk"));
        registry.register(ITEM_BLOOD_ROCK.setRegistryName("item_blood_rock"));

        registry.register(ITEM_BLOOD_VIAL.setRegistryName("item_blood_vial"));
        registry.register(ITEM_IOSEFKAS_BLOOD_VIAL.setRegistryName("item_iosefkas_blood_vial"));
        registry.register(ITEM_BEAST_BLOOD_PELLET.setRegistryName("item_beast_blood_pellet"));
        registry.register(ITEM_BOLD_HUNTERS_MARK.setRegistryName("item_bold_hunters_mark"));

        registry.register(ITEM_SAW_CLEAVER.setRegistryName("item_saw_cleaver"));
        registry.register(ITEM_SAW_CLEAVER_TRANSFORMED.setRegistryName("item_saw_cleaver_transformed"));
        registry.register(ITEM_HUNTER_AXE.setRegistryName("item_hunter_axe"));
        registry.register(ITEM_HUNTER_AXE_TRANSFORMED.setRegistryName("item_hunter_axe_transformed"));
    }

    @SubscribeEvent
    public static void blockRegister(RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();

    }

    private static Item.Properties properties() {
        return new Item.Properties().group(CREATIVE_TAB);
    }
}