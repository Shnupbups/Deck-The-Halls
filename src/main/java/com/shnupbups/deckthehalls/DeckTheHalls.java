package com.shnupbups.deckthehalls;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

public class DeckTheHalls implements ModInitializer {
	@Override
	public void onInitialize() {
		ModBlocks.init();
	}
	
	public static Identifier id(String name) {
		return new Identifier("deckthehalls", name);
	}
}
