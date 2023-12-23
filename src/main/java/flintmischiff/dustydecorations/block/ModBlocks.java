package flintmischiff.dustydecorations.block;

import flintmischiff.dustydecorations.Dustydecorations;
import flintmischiff.dustydecorations.block.custom.*;
import flintmischiff.dustydecorations.item.ModCreativeModeTab;
import flintmischiff.dustydecorations.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Dustydecorations.MOD_ID);

    public static final RegistryObject<Block> APPLE_BARREL = registerBlock("apple_barrel",
            () -> new AppleBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().dynamicShape().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> BEETROOT_BARREL = registerBlock("beetroot_barrel",
            () -> new BeetrootBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().dynamicShape().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> CARROT_BARREL = registerBlock("carrot_barrel",
            () -> new CarrotBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> COD_BARREL = registerBlock("cod_barrel",
            () -> new CodBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> GLOW_BERRIES_BARREL = registerBlock("glow_berries_barrel",
            () -> new GlowBerriesBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> POTATO_BARREL = registerBlock("potato_barrel",
            () -> new PotatoBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> SALMON_BARREL = registerBlock("salmon_barrel",
            () -> new SalmonBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> SWEET_BERRIES_BARREL = registerBlock("sweet_berries_barrel",
            () -> new SweetBerriesBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> EMPTY_BARREL = registerBlock("empty_barrel",
            () -> new EmptyBarrelBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> HANGING_COD = registerBlock("hanging_cod",
            () -> new HangingCodBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(.2f).noOcclusion().noCollission().sound(SoundType.SLIME_BLOCK)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> HANGING_SALMON = registerBlock("hanging_salmon",
            () -> new HangingSalmonBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(.2f).noOcclusion().noCollission().sound(SoundType.SLIME_BLOCK)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> OAK_SHELF = registerBlock("oak_shelf",
            () -> new OakShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> BIRCH_SHELF = registerBlock("birch_shelf",
            () -> new BirchShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> SPRUCE_SHELF = registerBlock("spruce_shelf",
            () -> new SpruceShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> DARK_OAK_SHELF = registerBlock("dark_oak_shelf",
            () -> new DarkOakShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> ACACIA_SHELF = registerBlock("acacia_shelf",
            () -> new AcaciaShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> JUNGLE_SHELF = registerBlock("jungle_shelf",
            () -> new JungleShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> MANGROVE_SHELF = registerBlock("mangrove_shelf",
            () -> new MangroveShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> CRIMSON_SHELF = registerBlock("crimson_shelf",
            () -> new CrimsonShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> WARPED_SHELF = registerBlock("warped_shelf",
            () -> new WarpedShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> HANGING_KNIVES = registerBlock("hanging_knives",
            () -> new HangingKnivesBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(.2f).noOcclusion().noCollission().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> POSTER = registerBlock("poster",
            () -> new PosterBlock(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(1f).instabreak().noOcclusion().noCollission().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> JARS = registerBlock("jars",
            () -> new JarsBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(.3f).noOcclusion().noCollission().sound(SoundType.STONE)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> ROPE = registerBlock("rope",
            () -> new RopeBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> COILED_ROPE = registerBlock("coiled_rope",
            () -> new CoiledRopeBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> CORRUGATED_METAL = registerBlock("corrugated_metal",
            () -> new CorrugatedMetalBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).noOcclusion().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> CORRUGATED_METAL_AWNING = registerBlock("corrugated_metal_awning",
            () -> new CorrugatedMetalAwningBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(3f).noOcclusion().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> WEDGED_KNIFE = registerBlock("wedged_knife",
            () -> new WedgedKnifeBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(.3f).noOcclusion().noCollission().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> WEDGED_CLEAVER = registerBlock("wedged_cleaver",
            () -> new WedgedCleaverBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(.3f).noOcclusion().noCollission().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> CUTTING_BOARD = registerBlock("cutting_board",
            () -> new CuttingBoardBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> KNIFE_AND_CUTTING_BOARD = registerBlock("knife_and_cutting_board",
            () -> new KnifeAndCuttingBoardBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> WHITE_WOOL_AWNING = registerBlock("white_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> RED_WOOL_AWNING = registerBlock("red_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> BLACK_WOOL_AWNING = registerBlock("black_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> BLUE_WOOL_AWNING = registerBlock("blue_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> BROWN_WOOL_AWNING = registerBlock("brown_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> CYAN_WOOL_AWNING = registerBlock("cyan_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> GRAY_WOOL_AWNING = registerBlock("gray_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> GREEN_WOOL_AWNING = registerBlock("green_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_AWNING = registerBlock("light_blue_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_AWNING = registerBlock("light_gray_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> LIME_WOOL_AWNING = registerBlock("lime_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> MAGENTA_WOOL_AWNING = registerBlock("magenta_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> ORANGE_WOOL_AWNING = registerBlock("orange_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> PINK_WOOL_AWNING = registerBlock("pink_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> PURPLE_WOOL_AWNING = registerBlock("purple_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> YELLOW_WOOL_AWNING = registerBlock("yellow_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> CLUTTERED_SHELF = registerBlock("cluttered_shelf",
            () -> new ClutteredShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> BOOKS = registerBlock("books",
            () -> new BooksBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).noOcclusion().noCollission().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> BOOK_STACK = registerBlock("book_stack",
            () -> new BookStackBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> SMALL_BOOKSHELF = registerBlock("small_bookshelf",
            () -> new ClutteredShelfBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> SCATTERED_PAPER = registerBlock("scattered_paper",
            () -> new ScatteredPaperBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.2f).noOcclusion().noCollission().instabreak().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> PAPER_STACK = registerBlock("paper_stack",
            () -> new PaperStackBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.6f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> LIFE_PRESERVER = registerBlock("life_preserver",
            () -> new LifePreserverBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(0.6f).noOcclusion().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> ANCHOR = registerBlock("anchor",
            () -> new AnchorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).noOcclusion().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> GLASS_BUOY = registerBlock("glass_buoy",
            () -> new GlassBuoyBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(.3f).noOcclusion().sound(SoundType.GLASS)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> SMALL_GLASS_BUOYS = registerBlock("small_glass_buoys",
            () -> new SmallGlassBuoysBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(.3f).noOcclusion().sound(SoundType.GLASS)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> WOODEN_BUOYS = registerBlock("wooden_buoys",
            () -> new WoodenBuoyBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> COOKING_POT = registerBlock("cooking_pot",
            () -> new CookingPotBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).noOcclusion().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> FRYING_PAN = registerBlock("frying_pan",
            () -> new FryingPanBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).noOcclusion().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> POTS_AND_PANS_STACK = registerBlock("pots_and_pans_stack",
            () -> new PotsAndPansStackBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).noOcclusion().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> TREASURE_MAP = registerBlock("treasure_map",
            () -> new TreasureMapBlock(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.2f).noOcclusion().noCollission().instabreak().sound(SoundType.WOOL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> PLACEABLE_BOWL = registerBlock("placeable_bowl",
            () -> new PlaceableBowlBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(.2f).noOcclusion().noCollission().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> OAK_CHAIR = registerBlock("oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    public static final RegistryObject<Block> SPRUCE_CHAIR = registerBlock("spruce_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> BIRCH_CHAIR = registerBlock("birch_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> ACACIA_CHAIR = registerBlock("acacia_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> JUNGLE_CHAIR = registerBlock("jungle_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> MANGROVE_CHAIR = registerBlock("mangrove_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> CRIMSON_CHAIR = registerBlock("crimson_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> WARPED_CHAIR = registerBlock("warped_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.5f).noOcclusion().sound(SoundType.WOOD)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> GLOBE = registerBlock("globe",
            () -> new GlobeBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2.5f).noOcclusion().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);
    public static final RegistryObject<Block> OLD_GLOBE = registerBlock("old_globe",
            () -> new GlobeBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2.5f).noOcclusion().sound(SoundType.METAL)), ModCreativeModeTab.DUSTY_DECORATIONS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}