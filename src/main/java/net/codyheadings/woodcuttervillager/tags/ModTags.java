package net.codyheadings.woodcuttervillager.tags;

import net.codyheadings.woodcuttervillager.CarpenterVillager;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.trading.VillagerTrade;

public class ModTags {
    public static class Trades {
        public static final TagKey<VillagerTrade> CARPENTER_LEVEL_1 = createTag("carpenter/level_1");
        public static final TagKey<VillagerTrade> CARPENTER_LEVEL_2 = createTag("carpenter/level_2");
        public static final TagKey<VillagerTrade> CARPENTER_LEVEL_3 = createTag("carpenter/level_3");
        public static final TagKey<VillagerTrade> CARPENTER_LEVEL_4 = createTag("carpenter/level_4");
        public static final TagKey<VillagerTrade> CARPENTER_LEVEL_5 = createTag("carpenter/level_5");

        private static TagKey<VillagerTrade> createTag(String id) {
            return TagKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(CarpenterVillager.MOD_ID, id));
        }
    }
}
