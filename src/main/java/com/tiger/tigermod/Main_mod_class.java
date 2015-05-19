package com.tiger.tigermod;

/*MrCrayfish tutorials
 * Modding 1.8
 * https://www.youtube.com/watch?v=2_qM-Z0IQ4k
 * 
 * 
 * za gradelw quick build
 * http://www.wuppy29.com/minecraft/modding-tutorials/wuppys-minecraft-forge-modding-tutorials-for-1-7-releasing-your-mod-standard-setup/#sthash.EBINWcVM.zZ4Izy4B.dpbs
 * 
 * 
 */


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tiger.tigermod.blocks.Block_saso;
import com.tiger.tigermod.blocks.Block_transporter;
import com.tiger.tigermod.init.AllTigerBlocks;
import com.tiger.tigermod.init.AllTigerItems;
import com.tiger.tigermod.items.ItemCoordinateCache;
import com.tiger.tigermod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.VERSION)//Tell forge "Oh hey, there's a new mod here to load."
public class Main_mod_class {
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final Creative_tab creative_tab = new Creative_tab("Joey's tab");
	

	//vse kar se nardi predns se nalozi
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		AllTigerBlocks.init();
		AllTigerBlocks.register();
		AllTigerItems.init();
		AllTigerItems.register();

		addRecipes();
	}
	//vse kar se nardi vmes
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
		
		 //zakomentirano ker nevem kako popravt da ne crasha. recepti z vanilla itemi delajo brez problema.
	}
	//vse kar se nardi potem ko se nalozi
	@EventHandler
	public void postInt(FMLPostInitializationEvent event){
		
	}
	
	public static void addRecipes(){
		/*
		 * NEDELA PA NEVEM ZAKAJ: TUT GOOGLE NEVE TKO DA SMO FUCKED
		 */
		
		/* One thing to note is that you can’t have a stacksize of more 
		 * than one as a crafting component. It won’t crash, but it will not work properly.
		 */
		//recept za transporter

		GameRegistry.addShapelessRecipe( new ItemStack(AllTigerBlocks.coordtransporter) , Blocks.diamond_block , Blocks.gold_block);

		GameRegistry.addShapelessRecipe(new ItemStack(AllTigerItems.coordcache) , Items.diamond , Items.iron_ingot);

		GameRegistry.addShapelessRecipe(new ItemStack(AllTigerBlocks.saso_block) , Blocks.pumpkin, Blocks.glass);
		
		
		GameRegistry.addRecipe(new ItemStack(AllTigerBlocks.saso_block),
	    		"AAA",
	    		"AAA",
	    		"AAA",
	    		'A', Items.cookie
	    	);
		
	}
	
	
	

    private static Block getRegisteredBlock(String p_180383_0_)
    {
        return (Block)Block.blockRegistry.getObject(new ResourceLocation(p_180383_0_));
    }
	
}
