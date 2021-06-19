package com.zook.devtechgregicality.render;

import com.zook.devtechlib.api.render.OverlayRenderer;
import crafttweaker.annotations.ZenRegister;
import gregicadditions.client.ClientHandler;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenExpansion("mods.devtech.Overlays")
@ZenRegister
public class GAConstantOverlay {
    @ZenProperty public static final OverlayRenderer NAQADAH_OVERLAY = new OverlayRenderer(ClientHandler.NAQADAH_OVERLAY);
    @ZenProperty public static final OverlayRenderer ROCKET_OVERLAY = new OverlayRenderer(ClientHandler.ROCKET_OVERLAY);
    @ZenProperty public static final OverlayRenderer REPLICATOR_OVERLAY = new OverlayRenderer(ClientHandler.REPLICATOR_OVERLAY);
    @ZenProperty public static final OverlayRenderer MASS_FAB_OVERLAY = new OverlayRenderer(ClientHandler.MASS_FAB_OVERLAY);
    @ZenProperty public static final OverlayRenderer FUSION_REACTOR_OVERLAY = new OverlayRenderer(ClientHandler.FUSION_REACTOR_OVERLAY);
    @ZenProperty public static final OverlayRenderer BEE_ATTRACTOR = new OverlayRenderer(ClientHandler.BEE_ATTRACTOR);
    @ZenProperty public static final OverlayRenderer FREEZER_OVERLAY = new OverlayRenderer(ClientHandler.FREEZER_OVERLAY);
    @ZenProperty public static final OverlayRenderer IMPLOSION_OVERLAY = new OverlayRenderer(ClientHandler.IMPLOSION_OVERLAY);
    @ZenProperty public static final OverlayRenderer ORGANIC_REPLICATOR_OVERLAY = new OverlayRenderer(ClientHandler.ORGANIC_REPLICATOR_OVERLAY);
    @ZenProperty public static final OverlayRenderer PULVERIZER_OVERLAY = new OverlayRenderer(ClientHandler.PULVERIZER_OVERLAY);
    @ZenProperty public static final OverlayRenderer PRINTER_OVERLAY = new OverlayRenderer(ClientHandler.PRINTER_OVERLAY);
    @ZenProperty public static final OverlayRenderer QUBIT_COMPUTER_OVERLAY = new OverlayRenderer(ClientHandler.QUBIT_COMPUTER_OVERLAY);
    @ZenProperty public static final OverlayRenderer NUCLEAR_REACTOR_OVERLAY = new OverlayRenderer(ClientHandler.NUCLEAR_REACTOR_OVERLAY);
    @ZenProperty public static final OverlayRenderer ADVANCED_ALLOY_OVERLAY = new OverlayRenderer(ClientHandler.ADVANCED_ALLOY_OVERLAY);
}
