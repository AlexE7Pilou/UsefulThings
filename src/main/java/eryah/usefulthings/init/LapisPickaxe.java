package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class LapisPickaxe extends ItemPickaxe {
	
public static Item LapisPickaxe;
	
	public LapisPickaxe(ToolMaterial material) {
		super(material);
	}

	public static void init(){
		LapisPickaxe = new LapisPickaxe(UsefulthingsMod.lapisMat).setUnlocalizedName("LapisPickaxe").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(LapisPickaxe, LapisPickaxe.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(LapisPickaxe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
