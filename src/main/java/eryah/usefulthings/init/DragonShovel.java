package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class DragonShovel extends ItemSpade {
	
public static Item dragon_shovel;
	
	public DragonShovel(ToolMaterial material) {
		super(material);
	}

	public static void init(){
		dragon_shovel = new DragonShovel(UsefulthingsMod.dragonMat).setUnlocalizedName("dragon_shovel").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(dragon_shovel, dragon_shovel.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(dragon_shovel);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
