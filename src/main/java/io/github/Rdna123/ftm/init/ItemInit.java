package io.github.Rdna123.ftm.init;

import io.github.Rdna123.ftm.Rings.BaseRing;
import io.github.Rdna123.ftm.Rings.PowerRing;
import io.github.Rdna123.ftm.Rings.AthleticsRing;
import io.github.Rdna123.ftm.Rings.Ring;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    public static final Settings RingSettings = new FabricItemSettings().maxCount(1);

//    Base Ring
    public static final Item Base_Ring = new BaseRing(new FabricItemSettings().maxCount(16));


//    Athletics Ring initialization
    public static final Item Athletics_Ring = new AthleticsRing(RingSettings, 0);
    public static final Item Athletics_Ring_1 = new AthleticsRing(RingSettings, 1);

    public static final Item Athletics_Ring_2 = new AthleticsRing(RingSettings, 2);
    public static final Item Athletics_Ring_3 = new AthleticsRing(RingSettings, 3);


//    Power Ring initialization
    public static final Item Power_Ring = new PowerRing(RingSettings, 0);
    public  static final Item Power_Ring_1 = new PowerRing(RingSettings, 1);
    public  static final  Item Power_Ring_2 = new PowerRing(RingSettings, 2);
    public  static final Item Power_Ring_3 = new PowerRing(RingSettings, 3);

//    Method for Registration
    public static void init() {
        //Base Ring
        RegItem("base_ring", Base_Ring);

        //Athletics Rings
        RegItem("athletics_ring", Athletics_Ring);
        RegItem("athletics_ring_1", Athletics_Ring_1);
        RegItem("athletics_ring_2", Athletics_Ring_2);
        RegItem("athletics_ring_3", Athletics_Ring_3);

        //Power Rings
        RegItem("power_ring", Power_Ring);
        RegItem("power_ring_1", Power_Ring_1);
        RegItem("power_ring_2", Power_Ring_2);
        RegItem("power_ring_3", Power_Ring_3);
    }

    public static void RegItem(String path, Item item) {
        Registry.register(Registry.ITEM, new Identifier("ftm", path), item);
    }
}
