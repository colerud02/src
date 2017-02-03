package com.camp.block;

import com.camp.lib.Strings;

import javafx.scene.control.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class green extends Block{

	protected green(Material p_i45394_1_) {
		super(p_i45394_1_);
this.setBlockName("Green Block");
this.setBlockTextureName(Strings.MODID+":"+"Green Block");
this.setCreativeTab(CreativeTabs.tabMaterials);
}

}
