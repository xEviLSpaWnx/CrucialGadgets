package com.xevilspawnx.crucialgadgets.init;

import com.xevilspawnx.crucialgadgets.CrucialGadgets;
import com.xevilspawnx.crucialgadgets.enums.ModArmorMaterial;
import com.xevilspawnx.crucialgadgets.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrucialGadgets.MOD_ID);


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

    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(CrucialGadgets.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(CrucialGadgets.TAB)));
}
