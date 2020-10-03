package floey.bloodborne.handler;

import floey.bloodborne.Bloodborne;
import floey.bloodborne.utils.BBAttributes;
import floey.bloodborne.utils.FullArmor;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bloodborne.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ArmorEventHandler {

    @SubscribeEvent
    public static void playerTick(TickEvent.PlayerTickEvent event) {
        FullArmor fullArmor = new FullArmor();

        if (!event.player.world.isRemote) {
            if (event.player instanceof PlayerEntity) {

                //Hunter Armor
                if (fullArmor.fullHunterArmor(event.player) && event.player.getAttribute(Attributes.field_233821_d_).getModifier(BBAttributes.HUNTER_SPEED_BOOST_UUID) == null) {
                    event.player.getAttribute(Attributes.field_233821_d_).func_233767_b_(BBAttributes.HUNTER_SPEED_BOOST);
                }
                if (!fullArmor.fullHunterArmor(event.player) && event.player.getAttribute(Attributes.field_233821_d_).getModifier(BBAttributes.HUNTER_SPEED_BOOST_UUID) != null) {
                    event.player.getAttribute(Attributes.field_233821_d_).removeModifier(BBAttributes.HUNTER_SPEED_BOOST);
                }

                if (fullArmor.fullHunterArmor(event.player) && event.player.getAttribute(Attributes.field_233823_f_).getModifier(BBAttributes.HUNTER_DAMAGE_BOOST_UUID) == null) {
                    event.player.getAttribute(Attributes.field_233823_f_).func_233767_b_(BBAttributes.HUNTER_DAMAGE_BOOST);
                }
                if (!fullArmor.fullHunterArmor(event.player) && event.player.getAttribute(Attributes.field_233823_f_).getModifier(BBAttributes.HUNTER_DAMAGE_BOOST_UUID) != null) {
                    event.player.getAttribute(Attributes.field_233823_f_).removeModifier(BBAttributes.HUNTER_DAMAGE_BOOST_UUID);
                }
            }
        }
    }
}