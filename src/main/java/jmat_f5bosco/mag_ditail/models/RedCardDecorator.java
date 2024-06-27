package jmat_f5bosco.mag_ditail.models;

import java.math.BigDecimal;

public class RedCardDecorator extends Magiccrazy {

    public RedCardDecorator(Magiccrazy item) {
        
        super(item.getName(), item.getDescription(), item.getColor(), item.getAge());
        if ("red".equalsIgnoreCase(item.getColor())) {
            setSellPrice(BigDecimal.valueOf(3.50));
        } else {
            throw new IllegalArgumentException("The RedCard decorator can only be applied to red cards.");
        }
    }
    
}
