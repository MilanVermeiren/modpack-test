package net.elmo.ElmosMod.item;

import net.elmo.ElmosMod.ElmosMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElmosMod.MOD_ID);

    public static final RegistryObject<Item> BLAKC_OPAL = ITEMS.register("black_opal",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BLAKC_OPAL = ITEMS.register("raw_black_opal",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUB_CREATINE = ITEMS.register("tub_creatine",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
