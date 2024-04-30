package net.copen.divine.item;

import net.copen.divine.DivineMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DivineMod.MOD_ID);

    public static final RegistryObject<Item> BRONZE = ITEMS.register("bronze",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHARGED_BRONZE = ITEMS.register("charged_bronze",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOTTLE_OF_LIGHTNING = ITEMS.register("bottle_of_lightning.json",
            () -> new Item(new Item.Properties()));
    

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
