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

public class WoodChestplate extends ItemArmor {
	
	public static Item wooden_chestplate;
	
    public WoodChestplate(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(UsefulthingsMod.UTTab);
        this.setUnlocalizedName("wooden_chestplate");
    }
    
    public static void init(){
    	
	}
	
	public static void register()
	{
		GameRegistry.registerItem(wooden_chestplate, wooden_chestplate.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(wooden_chestplate);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

    
    
    
}