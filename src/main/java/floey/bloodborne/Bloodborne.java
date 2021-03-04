package floey.bloodborne;

import floey.bloodborne.utils.BBEffects;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Bloodborne.MODID)
public class Bloodborne {

    public static final String MODID = "bloodborne";

    public Bloodborne() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        BBEffects.EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    @SubscribeEvent
    public void commonSetup(FMLCommonSetupEvent event) {

    }
}