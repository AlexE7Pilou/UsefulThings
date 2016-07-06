package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class VegeStick extends Item {
	
public static Item vegetal_stick;
	
	public static void init(){
		vegetal_stick = new VegeStick().setUnlocalizedName("vegetal_stick").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(vegetal_stick, vegetal_stick.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(vegetal_stick);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
