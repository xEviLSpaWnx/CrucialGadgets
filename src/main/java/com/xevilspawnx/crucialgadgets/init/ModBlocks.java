package com.xevilspawnx.crucialgadgets.init;

import com.xevilspawnx.crucialgadgets.CrucialGadgets;
import com.xevilspawnx.crucialgadgets.blocks.AdvancedCraftingTable;
import com.xevilspawnx.crucialgadgets.blocks.GraveStone;
import net.minecraft.block.Block;
import net.minecraft.block.CraftingTableBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CrucialGadgets.MOD_ID);

    public static final RegistryObject<CraftingTableBlock> ADVANCED_CRAFTING_TABLE = BLOCKS.register("advanced_crafting_table", AdvancedCraftingTable::new);
    public static final RegistryObject<Block> GRAVESTONE = BLOCKS.register("gravestone", GraveStone::new);
}
