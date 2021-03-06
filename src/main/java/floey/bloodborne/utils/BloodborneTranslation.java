package floey.bloodborne.utils;

public enum BloodborneTranslation {

    SHIFT_INFORMATION("shift.information"),

    //Items
    TOOLTIP_ITEM_BLOOD_VIAL("tooltip.item.blood_vial"),
    TOOLTIP_ITEM_IOSEFKAS_BLOOD_VIAL("tooltip.item.iosefkas_blood_vial"),
    TOOLTIP_ITEM_BEAST_BLOOD_PELLET("tooltip.item.beast_blood_pellet"),
    TOOLTIP_ITEM_BOLD_HUNTERS_MARK("tooltip.item.bold_hunters_mark"),
    TOOLTIP_ITEM_BLOOD_STONE_SHARD("tooltip.item.blood_stone_shard"),
    TOOLTIP_ITEM_COLDBLOOD("tooltip.item.coldblood"),
    TOOLTIP_ITEM_GREAT_ONES_WISDOM("tooltip.item.great_ones_wisdom"),
    TOOLTIP_ITEM_MAD_MANS_KNOWLEDGE("tooltip.item.mad_mans_knowledge");

    private String lang;

    BloodborneTranslation(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}