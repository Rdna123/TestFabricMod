package io.github.Rdna123.ftm.Rings;

import io.github.Rdna123.ftm.util.RingPower;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class PowerRing extends Ring{
    public PowerRing(Settings settings, int ExLevel) {
        super(settings);
        this.level = ExLevel;
    }

    @Override
    public void tick(PlayerEntity player, ItemStack stack) {
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 0, new RingPower().levelSys(level)));
    }
}
