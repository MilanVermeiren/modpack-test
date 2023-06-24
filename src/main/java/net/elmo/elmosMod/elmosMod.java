package net.elmo.ElmosMod;

import com.mojang.logging.LogUtils;
import net.elmo.ElmosMod.block.ModBlocks;
import net.elmo.ElmosMod.item.ModCreativeModeTabs;
import net.elmo.ElmosMod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ElmosMod.MOD_ID)
public class ElmosMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "elmosmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public ElmosMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab()== CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.BLAKC_OPAL);
            event.accept(ModItems.TUB_CREATINE);
        }
        if (event.getTab()== CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.BLACK_OPAL_BLOCK);
            event.accept(ModBlocks.BLACK_OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_BLACK_OPAL_BLOCK_ORE);
            event.accept(ModBlocks.NETHERRACK_BLACK_OPAL_BLOCK_ORE);
            event.accept(ModBlocks.ENDSTONE_BLACK_OPAL_BLOCK_ORE);
        }
        if (event.getTab()== CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.BLACK_OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_BLACK_OPAL_BLOCK_ORE);
            event.accept(ModBlocks.NETHERRACK_BLACK_OPAL_BLOCK_ORE);
            event.accept(ModBlocks.ENDSTONE_BLACK_OPAL_BLOCK_ORE);
        }
        if (event.getTab()== ModCreativeModeTabs.CLUTCH_TAB){
            event.accept(ModItems.BLAKC_OPAL);
            event.accept(ModItems.TUB_CREATINE);
            event.accept(ModBlocks.BLACK_OPAL_BLOCK);
            event.accept(ModBlocks.BLACK_OPAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_BLACK_OPAL_BLOCK_ORE);
            event.accept(ModBlocks.NETHERRACK_BLACK_OPAL_BLOCK_ORE);
            event.accept(ModBlocks.ENDSTONE_BLACK_OPAL_BLOCK_ORE);

        }
    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}