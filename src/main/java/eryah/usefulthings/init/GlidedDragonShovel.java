package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class GlidedDragonShovel extends ItemSpade {
	
public static Item glided_dragon_shovel;
	
	public GlidedDragonShovel(ToolMaterial material) {
		super(material);
	}

	public static void init(){
		glided_dragon_shovel = new GlidedDragonShovel(UsefulthingsMod.dragonMatGlided).setUnlocalizedName("glided_dragon_shovel").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(glided_dragon_shovel, glided_dragon_shovel.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(glided_dragon_shovel);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
