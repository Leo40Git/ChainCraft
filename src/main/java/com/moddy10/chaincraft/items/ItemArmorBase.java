package com.moddy10.chaincraft.items;

import com.moddy10.chaincraft.ChainCraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArmorBase extends ItemArmor {
	
	private String unlocalized;

	public ItemArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setRegistryName(name);
		unlocalized = ChainCraft.MODID + "." + name;
		setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@Override
	public String getUnlocalizedName() {
		return "item." + unlocalized;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack ignored) {
		return getUnlocalizedName();
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

}
