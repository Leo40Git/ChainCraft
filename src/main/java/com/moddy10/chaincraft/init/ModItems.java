package com.moddy10.chaincraft.init;

import com.moddy10.chaincraft.ChainCraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	public static final ArmorMaterial ARMOR_STUDDED = EnumHelper.addArmorMaterial("STUDDED", "chaincraft:studded", 18,
			new int[] { 3, 7, 6, 3 }, 13, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1.0f);
	
	@GameRegistry.ObjectHolder(ChainCraft.MODID + ":chainmail_plate")
	public static Item chainmail_plate;
	@GameRegistry.ObjectHolder(ChainCraft.MODID + ":studded_plate")
	public static Item studded_plate;
	@GameRegistry.ObjectHolder(ChainCraft.MODID + ":studded_helmet")
	public static Item studded_helmet;
	@GameRegistry.ObjectHolder(ChainCraft.MODID + ":studded_chestplate")
	public static Item studded_chestplate;
	@GameRegistry.ObjectHolder(ChainCraft.MODID + ":studded_leggings")
	public static Item studded_leggings;
	@GameRegistry.ObjectHolder(ChainCraft.MODID + ":studded_boots")
	public static Item studded_boots;

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		initModel(chainmail_plate);
		initModel(studded_plate);
		initModel(studded_helmet);
		initModel(studded_chestplate);
		initModel(studded_leggings);
		initModel(studded_boots);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
