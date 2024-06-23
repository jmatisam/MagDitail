package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public class BlackCardDecorator extends Magiccrazy {

    public BlackCardDecorator(Magiccrazy item) {
        super(item.getName(), item.getDescription(), item.getColor(), item.getAge());
        if ("black".equalsIgnoreCase(item.getColor())) {
            setSellPrice(BigDecimal.valueOf(6.80)); // Precio específico para cartas negras
        } else {
            throw new IllegalArgumentException("The BlackCard decorator can only be applied to black cards.");
        }
    }
}
