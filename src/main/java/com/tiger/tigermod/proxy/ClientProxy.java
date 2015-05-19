package com.tiger.tigermod.proxy;

import com.tiger.tigermod.init.AllTigerBlocks;
import com.tiger.tigermod.init.AllTigerItems;

public class ClientProxy extends CommonProxy {//client

		@Override
		public void registerRenders(){//ta se klice samo na clientu
			AllTigerItems.registerRenders();
			AllTigerBlocks.registerRenders();
		}
}
