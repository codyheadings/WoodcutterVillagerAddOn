package net.codyheadings.woodcuttervillager;

import net.codyheadings.woodcuttervillager.datagen.ModRegistryDataProvider;
import net.codyheadings.woodcuttervillager.datagen.villager.ModPOITags;
import net.codyheadings.woodcuttervillager.datagen.villager.ModTradeSets;
import net.codyheadings.woodcuttervillager.datagen.villager.ModVillagerTradeTags;
import net.codyheadings.woodcuttervillager.datagen.villager.ModVillagerTrades;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class CarpenterVillagerDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRegistryDataProvider::new);
		pack.addProvider(ModVillagerTradeTags::new);
		pack.addProvider(ModPOITags::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(Registries.VILLAGER_TRADE, ModVillagerTrades::bootstrap);
		registryBuilder.add(Registries.TRADE_SET, ModTradeSets::bootstrap);
	}
}
