package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;


import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class AirBottle extends ItemFood {	

	public static Item air_bottle;

	public AirBottle() {
		super(0, false);
		this.setFull3D();
		this.setContainerItem(BottleHerm.bottleherm);
                this.setAlwaysEdible();
	}
	
	public static void init(){
		air_bottle = new AirBottle().setUnlocalizedName("air_bottle").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(air_bottle, air_bottle.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(air_bottle);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
	return EnumAction.DRINK;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		super.onFoodEaten(stack, worldIn, player);
		player.setAir(300);
		player.inventory.addItemStackToInventory(new ItemStack(BottleHerm.bottleherm));
	}
	
	public int getMaxItemUseDuration(ItemStack stack)
	   {
			return 10;
	   }
}