package net.elmo.ElmosMod.item;

import net.elmo.ElmosMod.ElmosMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ElmosMod.MOD_ID,bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab CLUTCH_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        CLUTCH_TAB = event.registerCreativeModeTab(new ResourceLocation(ElmosMod.MOD_ID,"clutch_tab"),
        builder ->builder.icon(()-> new ItemStack(ModItems.TUB_CREATINE.get()))
                .title(Component.translatable("creativemodetab.clutch_tab")));
    }
}
