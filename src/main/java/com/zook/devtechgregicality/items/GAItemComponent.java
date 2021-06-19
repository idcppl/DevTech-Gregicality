package com.zook.devtechgregicality.items;

import com.zook.devtechlib.api.items.crafttweaker.CTItemComponent;
import crafttweaker.annotations.ZenRegister;
import gregicadditions.capabilities.GAElectricStats;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethodStatic;

@ZenExpansion("mods.devtech.ItemComponent")
@ZenRegister
public class GAItemComponent {
    @ZenMethodStatic
    public static CTItemComponent GAElectricStats(long maxCharge, int tier) {
        return new CTItemComponent(new GAElectricStats(maxCharge, tier, true, true));
    }

    @ZenMethodStatic
    public static CTItemComponent GAElectricStats(long maxCharge, int tier, boolean rechargeable) {
        return new CTItemComponent(new GAElectricStats(maxCharge, tier, rechargeable, true));
    }

    @ZenMethodStatic
    public static CTItemComponent GAElectricStats(long maxCharge, int tier, boolean rechargeable, boolean dischrgeable) {
        return new CTItemComponent(new GAElectricStats(maxCharge, tier, rechargeable, dischrgeable));
    }
}
