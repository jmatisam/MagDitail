package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class BlackCardDecoratorTest {

    Magiccrazy card = new Magiccrazy("Black Card", "A powerful black card", "black", 10);
    Magiccrazy blackCard = new BlackCardDecorator(card);

    @Test
    public void testBlackCardDecoratorPrice() {
        assertEquals(BigDecimal.valueOf(6.80), blackCard.getSellPrice());
    }

    @Test
    public void testBlackCardDecoratorFinalPrice() {
        BigDecimal expectedFinalPrice = BigDecimal.valueOf(6.80).multiply(BigDecimal.valueOf(1.21));

        assertEquals(expectedFinalPrice.setScale(2, RoundingMode.HALF_UP), blackCard.calculateTotalPrice());
    }

    @Test
    public void testInvalidColorForBlackCardDecorator() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
            new BlackCardDecorator(new Magiccrazy("Green Card", "A mystical green card", "green", 5)));

        assertEquals("The BlackCard decorator can only be applied to black cards.", exception.getMessage());
    }
}
