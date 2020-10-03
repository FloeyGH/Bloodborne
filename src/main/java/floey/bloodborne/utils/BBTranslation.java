package floey.bloodborne.utils;

public enum BBTranslation {

    SHIFT_INFORMATION("shift.information"),

    //Armor
    TOOLTIP_HUNTER_ARMOR("item.tooltip.hunter_armor"),

    //Items
    TOOLTIP_ITEM_BITE_DOWN(""),
    TOOLTIP_ITEM_ANTIDOTE_POWDER("");

    //Weapons

    //Tools

    //Blocks

    private String lang;

    BBTranslation(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}