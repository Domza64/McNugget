package mc.nugget;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class McNugget implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("mcnugget");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello McNuggets!");
		McNuggetsLOL.registerNuggets();
	}
}
