package eryah.usefulthings.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import eryah.usefulthings.Reference;
import eryah.usefulthings.entity.item.SteelBoat;



public class RenderSteelBoat extends RenderBoat {
		
	public final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/entity/steelboat.png"); 
		
		
		public RenderSteelBoat(RenderManager renderManager, ModelBoat model, float shadow)
		{
			super(Minecraft.getMinecraft().getRenderManager());
		}
		
		protected ResourceLocation getEntityTexture(SteelBoat living)
		{
			return this.getMobSteelBoatTexture((SteelBoat)living);
		}

		private ResourceLocation getMobSteelBoatTexture(SteelBoat ironBoat)
		{
			return texture;
		}

		@Override
		protected ResourceLocation getEntityTexture(Entity entity) {
			return this.getEntityTexture((SteelBoat)entity);
		}

		
	}
