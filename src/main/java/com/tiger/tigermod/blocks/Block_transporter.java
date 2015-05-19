package com.tiger.tigermod.blocks;

import com.tiger.tigermod.items.ItemCoordinateCache;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Block_transporter extends Block{

	public Block_transporter(Material materialIn) {
		super(materialIn);
		this.blockHardness=20;
		// TODO Auto-generated constructor stub
	}
	
	  public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	    {//ko je block(teleporter) kliknjen
		ItemStack stack;
		if((stack=playerIn.getEquipmentInSlot(0)).getItem() instanceof ItemCoordinateCache){//ce ima akter v roki coord cache
			if(stack.getTagCompound().hasKey("coords")){//ce ima coord cache informacijo
				NBTTagCompound nbt = (NBTTagCompound) stack.getTagCompound().getTag("coords");
				int dim = nbt.getInteger("dim");
				int posX = nbt.getInteger("posX");
				int posY = nbt.getInteger("posY");
				int posZ = nbt.getInteger("posZ");
				
				playerIn.setPosition(posX, posY, posZ);
				
			}
		}
		return false;
	}

    /**
     * Called to determine whether to allow the a block to handle its own indirect power rather than using the default rules.
     * @param world The world
     * @param pos Block position in world
     * @param side The INPUT side of the block to be powered - ie the opposite of this block's output side
     * @return Whether Block#isProvidingWeakPower should be called when determining indirect power
     */
   // public boolean shouldCheckWeakPower(IBlockAccess world, BlockPos pos, EnumFacing side)
    //{
     //   return isNormalCube();
   // }

}
