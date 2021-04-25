package io.github.Rdna123.ftm.Rings;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.DispenserBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import static io.github.Rdna123.ftm.init.ItemInit.Athletics_Ring;

public abstract class Ring extends TrinketItem {

    protected int level = 0;


    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.getItem() == Items.GOLD_INGOT;
    }


    public static ItemGroup PowerRings = FabricItemGroupBuilder.create(
            new Identifier("ftm", "power_rings_group"))
            .icon(() -> new ItemStack(Athletics_Ring))
            .build();


    public Ring(Settings settings) {
        super(settings);
        DispenserBlock.registerBehavior(this, TRINKET_DISPENSER_BEHAVIOR);
    }


    @Override
    public boolean canWearInSlot(String group, String slot) {
        return group.equals(SlotGroups.HAND) && slot.equals(Slots.RING);
    }
}
