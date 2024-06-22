package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public class BlueCardDecorator extends EccentricItemDecorator {

    public BlueCardDecorator(EccentricItem item) {
        super(item);
        setSellPrice(BigDecimal.valueOf(5.0)); // Precio específico para cartas azules
    }

    @Override
    public BigDecimal getSellPrice() {
        return BigDecimal.valueOf(5.0); // Precio específico para cartas azules
    }
}
