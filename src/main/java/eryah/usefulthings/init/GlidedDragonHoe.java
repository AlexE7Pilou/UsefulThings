package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class GlidedDragonHoe extends ItemHoe {
	
public static Item glided_dragon_hoe;
	
	public GlidedDragonHoe(ToolMaterial material) {
		super(material);
		this.setFull3D();
	}
	
	public static void init(){
		glided_dragon_hoe = new GlidedDragonHoe(UsefulthingsMod.dragonMatGlided).setUnlocalizedName("glided_dragon_hoe").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(glided_dragon_hoe, glided_dragon_hoe.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(glided_dragon_hoe);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
