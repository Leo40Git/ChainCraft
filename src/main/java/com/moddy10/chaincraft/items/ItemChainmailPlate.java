package com.moddy10.chaincraft.items;

import com.moddy10.chaincraft.ChainCraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemChainmailPlate extends ItemBase {
	
	public ItemChainmailPlate() {
		super("chainmail_plate");
		setCreativeTab(CreativeTabs.MATERIALS);
	}

}
