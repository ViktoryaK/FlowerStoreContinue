package ua.edu.ucu.Items;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower extends Item{
    @Getter
    private double sepalLength;
    private FlowerColor color;

    private double price;

    public String getColor() {
        return color.toString();
    }

    @Override
    public double price() {
        return price;
    }
}