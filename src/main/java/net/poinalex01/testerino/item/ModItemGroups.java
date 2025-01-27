//package net.poinalex01.testerino.item;
//
//import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.Registry;
//import net.minecraft.text.Text;
//import net.minecraft.util.Identifier;
//import net.poinalex01.testerino.Testerino;
//
//public class ModItemGroups {
//    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
//            Identifier.of(Testerino.MOD_ID, "ruby"),
//            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
//                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
//                        entries.add(ModItems.RUBY);
//                        entries.add(ModItems.RAW_RUBY);
//
//                        entries.add(Items.DIAMOND);
//
//
//                    }).build());
//
//
//    public static void registerItemGroups() {
//        Testerino.LOGGER.info("Registering Item Groups for " + Testerino.MOD_ID);
//    }
//}