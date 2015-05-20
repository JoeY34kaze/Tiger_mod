package com.tiger.tigermod.items;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Armor_anime extends Tiger_armor {
	private  int t;

	public Armor_anime(ArmorMaterial m, int r, int a, String string) {
		super(m, r, a);
		this.t=1;
		this.setUnlocalizedName(string);
		// TODO Auto-generated constructor stub
	}


}
