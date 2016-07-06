package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class LapisHelmet extends ItemArmor {
	
	public static Item lapis_helmet;
	
    public LapisHelmet(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(UsefulthingsMod.UTTab);
        this.setUnlocalizedName("lapis_helmet");
    }
    
    public static void init(){
    	
	}
	
	public static void register()
	{
		GameRegistry.registerItem(lapis_helmet, lapis_helmet.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(lapis_helmet);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
    
    
    
    
    
    
}