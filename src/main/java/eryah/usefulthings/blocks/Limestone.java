package eryah.usefulthings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class Limestone extends Block {

	 protected Limestone(Material mat) {
	        super(Material.rock);
	        this.setHarvestLevel("pickaxe", 1);
	        this.setHardness(10.0f);
	        this.setResistance(15.0f);
	    }
	
	 public static Block limestone;
	 
	 public static void init()
		{
		 limestone = new Limestone(Material.rock).setUnlocalizedName("limestone").setCreativeTab(UsefulthingsMod.UTTab);
		}
		
		public static void register()
		{
			GameRegistry.registerBlock(limestone, limestone.getUnlocalizedName().substring(5));
		}
		
		public static void registerRenders()
		{
			registerRender(limestone);
		}
		
		public static void registerRender(Block block)
		{
			Item item = Item.getItemFromBlock(block);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}

}
