package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class GreenCardDecoratorTest {

    Magiccrazy card = new Magiccrazy("Green Card", "A mystical green card", "green", 7);
    Magiccrazy greenCard = new GreenCardDecorator(card);

    @Test
    public void testGreenCardDecoratorPrice() {
        assertEquals(BigDecimal.valueOf(4.40), greenCard.getSellPrice());
    }

    @Test
    public void testGreenCardDecoratorFinalPrice() {
        BigDecimal expectedFinalPrice = BigDecimal.valueOf(4.40).multiply(BigDecimal.valueOf(1.21));

        assertEquals(expectedFinalPrice.setScale(2, RoundingMode.HALF_UP), greenCard.calculateTotalPrice());
    }

    @Test
    public void testInvalidColorForGreenCardDecorator() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
            new GreenCardDecorator(new Magiccrazy("Black Card", "A powerful black card", "black", 5)));

        assertEquals("The GreenCard decorator can only be applied to green cards.", exception.getMessage());
    }
}
