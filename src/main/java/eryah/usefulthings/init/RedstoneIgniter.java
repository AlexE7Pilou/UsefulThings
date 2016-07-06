package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class RedstoneIgniter extends Item {
	
	public static Item redstone_igniter;
	
	 public RedstoneIgniter()
	    {
	        this.maxStackSize = 1;
	        this.setMaxDamage(64);
	    }
	
	public static void init(){
		redstone_igniter = new RedstoneIgniter().setUnlocalizedName("redstone_igniter").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(redstone_igniter, redstone_igniter.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(redstone_igniter);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) 
	{		
		worldIn.getRedstonePower(pos, side);
		return true;
	}
}
