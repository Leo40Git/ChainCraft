package com.moddy10.chaincraft;

import org.apache.logging.log4j.Level;

import com.moddy10.chaincraft.proxy.CommonProxy;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;

@Config(modid = ChainCraft.MODID, name = "jaccm", category = ModConfig.CATEGORY_GENERAL)
public class ModConfig {
	
	protected static final String CATEGORY_GENERAL = "general";
	
	protected static final String STUDDED_ARMOR_LANGKEY = "config.chaincraft.studded_armor";
	protected static final String STUDDED_ARMOR_COMMENT = "Set this to false if you don't want studded plates and armor.";
	
	@Config.Comment(STUDDED_ARMOR_COMMENT)
	@Config.LangKey(STUDDED_ARMOR_LANGKEY)
	@Config.RequiresMcRestart
	public static boolean studded_armor = true;
	
	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e) {
			ChainCraft.logger.log(Level.ERROR, "Problem loading config file!", e);
		} finally {
			if (cfg.hasChanged())
				cfg.save();
		}
	}

	private static void initGeneralConfig(Configuration cfg) {
		studded_armor = cfg.getBoolean("studdedArmor", CATEGORY_GENERAL, true, STUDDED_ARMOR_COMMENT, STUDDED_ARMOR_LANGKEY);
	}

}
