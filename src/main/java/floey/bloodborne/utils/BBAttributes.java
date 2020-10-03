package floey.bloodborne.utils;

import net.minecraft.entity.ai.attributes.AttributeModifier;

import java.util.UUID;

public class BBAttributes {

    //Armor
    public static final UUID HUNTER_SPEED_BOOST_UUID = UUID.fromString("19e1a364-3d95-4e22-af5a-9a20a614656a");
    public static final UUID HUNTER_DAMAGE_BOOST_UUID = UUID.fromString("f944ab75-c407-4053-98c0-74d038e995dd");

    public static AttributeModifier HUNTER_SPEED_BOOST = new AttributeModifier(HUNTER_SPEED_BOOST_UUID, "hunter_speed_boost", 0.2D, AttributeModifier.Operation.ADDITION);
    public static AttributeModifier HUNTER_DAMAGE_BOOST = new AttributeModifier(HUNTER_DAMAGE_BOOST_UUID, "hunter_damage_boost", 5D, AttributeModifier.Operation.ADDITION);

}