package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class AncientShard extends Item {
	
	public static Item ancient_shard;
	
	public static void init(){
		ancient_shard = new AncientShard().setUnlocalizedName("ancient_shard").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(ancient_shard, ancient_shard.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(ancient_shard);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack)
	{
	    return EnumRarity.UNCOMMON;
	}
	
}
