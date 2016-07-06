package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class SteelShovel extends ItemSpade {

public static Item SteelShovel;
	
	public SteelShovel(ToolMaterial material) {
		super(material);
	}

	public static void init(){
		SteelShovel = new SteelShovel(UsefulthingsMod.steelMat).setUnlocalizedName("steelshovel").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(SteelShovel, SteelShovel.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(SteelShovel);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
