package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class Cement extends Item {
	
	public static Item cement;
	
	public static void init(){
		cement = new Cement().setUnlocalizedName("cement").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(cement, cement.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(cement);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
