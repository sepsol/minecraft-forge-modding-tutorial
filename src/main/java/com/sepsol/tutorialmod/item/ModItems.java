package com.sepsol.tutorialmod.item;

import com.sepsol.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE =
            ITEMS.register(
                    "alexandrite",
                    () -> new Item(new Item.Properties().setId(ITEMS.key("alexandrite")))
            );

    public static final RegistryObject<Item> RAW_ALEXANDRITE =
            ITEMS.register(
                    "raw_alexandrite",
                    () -> new Item(new Item.Properties().setId(ITEMS.key("raw_alexandrite")))
            );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
