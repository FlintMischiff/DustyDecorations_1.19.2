package flintmischiff.dustydecorations.item;

import flintmischiff.dustydecorations.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DUSTY_DECORATIONS_TAB = new CreativeModeTab("dustydecorationstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.APPLE_BARREL.get());
        }
    };
}