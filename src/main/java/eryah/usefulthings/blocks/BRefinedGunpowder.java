package eryah.usefulthings.blocks;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;
import eryah.usefulthings.init.RafinedGunpowder;

public class BRefinedGunpowder extends Block {
	
	public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    public static Block rafined_gunpowder_wire;   
		
    public BRefinedGunpowder(Material material)
    {
        super(Material.circuits);
        this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
        this.setTickRandomly(true);
    }
		
    

	public static void init()
	{
    	rafined_gunpowder_wire = new BRefinedGunpowder(Material.circuits).setUnlocalizedName("rafined_gunpowder_wire").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(rafined_gunpowder_wire, rafined_gunpowder_wire.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(rafined_gunpowder_wire);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
    
    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
    {
        return null;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean isFullCube()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }	
		
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return RafinedGunpowder.rafined_gunpowder;
    }	
		
    @SideOnly(Side.CLIENT)
    public Item getItem(World worldIn, BlockPos pos)
    {
        return RafinedGunpowder.rafined_gunpowder;
    }
    
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {NORTH, EAST, WEST, SOUTH});
    }

	
    @Override
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock) {
		if(world.getBlockState(pos.east()).getBlock() == Blocks.fire || world.getBlockState(pos.west()).getBlock() == Blocks.fire ||world.getBlockState(pos.north()).getBlock() == Blocks.fire ||world.getBlockState(pos.south()).getBlock() == Blocks.fire) {			
			world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 1.0F, true);
		}

	}

	
	 public int getMetaFromState(IBlockState state)
	    {
		 int i = 0;

	        if (((Boolean)state.getValue(EAST)).booleanValue())
	        {
	            i |= 1;
	        }

	        if (((Boolean)state.getValue(NORTH)).booleanValue())
	        {
	            i |= 2;
	        }

	        if (((Boolean)state.getValue(SOUTH)).booleanValue())
	        {
	            i |= 4;
	        }

	        if (((Boolean)state.getValue(WEST)).booleanValue())
	        {
	            i |= 8;
	        }

	        return i;
	    }

	 @Override
	 public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn)
	    {
		  worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 1.0F, true);
	    }

	 static enum EnumAttachPosition implements IStringSerializable
	    {
	        UP("up"),
	        SIDE("side"),
	        NONE("none");
	        private final String name;

	        private static final String __OBFID = "CL_00002070";

	        private EnumAttachPosition(String name)
	        {
	            this.name = name;
	        }

	        public String toString()
	        {
	            return this.getName();
	        }

	        public String getName()
	        {
	            return this.name;
	        }
	    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
		
		
		
		
		
}

