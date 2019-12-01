package com.shnupbups.deckthehalls;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import java.util.function.Function;

public class ModBlocks {
	public static final Block GARLAND = register("garland", new GarlandBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).noCollision().build()));
	public static final Block GARLAND_WITH_LIGHTS_1 = register("garland_with_lights_1", new GarlandBlock(FabricBlockSettings.copy(GARLAND).lightLevel(1).build()));
	public static final Block GARLAND_WITH_LIGHTS_2 = register("garland_with_lights_2", new GarlandBlock(FabricBlockSettings.copy(GARLAND_WITH_LIGHTS_1).build()));
	public static final Block GARLAND_WITH_LIGHTS_3 = register("garland_with_lights_3", new GarlandBlock(FabricBlockSettings.copy(GARLAND_WITH_LIGHTS_1).build()));
	public static final Block GARLAND_WITH_LIGHTS_AND_BELLS_1 = register("garland_with_lights_and_bells_1", new GarlandBlock(FabricBlockSettings.copy(GARLAND_WITH_LIGHTS_1).build()));
	public static final Block GARLAND_WITH_LIGHTS_AND_BELLS_2 = register("garland_with_lights_and_bells_2", new GarlandBlock(FabricBlockSettings.copy(GARLAND_WITH_LIGHTS_1).build()));
	public static final Block GARLAND_WITH_LIGHTS_AND_BELLS_3 = register("garland_with_lights_and_bells_3", new GarlandBlock(FabricBlockSettings.copy(GARLAND_WITH_LIGHTS_1).build()));
	public static final Block GARLAND_WITH_LIGHTS_AND_MISTLETOE_1 = register("garland_with_lights_and_mistletoe_1", new GarlandBlock(FabricBlockSettings.copy(GARLAND_WITH_LIGHTS_1).build()));
	public static final Block GARLAND_WITH_LIGHTS_AND_MISTLETOE_2 = register("garland_with_lights_and_mistletoe_2", new GarlandBlock(FabricBlockSettings.copy(GARLAND_WITH_LIGHTS_1).build()));
	public static final Block GARLAND_WITH_LIGHTS_AND_MISTLETOE_3 = register("garland_with_lights_and_mistletoe_3", new GarlandBlock(FabricBlockSettings.copy(GARLAND_WITH_LIGHTS_1).build()));
	
	public static void init() {
	
	}
	
	static <T extends Block> T register(String name, T block, Item.Settings settings) {
		return register(name, block, new BlockItem(block, settings));
	}
	
	static <T extends Block> T register(String name, T block) {
		return register(name, block, new Item.Settings().group(ItemGroup.DECORATIONS));
	}
	
	static <T extends Block> T register(String name, T block, BlockItem item) {
		T b = Registry.register(Registry.BLOCK, DeckTheHalls.id(name), block);
		if (item != null) {
			Registry.register(Registry.ITEM, DeckTheHalls.id(name), item);
		}
		return b;
	}
}
