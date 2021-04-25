package io.github.Rdna123.ftm.Rings;

public class BaseRing extends Ring{
    public BaseRing(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canWearInSlot(String group, String slot) {
        return false;
    }
}
