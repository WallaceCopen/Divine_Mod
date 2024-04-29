package net.copen.divine.item;

import net.copen.divine.DivineMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DivineMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DIVINE_ITEMS_TAB = CREATIVE_MODE_TABS.register("divine_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE.get()))
                    .title(Component.translatable("creativetab.divine_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BRONZE.get());
                        output.accept(ModItems.CHARGED_BRONZE.get());
                        output.accept(ModItems.BOTTLE_OF_LIGHTNING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
