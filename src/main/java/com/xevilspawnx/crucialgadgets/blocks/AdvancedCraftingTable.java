package com.xevilspawnx.crucialgadgets.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AdvancedCraftingTable extends CraftingTableBlock {

    public AdvancedCraftingTable() {
        super(AbstractBlock.Properties.create(Material.WOOD)
                .hardnessAndResistance(3.5f, 3.5f)
                .harvestTool(ToolType.AXE)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .setRequiresTool()
        );
    }
}
