package jmat_f5bosco.mag_ditail;

import java.math.BigDecimal;

public class Magiccrazy extends EccentricItem{

    private String color;
    private int age;
    
    public Magiccrazy(String name, String description, String color, int age){
        super(name, description, BigDecimal.valueOf(2.0));
        this.color = color;
        this.age = age;
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
