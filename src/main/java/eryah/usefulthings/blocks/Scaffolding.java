package eryah.usefulthings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;

public class Scaffolding extends Block {
    
protected Scaffolding(Material materialIn) {
        super(Material.wood);
        // TODO Auto-generated constructor stub
    }

public static Block scaffolding;
    
    public static void init()
    {
        scaffolding = new Scaffolding(Material.wood).setUnlocalizedName("scaffolding").setCreativeTab(UsefulthingsMod.UTTab);
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(scaffolding, scaffolding.getUnlocalizedName().substring(5));
    }
    
    public static void registerRenders()
    {
        registerRender(scaffolding);
    }
    
    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    
    public boolean renderAsNormalBlock()
   {
       return false;
   }
    
     @Override
        public boolean isVisuallyOpaque()
        {
            return false; //Si visuellement opaque
        }
        
        @Override
        public boolean isOpaqueCube()
        {
            return false; //Si effectivement opaque
        }

        @Override
        public boolean isFullCube()
        {
            return true; //Si complet
        }
    
     @SideOnly(Side.CLIENT)

        public EnumWorldBlockLayer getBlockLayer()
        {
            return EnumWorldBlockLayer.CUTOUT;
        }
     
     public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side )
    {
        switch(side) {
        
        case DOWN:
            return true;
        default:
            return true;
        }    
    
    }
    
     public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity)
        {
            return true;
        }
     
     @Override
     public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity)
     {
         if (entity.onGround || entity.isCollidedVertically) { return; }
         if (entity.motionY >= 0.1) {
             entity.setPosition(entity.posX, entity.posY + 1.0F, entity.posZ);
         } else if (entity.motionY <= -0.1) {
             Block blockUnder = world.getBlockState(new BlockPos(entity.posX, entity.posY - 3, entity.posZ)).getBlock();
             if (blockUnder == null || blockUnder == this) {
                 entity.setPosition(entity.posX, entity.posY - 1.0F, entity.posZ);
             }
         }
     }
     
     public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
        {
            this.setBlockBoundsBasedOnState(worldIn, pos);
            return super.getCollisionBoundingBox(worldIn, pos, state);
        }

        @SideOnly(Side.CLIENT)
        public AxisAlignedBB getSelectedBoundingBox(World worldIn, BlockPos pos)
        {
            this.setBlockBoundsBasedOnState(worldIn, pos);
            return super.getSelectedBoundingBox(worldIn, pos);
        }

        public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos)
        {
            this.setBlockBounds(0.1F, 0.1F, 0.1F, 0.9F, 0.9F, 0.9F);
        }

}