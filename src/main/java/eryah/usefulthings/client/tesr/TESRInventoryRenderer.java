package eryah.usefulthings.client.tesr;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import eryah.usefulthings.blocks.PlateCrafter;

public class TESRInventoryRenderer {

    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, Render renderer)
    {
        return false;
    }


    public boolean shouldRender3DInInventory(int modelId)
    {
        return false;
    }

    public int getRenderId()
    {
        return 0;
    }
	
    public void renderInventoryBlock(Block block, int metadata, int modelId, Render renderer)
    {
        if(block == PlateCrafter.platecrafter && metadata == 0)
        {
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(0.0F, -1.0F, 0.0F);
            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntityPlateCrafterSpecialRenderer.texture);
            TileEntityPlateCrafterSpecialRenderer.model.renderAll();
            GL11.glPopMatrix();
        }
    }
	
    
	
	
	
	
	
	
	
	
	
	
	
	
}
