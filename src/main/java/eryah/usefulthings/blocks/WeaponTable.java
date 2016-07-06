package eryah.usefulthings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import eryah.usefulthings.Reference;
import eryah.usefulthings.UsefulthingsMod;
import eryah.usefulthings.container.ContainerWeaponTable;

public class WeaponTable extends Block {

	 protected WeaponTable(Material mat) {
	        super(Material.iron);
	        this.setHarvestLevel("pickaxe", 1);
	        this.setHardness(10.0f);
	        this.setResistance(15.0f);
	    }
	
	 public static Block weapon_table;
	 
	 public static void init()
		{
		 weapon_table = new WeaponTable(Material.rock).setUnlocalizedName("weapon_table").setCreativeTab(UsefulthingsMod.UTTab);
		}
		
		public static void register()
		{
			GameRegistry.registerBlock(weapon_table, weapon_table.getUnlocalizedName().substring(5));
		}
		
		public static void registerRenders()
		{
			registerRender(weapon_table);
		}
		
		public static void registerRender(Block block)
		{
			Item item = Item.getItemFromBlock(block);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
	
		@Override
	    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
		{			
	    	playerIn.openGui(UsefulthingsMod.instance, 2, worldIn, pos.getX(), pos.getY(), pos.getZ());
			return true;
		}

		@SideOnly(Side.CLIENT)
	    public Item getItem(World worldIn, BlockPos pos)
	    {
	        return Item.getItemFromBlock(WeaponTable.weapon_table);
	    }
		
		 public static class InterfaceWeaponTable implements IInteractionObject
	        {
	            private final World world;
	            private final BlockPos position;
	            private static final String __OBFID = "CL_00002127";

	            public InterfaceWeaponTable(World worldIn, BlockPos pos)
	            {
	                this.world = worldIn;
	                this.position = pos;
	            }

	            /**
	             * Gets the name of this command sender (usually username, but possibly "Rcon")
	             */
	            public String getName()
	            {
	                return null;
	            }

	            /**
	             * Returns true if this thing is named
	             */
	            public boolean hasCustomName()
	            {
	                return false;
	            }

	            public IChatComponent getDisplayName()
	            {
	                return new ChatComponentTranslation(WeaponTable.weapon_table.getUnlocalizedName() + ".name", new Object[0]);
	            }

	            public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
	            {
	                return new ContainerWeaponTable(playerInventory, this.world, this.position);
	            }

	            public String getGuiID()
	            {
	                return "ut:weapon_table";
	            }
	        }
		
		
		
	
}
