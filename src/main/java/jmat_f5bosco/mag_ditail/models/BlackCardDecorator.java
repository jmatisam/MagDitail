package jmat_f5bosco.mag_ditail.models;

import java.math.BigDecimal;

public final class BlackCardDecorator implements CardInterface {
    private final CardInterface decoratedCard;

    public BlackCardDecorator(CardInterface card) {
        this.decoratedCard = card;
        if (!"black".equalsIgnoreCase(card.getColor())) {
            throw new IllegalArgumentException("The BlackCard decorator can only be applied to black cards.");
        }
        
        if ("Black Lotus".equalsIgnoreCase(card.getName())) {
            setSellPrice(BigDecimal.valueOf(40000)); 
        } else {
            setSellPrice(BigDecimal.valueOf(6.80)); 
        }
    }

    @Override
    public String getId() {
        return decoratedCard.getId();
    }

    @Override
    public void setId(String id) {
        decoratedCard.setId(id);
    }

    @Override
    public String getName() {
        return decoratedCard.getName();
    }

    @Override
    public void setName(String name) {
        decoratedCard.setName(name);
    }

    @Override
    public String getDescription() {
        return decoratedCard.getDescription();
    }

    @Override
    public void setDescription(String description) {
        decoratedCard.setDescription(description);
    }

    @Override
    public String getColor() {
        return decoratedCard.getColor();
    }

    @Override
    public void setColor(String color) {
        decoratedCard.setColor(color);
    }

    @Override
    public int getAge() {
        return decoratedCard.getAge();
    }

    @Override
    public void setAge(int age) {
        decoratedCard.setAge(age);
    }

    @Override
    public BigDecimal getSellPrice() {
        return decoratedCard.getSellPrice();
    }

    @Override
    public void setSellPrice(BigDecimal price) {
        decoratedCard.setSellPrice(price);
    }

    @Override
    public String getImagePath() {
        return decoratedCard.getImagePath();
    }

    @Override
    public void setImagePath(String imagePath) {
        decoratedCard.setImagePath(imagePath);
    }
}
