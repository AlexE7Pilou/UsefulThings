package eryah.usefulthings.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;
import eryah.usefulthings.blocks.BRefinedGunpowder;

public class RafinedGunpowder extends Item {
	
	public static Item rafined_gunpowder;
	
	public static void init(){
		rafined_gunpowder = new RafinedGunpowder().setUnlocalizedName("rafined_gunpowder").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(rafined_gunpowder, rafined_gunpowder.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(rafined_gunpowder);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	 public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	    {
	        boolean flag = worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos);
	        BlockPos blockpos1 = flag ? pos : pos.offset(side);

	        if (!playerIn.canPlayerEdit(blockpos1, side, stack))
	        {
	            return false;
	        }
	        else
	        {
	            Block block = worldIn.getBlockState(blockpos1).getBlock();

	            if (!worldIn.canBlockBePlaced(block, blockpos1, false, side, (Entity)null, stack))
	            {
	                return false;
	            }
	            else if (BRefinedGunpowder.rafined_gunpowder_wire.canPlaceBlockAt(worldIn, blockpos1))
	            {
	                --stack.stackSize;
	                worldIn.setBlockState(blockpos1, BRefinedGunpowder.rafined_gunpowder_wire.getDefaultState());
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        }
	
	    }
}
