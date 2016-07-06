package eryah.usefulthings.client.tesr;

import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import eryah.usefulthings.Reference;
import eryah.usefulthings.client.models.Modelplatecrafter;
import eryah.usefulthings.tileentity.TileEntityPlateCrafter;

public class TileEntityPlateCrafterSpecialRenderer extends TileEntitySpecialRenderer {
     public static Modelplatecrafter model = new Modelplatecrafter();
       public static ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/models/blocks/platecrafter.png");

            private void renderTileEntityPlateCrafterAt(TileEntityPlateCrafter tile, double x, double y, double z, float partialRenderTick) // ma propre fonction
            {
                GL11.glPushMatrix(); // ouvre une matrix
                GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D); // déplace le bloc sur les coordonnés et le centre
                GL11.glRotatef(180F, 180.0F, 0.0F, 1.0F); // met droit le bloc (par défaut il est à l'envers)
                GL11.glRotatef(90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
                this.bindTexture(texture); // affiche la texture
                model.renderAll(); // rend le modèle
                GL11.glPopMatrix(); // ferme la matrix
            }

    @Override
    public void renderTileEntityAt(TileEntity tile, double x,
            double y, double z, float partialRenderTick, int i) {
        this.renderTileEntityPlateCrafterAt((TileEntityPlateCrafter)tile, x, y, z, partialRenderTick); // j'appelle ma fonction renderTileEntityTutorielAt en castant TileEntityTutoriel à l'argument tile
    }
    
  
}