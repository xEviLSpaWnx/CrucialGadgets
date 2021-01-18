package com.xevilspawnx.crucialgadgets.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GraveStone extends Block {
    public GraveStone() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(4.5f, 4.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(0)
                .setRequiresTool()
        );
    }
}
