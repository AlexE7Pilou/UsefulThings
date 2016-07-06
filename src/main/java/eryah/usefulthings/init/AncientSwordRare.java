package eryah.usefulthings.init;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class AncientSwordRare extends Item {
	
	private float attackDamage;
	public static Item rare_ancient_sword;
	
	public AncientSwordRare()  {
		 setMaxStackSize(1);
		 setMaxDamage(3000);
		 this.attackDamage = 25.0F;
		 canRepair = true;
	}
	
	
	
	public static void init(){
		rare_ancient_sword = new AncientSwordRare().setUnlocalizedName("rare_ancient_sword").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(rare_ancient_sword, rare_ancient_sword.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(rare_ancient_sword);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack)
	{
	    return EnumRarity.EPIC;
	}

	 public float getStrVsBlock(ItemStack stack, Block block)
	    {
	        if (block == Blocks.web)
	        {
	            return 15.0F;
	        }
	        else
	        {
	            Material material = block.getMaterial();
	            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
	        }
	    }
	
	 public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
	    {
	        stack.damageItem(1, attacker);
	        return true;
	    }
	
	 public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase playerIn)
	    {
	        if ((double)blockIn.getBlockHardness(worldIn, pos) != 0.0D)
	        {
	            stack.damageItem(2, playerIn);
	        }

	        return true;
	    }
	 
	 
	 public EnumAction getItemUseAction(ItemStack stack)
	    {
	        return EnumAction.BLOCK;
	    }
	 
	 public int getMaxItemUseDuration(ItemStack stack)
	    {
	        return 72000;
	    }
	 
	 public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
	    {
	        playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));
	        return itemStackIn;
	    }
	 
	 public boolean canHarvestBlock(Block blockIn)
	    {
	        return blockIn == Blocks.web;
	    }
	
	 public float getDamageVsEntity(float f)
	    {
	        return getDamageVsEntity(25.0F);
	    }
	
	 public Multimap getItemAttributeModifiers()
	    {
	        Multimap multimap = super.getItemAttributeModifiers();
	        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)this.attackDamage, 0));
	        return multimap;
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
