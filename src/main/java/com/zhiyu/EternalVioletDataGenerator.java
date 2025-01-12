package com.zhiyu;

import com.zhiyu.DataGenerate.ModBlockTagsProvider;
import com.zhiyu.DataGenerate.ModENUSLanProvider;
import com.zhiyu.DataGenerate.ModModelsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EternalVioletDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModENUSLanProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
	}
}
