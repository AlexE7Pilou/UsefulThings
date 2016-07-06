package eryah.usefulthings.blocks;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;
import eryah.usefulthings.init.Resin;

public class ResinTree extends BlockRotatedPillar {
	
	
	
	protected ResinTree(Material materialIn) {
		 super(Material.wood);
	        this.setHardness(2.0F);
	        this.setStepSound(soundTypeWood);
	}

	public static Block resin_log;


	public static void init()
	{
		resin_log = new ResinTree(Material.wood).setUnlocalizedName("resin_log").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(resin_log, resin_log.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(resin_log);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	 	
	@Override
	public ArrayList getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
	    ArrayList drops = new ArrayList();
	    drops.add(new ItemStack(Resin.resin));
	    drops.add(new ItemStack(Blocks.log));
	    return drops;
	}
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}