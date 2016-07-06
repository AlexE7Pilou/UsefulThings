package eryah.usefulthings.entity.projectile;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ELavaBottle extends EntityThrowable {

	private BlockPos blockPos;
	public int x;
	public int y;
	public int z;
	
    public ELavaBottle(World worldIn)
    {
        super(worldIn);
    }

    public ELavaBottle(World worldIn, EntityLivingBase p_i1786_2_)
    {
        super(worldIn, p_i1786_2_);
    }

    public ELavaBottle(World worldIn, double p_i1787_2_, double p_i1787_4_, double p_i1787_6_)
    {
        super(worldIn, p_i1787_2_, p_i1787_4_, p_i1787_6_);
    }

    public ELavaBottle(World worldObj, double posX, double posY, double posZ, int j) {
    	 super(worldObj);
	}

	/**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    protected float getGravityVelocity()
    {
        return 0.07F;
    }

    protected float getVelocity()
    {
        return 0.7F;
    }

    protected float getInaccuracy()
    {
        return -20.0F;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition mop)
    { 
    	
    	 if (!this.worldObj.isRemote)
         {
             this.worldObj.playAuxSFX(2002, new BlockPos(this), 0);
             int i = 3 + this.worldObj.rand.nextInt(5) + this.worldObj.rand.nextInt(5);
    	
            this.setDead();
            if(mop.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY) {
            	mop.entityHit.setFire(20);
            	mop.entityHit.attackEntityFrom(DamageSource.lava, 5);
            }
            
            if(mop.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) { 
            		           	
            		if(this.worldObj.isAirBlock(mop.getBlockPos())) {
            			worldObj.setBlockState(mop.getBlockPos(), Blocks.fire.getDefaultState()); 
            		}
            }
            
            else {
            	return;
            }
            
         }
         }

	private BlockPos blockPos(int x, int y, int z) {
		// TODO Auto-generated method stub
		return this.blockPos;
	}
    
    
    }
