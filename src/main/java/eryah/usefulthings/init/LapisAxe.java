package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class LapisAxe extends ItemAxe {
	
public static Item LapisAxe ;
	
	public LapisAxe(ToolMaterial material) {
		super(material);
	}

	public static void init(){
		LapisAxe = new LapisAxe(UsefulthingsMod.lapisMat).setUnlocalizedName("LapisAxe").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(LapisAxe, LapisAxe.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(LapisAxe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
