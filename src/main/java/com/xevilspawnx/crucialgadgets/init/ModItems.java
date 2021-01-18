package com.xevilspawnx.crucialgadgets.init;

import com.xevilspawnx.crucialgadgets.CrucialGadgets;
import com.xevilspawnx.crucialgadgets.enums.ModArmorMaterial;
import com.xevilspawnx.crucialgadgets.enums.ModItemTier;
import com.xevilspawnx.crucialgadgets.items.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrucialGadgets.MOD_ID);

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///// ITEMS /////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final RegistryObject<Item> PORTABLE_CRAFTING_TABLE = ITEMS.register("portable_crafting_table", PortableCraftingTable::new);
    public static final RegistryObject<Item> SLEEPING_BAG = ITEMS.register("sleeping_bag", SleepingBag::new);
    public static final RegistryObject<Item> BACKPACK = ITEMS.register("backpack", BackPack::new);
    public static final RegistryObject<Item> HOME_TELEPORTER = ITEMS.register("hometeleporter", HomeTeleporter::new);
    public static final RegistryObject<Item> TROLLEY_DOLLY = ITEMS.register("trolleydolly", TrolleyDolly::new);
    public static final RegistryObject<Item> BRIDGE_BUILDER = ITEMS.register("bridge_builder", BridgeBuilder::new);
    public static final RegistryObject<Item> WINGS = ITEMS.register("wings", Wings::new);

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///// BLOCK ITEMS /////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final RegistryObject<BlockItem> ADVANCED_CRAFTING_TABLE = ITEMS.register("advanced_crafting_table",
            () -> new BlockItem(ModBlocks.ADVANCED_CRAFTING_TABLE.get(), new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<BlockItem> GRAVESTONE = ITEMS.register("gravestone",
            () -> new BlockItem(ModBlocks.GRAVESTONE.get(), new Item.Properties().group(CrucialGadgets.TAB)));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///// EMERALD TOOLS /////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModItemTier.EMERALD, 5, -2.4f, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModItemTier.EMERALD, 3, -2.8f, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModItemTier.EMERALD, 7, -3.0f, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModItemTier.EMERALD, 3, -3.0f, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModItemTier.EMERALD, -1, -0.0f, new Item.Properties().group(CrucialGadgets.TAB)));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///// EMERALD ARMOR /////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(CrucialGadgets.TAB)));
}
