package eryah.usefulthings.proxy;

import org.lwjgl.input.Keyboard;

import eryah.usefulthings.Reference;
import eryah.usefulthings.blocks.Clinker;
import eryah.usefulthings.blocks.Concrete;
import eryah.usefulthings.blocks.Crusher;
import eryah.usefulthings.blocks.DragonScaleOre;
import eryah.usefulthings.blocks.Limestone;
import eryah.usefulthings.blocks.LitCrusher;
import eryah.usefulthings.blocks.MarkedRoadBlock;
import eryah.usefulthings.blocks.PlateCrafter;
import eryah.usefulthings.blocks.ResinLeaves;
import eryah.usefulthings.blocks.ResinTree;
import eryah.usefulthings.blocks.RoadBlock;
import eryah.usefulthings.blocks.Scaffolding;
import eryah.usefulthings.blocks.SteelBlock;
import eryah.usefulthings.blocks.WeaponTable;
import eryah.usefulthings.client.models.ModelBullet;
import eryah.usefulthings.client.models.ModelBulletCasing;
import eryah.usefulthings.client.models.ModelMotoBoat;
import eryah.usefulthings.client.render.RenderBullet;
import eryah.usefulthings.client.render.RenderBulletCasing;
import eryah.usefulthings.client.render.RenderGoldenEggChicken;
import eryah.usefulthings.client.render.RenderIronMotoBoat;
import eryah.usefulthings.client.render.RenderMotoBoat;
import eryah.usefulthings.client.render.RenderReinforcedBoat;
import eryah.usefulthings.client.render.RenderSteelBoat;
import eryah.usefulthings.client.render.RenderSteelMotoBoat;
import eryah.usefulthings.client.tesr.TileEntityPlateCrafterSpecialRenderer;
import eryah.usefulthings.entity.item.BulletCasing;
import eryah.usefulthings.entity.item.IronMotorizedBoat;
import eryah.usefulthings.entity.item.MotorizedBoat;
import eryah.usefulthings.entity.item.ReinforcedBoat;
import eryah.usefulthings.entity.item.SteelBoat;
import eryah.usefulthings.entity.item.SteelMotorizedBoat;
import eryah.usefulthings.entity.passive.GoldenEggChicken;
import eryah.usefulthings.entity.projectile.EBullet;
import eryah.usefulthings.entity.projectile.ELavaBottle;
import eryah.usefulthings.init.AirBottle;
import eryah.usefulthings.init.AncientShard;
import eryah.usefulthings.init.AncientSword;
import eryah.usefulthings.init.AncientSwordRare;
import eryah.usefulthings.init.BladedBowDiamond;
import eryah.usefulthings.init.BladedBowGold;
import eryah.usefulthings.init.BladedBowIron;
import eryah.usefulthings.init.BladedBowStone;
import eryah.usefulthings.init.BladedBowWood;
import eryah.usefulthings.init.BottleHerm;
import eryah.usefulthings.init.BucketHerm;
import eryah.usefulthings.init.Bullet;
import eryah.usefulthings.init.Cement;
import eryah.usefulthings.init.Chainsaw;
import eryah.usefulthings.init.CoalPowder;
import eryah.usefulthings.init.DragonAxe;
import eryah.usefulthings.init.DragonBoots;
import eryah.usefulthings.init.DragonChestplate;
import eryah.usefulthings.init.DragonGem;
import eryah.usefulthings.init.DragonHelmet;
import eryah.usefulthings.init.DragonHoe;
import eryah.usefulthings.init.DragonLeggings;
import eryah.usefulthings.init.DragonPickaxe;
import eryah.usefulthings.init.DragonScale;
import eryah.usefulthings.init.DragonShovel;
import eryah.usefulthings.init.DragonSword;
import eryah.usefulthings.init.EnderGem;
import eryah.usefulthings.init.EnderSoul;
import eryah.usefulthings.init.Engine;
import eryah.usefulthings.init.EpicAdminChestplate;
import eryah.usefulthings.init.GlidedDragonAxe;
import eryah.usefulthings.init.GlidedDragonHoe;
import eryah.usefulthings.init.GlidedDragonPickaxe;
import eryah.usefulthings.init.GlidedDragonShovel;
import eryah.usefulthings.init.GlidedDragonSword;
import eryah.usefulthings.init.GoldPlate;
import eryah.usefulthings.init.GoldenEgg;
import eryah.usefulthings.init.GoldenPowder;
import eryah.usefulthings.init.IIronMotorizedBoat;
import eryah.usefulthings.init.IMotorizedBoat;
import eryah.usefulthings.init.IReinforcedBoat;
import eryah.usefulthings.init.ISteelBoat;
import eryah.usefulthings.init.ISteelMotorizedBoat;
import eryah.usefulthings.init.IronPlate;
import eryah.usefulthings.init.LapisAxe;
import eryah.usefulthings.init.LapisBoots;
import eryah.usefulthings.init.LapisChestplate;
import eryah.usefulthings.init.LapisHelmet;
import eryah.usefulthings.init.LapisLeggings;
import eryah.usefulthings.init.LapisPickaxe;
import eryah.usefulthings.init.LapisShovel;
import eryah.usefulthings.init.LapisSword;
import eryah.usefulthings.init.LavaBottle;
import eryah.usefulthings.init.MakeshiftRifle;
import eryah.usefulthings.init.Mortar;
import eryah.usefulthings.init.PolishedLapis;
import eryah.usefulthings.init.Propeller;
import eryah.usefulthings.init.RedstoneIgniter;
import eryah.usefulthings.init.Resin;
import eryah.usefulthings.init.ScaphBoots;
import eryah.usefulthings.init.ScaphChestplate;
import eryah.usefulthings.init.ScaphHelmet;
import eryah.usefulthings.init.ScaphLeggings;
import eryah.usefulthings.init.SteelAxe;
import eryah.usefulthings.init.SteelBoots;
import eryah.usefulthings.init.SteelChestplate;
import eryah.usefulthings.init.SteelHelmet;
import eryah.usefulthings.init.SteelIngot;
import eryah.usefulthings.init.SteelLeggings;
import eryah.usefulthings.init.SteelPickaxe;
import eryah.usefulthings.init.SteelPlate;
import eryah.usefulthings.init.SteelShovel;
import eryah.usefulthings.init.SteelSword;
import eryah.usefulthings.init.StoneBoots;
import eryah.usefulthings.init.StoneChestplate;
import eryah.usefulthings.init.StoneHelmet;
import eryah.usefulthings.init.StoneLeggings;
import eryah.usefulthings.init.SuperBadassAdminTool;
import eryah.usefulthings.init.VegeStick;
import eryah.usefulthings.init.VegetalBow;
import eryah.usefulthings.init.WeedKiller;
import eryah.usefulthings.init.WoodBoots;
import eryah.usefulthings.init.WoodChestplate;
import eryah.usefulthings.init.WoodHelmet;
import eryah.usefulthings.init.WoodLeggings;
import eryah.usefulthings.tileentity.TileEntityPlateCrafter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class ClientProxy extends CommonProxy  {
	
	private static KeyBinding keyAirBag;
	 public static int tesrRenderId;
	
	public ClientProxy() {
		FMLCommonHandler.instance().bus().register(this);
		 keyAirBag = new KeyBinding("ut.keyDesAirbag", Keyboard.KEY_LMENU, "key.categories.movement");
		 ClientRegistry.registerKeyBinding(keyAirBag);
    } 
	
	
	
	@Override
	public void registerRenders() {
		ResinTree.registerRenders();
		Resin.registerRenders();
		Engine.registerRenders();
		ResinLeaves.registerRenders();
		Chainsaw.registerRenders();
		BucketHerm.registerRenders();
		CoalPowder.registerRenders();
		SteelIngot.registerRenders();
		SteelAxe.registerRenders();
		SteelSword.registerRenders();
		SteelPickaxe.registerRenders();
		SteelShovel.registerRenders();
		PlateCrafter.registerRenders();
		VegeStick.registerRenders();
		Scaffolding.registerRenders();
		BottleHerm.registerRenders();
		RoadBlock.registerRenders();
		MarkedRoadBlock.registerRenders();
		GoldenEgg.registerRenders();
		PolishedLapis.registerRenders();
		LapisAxe.registerRenders();
		LapisSword.registerRenders();
		LapisPickaxe.registerRenders();
		LapisShovel.registerRenders();
		SuperBadassAdminTool.registerRenders();
		EnderSoul.registerRenders();
		EnderGem.registerRenders();
		DragonScaleOre.registerRenders();
		DragonScale.registerRenders();
		DragonGem.registerRenders();
		DragonShovel.registerRenders();
		DragonAxe.registerRenders();
		DragonSword.registerRenders();
		DragonPickaxe.registerRenders();
		DragonHoe.registerRenders();
		EpicAdminChestplate.registerRenders();
		SteelHelmet.registerRenders();
		SteelChestplate.registerRenders();
		SteelLeggings.registerRenders();
		SteelBoots.registerRenders();
		LapisHelmet.registerRenders();
		LapisChestplate.registerRenders();
		LapisLeggings.registerRenders();
		LapisBoots.registerRenders();
		SteelBlock.registerRenders();
		Limestone.registerRenders();
		Clinker.registerRenders();
		Crusher.registerRenders();
		LitCrusher.registerRenders();
		BladedBowWood.registerRenders();
		AirBottle.registerRenders();
		LavaBottle.registerRenders();
		BladedBowStone.registerRenders();
		BladedBowIron.registerRenders();
		BladedBowGold.registerRenders();
		BladedBowDiamond.registerRenders();
		WeedKiller.registerRenders();
		RedstoneIgniter.registerRenders();
		ScaphHelmet.registerRenders();
		ScaphChestplate.registerRenders();
		ScaphLeggings.registerRenders();
		ScaphBoots.registerRenders();
		Propeller.registerRenders();
		IMotorizedBoat.registerRenders();
		IReinforcedBoat.registerRenders();
		ISteelBoat.registerRenders();
		SteelPlate.registerRenders();
		IronPlate.registerRenders();
		GoldenPowder.registerRenders();
		GlidedDragonSword.registerRenders();
		GlidedDragonShovel.registerRenders();
		GlidedDragonAxe.registerRenders();
		GlidedDragonPickaxe.registerRenders();
		GlidedDragonHoe.registerRenders();
		DragonHelmet.registerRenders();
		DragonChestplate.registerRenders();
		DragonLeggings.registerRenders();
		DragonBoots.registerRenders();
		AncientSwordRare.registerRenders();
		AncientShard.registerRenders();
		AncientSword.registerRenders();
		Cement.registerRenders();
		Concrete.registerRenders();
		Mortar.registerRenders();
		WoodHelmet.registerRenders();
		WoodChestplate.registerRenders();
		WoodLeggings.registerRenders();
		WoodBoots.registerRenders();
		StoneHelmet.registerRenders();
		StoneChestplate.registerRenders();
		StoneLeggings.registerRenders();
		StoneBoots.registerRenders();
		MakeshiftRifle.registerRenders();
		Bullet.registerRenders();
		IIronMotorizedBoat.registerRenders();
		WeaponTable.registerRenders();
		GoldPlate.registerRenders();
		ISteelMotorizedBoat.registerRenders();


		
		
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(GoldenEggChicken.class, new RenderGoldenEggChicken(Minecraft.getMinecraft().getRenderManager(), new ModelChicken(), 0.3F));
				
		RenderingRegistry.registerEntityRenderingHandler(MotorizedBoat.class, new RenderMotoBoat(Minecraft.getMinecraft().getRenderManager(), new ModelMotoBoat(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(IronMotorizedBoat.class, new RenderIronMotoBoat(Minecraft.getMinecraft().getRenderManager(), new ModelMotoBoat(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(SteelMotorizedBoat.class, new RenderSteelMotoBoat(Minecraft.getMinecraft().getRenderManager(), new ModelMotoBoat(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(ReinforcedBoat.class, new RenderReinforcedBoat(Minecraft.getMinecraft().getRenderManager(), new ModelBoat(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(SteelBoat.class, new RenderSteelBoat(Minecraft.getMinecraft().getRenderManager(), new ModelBoat(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(ELavaBottle.class, new RenderSnowball(Minecraft.getMinecraft().getRenderManager(), LavaBottle.lava_bottle, Minecraft.getMinecraft().getRenderItem()));
		
		RenderingRegistry.registerEntityRenderingHandler(EBullet.class, new RenderBullet(Minecraft.getMinecraft().getRenderManager(), new ModelBullet(), 0.3F));
		
		RenderingRegistry.registerEntityRenderingHandler(BulletCasing.class, new RenderBulletCasing(Minecraft.getMinecraft().getRenderManager(), new ModelBulletCasing(), 0.1F));
		
		
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlateCrafter.class, new TileEntityPlateCrafterSpecialRenderer());
		
		
		   registerItem(BladedBowDiamond.diamond_bladed_bow, 0, Reference.MOD_ID + ":diamond_bladed_bow_standby");
	       registerItem(BladedBowDiamond.diamond_bladed_bow, 1, Reference.MOD_ID + ":diamond_bladed_bow_pulling_0");
	       registerItem(BladedBowDiamond.diamond_bladed_bow, 2, Reference.MOD_ID + ":diamond_bladed_bow_pulling_1");
	       registerItem(BladedBowDiamond.diamond_bladed_bow, 3, Reference.MOD_ID + ":diamond_bladed_bow_pulling_2");
	       ModelBakery.addVariantName(BladedBowDiamond.diamond_bladed_bow, new String[] {Reference.MOD_ID + ":diamond_bladed_bow_standby", Reference.MOD_ID + ":diamond_bladed_bow_pulling_0", Reference.MOD_ID + ":diamond_bladed_bow_pulling_1", Reference.MOD_ID + ":diamond_bladed_bow_pulling_2"});

	       registerItem(BladedBowIron.iron_bladed_bow, 0, Reference.MOD_ID + ":iron_bladed_bow_standby");
		   registerItem(BladedBowIron.iron_bladed_bow, 1, Reference.MOD_ID + ":iron_bladed_bow_pulling_0");
		   registerItem(BladedBowIron.iron_bladed_bow, 2, Reference.MOD_ID + ":iron_bladed_bow_pulling_1");
		   registerItem(BladedBowIron.iron_bladed_bow, 3, Reference.MOD_ID + ":iron_bladed_bow_pulling_2");
		   ModelBakery.addVariantName(BladedBowIron.iron_bladed_bow, new String[] {Reference.MOD_ID + ":iron_bladed_bow_standby", Reference.MOD_ID + ":iron_bladed_bow_pulling_0", Reference.MOD_ID + ":iron_bladed_bow_pulling_1", Reference.MOD_ID + ":iron_bladed_bow_pulling_2"});
		   
		   registerItem(BladedBowGold.golden_bladed_bow, 0, Reference.MOD_ID + ":golden_bladed_bow_standby");
		   registerItem(BladedBowGold.golden_bladed_bow, 1, Reference.MOD_ID + ":golden_bladed_bow_pulling_0");
		   registerItem(BladedBowGold.golden_bladed_bow, 2, Reference.MOD_ID + ":golden_bladed_bow_pulling_1");
		   registerItem(BladedBowGold.golden_bladed_bow, 3, Reference.MOD_ID + ":golden_bladed_bow_pulling_2");
		   ModelBakery.addVariantName(BladedBowGold.golden_bladed_bow, new String[] {Reference.MOD_ID + ":golden_bladed_bow_standby", Reference.MOD_ID + ":golden_bladed_bow_pulling_0", Reference.MOD_ID + ":golden_bladed_bow_pulling_1", Reference.MOD_ID + ":golden_bladed_bow_pulling_2"});
		   
		   registerItem(BladedBowStone.stone_bladed_bow, 0, Reference.MOD_ID + ":stone_bladed_bow_standby");
		   registerItem(BladedBowStone.stone_bladed_bow, 1, Reference.MOD_ID + ":stone_bladed_bow_pulling_0");
		   registerItem(BladedBowStone.stone_bladed_bow, 2, Reference.MOD_ID + ":stone_bladed_bow_pulling_1");
		   registerItem(BladedBowStone.stone_bladed_bow, 3, Reference.MOD_ID + ":stone_bladed_bow_pulling_2");
		   ModelBakery.addVariantName(BladedBowStone.stone_bladed_bow, new String[] {Reference.MOD_ID + ":stone_bladed_bow_standby", Reference.MOD_ID + ":stone_bladed_bow_pulling_0", Reference.MOD_ID + ":stone_bladed_bow_pulling_1", Reference.MOD_ID + ":stone_bladed_bow_pulling_2"});
		   
		   registerItem(BladedBowWood.wooden_bladed_bow, 0, Reference.MOD_ID + ":wooden_bladed_bow_standby");
		   registerItem(BladedBowWood.wooden_bladed_bow, 1, Reference.MOD_ID + ":wooden_bladed_bow_pulling_0");
		   registerItem(BladedBowWood.wooden_bladed_bow, 2, Reference.MOD_ID + ":wooden_bladed_bow_pulling_1");
		   registerItem(BladedBowWood.wooden_bladed_bow, 3, Reference.MOD_ID + ":wooden_bladed_bow_pulling_2");
		   ModelBakery.addVariantName(BladedBowWood.wooden_bladed_bow, new String[] {Reference.MOD_ID + ":wooden_bladed_bow_standby", Reference.MOD_ID + ":wooden_bladed_bow_pulling_0", Reference.MOD_ID + ":wooden_bladed_bow_pulling_1", Reference.MOD_ID + ":wooden_bladed_bow_pulling_2"});
	        
		   registerItem(VegetalBow.vegetal_bow, 0, Reference.MOD_ID + ":vegetal_bow_standby");
		   registerItem(VegetalBow.vegetal_bow, 1, Reference.MOD_ID + ":vegetal_bow_pulling_0");
		   registerItem(VegetalBow.vegetal_bow, 2, Reference.MOD_ID + ":vegetal_bow_pulling_1");
		   registerItem(VegetalBow.vegetal_bow, 3, Reference.MOD_ID + ":vegetal_bow_pulling_2");
		   ModelBakery.addVariantName(VegetalBow.vegetal_bow, new String[] {Reference.MOD_ID + ":vegetal_bow_standby", Reference.MOD_ID + ":vegetal_bow_pulling_0", Reference.MOD_ID + ":vegetal_bow_pulling_1", Reference.MOD_ID + ":vegetal_bow_pulling_2"});
		   
		  

	        
	}

	private void registerItem(Item diamond_bladed_bow, int i, String identifier) {

        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(diamond_bladed_bow, i, new ModelResourceLocation(identifier, "inventory"));
		
	}
	
	@SubscribeEvent
	public void onEvent(KeyInputEvent event)
	{
		// Si vous remplacez isPressed() par getIsKeyPressed()
		// Le chat sera inondé à chaque fois que vous presserez la touche


		if(keyAirBag.isKeyDown())
		{
			keyTestTyped(FMLClientHandler.instance().getClientPlayerEntity()); // Traitement de la touche
		
		}
	}
	
	private void keyTestTyped(EntityPlayer player)
	{
		// La touche vient d'être appuyé !!
		if(player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ScaphLeggings.airbag_leggings) {
			if(player.isInWater())
			{
				player.getEntityData().setBoolean("airbag", true);
			}
			
				if(!player.isInWater())
				{
					player.getEntityData().setBoolean("airbag", false);
				}
			}
		
		
	}
}

	
