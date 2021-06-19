package com.zook.devtechgregicality.machines;

import com.zook.devtechlib.DevTechLib;
import com.zook.devtechlib.api.render.OverlayRenderer;
import crafttweaker.annotations.ZenRegister;
import gregicadditions.machines.MetaTileEntityDrum;
import gregicadditions.machines.TileEntityCrate;
import gregicadditions.machines.overrides.GASimpleMachineMetaTileEntity;
import gregicadditions.machines.overrides.SimpleGeneratorWithLossMetaTileEntity;
import gregtech.api.GregTechAPI;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.machines.FuelRecipeMap;
import gregtech.api.unification.material.type.SolidMaterial;
import net.minecraft.util.ResourceLocation;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethodStatic;

@ZenExpansion("mods.devtech.Machine")
@ZenRegister
public class GAMachines {
    @ZenMethodStatic
    public static void createGASimpleMachine(int id, String nameID, RecipeMap<?> recipeMap, OverlayRenderer renderer, int tier) {
        GregTechAPI.registerMetaTileEntity(id, new GASimpleMachineMetaTileEntity(new ResourceLocation(DevTechLib.MODID, nameID), recipeMap, renderer.getInternal(), tier));
    }

    @ZenMethodStatic
    public static void createGASimpleGenerator(int id, String nameID, FuelRecipeMap fuelRecipeMap, OverlayRenderer renderer, int tier, int efficiency) {
        GregTechAPI.registerMetaTileEntity(id, new SimpleGeneratorWithLossMetaTileEntity(new ResourceLocation(DevTechLib.MODID, nameID), fuelRecipeMap, renderer.getInternal(), tier, efficiency));
    }

    @ZenMethodStatic
    public static void createDrum(int id, String nameID, SolidMaterial material, int tankSize) {
        GregTechAPI.registerMetaTileEntity(id, new MetaTileEntityDrum(new ResourceLocation(DevTechLib.MODID, nameID), material, tankSize));
    }

    @ZenMethodStatic
    public static void createCrate(int id, String nameID, SolidMaterial material, int inventorySize) {
        GregTechAPI.registerMetaTileEntity(id, new TileEntityCrate(new ResourceLocation(DevTechLib.MODID, nameID), material, inventorySize));
    }
}
