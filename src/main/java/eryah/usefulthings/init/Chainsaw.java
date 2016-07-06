package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class Chainsaw extends ItemAxe{


	
public static Item chainsaw;

	public Chainsaw(ToolMaterial material) {
		super(material);
		this.setFull3D();
	}
	
	public static void init(){
		chainsaw = new Chainsaw(UsefulthingsMod.chainsawMat).setUnlocalizedName("chainsaw").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(chainsaw, chainsaw.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(chainsaw);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}


	
	
}
