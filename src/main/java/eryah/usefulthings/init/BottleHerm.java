package eryah.usefulthings.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class BottleHerm extends Item {
	
public static Item bottleherm;
	
	public static void init(){
		bottleherm = new BottleHerm().setUnlocalizedName("bottleherm").setCreativeTab(UsefulthingsMod.UTTab);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(bottleherm, bottleherm.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(bottleherm);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(worldIn, playerIn, true);

        if(movingobjectposition == null)
        {
            --itemStackIn.stackSize;
            playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);

            if(itemStackIn.stackSize <= 0)
            {
                return new ItemStack(AirBottle.air_bottle);
            }

            if(!playerIn.inventory.addItemStackToInventory(new ItemStack(AirBottle.air_bottle)))
            {
                playerIn.dropPlayerItemWithRandomChoice(new ItemStack(AirBottle.air_bottle, 1, 0), false);
            }
        }
        else if(movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
        {
            Block block = worldIn.getBlockState(movingobjectposition.getBlockPos()).getBlock();
            if(block == Blocks.lava || block == Blocks.flowing_lava) // retire || Blocks.flowing_lava si tu ne veux que prendre en compte les sources de lave
            { 
                --itemStackIn.stackSize;
                playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);

                if(itemStackIn.stackSize <= 0)
                {
                    return new ItemStack(LavaBottle.lava_bottle);
                }

                if(!playerIn.inventory.addItemStackToInventory(new ItemStack(LavaBottle.lava_bottle)))
                {
                    playerIn.dropPlayerItemWithRandomChoice(new ItemStack(LavaBottle.lava_bottle, 1, 0), false);
                }
            }
           
        }

        return itemStackIn;
    }
    }
  

