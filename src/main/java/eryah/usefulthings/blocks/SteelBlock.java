package eryah.usefulthings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class SteelBlock extends Block {

	 protected SteelBlock(Material mat) {
	        super(Material.iron);
	        this.setHarvestLevel("pickaxe", 1);
	        this.setHardness(10.0f);
	        this.setResistance(15.0f);
	    }
	
	 public static Block steel_block;
	 
	 public static void init()
		{
		 steel_block = new SteelBlock(Material.rock).setUnlocalizedName("steel_block").setCreativeTab(UsefulthingsMod.UTTab);
		}
		
		public static void register()
		{
			GameRegistry.registerBlock(steel_block, steel_block.getUnlocalizedName().substring(5));
		}
		
		public static void registerRenders()
		{
			registerRender(steel_block);
		}
		
		public static void registerRender(Block block)
		{
			Item item = Item.getItemFromBlock(block);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
	
	
	
}
