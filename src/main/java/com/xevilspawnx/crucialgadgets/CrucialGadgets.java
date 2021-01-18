package com.xevilspawnx.crucialgadgets;

import com.xevilspawnx.crucialgadgets.init.ModBlocks;
import com.xevilspawnx.crucialgadgets.init.ModItems;
import javafx.event.Event;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("crucialgadgets")
public class CrucialGadgets {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "crucialgadgets";

    public CrucialGadgets() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("crucialgadgetsTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.EMERALD_SWORD.get());
        }
    };
}