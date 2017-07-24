package com.moddy10.chaincraft;

import com.moddy10.chaincraft.items.ItemChainmailPlate;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@GameRegistry.ObjectHolder(ChainCraft.MODID)
public class ModItems {
	
	@GameRegistry.ObjectHolder("chainmail_plate")
	public static ItemChainmailPlate chainmail_plate;
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		chainmail_plate.initModel();
	}

}
