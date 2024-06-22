package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EccentricItemTest {
    
       EccentricItem item = new EccentricItem("Test Item", "Item Description", BigDecimal.valueOf(1.00));
    

    @Test
    void testEccentricItemCreate(){
        assertNotNull(item);
    }
    
    @Test
    public void item_should_receive_the_name_1st_argument() {
    assertEquals("Test Item", item.getName());
    }

    @Test
    public void item_should_receive_the_Description_2st_argument() {
        assertEquals("Item Description", item.getDescription());
    }

    @Test
    public void item_should_receive_the_basePrice_3st_argument() {
        assertEquals(BigDecimal.valueOf(1.0), item.getBasePrice());
    }

    @Test
    public void item_should_receive_set_sellPrice() {
        item.setSellPrice(BigDecimal.valueOf(100.0));
        assertEquals(BigDecimal.valueOf(100.0), item.getSellPrice());
    }

   @Test
    public void item_should_taxOk_and_calculateTotalPrice() {
        item.setSellPrice(BigDecimal.valueOf(100.0));
        
        BigDecimal expected = BigDecimal.valueOf(121.00);
        BigDecimal actual = item.calculateTotalPrice();

        assertTrue(expected.compareTo(actual) == 0);
        //assertEquals(BigDecimal.valueOf(121.0), item.calculateTotalPrice());Usando assertTrue con compareTo,
        // aseguras que la prueba verifica la igualdad numérica sin preocuparse por la cantidad de ceros después del punto decimal.
    }


}

