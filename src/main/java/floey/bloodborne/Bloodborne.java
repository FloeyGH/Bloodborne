package floey.bloodborne;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Bloodborne.MODID)
public class Bloodborne {

    public static final String MODID = "bloodborne";

    public Bloodborne() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public void commonSetup(FMLCommonSetupEvent event) {

    }
}