package com.moddy10.chaincraft;

import org.apache.logging.log4j.Logger;

import com.moddy10.chaincraft.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ChainCraft.MODID, name = ChainCraft.NAME, version = ChainCraft.VERSION, useMetadata = true)
public class ChainCraft {

	public static final String MODID = "chaincraft";
	public static final String NAME = "JACCM";
	public static final String VERSION = "1.0.0";

	@SidedProxy(serverSide = "com.moddy10.chaincraft.proxy.CommonProxy", clientSide = "com.moddy10.chaincraft.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static ChainCraft instance;

	public static Logger logger;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		proxy.preInit(e);
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

}
