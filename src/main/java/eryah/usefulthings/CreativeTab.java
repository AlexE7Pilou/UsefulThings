package eryah.usefulthings;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import eryah.usefulthings.blocks.PlateCrafter;

public class CreativeTab extends CreativeTabs {

    public CreativeTab(String label) {
        super(label);

        //Tres important de ne pas ecrire "tab_"
        this.setBackgroundImageName("eryah.png");
    }

    @Override
    public Item getTabIconItem() {
    	 return Item.getItemFromBlock(PlateCrafter.platecrafter);
    }

}