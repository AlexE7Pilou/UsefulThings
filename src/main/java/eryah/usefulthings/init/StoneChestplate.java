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

public class StoneChestplate extends ItemArmor {
	
	public static Item stone_chestplate;
	
    public StoneChestplate(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(UsefulthingsMod.UTTab);
        this.setUnlocalizedName("stone_chestplate");
    }
    
    public static void init(){
    	
	}
	
	public static void register()
	{
		GameRegistry.registerItem(stone_chestplate, stone_chestplate.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(stone_chestplate);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

    
    
    
}