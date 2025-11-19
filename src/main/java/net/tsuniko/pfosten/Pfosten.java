package net.tsuniko.pfosten;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pfosten implements ModInitializer {
	public static final String MOD_ID = "pfosten";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Pfosten");
	}
}