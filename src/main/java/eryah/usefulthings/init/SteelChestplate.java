package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class SteelChestplate extends ItemArmor {
	
	public static Item steel_chestplate;
	
    public SteelChestplate(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(UsefulthingsMod.UTTab);
        this.setUnlocalizedName("steel_chestplate");
    }
    
    public static void init(){
    	
	}
	
	public static void register()
	{
		GameRegistry.registerItem(steel_chestplate, steel_chestplate.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(steel_chestplate);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
    
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	if(player.isInWater()) {
	player.motionX *= 3.0F;
	player.motionZ *= 3.0F;
	System.out.println("Ahuut");
	}
	}
    
    
    
}