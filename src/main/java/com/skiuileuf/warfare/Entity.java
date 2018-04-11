package com.skiuileuf.warfare;

import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;

public class Entity {
	public static void mainRegistry()
	{
		registerEntity();
	}
	
	public static void registerEntity()
	{
		createEntity(Soldier.class, "Soldier", 0xff0000, 0xff9d00);
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColour, int spotColour)
	{
		int randomID = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomID);
		EntityRegistry.registerModEntity(entityClass, entityName, randomID, 1.0 , 64, 1, true);
		createEgg(randomID, solidColour, spotColour);
		
	}
	public static void createEgg(int randomID, int solidColour, int spotColour)
	{
		EntityList.entityEggs.put(Integer.valueOf(randomID), new EntityList.EntityEggInfo(randomID, solidColour, spotColour));
	}
}
