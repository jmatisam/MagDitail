package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public class RedCardDecorator extends EccentricItemDecorator {

    public RedCardDecorator(EccentricItemDecorator item) {
        super(item);
        setSellPrice(BigDecimal.valueOf(3.50));
    }
    @Override
    public BigDecimal getSellPrice() {
        return BigDecimal.valueOf(3.50);
    }
    
}
