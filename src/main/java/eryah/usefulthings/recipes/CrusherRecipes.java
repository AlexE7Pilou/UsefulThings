package eryah.usefulthings.recipes;

import com.google.common.collect.Maps;

import eryah.usefulthings.blocks.Clinker;
import eryah.usefulthings.init.Cement;
import eryah.usefulthings.init.CoalPowder;
import eryah.usefulthings.init.GoldenPowder;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

public class CrusherRecipes
{
    private static final CrusherRecipes smeltingBase = new CrusherRecipes();
    /** The list of smelting results. */
    private Map smeltingList = Maps.newHashMap();
    /** A list which contains how many experience points each recipe output will give. */
    private Map experienceList = Maps.newHashMap();
    private static final String __OBFID = "CL_00000085";

    /**
     * Returns an instance of FurnaceRecipes.
     */
    public static CrusherRecipes instance()
    {
        return smeltingBase;
    }

    private CrusherRecipes()
    {
        this.addSmeltingRecipeForBlock(Clinker.clinker, new ItemStack(Cement.cement), 0.3F);
        this.addSmeltingRecipeForBlock(Blocks.gold_block, new ItemStack(GoldenPowder.golden_powder, 4), 1.0F);
        this.addSmelting(Items.coal, new ItemStack(CoalPowder.coalpowder, 2), 1.0F);

        
    }

    /**
     * Adds a smelting recipe, where the input item is an instance of Block.
     *  
     * @param input The block to be used as the input for the smelting recipe.
     * @param stack The output for this recipe in the form of an ItemStack.
     * @param experience The amount of experience this recipe will give the player.
     */
    public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addSmelting(Item.getItemFromBlock(input), stack, experience);
    }

    /**
     * Adds a smelting recipe using an Item as the input item.
     *  
     * @param input The input Item to be used for this recipe.
     * @param stack The output ItemStack for this recipe.
     * @param experience The amount of experience this recipe will give the player.
     */
    public void addSmelting(Item input, ItemStack stack, float experience)
    {
        this.addSmeltingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    /**
     * Adds a smelting recipe using an ItemStack as the input for the recipe.
     *  
     * @param input The input ItemStack for this recipe.
     * @param stack The output ItemStack for this recipe.
     * @param experience The amount of experience this recipe will give the player.
     */
    public void addSmeltingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        this.smeltingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getSmeltingResult(ItemStack stack)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    /**
     * Compares two itemstacks to ensure that they are the same. This checks both the item and the metadata of the item.
     */
    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    public float getSmeltingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.compareItemStacks(stack, (ItemStack)entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}