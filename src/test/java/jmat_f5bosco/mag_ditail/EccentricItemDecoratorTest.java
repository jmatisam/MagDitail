package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EccentricItemDecoratorTest {

    // Subclase concreta para pruebas // comentario durante mi aprendizaje de los decoradores
    public class ConcreteEccentricItemDecorator extends EccentricItemDecorator {
        public ConcreteEccentricItemDecorator(EccentricItem item) {
            super(item);
        }

        @Override
        public void setSellPrice(BigDecimal sellPrice) {
            item.setSellPrice(sellPrice);
        }

        @Override
        public BigDecimal getSellPrice() {
            return item.getSellPrice();
        }
    }

    @Test
    void decorator_should_inherit_name() {
        EccentricItem item = new EccentricItem("Test Item", "Item Description", BigDecimal.valueOf(1.00));
        ConcreteEccentricItemDecorator decorator = new ConcreteEccentricItemDecorator(item);
        assertEquals("Test Item", decorator.getName());
    }

    @Test
    void decorator_should_inherit_description() {
        EccentricItem item = new EccentricItem("Test Item", "Item Description", BigDecimal.valueOf(1.00));
        ConcreteEccentricItemDecorator decorator = new ConcreteEccentricItemDecorator(item);
        assertEquals("Item Description", decorator.getDescription());
    }

    @Test
    void decorator_should_inherit_basePrice() {
        EccentricItem item = new EccentricItem("Test Item", "Item Description", BigDecimal.valueOf(1.00));
        ConcreteEccentricItemDecorator decorator = new ConcreteEccentricItemDecorator(item);
        assertEquals(BigDecimal.valueOf(1.0), decorator.getBasePrice());
    }

    @Test
    void decorator_should_inherit_and_set_sellPrice() {
        EccentricItem item = new EccentricItem("Test Item", "Item Description", BigDecimal.valueOf(1.00));
        ConcreteEccentricItemDecorator decorator = new ConcreteEccentricItemDecorator(item);
        decorator.setSellPrice(BigDecimal.valueOf(100.0));
        assertEquals(BigDecimal.valueOf(100.0), decorator.getSellPrice());
    }

    @Test
    void decorator_should_calculateTotalPrice_with_tax() {
        EccentricItem item = new EccentricItem("Test Item", "Item Description", BigDecimal.valueOf(1.00));
        ConcreteEccentricItemDecorator decorator = new ConcreteEccentricItemDecorator(item);
        decorator.setSellPrice(BigDecimal.valueOf(100.0));
        BigDecimal expected = BigDecimal.valueOf(121.00);
        BigDecimal actual = decorator.calculateTotalPrice();
        assertEquals(0, expected.compareTo(actual));
    }
}

