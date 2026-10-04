package net.codyheadings.woodcuttervillager.datagen.villager;

import net.codyheadings.woodcuttervillager.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.concurrent.CompletableFuture;

public class ModVillagerTradeTags extends FabricTagsProvider<VillagerTrade> {
    public ModVillagerTradeTags(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, Registries.VILLAGER_TRADE, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        getOrCreateRawBuilder(ModTags.Trades.CARPENTER_LEVEL_1)
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_COPPER_AXE_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_ACACIA_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_BIRCH_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_CHERRY_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_DARK_OAK_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_JUNGLE_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_MANGROVE_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_OAK_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_PALE_OAK_LOG.identifier()))
//                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_POPLAR_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_SPRUCE_LOG.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_STICK_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_1_EMERALD_BAMBOO_BLOCK.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.CARPENTER_LEVEL_2)
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_ACACIA_PLANK_AND_EMERALD_ACACIA_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_BAMBOO_PLANK_AND_EMERALD_BAMBOO_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_BIRCH_PLANK_AND_EMERALD_BIRCH_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_CHERRY_PLANK_AND_EMERALD_CHERRY_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_DARK_OAK_PLANK_AND_EMERALD_DARK_OAK_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_EMERALD_ACACIA_SAPLING.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_EMERALD_BIRCH_SAPLING.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_EMERALD_DARK_OAK_SAPLING.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_EMERALD_OAK_SAPLING.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_EMERALD_SPRUCE_SAPLING.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_IRON_AXE_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_JUNGLE_PLANK_AND_EMERALD_JUNGLE_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_MANGROVE_PLANK_AND_EMERALD_MANGROVE_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_OAK_PLANK_AND_EMERALD_OAK_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_PALE_OAK_PLANK_AND_EMERALD_PALE_OAK_SHELF.identifier()))
//                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_POPLAR_PLANK_AND_EMERALD_POPLAR_SHELF.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_2_SPRUCE_PLANK_AND_EMERALD_SPRUCE_SHELF.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.CARPENTER_LEVEL_3)
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_BONE_MEAL_EMERALD.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_ACACIA_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_BAMBOO_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_BARREL.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_BIRCH_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_CHERRY_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_CHEST.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_DARK_OAK_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_JUNGLE_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_MANGROVE_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_OAK_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_SPRUCE_HANGING_SIGN.identifier()))
//                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_POPLAR_SPRUCE_HANGING_SIGN.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_3_EMERALD_PALE_OAK_HANGING_SIGN.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.CARPENTER_LEVEL_4)
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_4_EMERALD_ARMOR_STAND.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_4_EMERALD_NOTE_BLOCK.identifier()));

        getOrCreateRawBuilder(ModTags.Trades.CARPENTER_LEVEL_5)
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_5_EMERALD_CHERRY_SAPLING.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_5_EMERALD_JUKEBOX.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_5_EMERALD_JUNGLE_SAPLING.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_5_EMERALD_MANGROVE_PROPAGULE.identifier()))
//                .add(TagEntry.element(ModVillagerTrades.CARPENTER_5_EMERALD_POPLAR_SAPLING.identifier()))
                .add(TagEntry.element(ModVillagerTrades.CARPENTER_5_EMERALD_PALE_OAK_SAPLING.identifier()));
    }
}
