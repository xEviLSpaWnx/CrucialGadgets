package com.xevilspawnx.crucialgadgets.items;

import com.xevilspawnx.crucialgadgets.CrucialGadgets;
import com.xevilspawnx.crucialgadgets.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class BridgeBuilder extends Item {
    public BridgeBuilder() {
        super(new Properties().group(CrucialGadgets.TAB));
    }
}
