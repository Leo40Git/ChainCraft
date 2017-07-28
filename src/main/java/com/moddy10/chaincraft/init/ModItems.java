package com.moddy10.chaincraft.init;

import com.moddy10.chaincraft.items.ItemArmorBase;
import com.moddy10.chaincraft.items.ItemChainmailPlate;
import com.moddy10.chaincraft.items.ItemStuddedPlate;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	public static final ArmorMaterial ARMOR_STUDDED = EnumHelper.addArmorMaterial("STUDDED", "chaincraft:studded", 18,
			new int[] { 3, 7, 6, 3 }, 13, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1.0f);

	public static ItemChainmailPlate chainmail_plate;
	public static ItemStuddedPlate studded_plate;
	public static ItemArmorBase studded_helmet;
	public static ItemArmorBase studded_chestplate;
	public static ItemArmorBase studded_leggings;
	public static ItemArmorBase studded_boots;

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		chainmail_plate.initModel();
		studded_plate.initModel();
		studded_helmet.initModel();
		studded_chestplate.initModel();
		studded_leggings.initModel();
		studded_boots.initModel();
	}

}
