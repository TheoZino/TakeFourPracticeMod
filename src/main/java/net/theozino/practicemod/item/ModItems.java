package net.theozino.practicemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theozino.practicemod.PracticeMod;

public class ModItems {
   public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, PracticeMod.MOD_ID);

   public static final RegistryObject<Item> ORANGE_TOPAZ = ITEMS.register("orange_topaz",
           () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));

   public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
   }
}
