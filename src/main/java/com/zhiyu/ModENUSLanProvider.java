package com.zhiyu;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
    translationBuilder.add(ModItems.FLINT_KNIFE,"Flint Knife");
    translationBuilder.add(ModItems.FURRY_CLOTH,"Furry Cloth");
    translationBuilder.add(ModItems.GOLDEN_KNIFE,"Golden Knife");
    translationBuilder.add(ModItems.IRON_STICK,"Iron Stick");
    translationBuilder.add(ModItems.WHITE_CLAY_BALL,"White Clay Ball");
    }
}
