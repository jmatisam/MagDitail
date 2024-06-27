package jmat_f5bosco.mag_ditail.models;

import java.math.BigDecimal;

public class GreenCardDecorator extends Magiccrazy{

    public GreenCardDecorator(Magiccrazy item) {
        
    super(item.getName(), item.getDescription(), item.getColor(), item.getAge());
    if ("green".equalsIgnoreCase(item.getColor())) {
        setSellPrice(BigDecimal.valueOf(4.40)); 
    } else {
        throw new IllegalArgumentException("The GreenCard decorator can only be applied to green cards.");
    }
}
}
