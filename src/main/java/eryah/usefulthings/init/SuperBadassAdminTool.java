package eryah.usefulthings.init;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.google.common.collect.ImmutableSet;

import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class SuperBadassAdminTool extends ItemPickaxe {

	
	public static Item SuperBadassAdminTool;
	
	public SuperBadassAdminTool(ToolMaterial material) {
		super(material);
		}


	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "spade", "hoe", "axe");
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
	    if (!player.canPlayerEdit(pos.offset(side), side, stack)) {
	        return false;
	    } else {
	        int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(stack, player, world, pos);
	        if (hook != 0)
	            return hook > 0;

	        IBlockState iblockstate = world.getBlockState(pos);
	        Block block = iblockstate.getBlock();

	        if (side != EnumFacing.DOWN && world.isAirBlock(pos.up())) {
	            if (block == Blocks.grass) {
	                return this.useHoe(stack, player, world, pos, Blocks.farmland.getDefaultState());
	            }

	            if (block == Blocks.dirt) {
	                switch (SwitchDirtType.TYPE_LOOKUP[((BlockDirt.DirtType) iblockstate.getValue(BlockDirt.VARIANT)).ordinal()]) {
	                case 1:
	                    return this.useHoe(stack, player, world, pos, Blocks.farmland.getDefaultState());
	                case 2:
	                    return this.useHoe(stack, player, world, pos, Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
	                }
	            }
	        }

	        return false;
	    }
	}

	protected boolean useHoe(ItemStack stack, EntityPlayer player, World worldIn, BlockPos target, IBlockState newState) {
	    worldIn.playSoundEffect(target.getX() + 0.5F, target.getY() + 0.5F, target.getZ() + 0.5F, newState.getBlock().stepSound.getStepSound(), (newState.getBlock().stepSound.getVolume() + 1.0F) / 2.0F, newState.getBlock().stepSound.getFrequency() * 0.8F);

	    if (worldIn.isRemote) {
	        return true;
	    } else {
	        worldIn.setBlockState(target, newState);
	        stack.damageItem(1, player);
	        return true;
	    }
	}

	static final class SwitchDirtType {

	    static final int[] TYPE_LOOKUP = new int[BlockDirt.DirtType.values().length];

	    static {
	        try {
	            TYPE_LOOKUP[BlockDirt.DirtType.DIRT.ordinal()] = 1;
	        } catch (NoSuchFieldError var2) {
	            ;
	        }

	        try {
	            TYPE_LOOKUP[BlockDirt.DirtType.COARSE_DIRT.ordinal()] = 2;
	        } catch (NoSuchFieldError var1) {
	            ;
	        }
	    }
	}
	
	public static void init(){
		SuperBadassAdminTool = new SuperBadassAdminTool(UsefulthingsMod.adminMat).setUnlocalizedName("SuperBadassAdminTool").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(SuperBadassAdminTool, SuperBadassAdminTool.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(SuperBadassAdminTool);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
