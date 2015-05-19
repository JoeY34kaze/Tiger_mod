package com.tiger.tigermod.init;

import com.tiger.tigermod.Reference;
import com.tiger.tigermod.Main_mod_class;
import com.tiger.tigermod.Creative_tab;
import com.tiger.tigermod.items.ItemCoordinateCache;
import com.tiger.tigermod.items.ItemFurgl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllTigerItems {
	
	//tle na vrhu je treba deklarirat vse staticne objekte ker drgac minecraft crkne ko hocs nrdit recept
	public static Item furgl;
	public static Item coordcache;
	
	
	public static void init(){
		coordcache=	new ItemCoordinateCache()	.setUnlocalizedName("coordcache")	.setCreativeTab(Main_mod_class.creative_tab);
		furgl=		new ItemFurgl()				.setUnlocalizedName("furgl")		.setCreativeTab(Main_mod_class.creative_tab);
	}
	
	public static void register(){//tle je treba vse iteme registrirat
		GameRegistry.registerItem(coordcache, coordcache.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(furgl, furgl.getUnlocalizedName().substring(5)); //tile.(test_item)  vrne brez prvih 5 znakotko da je samo ime

	}
	
	public static void registerRenders(){
		registerRender(coordcache);
		registerRender(furgl);
		
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
}
