package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class SteelPickaxe extends ItemPickaxe {
	
	public static Item SteelPickaxe;
	
	public SteelPickaxe(ToolMaterial material) {
		super(material);
	}

	public static void init(){
		SteelPickaxe = new SteelPickaxe(UsefulthingsMod.steelMat).setUnlocalizedName("steelpickaxe").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(SteelPickaxe, SteelPickaxe.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(SteelPickaxe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}



}
