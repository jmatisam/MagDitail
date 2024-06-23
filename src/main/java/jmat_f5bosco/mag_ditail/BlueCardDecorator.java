package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public class BlueCardDecorator extends Magiccrazy {

    public BlueCardDecorator(Magiccrazy item) {
        super(item.getName(), item.getDescription(), item.getColor(), item.getAge());
        if ("blue".equalsIgnoreCase(item.getColor())) {
            setSellPrice(BigDecimal.valueOf(5.0));
        } else {
            throw new IllegalArgumentException("The BlueCard decorator can only be applied to blue cards.");
        }
    }
}
