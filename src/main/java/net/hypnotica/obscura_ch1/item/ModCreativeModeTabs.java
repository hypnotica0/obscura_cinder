package net.hypnotica.obscura_ch1.item;

import net.hypnotica.obscura_ch1.Cinderfall;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cinderfall.MOD_ID);
    public static final RegistryObject<CreativeModeTab> CINDERFALL_TAB = CREATIVE_MODE_TABS.register("cinderfall_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OBSCURE_GEM.get()))
                    .title(Component.translatable("creativetab.cinderfall_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OBSCURE_GEM.get());
                        output.accept(ModItems.OBSCURE_CHARM.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
