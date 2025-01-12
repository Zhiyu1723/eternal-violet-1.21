package com.zhiyu;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(ModItems.FURRY_CLOTH, Models.GENERATED);
    itemModelGenerator.register(ModItems.FLINT_KNIFE, Models.GENERATED);
    itemModelGenerator.register(ModItems.GOLDEN_KNIFE, Models.GENERATED);
    itemModelGenerator.register(ModItems.IRON_STICK, Models.GENERATED);
    itemModelGenerator.register(ModItems.WHITE_CLAY_BALL, Models.GENERATED);
    }
}
