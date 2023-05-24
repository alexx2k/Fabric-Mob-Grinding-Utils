package com.alex2k.mobgrindingutils.item;

import com.alex2k.mobgrindingutils.MobGrindingUtils;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup MOBGRINDINGUTILS;

    public static void registerItemGroups() {
        MOBGRINDINGUTILS = FabricItemGroup.builder(new Identifier(MobGrindingUtils.MOD_ID, "mgu"))
                .displayName(Text.translatable("itemgroup.mgu"))
                .icon(() -> new ItemStack(ModItems.FAN_RANGE_UPGRADE)).build();
    }
}
