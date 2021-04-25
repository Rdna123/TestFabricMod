package io.github.Rdna123.ftm;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketSlots;
import io.github.Rdna123.ftm.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class FabricTestMod implements ModInitializer {


    @Override
    public void onInitialize() {
        //Register your item somewhere
        //Adding the hand:ring slot to Trinkets, as it does not exist by default, note that this uses the provided Trinkets texture
        TrinketSlots.addSlot(SlotGroups.HAND, Slots.RING, new Identifier("trinkets", "textures/item/empty_trinket_slot_ring.png"));
        ItemInit.init();

    }
}