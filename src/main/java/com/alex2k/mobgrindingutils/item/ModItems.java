package com.alex2k.mobgrindingutils.item;

import com.alex2k.mobgrindingutils.MobGrindingUtils;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FAN_WIDTH_UPGRADE = registerItem("fan_width_upgrade",
            new Item(new FabricItemSettings().maxCount(4)));
    public static final Item FAN_HEIGHT_UPGRADE = registerItem("fan_height_upgrade",
            new Item(new FabricItemSettings().maxCount(2)));
    public static final Item FAN_RANGE_UPGRADE = registerItem("fan_range_upgrade",
            new Item(new FabricItemSettings().maxCount(8)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MobGrindingUtils.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.FUNCTIONAL, FAN_WIDTH_UPGRADE);
        addToItemGroup(ModItemGroup.MOBGRINDINGUTILS, FAN_WIDTH_UPGRADE);
        addToItemGroup(ItemGroups.FUNCTIONAL, FAN_HEIGHT_UPGRADE);
        addToItemGroup(ModItemGroup.MOBGRINDINGUTILS, FAN_HEIGHT_UPGRADE);
        addToItemGroup(ItemGroups.FUNCTIONAL, FAN_RANGE_UPGRADE);
        addToItemGroup(ModItemGroup.MOBGRINDINGUTILS, FAN_RANGE_UPGRADE);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        MobGrindingUtils.LOGGER.debug("Registering Mod Items for " + MobGrindingUtils.MOD_ID);

        addItemsToItemGroup();
    }
}
