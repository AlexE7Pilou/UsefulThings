package eryah.usefulthings.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;
import eryah.usefulthings.init.Resin;

public class ResinLeaves extends BlockLeavesBase implements net.minecraftforge.common.IShearable {
	
	public static Block resin_leaves;
	@SideOnly(Side.CLIENT)
	protected boolean isTransparent;
	
	
	
	public ResinLeaves(Material leaves) {
		super(Material.leaves, false);
        this.setTickRandomly(true);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGrass);
	}

	public static void init()
	{
		resin_leaves = new ResinLeaves(Material.leaves).setUnlocalizedName("resin_leaves").setCreativeTab(UsefulthingsMod.UTTab);
	}

	public static void register()
	{
		GameRegistry.registerBlock(resin_leaves, resin_leaves.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(resin_leaves);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world,
			BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isOpaqueCube()
    {
        return !this.fancyGraphics;
    }

	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Resin.resin;
    }
	
	@SideOnly(Side.CLIENT)
    public void setGraphicsLevel(boolean fancy)
    {
        this.isTransparent = fancy;
        this.fancyGraphics = fancy;
    }
	
	
	
	
	
}