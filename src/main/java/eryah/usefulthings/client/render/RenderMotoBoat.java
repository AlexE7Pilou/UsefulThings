package eryah.usefulthings.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.client.models.ModelMotoBoat;
import eryah.usefulthings.entity.item.MotorizedBoat;

@SideOnly(Side.CLIENT)
public class RenderMotoBoat extends RenderBoat
{
    private static final ResourceLocation boatTextures = new ResourceLocation("ut:textures/entity/motoboat.png");
    /** instance of ModelBoat for rendering */
    protected ModelBase modelBoat = new ModelMotoBoat();

    public RenderMotoBoat(RenderManager render, ModelMotoBoat model, float shadow)
    {
        super(Minecraft.getMinecraft().getRenderManager());
        this.shadowSize = 0.5F;
    }

    public void doRender(MotorizedBoat entity, double p_180552_2_, double p_180552_4_, double p_180552_6_, float p_180552_8_, float p_180552_9_)
    {
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)p_180552_2_, (float)p_180552_4_ + 1.27F, (float)p_180552_6_);
        GlStateManager.rotate(90.0F - p_180552_8_, 0.0F, 1.0F, 0.0F);
        float f2 = (float)entity.getTimeSinceHit() - p_180552_9_;
        float f3 = entity.getDamageTaken() - p_180552_9_;

        if (f3 < 0.0F)
        {
            f3 = 0.0F;
        }

        if (f2 > 0.0F)
        {
            GlStateManager.rotate(MathHelper.sin(f2) * f2 * f3 / 10.0F * (float)entity.getForwardDirection(), 1.0F, 0.0F, 0.0F);
        }

        float f4 = 0.75F;
        GlStateManager.scale(f4, f4, f4);
        GlStateManager.scale(1.0F / f4, 1.0F / f4, 1.0F / f4);
        this.bindEntityTexture(entity);
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        this.modelBoat.render(entity, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GlStateManager.popMatrix();
    }

    protected ResourceLocation getEntityTexture(MotorizedBoat p_180553_1_)
    {
        return boatTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((MotorizedBoat)entity);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(Entity entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.doRender((MotorizedBoat)entity, x, y, z, p_76986_8_, partialTicks);
    }
}