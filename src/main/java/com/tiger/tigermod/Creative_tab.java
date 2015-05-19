package com.tiger.tigermod;

import com.tiger.tigermod.init.AllTigerItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Creative_tab extends CreativeTabs{

	public Creative_tab(String label) {
		super(label);
		this.setBackgroundImageName("joeycreativebackgroundtab.png");
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Item getTabIconItem() {//overrida klic privzete funkcije. vrne ikono ki naj se narise na tab
		// TODO Auto-generated method stub
		return AllTigerItems.furgl;
	}

}
