package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class DragonAxe extends ItemAxe {
	
public static Item dragon_axe ;
	
	public DragonAxe(ToolMaterial material) {
		super(material);
	}

	public static void init(){
		dragon_axe = new DragonAxe(UsefulthingsMod.dragonMat).setUnlocalizedName("dragon_axe").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(dragon_axe, dragon_axe.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(dragon_axe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
