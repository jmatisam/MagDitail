package jmat_f5bosco.mag_ditail.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import jmat_f5bosco.mag_ditail.models.BlueCardDecorator;
import jmat_f5bosco.mag_ditail.models.Magiccrazy;


public class BlueCardDecoratorTest {

    Magiccrazy card = new Magiccrazy("Blue Card", "A mystical blue card", "blue", 7);
    Magiccrazy blueCard = new BlueCardDecorator(card);

    @Test
    public void testBlueCardDecoratorPrice() {

        assertEquals(BigDecimal.valueOf(5.00), blueCard.getSellPrice());        
    }

    @Test
    public void test_blue_card_decorator_Final_Price(){
        BigDecimal expectedFinalPrice = BigDecimal.valueOf(5.00).multiply(BigDecimal.valueOf(1.21)); 

        assertEquals(expectedFinalPrice.setScale(2, RoundingMode.HALF_UP), blueCard.calculateTotalPrice());
    }

    @Test
    public void testInvalidColorForBlueCardDecorator() {
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
         new BlueCardDecorator(new Magiccrazy("Red Card", "A mystical red card", "red", 5)));

        assertEquals("The BlueCard decorator can only be applied to blue cards.", exception.getMessage());

    }
}

