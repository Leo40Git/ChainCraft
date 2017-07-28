package com.moddy10.chaincraft.proxy;

import com.moddy10.chaincraft.ModConfig;
import com.moddy10.chaincraft.init.ModItems;
import com.moddy10.chaincraft.items.ItemArmorBase;
import com.moddy10.chaincraft.items.ItemChainmailPlate;
import com.moddy10.chaincraft.items.ItemStuddedPlate;

import net.minecraft.block.Block;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
	
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		config = new Configuration(e.getSuggestedConfigurationFile());
		ModConfig.readConfig();
	}

	public void init(FMLInitializationEvent e) {
	}

	public void postInit(FMLPostInitializationEvent e) {
		if (config.hasChanged())
			config.save();
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> r = event.getRegistry();
		r.register(ModItems.chainmail_plate = new ItemChainmailPlate());
		if (ModConfig.studded_armor) {
			r.register(ModItems.studded_plate = new ItemStuddedPlate());
			ModItems.ARMOR_STUDDED.setRepairItem(new ItemStack(ModItems.studded_plate));
			r.register(ModItems.studded_helmet = new ItemArmorBase("studded_helmet", ModItems.ARMOR_STUDDED, 1,
					EntityEquipmentSlot.HEAD));
			r.register(ModItems.studded_chestplate = new ItemArmorBase("studded_chestplate", ModItems.ARMOR_STUDDED, 1,
					EntityEquipmentSlot.CHEST));
			r.register(ModItems.studded_leggings = new ItemArmorBase("studded_leggings", ModItems.ARMOR_STUDDED, 2,
					EntityEquipmentSlot.LEGS));
			r.register(ModItems.studded_boots = new ItemArmorBase("studded_boots", ModItems.ARMOR_STUDDED, 1,
					EntityEquipmentSlot.FEET));
		}
	}

}
