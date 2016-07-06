package eryah.usefulthings.proxy;

import eryah.usefulthings.client.models.ModelBullet;
import eryah.usefulthings.client.models.ModelBulletCasing;
import eryah.usefulthings.client.models.ModelMotoBoat;
import eryah.usefulthings.client.render.RenderBullet;
import eryah.usefulthings.client.render.RenderBulletCasing;
import eryah.usefulthings.client.render.RenderMotoBoat;
import eryah.usefulthings.entity.item.BulletCasing;
import eryah.usefulthings.entity.item.MotorizedBoat;
import eryah.usefulthings.entity.projectile.EBullet;
import eryah.usefulthings.generation.DragonScaleOreGen;
import eryah.usefulthings.generation.LimestoneGen;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void registerRenders() {
		
	}
	
	public void init(FMLInitializationEvent e) {
	    
	    GameRegistry.registerWorldGenerator(new DragonScaleOreGen(), 2);
	    GameRegistry.registerWorldGenerator(new LimestoneGen(), 0);
	}
	
	private void RenderInformation() {
		RenderingRegistry.registerEntityRenderingHandler(MotorizedBoat.class, new RenderMotoBoat(Minecraft.getMinecraft().getRenderManager(), new ModelMotoBoat(), 0.3F));
RenderingRegistry.registerEntityRenderingHandler(EBullet.class, new RenderBullet(Minecraft.getMinecraft().getRenderManager(), new ModelBullet(), 0.3F));		
		RenderingRegistry.registerEntityRenderingHandler(BulletCasing.class, new RenderBulletCasing(Minecraft.getMinecraft().getRenderManager(), new ModelBulletCasing(), 0.1F));
	}
}
