package net.codyheadings.woodcuttervillager.villager;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.codyheadings.woodcutter.block.ModBlocks;
import net.codyheadings.woodcuttervillager.CarpenterVillager;
import net.codyheadings.woodcuttervillager.datagen.villager.ModTradeSets;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PoiHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.item.trading.TradeSet;

public class ModVillagers {

    public static final ResourceKey<PoiType> CARPENTER_POI_KEY = ResourceKey.create(Registries.POINT_OF_INTEREST_TYPE,
            Identifier.fromNamespaceAndPath(CarpenterVillager.MOD_ID, "carpenter_poi"));
    public static final PoiType CARPENTER_POI = PoiHelper.register(Identifier.fromNamespaceAndPath(CarpenterVillager.MOD_ID, "carpenter_poi"),
            1, 1, ModBlocks.WOODCUTTER);

    public static final VillagerProfession CARPENTER = registerVillagerProfession("carpenter", "Carpenter", CARPENTER_POI_KEY,
            SoundEvents.AXE_STRIP, Int2ObjectMap.ofEntries(
                    Int2ObjectMap.entry(1, ModTradeSets.CARPENTER_LEVEL_1),
                    Int2ObjectMap.entry(2, ModTradeSets.CARPENTER_LEVEL_2),
                    Int2ObjectMap.entry(3, ModTradeSets.CARPENTER_LEVEL_3),
                    Int2ObjectMap.entry(4, ModTradeSets.CARPENTER_LEVEL_4),
                    Int2ObjectMap.entry(5, ModTradeSets.CARPENTER_LEVEL_5)
            ));

    private static VillagerProfession registerVillagerProfession(String name, String title, ResourceKey<PoiType> poi,
                                                                 SoundEvent sound, Int2ObjectMap<ResourceKey<TradeSet>> map) {
        return Registry.register(BuiltInRegistries.VILLAGER_PROFESSION, Identifier.fromNamespaceAndPath(CarpenterVillager.MOD_ID, name),
                new VillagerProfession(
                        Component.literal(title), holder -> holder.is(poi), holder -> holder.is(poi),
                        ImmutableSet.of(), ImmutableSet.of(), sound, map));
    }

    public static void register() {
        CarpenterVillager.LOGGER.info("Registering ModVillagers for " + CarpenterVillager.MOD_ID);
    }
}
