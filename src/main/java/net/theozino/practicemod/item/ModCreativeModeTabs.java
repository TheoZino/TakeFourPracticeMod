package net.theozino.practicemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.theozino.practicemod.PracticeMod;
import net.theozino.practicemod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PracticeMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> GEMS_ITEM_TAB = CREATIVE_MODE_TABS.register("gems_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ORANGE_TOPAZ.get()))
                    .title(Component.translatable("creativetab.practicemod.gems_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ORANGE_TOPAZ.get());
                        output.accept(ModItems.RAW_ORANGE_TOPAZ.get());
                        output.accept(ModItems.PERIDOT.get());
                        output.accept(ModItems.RAW_PERIDOT.get());
                    })

                    .build());public static final RegistryObject<CreativeModeTab> GEMS_BLOCK_TAB = CREATIVE_MODE_TABS.register("gems_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ORANGE_TOPAZ_BLOCK.get()))
                    .title(Component.translatable("creativetab.practicemod.gems_blocks"))
                    .withTabsBefore(GEMS_ITEM_TAB.getId())
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ORANGE_TOPAZ_BLOCK.get());
                        output.accept(ModBlocks.RAW_ORANGE_TOPAZ_BLOCK.get());
                        output.accept(ModBlocks.ORANGE_TOPAZ_ORE.get());
                        output.accept(ModBlocks.ORANGE_TOPAZ_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.PERIDOT_BLOCK.get());
                        output.accept(ModBlocks.RAW_PERIDOT_BLOCK.get());
                        output.accept(ModBlocks.PERIDOT_ORE.get());
                        output.accept(ModBlocks.PERIDOT_DEEPSLATE_ORE.get());

                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
