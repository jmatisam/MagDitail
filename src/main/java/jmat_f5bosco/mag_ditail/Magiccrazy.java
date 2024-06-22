package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public class Magiccrazy extends EccentricItem{

    private int age;
    private String color;

    public Magiccrazy(String name, String description, BigDecimal basePrice){
        super(name, description, basePrice);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
