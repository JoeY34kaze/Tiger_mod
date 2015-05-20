package com.tiger.tigermod.init;

import com.tiger.tigermod.Reference;
import com.tiger.tigermod.Main_mod_class;
import com.tiger.tigermod.Creative_tab;
import com.tiger.tigermod.items.Armor_anime;
import com.tiger.tigermod.items.ItemCoordinateCache;
import com.tiger.tigermod.items.ItemFurgl;
import com.tiger.tigermod.items.Tiger_armor;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllTigerItems extends Item {
	
	//tle na vrhu je treba deklarirat vse staticne objekte ker drgac minecraft crkne ko hocs nrdit recept
	/*-----------------Items--------------------*/
	public static Item furgl;
	public static Item coordcache;
	
	
	/*-----------------Materials-----------------*/
	//public static ArmorMaterial TUTORIALA = EnumHelper.addArmorMaterial("TUTORIALA", "tutorial:tutorial", 16, new int[] {3, 8, 6, 3}, 30);
	
	
	
	/*---------------------Armors-------------------*/
	public static Item kawaiihead;
	public static Item kawaiichest;
	public static Item kawaiilegs;
	public static Item kawaiifeet;
	
	
	
	
	
	public static void init(){
		coordcache=	new ItemCoordinateCache()	.setUnlocalizedName("coordcache")	.setCreativeTab(Main_mod_class.creative_tab);
		furgl=		new ItemFurgl()				.setUnlocalizedName("furgl")		.setCreativeTab(Main_mod_class.creative_tab);
		
		
		kawaiihead=new Armor_anime(ArmorMaterial.DIAMOND, 1, 0, "kawaiihead").setCreativeTab(Main_mod_class.creative_tab);
		kawaiichest=new Armor_anime(ArmorMaterial.DIAMOND, 1, 1, "kawaiichest").setCreativeTab(Main_mod_class.creative_tab);
		kawaiilegs=new Armor_anime(ArmorMaterial.DIAMOND, 2, 2, "kawaiilegs").setCreativeTab(Main_mod_class.creative_tab);
		kawaiifeet= new Armor_anime(ArmorMaterial.DIAMOND, 1, 3, "kawaiifeet").setCreativeTab(Main_mod_class.creative_tab);
	}
	
	public static void register(){//tle je treba vse iteme registrirat
		/*--------------------------Items---------------------------*/
		GameRegistry.registerItem(coordcache, coordcache.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(furgl, furgl.getUnlocalizedName().substring(5)); //tile.(test_item)  vrne brez prvih 5 znakotko da je samo ime

		
		
		/*--------------------------------Armors---------------------------------*/
		//anime - kawaii armor
			GameRegistry.registerItem(kawaiihead,kawaiihead.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(kawaiichest,kawaiichest.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(kawaiilegs,kawaiilegs.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(kawaiifeet,kawaiifeet.getUnlocalizedName().substring(5));	
	}
	
	public static void registerRenders(){
		/*--------items--------*/
		registerRender(coordcache);
		registerRender(furgl);
		
		
		
		
		
		/*---------------armors------------nevem ce sploh treba----*/
		//registerRender(kawaiihead);
		//registerRender(kawaiichest);
		//registerRender(kawaiilegs);
		//registerRender(kawaiifeet);
		
		
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,new ModelResourceLocation(Reference.MOD_ID+":"+item.getUnlocalizedName().substring(5), "inventory"));
	}
}
