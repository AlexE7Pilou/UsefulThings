package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class DragonGem extends Item {
	
	public static Item dragon_gem;
	
	public static void init(){
		dragon_gem = new DragonGem().setUnlocalizedName("dragon_gem").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(dragon_gem, dragon_gem.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(dragon_gem);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
