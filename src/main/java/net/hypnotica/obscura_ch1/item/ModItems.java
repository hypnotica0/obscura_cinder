package net.hypnotica.obscura_ch1.item;

import net.hypnotica.obscura_ch1.Cinderfall;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cinderfall.MOD_ID);
    public static final RegistryObject<Item> OBSCURE_GEM = ITEM.register("obscure_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSCURE_CHARM = ITEM.register("obscure_charm",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
