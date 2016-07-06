package eryah.usefulthings;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import eryah.usefulthings.container.ContainerCrusher;
import eryah.usefulthings.container.ContainerPlateCrafter;
import eryah.usefulthings.container.ContainerWeaponTable;
import eryah.usefulthings.gui.GuiCrusher;
import eryah.usefulthings.gui.GuiPlateCrafter;
import eryah.usefulthings.gui.GuiWeaponTable;
import eryah.usefulthings.tileentity.TileEntityCrusher;
import eryah.usefulthings.tileentity.TileEntityPlateCrafter;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		switch (ID) {
		case 0:
			return new ContainerCrusher(((TileEntityCrusher)world.getTileEntity(new BlockPos(x, y, z))), player.inventory);
		case 1:
			return new ContainerPlateCrafter(((TileEntityPlateCrafter)world.getTileEntity(new BlockPos(x, y, z))), player.inventory);
		case 2:
			return new ContainerWeaponTable(player.inventory, world,(new BlockPos(x, y, z)) );
		}
		return null;
}
	

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		
			
		
			switch (ID) {
			case 0:
				return new GuiCrusher(((TileEntityCrusher)world.getTileEntity(new BlockPos(x, y, z))), player.inventory);
			case 1:
				return new GuiPlateCrafter(((TileEntityPlateCrafter)world.getTileEntity(new BlockPos(x, y, z))), player.inventory);
			case 2:
				return new GuiWeaponTable(player.inventory, world,(new BlockPos(x, y, z)) );
			}
		
		return null;
	}
	
}