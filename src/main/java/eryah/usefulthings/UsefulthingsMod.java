package eryah.usefulthings;

import java.awt.Color;

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
import eryah.usefulthings.entity.item.BulletCasing;
import eryah.usefulthings.entity.item.IronMotorizedBoat;
import eryah.usefulthings.entity.item.MotorizedBoat;
import eryah.usefulthings.entity.item.ReinforcedBoat;
import eryah.usefulthings.entity.item.SteelBoat;
import eryah.usefulthings.entity.item.SteelMotorizedBoat;
import eryah.usefulthings.entity.passive.GoldenEggChicken;
import eryah.usefulthings.entity.projectile.EBullet;
import eryah.usefulthings.entity.projectile.ELavaBottle;
import eryah.usefulthings.generation.DragonScaleOreGen;
import eryah.usefulthings.generation.LimestoneGen;
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
import eryah.usefulthings.init.HerbRope;
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
import eryah.usefulthings.proxy.CommonProxy;
import eryah.usefulthings.recipes.RemovedRecipes;
import eryah.usefulthings.tileentity.TileEntityCrusher;
import eryah.usefulthings.tileentity.TileEntityPlateCrafter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class UsefulthingsMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTab UTTab = new CreativeTab("UTTab");
	
	//Tool Material
	public static ToolMaterial chainsawMat = EnumHelper.addToolMaterial("chainsawMat", 1, 1000, 15.0F, 3.0F, 14);
	public static ToolMaterial steelMat = EnumHelper.addToolMaterial("steelMat", 2, 1200, 7.0F, 3.0F, 16);
	public static ToolMaterial lapisMat = EnumHelper.addToolMaterial("lapisMat", 2, 600, 6.0F, 0.0F, 30);
	public static ToolMaterial adminMat = EnumHelper.addToolMaterial("adminMat", 999999999, 999999999, 99999999999999999999.0F, 123456789.0F, 999999999);
	public static ToolMaterial dragonMat = EnumHelper.addToolMaterial("dragonMat", 3, 2300, 12.0F, 6.0F, 40);
	public static ToolMaterial dragonMatGlided = EnumHelper.addToolMaterial("dragonMatGlided", 3, 3000, 15.0F, 11.0F, 50);
	
	//Armor Material
	public static ArmorMaterial adminArmor = EnumHelper.addArmorMaterial("adminArmor", "ut:EpicAdminChestplate", 999999999, new int[] {10, 20, 10, 10}, 999999);
	public static ArmorMaterial steelArmor = EnumHelper.addArmorMaterial("steelArmor", "ut:Steel", 25, new int[] {3, 7, 6, 3}, 16);
	public static ArmorMaterial lapisArmor = EnumHelper.addArmorMaterial("lapisArmor", "ut:Lapis", 17, new int[] {3, 6, 5, 2}, 30);
	public static ArmorMaterial scaphArmor = EnumHelper.addArmorMaterial("scaphArmor", "ut:Scaph", 25, new int[] {3, 7, 6, 3}, 16);
	public static ArmorMaterial dragonArmor = EnumHelper.addArmorMaterial("dragonArmor", "ut:Dragon", 40, new int[] {5, 10, 8, 5}, 40);
	public static ArmorMaterial woodArmor = EnumHelper.addArmorMaterial("woodArmor", "ut:Wood", 4, new int[] {1, 2, 1, 1}, 15);
	public static ArmorMaterial stoneArmor = EnumHelper.addArmorMaterial("stoneArmor", "ut:Stone", 20, new int[] {2, 5, 4, 3}, 15);
	
	

	@Mod.Instance(Reference.MOD_ID)
	public static UsefulthingsMod instance;

	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		 
		
		//Register
		ResinTree.init();
		ResinTree.register();
		Resin.init();
		Resin.register();
		Engine.init();
		Engine.register();
		ResinLeaves.init();
		ResinLeaves.register();
		Chainsaw.init();
		Chainsaw.register();
		BucketHerm.init();
		BucketHerm.register();
		CoalPowder.init();
		CoalPowder.register();
		SteelIngot.init();
		SteelIngot.register();
		SteelSword.init();
		SteelSword.register();
		SteelAxe.init();
		SteelAxe.register();
		SteelPickaxe.init();
		SteelPickaxe.register();
		SteelShovel.init();
		SteelShovel.register();
		PlateCrafter.init();
		PlateCrafter.register();
		VegeStick.init();
		VegeStick.register();
		Scaffolding.init();
		Scaffolding.register();
		BottleHerm.init();
		BottleHerm.register();
		RoadBlock.init();
		RoadBlock.register();
		MarkedRoadBlock.init();
		MarkedRoadBlock.register();
		GoldenEgg.init();
		GoldenEgg.register();
		PolishedLapis.init();
		PolishedLapis.register();
		LapisSword.init();
		LapisSword.register();
		LapisAxe.init();
		LapisAxe.register();
		LapisPickaxe.init();
		LapisPickaxe.register();
		LapisShovel.init();
		LapisShovel.register();
		SuperBadassAdminTool.init();
		SuperBadassAdminTool.register();
		EnderSoul.init();
		EnderSoul.register();
		EnderGem.init();
		EnderGem.register();
		DragonScaleOre.init();
		DragonScaleOre.register();
		DragonScale.init();
		DragonScale.register();
		DragonGem.init();
		DragonGem.register();
		DragonSword.init();
		DragonSword.register();
		DragonAxe.init();
		DragonAxe.register();
		DragonPickaxe.init();
		DragonPickaxe.register();
		DragonShovel.init();
		DragonShovel.register();
		DragonHoe.init();
		DragonHoe.register();
		SteelBlock.init();
		SteelBlock.register();
		Limestone.init();
		Limestone.register();
		Clinker.init();
		Clinker.register();
		Crusher.init();
		Crusher.register();
		LitCrusher.init();
		LitCrusher.register();
		BladedBowWood.init();
		BladedBowWood.register();
		AirBottle.init();
		AirBottle.register();
		LavaBottle.init();
		LavaBottle.register();
		BladedBowStone.init();
		BladedBowStone.register();
		BladedBowIron.init();
		BladedBowIron.register();
		BladedBowGold.init();
		BladedBowGold.register();
		BladedBowDiamond.init();
		BladedBowDiamond.register();
		WeedKiller.init();
		WeedKiller.register();
		RedstoneIgniter.init();
		RedstoneIgniter.register();
		Propeller.init();
		Propeller.register();
		IMotorizedBoat.init();
		IMotorizedBoat.register();
		IReinforcedBoat.init();
		IReinforcedBoat.register();
		ISteelBoat.init();
		ISteelBoat.register();
		SteelPlate.init();
		SteelPlate.register();
		IronPlate.init();
		IronPlate.register();
		GoldenPowder.init();
		GoldenPowder.register();
		GlidedDragonSword.init();
		GlidedDragonSword.register();
		GlidedDragonShovel.init();
		GlidedDragonShovel.register();
		GlidedDragonAxe.init();
		GlidedDragonAxe.register();
		GlidedDragonPickaxe.init();
		GlidedDragonPickaxe.register();
		GlidedDragonHoe.init();
		GlidedDragonHoe.register();
		AncientSwordRare.init();
		AncientSwordRare.register();
		AncientShard.init();
		AncientShard.register();
		AncientSword.init();
		AncientSword.register();
		Cement.init();
		Cement.register();
		Concrete.init();
		Concrete.register();
		Mortar.init();
		Mortar.register();
		VegetalBow.init();
		VegetalBow.register();
		MakeshiftRifle.init();;
	MakeshiftRifle.register();
		Bullet.init();
		Bullet.register();
		IIronMotorizedBoat.init();
		IIronMotorizedBoat.register();
		WeaponTable.init();
		WeaponTable.register();
		GoldPlate.init();
		GoldPlate.register();
		ISteelMotorizedBoat.init();
		ISteelMotorizedBoat.register();
		
		

		//TileEntity
		GameRegistry.registerTileEntity(TileEntityPlateCrafter.class, "TileEntityPlateCrafter");
		GameRegistry.registerTileEntity(TileEntityCrusher.class, "TileEntityCrusher");
		
		//Armors
		GameRegistry.registerItem(EpicAdminChestplate.epic_admin_chestplate = new EpicAdminChestplate("epic_admin_chestplate", adminArmor, 1, 1), "epic_admin_chestplate");
		
		GameRegistry.registerItem(SteelHelmet.steel_helmet = new SteelHelmet("steel_helmet", steelArmor, 1, 0), "steel_helmet");
		GameRegistry.registerItem(SteelChestplate.steel_chestplate = new SteelChestplate("steel_chestplate", steelArmor, 1, 1), "steel_chestplate");
		GameRegistry.registerItem(SteelLeggings.steel_leggings = new SteelLeggings("steel_leggings", steelArmor, 2, 2), "steel_leggings");
		GameRegistry.registerItem(SteelBoots.steel_boots = new SteelBoots("steel_boots", steelArmor, 1, 3), "steel_boots");  
		
		GameRegistry.registerItem(LapisHelmet.lapis_helmet = new LapisHelmet("lapis_helmet", lapisArmor, 1, 0), "lapis_helmet");
		GameRegistry.registerItem(LapisChestplate.lapis_chestplate = new LapisChestplate("lapis_chestplate", lapisArmor, 1, 1), "lapis_chestplate");
		GameRegistry.registerItem(LapisLeggings.lapis_leggings = new LapisLeggings("lapis_leggings", lapisArmor, 2, 2), "lapis_leggings");
		GameRegistry.registerItem(LapisBoots.lapis_boots = new LapisBoots("lapis_boots", lapisArmor, 1, 3), "lapis_boots");  
		
		GameRegistry.registerItem(ScaphHelmet.scaph_helmet = new ScaphHelmet("scaph_helmet", scaphArmor, 1, 0), "scaph_helmet");
		GameRegistry.registerItem(ScaphChestplate.motorized_chestplate = new ScaphChestplate("motorized_chestplate", scaphArmor, 1, 1), "motorized_chestplate");
		GameRegistry.registerItem(ScaphLeggings.airbag_leggings = new ScaphLeggings("airbag_leggings", scaphArmor, 2, 2), "airbag_leggings");
		GameRegistry.registerItem(ScaphBoots.scaph_boots = new ScaphBoots("scaph_boots", scaphArmor, 1, 3), "scaph_boots");
		
		GameRegistry.registerItem(DragonHelmet.dragon_helmet = new DragonHelmet("dragon_helmet", dragonArmor, 1, 0), "dragon_helmet");
		GameRegistry.registerItem(DragonChestplate.dragon_chestplate = new DragonChestplate("dragon_chestplate", dragonArmor, 1, 1), "dragon_chestplate");
		GameRegistry.registerItem(DragonLeggings.dragon_leggings = new DragonLeggings("dragon_leggings", dragonArmor, 2, 2), "dragon_leggings");
		GameRegistry.registerItem(DragonBoots.dragon_boots = new DragonBoots("dragon_boots", dragonArmor, 1, 3), "dragon_boots");
		
		GameRegistry.registerItem(WoodHelmet.wooden_helmet = new WoodHelmet("wooden_helmet", woodArmor, 1, 0), "wooden_helmet");
		GameRegistry.registerItem(WoodChestplate.wooden_chestplate = new WoodChestplate("wooden_chestplate", woodArmor, 1, 1), "wooden_chestplate");
		GameRegistry.registerItem(WoodLeggings.wooden_leggings = new WoodLeggings("wooden_leggings", woodArmor, 2, 2), "wooden_leggings");
		GameRegistry.registerItem(WoodBoots.wooden_boots = new WoodBoots("wooden_boots", woodArmor, 1, 3), "wooden_boots");
		
		GameRegistry.registerItem(StoneHelmet.stone_helmet = new StoneHelmet("stone_helmet", stoneArmor, 1, 0), "stone_helmet");
		GameRegistry.registerItem(StoneChestplate.stone_chestplate = new StoneChestplate("stone_chestplate", stoneArmor, 1, 1), "stone_chestplate");
		GameRegistry.registerItem(StoneLeggings.stone_leggings = new StoneLeggings("stone_leggings", stoneArmor, 2, 2), "stone_leggings");
		GameRegistry.registerItem(StoneBoots.stone_boots = new StoneBoots("stone_boots", stoneArmor, 1, 3), "stone_boots");
		
		
		ModelLoader.setCustomMeshDefinition(Bullet.bullet, new ItemMeshDefinition()
	        {
	            @Override
	            public ModelResourceLocation getModelLocation(ItemStack stack)
	            {
	                if(stack.getItemDamage() == 1) // metadata 1
	                {
	                    return new ModelResourceLocation("ut:bullet_casing", "inventory");
	                }
	                
	                if(stack.getItemDamage() == 2) // metadata 1
	                {
	                    return new ModelResourceLocation("ut:pistol_bullet", "inventory");
	                }
	                
	                if(stack.getItemDamage() == 3) // metadata 1
	                {
	                    return new ModelResourceLocation("ut:pistol_bullet_casing", "inventory");
	                }
	                
	                return new ModelResourceLocation("ut:bullet", "inventory"); // autres metadatas, 0 comprit.
	            }
	        });
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		
		//crafts
		GameRegistry.addRecipe(new ItemStack(Engine.engine), new Object[]{" R ", "PRP","RRR", 'R',Items.redstone, 'P',Blocks.piston});
		GameRegistry.addShapelessRecipe(new ItemStack(BucketHerm.bucketherm), Resin.resin, Items.bucket, Blocks.sand);
		GameRegistry.addRecipe(new ItemStack(Chainsaw.chainsaw), new Object[]{"I  ", " IC"," CM", 'I',Items.iron_ingot, 'M',Engine.engine, 'C', new ItemStack(Items.dye, 1, 14)});
		GameRegistry.addShapelessRecipe(new ItemStack(SteelIngot.steelingot), CoalPowder.coalpowder ,Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(SteelSword.SteelSword), new Object[]{" A ", " A ", " S ", 'A',SteelIngot.steelingot, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(SteelAxe.SteelAxe), new Object[]{"AA ", "AS ", " S ", 'A',SteelIngot.steelingot, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(SteelPickaxe.SteelPickaxe), new Object[]{"AAA", " S ", " S ", 'A',SteelIngot.steelingot, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(SteelShovel.SteelShovel), new Object[]{" A ", " S ", " S ", 'A',SteelIngot.steelingot, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(PlateCrafter.platecrafter), new Object[]{" I ", "CSC", "CTC", 'I',Blocks.iron_block, 'S',Items.stick, 'C',Blocks.cobblestone, 'T',Blocks.crafting_table});
		GameRegistry.addShapelessRecipe(new ItemStack(VegeStick.vegetal_stick), Items.stick , Blocks.vine);
		GameRegistry.addShapelessRecipe(new ItemStack(VegeStick.vegetal_stick), Items.stick , new ItemStack(Blocks.tallgrass, 3, 0));
		GameRegistry.addRecipe(new ItemStack(Scaffolding.scaffolding, 8), new Object[]{" S ", "SPS"," S ", 'S',Items.stick, 'P',Blocks.planks});
		GameRegistry.addShapelessRecipe(new ItemStack(BottleHerm.bottleherm), Items.glass_bottle, BucketHerm.bucketherm);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_nugget, 4), GoldenEgg.golden_egg);
		GameRegistry.addRecipe(new ItemStack(PolishedLapis.polished_lapislazuli), new Object[]{"LL", "LL", 'L', new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(LapisSword.LapisSword), new Object[]{" L ", " L ", " S ", 'L',PolishedLapis.polished_lapislazuli, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(LapisAxe.LapisAxe), new Object[]{"LL ", "LS ", " S ", 'L',PolishedLapis.polished_lapislazuli, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(LapisPickaxe.LapisPickaxe), new Object[]{"LLL", " S ", " S ", 'L',PolishedLapis.polished_lapislazuli, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(LapisShovel.LapisShovel), new Object[]{" L ", " S ", " S ", 'L',PolishedLapis.polished_lapislazuli, 'S',Items.stick});
		GameRegistry.addShapelessRecipe(new ItemStack(EnderSoul.ender_soul, 3), Items.ender_eye, new ItemStack(Items.ender_pearl, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(EnderGem.ender_gem), EnderSoul.ender_soul, Items.emerald);
		GameRegistry.addSmelting(DragonScaleOre.dragon_scale_ore, new ItemStack(DragonScale.dragon_scale), 1.0F);
		GameRegistry.addRecipe(new ItemStack(SteelBlock.steel_block), new Object[]{"LLL", "LLL", "LLL", 'L',SteelIngot.steelingot});
		GameRegistry.addShapelessRecipe(new ItemStack(Clinker.clinker), Blocks.clay , new ItemStack(Limestone.limestone, 4, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(SteelIngot.steelingot, 9), SteelBlock.steel_block);
		GameRegistry.addRecipe(new ItemStack(RoadBlock.road), new Object[]{" S ", "SCS", " S ", 'S',Blocks.stone, 'C',CoalPowder.coalpowder});
		GameRegistry.addRecipe(new ItemStack(MarkedRoadBlock.Mroad), new Object[]{" S ", "SCS", " S ", 'S',RoadBlock.road, 'C', new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addRecipe(new ItemStack(Propeller.propeller), new Object[]{" S ", "SCS", " S ", 'S',Items.iron_ingot, 'C',SteelIngot.steelingot});
		GameRegistry.addRecipe(new ItemStack(ScaphHelmet.scaph_helmet), new Object[]{"ASA", "ACA", "AVA", 'S',BucketHerm.bucketherm, 'A',AirBottle.air_bottle, 'C',SteelHelmet.steel_helmet, 'V',Blocks.glass});
		GameRegistry.addRecipe(new ItemStack(ScaphChestplate.motorized_chestplate), new Object[]{" H ", "SPS", " M ", 'S',BucketHerm.bucketherm, 'H',Propeller.propeller, 'P',SteelChestplate.steel_chestplate, 'M',Engine.engine});
		GameRegistry.addRecipe(new ItemStack(ScaphLeggings.airbag_leggings), new Object[]{" S ", "LPL", "A A", 'S',BucketHerm.bucketherm, 'A',AirBottle.air_bottle, 'P',SteelLeggings.steel_leggings, 'L',Blocks.wool});
		GameRegistry.addRecipe(new ItemStack(ScaphBoots.scaph_boots), new Object[]{" S ", " B ", "L L", 'S',BucketHerm.bucketherm, 'L',SteelIngot.steelingot, 'B',SteelBoots.steel_boots});
		GameRegistry.addRecipe(new ItemStack(SteelHelmet.steel_helmet), new Object[]{"LLL", "L L", "   ", 'L',SteelIngot.steelingot});
		GameRegistry.addRecipe(new ItemStack(SteelHelmet.steel_helmet), new Object[]{"   ", "LLL", "L L", 'L',SteelIngot.steelingot});
		GameRegistry.addRecipe(new ItemStack(SteelChestplate.steel_chestplate), new Object[]{"L L", "LLL", "LLL", 'L',SteelIngot.steelingot});
		GameRegistry.addRecipe(new ItemStack(SteelLeggings.steel_leggings), new Object[]{"LLL", "L L", "L L", 'L',SteelIngot.steelingot});
		GameRegistry.addRecipe(new ItemStack(SteelBoots.steel_boots), new Object[]{"L L", "L L", "   ", 'L',SteelIngot.steelingot});
		GameRegistry.addRecipe(new ItemStack(SteelBoots.steel_boots), new Object[]{"   ", "L L", "L L", 'L',SteelIngot.steelingot});
		GameRegistry.addRecipe(new ItemStack(LapisHelmet.lapis_helmet), new Object[]{"LLL", "L L", "   ", 'L',PolishedLapis.polished_lapislazuli});
		GameRegistry.addRecipe(new ItemStack(LapisHelmet.lapis_helmet), new Object[]{"   ", "LLL", "L L", 'L',PolishedLapis.polished_lapislazuli});
		GameRegistry.addRecipe(new ItemStack(LapisChestplate.lapis_chestplate), new Object[]{"L L", "LLL", "LLL", 'L',PolishedLapis.polished_lapislazuli});
		GameRegistry.addRecipe(new ItemStack(LapisLeggings.lapis_leggings), new Object[]{"LLL", "L L", "L L", 'L',PolishedLapis.polished_lapislazuli});
		GameRegistry.addRecipe(new ItemStack(LapisBoots.lapis_boots), new Object[]{"L L", "L L", "   ", 'L',PolishedLapis.polished_lapislazuli});
		GameRegistry.addRecipe(new ItemStack(LapisBoots.lapis_boots), new Object[]{"   ", "L L", "L L", 'L',PolishedLapis.polished_lapislazuli});
		GameRegistry.addRecipe(new ItemStack(DragonHelmet.dragon_helmet), new Object[]{"LLL", "L L", "   ", 'L',DragonScale.dragon_scale});
		GameRegistry.addRecipe(new ItemStack(DragonHelmet.dragon_helmet), new Object[]{"   ", "LLL", "L L", 'L',DragonScale.dragon_scale});
		GameRegistry.addRecipe(new ItemStack(DragonChestplate.dragon_chestplate), new Object[]{"L L", "LLL", "LLL", 'L',DragonScale.dragon_scale});
		GameRegistry.addRecipe(new ItemStack(DragonLeggings.dragon_leggings), new Object[]{"LLL", "L L", "L L", 'L',DragonScale.dragon_scale});
		GameRegistry.addRecipe(new ItemStack(DragonBoots.dragon_boots), new Object[]{"L L", "L L", "   ", 'L',DragonScale.dragon_scale});
		GameRegistry.addRecipe(new ItemStack(DragonBoots.dragon_boots), new Object[]{"   ", "L L", "L L", 'L',DragonScale.dragon_scale});
		GameRegistry.addRecipe(new ItemStack(GlidedDragonSword.glided_dragon_sword), new Object[]{"SSS", "STS", "SSS", 'T',DragonSword.dragon_sword, 'S',GoldenPowder.golden_powder});
		GameRegistry.addRecipe(new ItemStack(GlidedDragonShovel.glided_dragon_shovel), new Object[]{"SSS", "STS", "SSS", 'T',DragonShovel.dragon_shovel, 'S',GoldenPowder.golden_powder});
		GameRegistry.addRecipe(new ItemStack(GlidedDragonPickaxe.glided_dragon_pickaxe), new Object[]{"SSS", "STS", "SSS", 'T',DragonPickaxe.dragon_pickaxe, 'S',GoldenPowder.golden_powder});
		GameRegistry.addRecipe(new ItemStack(GlidedDragonSword.glided_dragon_sword), new Object[]{"SSS", "STS", "SSS", 'T',DragonSword.dragon_sword, 'S',GoldenPowder.golden_powder});
		GameRegistry.addRecipe(new ItemStack(AncientSword.ancient_sword), new Object[]{" L ", " L ", " S ", 'L',AncientShard.ancient_shard, 'S',Items.stick});
		GameRegistry.addShapelessRecipe(new ItemStack(Mortar.mortar), Cement.cement, Items.water_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(Concrete.concrete), Cement.cement, Blocks.gravel, Blocks.sand);
		GameRegistry.addRecipe(new ItemStack(Crusher.crusher), new Object[]{" E ", "PFP", "RRR", 'E',Engine.engine, 'F',Blocks.furnace, 'R',Items.redstone, 'P',Blocks.piston});
		GameRegistry.addRecipe(new ItemStack(WeaponTable.weapon_table), new Object[]{" I ", "SCS", " S ", 'I',IronPlate.iron_plate, 'S',SteelPlate.steel_plate, 'C',Blocks.crafting_table});
		GameRegistry.addShapelessRecipe(new ItemStack(DragonGem.dragon_gem), EnderGem.ender_gem, DragonScale.dragon_scale);
		
		
		
		//Entitys
		EntityRegistry.registerGlobalEntityID(GoldenEggChicken.class, "goldenEggChicken", EntityRegistry.findGlobalUniqueEntityId(), new Color(192,192,192).getRGB(), new Color(255, 239, 0).getRGB());
		EntityRegistry.registerModEntity(GoldenEggChicken.class, "goldenEggChicken", 210523, this.instance, 40, 1, true);	
		
		//boats
		EntityRegistry.registerModEntity(MotorizedBoat.class, "motorizedBoat", 21052, this.instance, 40, 1, true);
		
		EntityRegistry.registerModEntity(IronMotorizedBoat.class, "ironMotorizedBoat", 21056, this.instance, 40, 1, true);
		
		EntityRegistry.registerModEntity(SteelMotorizedBoat.class, "steelMotorizedBoat", 21057, this.instance, 40, 1, true);
		
		EntityRegistry.registerModEntity(ReinforcedBoat.class, "reinforcedBoat", 21054, this.instance, 40, 1, true);
		
		EntityRegistry.registerModEntity(SteelBoat.class, "steelBoat", 21055, this.instance, 40, 1, true);
		
		//bottles
		EntityRegistry.registerModEntity(ELavaBottle.class, "lavaBottle", 21051, this.instance, 40, 1, true);
		
		//bullets
		EntityRegistry.registerModEntity(EBullet.class, "bullet", 21058, this.instance, 40, 1, true);
		
		EntityRegistry.registerModEntity(BulletCasing.class, "bullet_casing", 21059, this.instance, 40, 1, true);
		
		
		
		
		
		
		
		//Generation
		GameRegistry.registerWorldGenerator(new DragonScaleOreGen(), 2);
		GameRegistry.registerWorldGenerator(new LimestoneGen(), 2);
		
		//Guihandler
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, (IGuiHandler) new GuiHandler());

		//ChestHooks
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AncientSwordRare.rare_ancient_sword), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(AncientSwordRare.rare_ancient_sword), 1, 1, 7));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(AncientShard.ancient_shard), 1, 1, 30));
		ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AncientShard.ancient_shard), 1, 1, 40));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AncientShard.ancient_shard), 1, 1, 45));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AncientShard.ancient_shard), 1, 1, 40));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(AncientShard.ancient_shard), 1, 1, 45));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AncientShard.ancient_shard), 1, 1, 65));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AncientShard.ancient_shard), 1, 1, 70));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AncientShard.ancient_shard), 1, 1, 70));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AncientSword.ancient_sword), 1, 1, 20));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(AncientSword.ancient_sword), 1, 1, 25));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AncientSword.ancient_sword), 1, 1, 40));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST ).addItem(new WeightedRandomChestContent(new ItemStack(AncientSword.ancient_sword), 1, 1, 45));
		
		//Removed Recipes
		RemovedRecipes.removeRecipe(new ItemStack(Blocks.brick_block));
		
		MinecraftForge.addGrassSeed(new ItemStack(HerbRope.herb_rope), 100);
		
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
		GameRegistry.addRecipe(new ItemStack(Blocks.brick_block), new Object[]{"SSS", "STS", "SSS", 'T',Mortar.mortar, 'S',Items.brick});
		
		
		ModelBakery.addVariantName(Bullet.bullet, "ut:bullet", "ut:bullet_casing");
		
		
		
		
		
		
		
	}

	
	public static void registerItemRenderer() {
	    reg(Bullet.bullet, 0, "bullet");
	    reg(Bullet.bullet, 1, "bullet_casing");
	    
	}
	 
	 public static void reg(Item item, int meta, String file) {
		    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + file, "inventory"));
	 }
	 
	 
	 
	 
	
}