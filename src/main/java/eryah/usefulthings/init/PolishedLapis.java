package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class PolishedLapis extends Item {
	
public static Item polished_lapislazuli;
	
	public static void init(){
		polished_lapislazuli = new PolishedLapis().setUnlocalizedName("polished_lapislazuli").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(polished_lapislazuli, polished_lapislazuli.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(polished_lapislazuli);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	

}
