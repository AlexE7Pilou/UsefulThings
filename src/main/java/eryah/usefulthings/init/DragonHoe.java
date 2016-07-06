package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class DragonHoe extends ItemHoe {
	
public static Item dragon_hoe;
	
	public DragonHoe(ToolMaterial material) {
		super(material);
		this.setFull3D();
	}
	
	public static void init(){
		dragon_hoe = new DragonHoe(UsefulthingsMod.dragonMat).setUnlocalizedName("dragon_hoe").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(dragon_hoe, dragon_hoe.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(dragon_hoe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
