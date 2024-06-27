package jmat_f5bosco.mag_ditail.models;

import java.math.BigDecimal;

public interface CardInterface{
    
    String getId();
    void setId(String Id);

    String getName();
    void setName(String name);
    
    String getDescription();
    void setDescription(String description);
    
    String getColor();
    void setColor(String color);
    
    int getAge();
    void setAge(int age);
    
    BigDecimal getSellPrice();
    void setSellPrice(BigDecimal price);

    String getImagePath();
    void setImagePath(String imagePath);
    
    
}
