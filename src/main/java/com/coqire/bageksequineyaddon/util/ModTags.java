package com.coqire.bageksequineyaddon.util;

import com.coqire.bageksequineyaddon.BageksEquineyAddon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> PASTURE = tag("pasture");



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(BageksEquineyAddon.MOD_ID, name));
        }
    }
}
