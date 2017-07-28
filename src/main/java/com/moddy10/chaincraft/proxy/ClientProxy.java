package com.moddy10.chaincraft.proxy;

import com.moddy10.chaincraft.init.ModItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ModItems.initModels();
	}

}
