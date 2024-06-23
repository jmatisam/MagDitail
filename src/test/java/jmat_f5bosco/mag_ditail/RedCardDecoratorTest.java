package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class RedCardDecoratorTest {

    Magiccrazy card = new Magiccrazy("Red Card", "A mystical red card", "red", 7);
    Magiccrazy redCard = new RedCardDecorator(card);

    @Test
    public void testRedCardDecoratorPrice() {
        assertEquals(BigDecimal.valueOf(3.50), redCard.getSellPrice());
    }

    @Test
    public void testRedCardDecoratorFinalPrice() {
        BigDecimal expectedFinalPrice = BigDecimal.valueOf(3.50).multiply(BigDecimal.valueOf(1.21));

        assertEquals(expectedFinalPrice.setScale(2, RoundingMode.HALF_UP), redCard.calculateTotalPrice());
    }

    @Test
    public void testInvalidColorForRedCardDecorator() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
            new RedCardDecorator(new Magiccrazy("Blue Card", "A mystical blue card", "blue", 5)));

        assertEquals("The RedCard decorator can only be applied to red cards.", exception.getMessage());
    }
}
