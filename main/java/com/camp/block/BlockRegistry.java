package com.camp.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistry {
	//paste your code:
	static green greenBlock;
	
	
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}

	
	public static ArrayList<Block> blockList;
	
	public static void initializeBlock(){
		blockList = BlockMaker.blockListMaker();
		greenBlock = new green(Material.glass);
	}
		
	public static void registerBlock(){
		for(Block each : blockList){
		GameRegistry.registerBlock(each, each.getUnlocalizedName().substring(5));
		}
		GameRegistry.registerBlock(greenBlock, greenBlock.getLocalizedName());
		}	
}
