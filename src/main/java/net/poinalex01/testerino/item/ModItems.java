package net.poinalex01.testerino.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.poinalex01.testerino.Testerino;

import java.util.function.Function;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", Item::new, new Item.Settings());
    public static final Item RAW_RUBY = registerItem("rawruby", Item::new, new Item.Settings());


    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Testerino.MOD_ID, name));
        return Items.register(registryKey, factory, settings);
    }
    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }
    public static void registerModItems() {
        Testerino.LOGGER.info("Registering Mod Items for " + Testerino.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }
}