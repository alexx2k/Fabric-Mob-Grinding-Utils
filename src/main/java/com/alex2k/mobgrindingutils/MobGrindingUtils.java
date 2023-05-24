package com.alex2k.mobgrindingutils;

import com.alex2k.mobgrindingutils.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class MobGrindingUtils implements ModInitializer {
	public static final String MOD_ID = "mobgrindingutils";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
