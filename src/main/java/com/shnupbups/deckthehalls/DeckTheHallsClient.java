package com.shnupbups.deckthehalls;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

import net.minecraft.client.render.RenderLayer;

public class DeckTheHallsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.GARLAND_WITH_LIGHTS_1, ModBlocks.GARLAND_WITH_LIGHTS_2, ModBlocks.GARLAND_WITH_LIGHTS_3, ModBlocks.GARLAND_WITH_LIGHTS_AND_BELLS_1, ModBlocks.GARLAND_WITH_LIGHTS_AND_BELLS_2, ModBlocks.GARLAND_WITH_LIGHTS_AND_BELLS_3, ModBlocks.GARLAND_WITH_LIGHTS_AND_MISTLETOE_1, ModBlocks.GARLAND_WITH_LIGHTS_AND_MISTLETOE_2, ModBlocks.GARLAND_WITH_LIGHTS_AND_MISTLETOE_3);
	}
}
