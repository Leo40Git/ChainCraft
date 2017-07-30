package com.moddy10.chaincraft.proxy;

import com.moddy10.chaincraft.ChainCraft;
import com.moddy10.chaincraft.ModConfig;
import com.moddy10.chaincraft.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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
		r.register(new Item().setRegistryName("chainmail_plate")
				.setUnlocalizedName(ChainCraft.MODID + ".chainmail_plate").setCreativeTab(CreativeTabs.MATERIALS));
		if (ModConfig.studded_armor) {
			r.register(new Item().setRegistryName("studded_plate")
					.setUnlocalizedName(ChainCraft.MODID + ".studded_plate").setCreativeTab(CreativeTabs.MATERIALS));
			ModItems.ARMOR_STUDDED.setRepairItem(new ItemStack(ModItems.studded_plate));
			r.register(new ItemArmor(ModItems.ARMOR_STUDDED, 1, EntityEquipmentSlot.HEAD).setRegistryName("studded_helmet")
					.setUnlocalizedName(ChainCraft.MODID + ".studded_helmet"));
			r.register(new ItemArmor(ModItems.ARMOR_STUDDED, 1, EntityEquipmentSlot.CHEST).setRegistryName("studded_chestplate")
					.setUnlocalizedName(ChainCraft.MODID + ".studded_chestplate"));
			r.register(new ItemArmor(ModItems.ARMOR_STUDDED, 2, EntityEquipmentSlot.LEGS).setRegistryName("studded_leggings")
					.setUnlocalizedName(ChainCraft.MODID + ".studded_leggings"));
			r.register(new ItemArmor(ModItems.ARMOR_STUDDED, 1, EntityEquipmentSlot.FEET).setRegistryName("studded_boots")
					.setUnlocalizedName(ChainCraft.MODID + ".studded_boots"));
		}
	}

}
