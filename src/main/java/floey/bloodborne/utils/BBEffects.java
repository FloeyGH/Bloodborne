package floey.bloodborne.utils;

import floey.bloodborne.Bloodborne;
import floey.bloodborne.utils.effects.BeasthoodEffect;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Bloodborne.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BBEffects {

    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Bloodborne.MODID);

    public static final RegistryObject<Effect> BEASTHOOD = EFFECTS.register("beasthood", BeasthoodEffect::new);
}