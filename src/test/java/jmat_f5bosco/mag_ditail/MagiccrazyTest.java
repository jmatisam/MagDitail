package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MagiccrazyTest {

    Magiccrazy card = new Magiccrazy("Card", "A rare card", "brown", 10);

    @Test
    public void test_create_MagicCrazy() {
        
        assertEquals("Card", card.getName());
        assertEquals("A rare card", card.getDescription());
        assertEquals("brown", card.getColor());
        assertEquals(10, card.getAge());
        assertEquals(BigDecimal.valueOf(2.0), card.getBasePrice());
    }

    @Test
    public void test_uUpdate_name() {
        card.setName("red Card");

        assertEquals("red Card", card.getName());
    }
    @Test
    public void test_uUpdate_description() {
        card.setDescription("A Unique Red Card ");

        assertEquals("A Unique Red Card ", card.getDescription());
    }

    @Test
    public void test_uUpdate_BasePrice() {
        card.setBasePrice(BigDecimal.valueOf(7.0));

        assertEquals(BigDecimal.valueOf(7.0), card.getBasePrice());
    }

    @Test
    public void test_Set_And_GetAge() {
        card.setAge(12);
        assertEquals(12, card.getAge());
    }

    @Test
    public void test_Set_And_GetColor() {
        card.setColor("Blue");
        assertEquals("Blue", card.getColor());
    }

    @Test
    public void test_uUpdate_sellPrice() {
        card.setSellPrice(BigDecimal.valueOf(7.0));

        assertEquals(BigDecimal.valueOf(7.0), card.getSellPrice());
    }

    @Test
    public void testCalculateTotalPrice() {

        assertEquals(BigDecimal.valueOf(2.42), card.calculateTotalPrice());
    }
    
}
