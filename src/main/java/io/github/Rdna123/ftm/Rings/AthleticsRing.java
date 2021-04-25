package io.github.Rdna123.ftm.Rings;

import io.github.Rdna123.ftm.util.RingPower;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;


public class AthleticsRing extends Ring {

    public AthleticsRing(Settings settings, int ExLevel) {
        super(settings.group(Ring.PowerRings).maxCount(1));
        this.level = ExLevel;
    }

    @Override
    public void tick(PlayerEntity player, ItemStack stack) {
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 0, new RingPower().levelSys(level)));
        if (level != 0){
            player.addStatusEffect(new StatusEffectInstance(
                    StatusEffects.JUMP_BOOST, 0, new RingPower().levelSys(level-1)));
        }
    }
}
