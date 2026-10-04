package net.codyheadings.woodcuttervillager.datagen.villager;

import net.codyheadings.woodcuttervillager.CarpenterVillager;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.villager.VillagerType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;

import java.util.List;
import java.util.Optional;

import static net.minecraft.world.item.trading.VillagerTrades.villagerTypeHolderSet;
import static net.minecraft.world.item.trading.VillagerTrades.villagerTypeRestriction;

public class ModVillagerTrades {
    public static final ResourceKey<VillagerTrade> CARPENTER_1_COPPER_AXE_EMERALD = createKey("carpenter/1/copper_axe_emerald");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_STICK_EMERALD = createKey("carpenter/1/stick_emerald");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_OAK_LOG = createKey("carpenter/1/emerald_oak_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_ACACIA_LOG = createKey("carpenter/1/emerald_acacia_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_JUNGLE_LOG = createKey("carpenter/1/emerald_jungle_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_BIRCH_LOG = createKey("carpenter/1/emerald_birch_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_SPRUCE_LOG = createKey("carpenter/1/emerald_spruce_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_DARK_OAK_LOG = createKey("carpenter/1/emerald_dark_oak_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_PALE_OAK_LOG = createKey("carpenter/1/emerald_pale_oak_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_CHERRY_LOG = createKey("carpenter/1/emerald_cherry_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_MANGROVE_LOG = createKey("carpenter/1/emerald_mangrove_log");
//    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_POPLAR_LOG = createKey("carpenter/1/emerald_poplar_log");
    public static final ResourceKey<VillagerTrade> CARPENTER_1_EMERALD_BAMBOO_BLOCK = createKey("carpenter/1/emerald_bamboo_block");

    public static final ResourceKey<VillagerTrade> CARPENTER_2_IRON_AXE_EMERALD = createKey("carpenter/2/iron_axe_emerald");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_OAK_PLANK_AND_EMERALD_OAK_SHELF = createKey("carpenter/2/oak_plank_and_emerald_oak_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_ACACIA_PLANK_AND_EMERALD_ACACIA_SHELF = createKey("carpenter/2/acacia_plank_and_emerald_acacia_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_JUNGLE_PLANK_AND_EMERALD_JUNGLE_SHELF = createKey("carpenter/2/jungle_plank_and_emerald_jungle_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_BIRCH_PLANK_AND_EMERALD_BIRCH_SHELF = createKey("carpenter/2/birch_plank_and_emerald_birch_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_SPRUCE_PLANK_AND_EMERALD_SPRUCE_SHELF = createKey("carpenter/2/spruce_plank_and_emerald_spruce_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_DARK_OAK_PLANK_AND_EMERALD_DARK_OAK_SHELF = createKey("carpenter/2/dark_oak_plank_and_emerald_dark_oak_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_CHERRY_PLANK_AND_EMERALD_CHERRY_SHELF = createKey("carpenter/2/cherry_plank_and_emerald_cherry_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_PALE_OAK_PLANK_AND_EMERALD_PALE_OAK_SHELF = createKey("carpenter/2/pale_oak_plank_and_emerald_pale_oak_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_MANGROVE_PLANK_AND_EMERALD_MANGROVE_SHELF = createKey("carpenter/2/mangrove_plank_and_emerald_mangrove_shelf");
//    public static final ResourceKey<VillagerTrade> CARPENTER_2_POPLAR_PLANK_AND_EMERALD_POPLAR_SHELF = createKey("carpenter/2/poplar_plank_and_emerald_poplar_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_BAMBOO_PLANK_AND_EMERALD_BAMBOO_SHELF = createKey("carpenter/2/bamboo_plank_and_emerald_bamboo_shelf");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_EMERALD_OAK_SAPLING = createKey("carpenter/2/emerald_oak_sapling");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_EMERALD_ACACIA_SAPLING = createKey("carpenter/2/emerald_acacia_sapling");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_EMERALD_BIRCH_SAPLING = createKey("carpenter/2/emerald_birch_sapling");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_EMERALD_SPRUCE_SAPLING = createKey("carpenter/2/emerald_spruce_sapling");
    public static final ResourceKey<VillagerTrade> CARPENTER_2_EMERALD_DARK_OAK_SAPLING = createKey("carpenter/2/emerald_dark_oak_sapling");

    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_CHEST = createKey("carpenter/3/emerald_chest");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_BARREL = createKey("carpenter/3/emerald_barrel");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_BONE_MEAL_EMERALD = createKey("carpenter/3/bone_meal_emerald");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_OAK_HANGING_SIGN = createKey("carpenter/3/emerald_oak_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_ACACIA_HANGING_SIGN = createKey("carpenter/3/emerald_acacia_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_JUNGLE_HANGING_SIGN = createKey("carpenter/3/emerald_jungle_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_BIRCH_HANGING_SIGN = createKey("carpenter/3/emerald_birch_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_SPRUCE_HANGING_SIGN = createKey("carpenter/3/emerald_spruce_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_DARK_OAK_HANGING_SIGN = createKey("carpenter/3/emerald_dark_oak_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_PALE_OAK_HANGING_SIGN = createKey("carpenter/3/emerald_pale_oak_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_CHERRY_HANGING_SIGN = createKey("carpenter/3/emerald_cherry_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_MANGROVE_HANGING_SIGN = createKey("carpenter/3/emerald_mangrove_hanging_sign");
//    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_POPLAR_HANGING_SIGN = createKey("carpenter/3/emerald_poplar_hanging_sign");
    public static final ResourceKey<VillagerTrade> CARPENTER_3_EMERALD_BAMBOO_HANGING_SIGN = createKey("carpenter/3/emerald_bamboo_hanging_sign");

    public static final ResourceKey<VillagerTrade> CARPENTER_4_EMERALD_ARMOR_STAND = createKey("carpenter/4/emerald_armor_stand");
    public static final ResourceKey<VillagerTrade> CARPENTER_4_EMERALD_NOTE_BLOCK = createKey("carpenter/4/emerald_note_block");

    public static final ResourceKey<VillagerTrade> CARPENTER_5_EMERALD_JUNGLE_SAPLING = createKey("carpenter/5/emerald_jungle_sapling");
    public static final ResourceKey<VillagerTrade> CARPENTER_5_EMERALD_CHERRY_SAPLING = createKey("carpenter/5/emerald_cherry_sapling");
    public static final ResourceKey<VillagerTrade> CARPENTER_5_EMERALD_PALE_OAK_SAPLING = createKey("carpenter/5/emerald_pale_oak_sapling");
    public static final ResourceKey<VillagerTrade> CARPENTER_5_EMERALD_MANGROVE_PROPAGULE = createKey("carpenter/5/emerald_mangrove_propagule");
//    public static final ResourceKey<VillagerTrade> CARPENTER_5_EMERALD_POPLAR_SAPLING = createKey("carpenter/5/emerald_poplar_sapling");
    public static final ResourceKey<VillagerTrade> CARPENTER_5_EMERALD_JUKEBOX = createKey("carpenter/5/emerald_jukebox");

    public static void bootstrap(BootstrapContext<VillagerTrade> context) {
        HolderGetter<VillagerType> villagerVariants = context.lookup(Registries.VILLAGER_TYPE);

        //L1
        context.register(CARPENTER_1_COPPER_AXE_EMERALD, new VillagerTrade(
                new TradeCost(Items.COPPER_AXE, 1),
                new ItemStackTemplate(Items.EMERALD),
                8, 2, 0.05f,
                Optional.empty(), List.of()
        ));

        context.register(CARPENTER_1_STICK_EMERALD, new VillagerTrade(
                new TradeCost(Items.STICK, 32),
                new ItemStackTemplate(Items.EMERALD),
                16, 2, 0.05f,
                Optional.empty(), List.of()
        ));

        registerLogTrades(context, villagerVariants);

        //L2
        context.register(CARPENTER_2_IRON_AXE_EMERALD, new VillagerTrade(
                new TradeCost(Items.IRON_AXE, 1),
                new ItemStackTemplate(Items.EMERALD, 2),
                8, 6, 0.05f,
                Optional.empty(), List.of()
        ));

        registerLevel2SaplingTrades(context);
        registerShelfTrades(context, villagerVariants);

        //L3
        context.register(CARPENTER_3_BONE_MEAL_EMERALD, new VillagerTrade(
                new TradeCost(Items.BONE_MEAL, 16),
                new ItemStackTemplate(Items.EMERALD, 1),
                16, 3, 0.05f,
                Optional.empty(), List.of()
        ));

        registerStorageTrades(context, villagerVariants);
        registerSignTrades(context, villagerVariants);

        //L4
        context.register(CARPENTER_4_EMERALD_ARMOR_STAND, new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                new ItemStackTemplate(Items.ARMOR_STAND, 1),
                6, 6, 0.05f,
                Optional.empty(), List.of()
        ));

        context.register(CARPENTER_4_EMERALD_NOTE_BLOCK, new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(Items.NOTE_BLOCK),
                16, 4, 0.05f,
                Optional.empty(), List.of()
        ));

        //L5
        context.register(CARPENTER_5_EMERALD_JUKEBOX, new VillagerTrade(
                new TradeCost(Items.EMERALD, 6),
                new ItemStackTemplate(Items.JUKEBOX),
                12, 6, 0.05f,
                Optional.empty(), List.of()
        ));

        registerLevel5SaplingTrades(context);
    }

    private static void registerSignTrades(BootstrapContext<VillagerTrade> context, HolderGetter<VillagerType> villagerVariants) {
        context.register(CARPENTER_3_EMERALD_OAK_HANGING_SIGN, createSignTrade(villagerVariants, Items.OAK_HANGING_SIGN, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_3_EMERALD_BIRCH_HANGING_SIGN, createSignTrade(villagerVariants, Items.BIRCH_HANGING_SIGN, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_3_EMERALD_CHERRY_HANGING_SIGN, createSignTrade(villagerVariants, Items.CHERRY_HANGING_SIGN, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_3_EMERALD_SPRUCE_HANGING_SIGN, createSignTrade(villagerVariants, Items.SPRUCE_HANGING_SIGN, List.of(VillagerType.TAIGA, VillagerType.SNOW)));
//        context.register(CARPENTER_3_EMERALD_POPLAR_HANGING_SIGN, createSignTrade(villagerVariants, Items.POPLAR_HANGING_SIGN, List.of(VillagerType.TAIGA, VillagerType.SNOW, VillagerType.PLAINS)));
        context.register(CARPENTER_3_EMERALD_JUNGLE_HANGING_SIGN, createSignTrade(villagerVariants, Items.JUNGLE_HANGING_SIGN, List.of(VillagerType.JUNGLE)));
        context.register(CARPENTER_3_EMERALD_BAMBOO_HANGING_SIGN, createSignTrade(villagerVariants, Items.BAMBOO_HANGING_SIGN, List.of(VillagerType.JUNGLE)));
        context.register(CARPENTER_3_EMERALD_ACACIA_HANGING_SIGN, createSignTrade(villagerVariants, Items.ACACIA_HANGING_SIGN, List.of(VillagerType.SAVANNA, VillagerType.DESERT)));
        context.register(CARPENTER_3_EMERALD_DARK_OAK_HANGING_SIGN, createSignTrade(villagerVariants, Items.DARK_OAK_HANGING_SIGN, List.of(VillagerType.SWAMP)));
        context.register(CARPENTER_3_EMERALD_MANGROVE_HANGING_SIGN, createSignTrade(villagerVariants, Items.MANGROVE_HANGING_SIGN, List.of(VillagerType.SWAMP)));
        context.register(CARPENTER_3_EMERALD_PALE_OAK_HANGING_SIGN, createSignTrade(villagerVariants, Items.PALE_OAK_HANGING_SIGN, List.of(VillagerType.SWAMP)));
    }

    private static VillagerTrade createSignTrade(
            final HolderGetter<VillagerType> villagerVariants, final Item item, final List<ResourceKey<VillagerType>> villagerTypes
    ) {
        return new VillagerTrade(
                new TradeCost(Items.EMERALD, 6),
                new ItemStackTemplate(item, 1),
                16,
                6,
                0.05F,
                villagerTypeRestriction(villagerTypeHolderSet(villagerVariants, villagerTypes)),
                List.of()
        );
    }

    private static void registerStorageTrades(BootstrapContext<VillagerTrade> context, HolderGetter<VillagerType> villagerVariants) {
        context.register(CARPENTER_3_EMERALD_CHEST, createStorageTrade(villagerVariants, Items.CHEST, List.of(VillagerType.PLAINS, VillagerType.DESERT, VillagerType.JUNGLE, VillagerType.SAVANNA, VillagerType.SWAMP)));
        context.register(CARPENTER_3_EMERALD_BARREL, createStorageTrade(villagerVariants, Items.BARREL, List.of(VillagerType.TAIGA, VillagerType.SNOW)));
    }

    private static VillagerTrade createStorageTrade(
            final HolderGetter<VillagerType> villagerVariants, final Item item, final List<ResourceKey<VillagerType>> villagerTypes
    ) {
        return new VillagerTrade(
                new TradeCost(Items.EMERALD, 3),
                new ItemStackTemplate(item, 4),
                12,
                4,
                0.05F,
                villagerTypeRestriction(villagerTypeHolderSet(villagerVariants, villagerTypes)),
                List.of()
        );
    }

    private static void registerShelfTrades(BootstrapContext<VillagerTrade> context, HolderGetter<VillagerType> villagerVariants) {
        context.register(CARPENTER_2_OAK_PLANK_AND_EMERALD_OAK_SHELF, createShelfTrade(villagerVariants, Items.OAK_PLANKS, Items.OAK_SHELF, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_2_BIRCH_PLANK_AND_EMERALD_BIRCH_SHELF, createShelfTrade(villagerVariants, Items.BIRCH_PLANKS, Items.BIRCH_SHELF, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_2_CHERRY_PLANK_AND_EMERALD_CHERRY_SHELF, createShelfTrade(villagerVariants, Items.CHERRY_PLANKS, Items.CHERRY_LOG, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_2_SPRUCE_PLANK_AND_EMERALD_SPRUCE_SHELF, createShelfTrade(villagerVariants, Items.SPRUCE_PLANKS, Items.SPRUCE_LOG, List.of(VillagerType.TAIGA, VillagerType.SNOW)));
//        context.register(CARPENTER_2_POPLAR_PLANK_AND_EMERALD_POPLAR_SHELF, createShelfTrade(villagerVariants, Items.POPLAR_PLANKS, Items.POPLAR_LOG, List.of(VillagerType.TAIGA, VillagerType.SNOW, VillagerType.PLAINS)));
        context.register(CARPENTER_2_JUNGLE_PLANK_AND_EMERALD_JUNGLE_SHELF, createShelfTrade(villagerVariants, Items.JUNGLE_PLANKS, Items.JUNGLE_LOG, List.of(VillagerType.JUNGLE)));
        context.register(CARPENTER_2_BAMBOO_PLANK_AND_EMERALD_BAMBOO_SHELF, createShelfTrade(villagerVariants, Items.BAMBOO_PLANKS, Items.BAMBOO_BLOCK, List.of(VillagerType.JUNGLE)));
        context.register(CARPENTER_2_ACACIA_PLANK_AND_EMERALD_ACACIA_SHELF, createShelfTrade(villagerVariants, Items.ACACIA_PLANKS, Items.ACACIA_LOG, List.of(VillagerType.SAVANNA, VillagerType.DESERT)));
        context.register(CARPENTER_2_DARK_OAK_PLANK_AND_EMERALD_DARK_OAK_SHELF, createShelfTrade(villagerVariants, Items.DARK_OAK_PLANKS, Items.DARK_OAK_LOG, List.of(VillagerType.SWAMP)));
        context.register(CARPENTER_2_MANGROVE_PLANK_AND_EMERALD_MANGROVE_SHELF, createShelfTrade(villagerVariants, Items.MANGROVE_PLANKS, Items.MANGROVE_LOG, List.of(VillagerType.SWAMP)));
        context.register(CARPENTER_2_PALE_OAK_PLANK_AND_EMERALD_PALE_OAK_SHELF, createShelfTrade(villagerVariants, Items.PALE_OAK_PLANKS, Items.PALE_OAK_LOG, List.of(VillagerType.SWAMP)));
    }

    private static VillagerTrade createShelfTrade(
            final HolderGetter<VillagerType> villagerVariants, final Item in, final Item out, final List<ResourceKey<VillagerType>> villagerTypes
    ) {
        return new VillagerTrade(
                new TradeCost(Items.EMERALD, 2),
                Optional.of(new TradeCost(in, 6)),
                new ItemStackTemplate(out, 1),
                12,
                8,
                0.05F,
                villagerTypeRestriction(villagerTypeHolderSet(villagerVariants, villagerTypes)),
                List.of()
        );
    }

    private static void registerLevel2SaplingTrades(BootstrapContext<VillagerTrade> context) {
        context.register(CARPENTER_2_EMERALD_OAK_SAPLING, createSaplingTrade(Items.OAK_SAPLING));
        context.register(CARPENTER_2_EMERALD_BIRCH_SAPLING, createSaplingTrade(Items.BIRCH_SAPLING));
        context.register(CARPENTER_2_EMERALD_ACACIA_SAPLING, createSaplingTrade(Items.ACACIA_SAPLING));
        context.register(CARPENTER_2_EMERALD_SPRUCE_SAPLING, createSaplingTrade(Items.SPRUCE_SAPLING));
        context.register(CARPENTER_2_EMERALD_DARK_OAK_SAPLING, createSaplingTrade(Items.DARK_OAK_SAPLING));
    }

    private static void registerLevel5SaplingTrades(BootstrapContext<VillagerTrade> context) {
        context.register(CARPENTER_5_EMERALD_CHERRY_SAPLING, createSaplingTrade(Items.CHERRY_SAPLING));
        context.register(CARPENTER_5_EMERALD_JUNGLE_SAPLING, createSaplingTrade(Items.JUNGLE_SAPLING));
        context.register(CARPENTER_5_EMERALD_MANGROVE_PROPAGULE, createSaplingTrade(Items.MANGROVE_PROPAGULE));
        context.register(CARPENTER_5_EMERALD_PALE_OAK_SAPLING, createSaplingTrade(Items.PALE_OAK_SAPLING));
//        context.register(CARPENTER_5_EMERALD_POPLAR_SAPLING, createSaplingTrade(Items.POPLAR_SAPLING));
    }

    private static VillagerTrade createSaplingTrade(final Item item) {
        return new VillagerTrade(
                new TradeCost(Items.EMERALD, 4),
                new ItemStackTemplate(item, 1),
                8,
                3,
                0.05F,
                Optional.empty(),
                List.of()
        );
    }

    private static void registerLogTrades(final BootstrapContext<VillagerTrade> context, final HolderGetter<VillagerType> villagerVariants) {
        context.register(CARPENTER_1_EMERALD_OAK_LOG, createLogTrade(villagerVariants, Items.OAK_LOG, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_1_EMERALD_BIRCH_LOG, createLogTrade(villagerVariants, Items.BIRCH_LOG, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_1_EMERALD_CHERRY_LOG, createLogTrade(villagerVariants, Items.CHERRY_LOG, List.of(VillagerType.PLAINS)));
        context.register(CARPENTER_1_EMERALD_SPRUCE_LOG, createLogTrade(villagerVariants, Items.SPRUCE_LOG, List.of(VillagerType.TAIGA, VillagerType.SNOW)));
//        context.register(CARPENTER_1_EMERALD_POPLAR_LOG, createLogTrade(villagerVariants, Items.POPLAR_LOG, List.of(VillagerType.TAIGA, VillagerType.SNOW, VillagerType.PLAINS)));
        context.register(CARPENTER_1_EMERALD_JUNGLE_LOG, createLogTrade(villagerVariants, Items.JUNGLE_LOG, List.of(VillagerType.JUNGLE)));
        context.register(CARPENTER_1_EMERALD_BAMBOO_BLOCK, createLogTrade(villagerVariants, Items.BAMBOO_BLOCK, List.of(VillagerType.JUNGLE)));
        context.register(CARPENTER_1_EMERALD_ACACIA_LOG, createLogTrade(villagerVariants, Items.ACACIA_LOG, List.of(VillagerType.SAVANNA, VillagerType.DESERT)));
        context.register(CARPENTER_1_EMERALD_DARK_OAK_LOG, createLogTrade(villagerVariants, Items.DARK_OAK_LOG, List.of(VillagerType.SWAMP)));
        context.register(CARPENTER_1_EMERALD_MANGROVE_LOG, createLogTrade(villagerVariants, Items.MANGROVE_LOG, List.of(VillagerType.SWAMP)));
        context.register(CARPENTER_1_EMERALD_PALE_OAK_LOG, createLogTrade(villagerVariants, Items.PALE_OAK_LOG, List.of(VillagerType.SWAMP)));
    }

    private static VillagerTrade createLogTrade(
            final HolderGetter<VillagerType> villagerVariants, final Item item, final List<ResourceKey<VillagerType>> villagerTypes
    ) {
        return new VillagerTrade(
                new TradeCost(Items.EMERALD, 1),
                new ItemStackTemplate(item, 2),
                8,
                2,
                0.05F,
                villagerTypeRestriction(villagerTypeHolderSet(villagerVariants, villagerTypes)),
                List.of()
        );
    }

    private static ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(CarpenterVillager.MOD_ID, name));
    }
}
