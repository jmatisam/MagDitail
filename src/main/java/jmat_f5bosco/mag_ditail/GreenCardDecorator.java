package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public class GreenCardDecorator extends EccentricItemDecorator {

    public GreenCardDecorator(EccentricItem item) {
        super(item);
        setSellPrice(BigDecimal.valueOf(4.40)); 
    }

    @Override
    public BigDecimal getSellPrice() {
        return BigDecimal.valueOf(4.40);
    }
}
