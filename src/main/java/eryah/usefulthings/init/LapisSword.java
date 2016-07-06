package eryah.usefulthings.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class LapisSword extends ItemSword {
	
public static Item LapisSword;
	
	public LapisSword(ToolMaterial material) {
		super(material);
		this.setFull3D();
	}
	
	public static void init(){
		LapisSword = new LapisSword(UsefulthingsMod.lapisMat).setUnlocalizedName("LapisSword").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(LapisSword, LapisSword.getUnlocalizedName().substring(5));

	}
	
	public static void registerRenders()
	{
		registerRender(LapisSword);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
