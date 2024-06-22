package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public class BlackCardDecorator extends EccentricItemDecorator {

    public BlackCardDecorator(EccentricItem item) {
        super(item);
        setSellPrice(BigDecimal.valueOf(6.80)); 
    }

    @Override
    public BigDecimal getSellPrice() {
        return BigDecimal.valueOf(6.80); 
    }
}
