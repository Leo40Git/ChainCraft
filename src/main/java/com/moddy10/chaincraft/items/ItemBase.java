package com.moddy10.chaincraft.items;

import com.moddy10.chaincraft.ChainCraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class ItemBase extends Item {

	private String unlocalized;

	public ItemBase(String name) {
		this.setRegistryName(name);
		unlocalized = ChainCraft.MODID + "." + name;
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
