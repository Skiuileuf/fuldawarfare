package com.fuldamc.fuldawarfare;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@Mod(modid = "fuldawarfare", name = "Fulda Warfare", version = "1.0")
public class FuldaWarfare {
	
	public static Item itemSoldier;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		//Item/block init
		itemSoldier = new ItemSoldier().setUnlocalizedName("ItemSoldier");
		GameRegistry.registerItem(itemSoldier, itemSoldier.getUnlocalizedName().substring(5));
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		
		
	}
	
}
