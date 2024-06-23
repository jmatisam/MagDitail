package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EccentricItem {
    private String name;
    private String description;
    private BigDecimal basePrice;
    private BigDecimal sellPrice;
    protected static final BigDecimal TAX_RATE = BigDecimal.valueOf(0.21);

    public EccentricItem(String name, String description, BigDecimal basePrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.sellPrice = basePrice;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
        this.sellPrice = basePrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public BigDecimal getFinalPrice() {
        return calculateTotalPrice();
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal totalPrice = sellPrice.multiply(BigDecimal.ONE.add(TAX_RATE));
        return totalPrice.setScale(2, RoundingMode.HALF_UP); 
    }
    
}
