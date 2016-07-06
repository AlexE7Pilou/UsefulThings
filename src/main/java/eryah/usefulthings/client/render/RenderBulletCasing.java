package eryah.usefulthings.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.client.models.ModelBullet;
import eryah.usefulthings.client.models.ModelBulletCasing;
import eryah.usefulthings.entity.item.BulletCasing;
import eryah.usefulthings.entity.projectile.EBullet;

@SideOnly(Side.CLIENT)
public class RenderBulletCasing extends Render
{
    private static final ResourceLocation Textures = new ResourceLocation("ut:textures/entity/bullet_casing.png");
    /** instance of ModelBoat for rendering */
    protected ModelBase modelBullet = new ModelBulletCasing();

    public RenderBulletCasing(RenderManager p_i46193_1_, ModelBulletCasing modelBulletCasing, float shadow)
    {
        super(Minecraft.getMinecraft().getRenderManager());
    }

    public void doRender(BulletCasing p_180551_1_, double p_180551_2_, double p_180551_4_, double p_180551_6_, float p_180551_8_, float p_180551_9_)
    {
        this.bindEntityTexture(p_180551_1_);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)p_180551_2_, (float)p_180551_4_ - 1.50D, (float)p_180551_6_);
        GlStateManager.rotate(p_180551_1_.prevRotationYaw + (p_180551_1_.rotationYaw - p_180551_1_.prevRotationYaw) * p_180551_9_ - 90.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(p_180551_1_.prevRotationPitch + (p_180551_1_.rotationPitch - p_180551_1_.prevRotationPitch) * p_180551_9_, 0.0F, 0.0F, 1.0F);
        

        GlStateManager.disableRescaleNormal();
        this.modelBullet.render(p_180551_1_, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GlStateManager.popMatrix();
       
    }

    protected ResourceLocation getEntityTexture(BulletCasing p_180550_1_)
    {
        return Textures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((BulletCasing)entity);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(Entity entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.doRender((BulletCasing)entity, x, y, z, p_76986_8_, partialTicks);
    }
}