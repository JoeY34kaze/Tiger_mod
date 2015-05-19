package com.tiger.tigermod.init;

import com.tiger.tigermod.Reference;
import com.tiger.tigermod.Main_mod_class;
import com.tiger.tigermod.blocks.Block_saso;
import com.tiger.tigermod.blocks.Block_transporter;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllTigerBlocks {
	//tle na vrhu je treba deklarirat vse staticne objekte ker drgac minecraft crkne ko hocs nrdit recept
	public static Block coordtransporter;
	public static Block saso_block;
	
	public static void init(){
		coordtransporter=	new Block_transporter(Material.rock)	.setUnlocalizedName("coordtransporter")	.setCreativeTab(Main_mod_class.creative_tab);
		saso_block=			new Block_saso()			.setUnlocalizedName("saso_block")		.setCreativeTab(Main_mod_class.creative_tab);
	}
	
	public static void register(){
		GameRegistry.registerBlock(coordtransporter, coordtransporter.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(saso_block, saso_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders(){
		registerRender(coordtransporter);
		registerRender(saso_block);
	}
	
	public static void registerRender(Block block){
		Item item=Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5), "inventory"));

	}
}
