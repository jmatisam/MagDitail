package jmat_f5bosco.mag_ditail.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Magic_Cards")
public class Magiccrazy extends EccentricItem implements CardInterface{

    @Id
    private String id;
    private String color;
    private int age;
    private String imagePath;
    
    public Magiccrazy(String name, String description, String color, int age){
        super(name, description, BigDecimal.valueOf(2.0));
        this.color = color;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

}
