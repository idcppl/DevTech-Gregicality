package com.zook.devtechgregicality.recipes;

import com.zook.devtechlib.api.recipes.crafttweaker.CTTextureArea;
import crafttweaker.annotations.ZenRegister;
import gregicadditions.gui.GAGuiTextures;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenExpansion("mods.devtech.GUITextures")
@ZenRegister
public class GAConstantGUITexture {
    @ZenProperty public static final CTTextureArea PROGRESS_BAR_CIRCUIT_ASSEMBLER = new CTTextureArea(GAGuiTextures.PROGRESS_BAR_CIRCUIT_ASSEMBLER);
    @ZenProperty public static final CTTextureArea PROGRESS_BAR_DISASSEMBLER = new CTTextureArea(GAGuiTextures.PROGRESS_BAR_DISASSEMBLER);
    @ZenProperty public static final CTTextureArea DISASSEMBLER_IN_OVERLAY = new CTTextureArea(GAGuiTextures.DISASSEMBLER_IN_OVERLAY);
}
