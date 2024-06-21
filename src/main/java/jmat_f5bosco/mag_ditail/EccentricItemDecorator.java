package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public abstract class EccentricItemDecorator extends EccentricItem {
    protected EccentricItem item;

    public EccentricItemDecorator(EccentricItem item) {
        super(item.getName(), item.getDescription(), item.getBasePrice());
        this.item = item;
    }

    @Override
    public BigDecimal getSellPrice() {
        return item.getSellPrice();
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return getSellPrice().multiply(BigDecimal.ONE.add(TAX_RATE));
    }
}
