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

public class ScaphLeggings extends ItemArmor {
	
	public static Item airbag_leggings;
	
    public ScaphLeggings(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setCreativeTab(UsefulthingsMod.UTTab);
        this.setUnlocalizedName("airbag_leggings");
    }
    
    public static void init(){
    	
	}
	
	public static void register()
	{
		GameRegistry.registerItem(airbag_leggings, airbag_leggings.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(airbag_leggings);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
    
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(player.getEntityData().getBoolean("airbag"))
		{
			if(player.isInWater()){
				player.motionY = 0.7F;
			}
			else
	        {
	 player.getEntityData().setBoolean("airbag", false);
	        }
		}
		
		else
        {
 player.getEntityData().setBoolean("airbag", false);
        }
	}
    
    
    
    
}