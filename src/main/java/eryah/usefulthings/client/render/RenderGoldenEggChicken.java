package eryah.usefulthings.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import eryah.usefulthings.Reference;
import eryah.usefulthings.entity.item.MotorizedBoat;
import eryah.usefulthings.entity.passive.GoldenEggChicken;



public class RenderGoldenEggChicken extends RenderChicken {
		
	public final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/entity/gechicken.png"); 
		
		
		public RenderGoldenEggChicken(RenderManager renderManager, ModelChicken model, float shadow)
		{
			super(Minecraft.getMinecraft().getRenderManager(), model, shadow);
		}
		
		protected ResourceLocation getEntityTexture(EntityLiving living)
		{
			return this.getMobGoldenEggChickenTexture((GoldenEggChicken)living);
		}

		private ResourceLocation getMobGoldenEggChickenTexture(GoldenEggChicken mobTutoriel)
		{
			return texture;
		}

		@Override
		protected ResourceLocation getEntityTexture(Entity entity) {
			return this.getEntityTexture((GoldenEggChicken)entity);
		}

		
	}
