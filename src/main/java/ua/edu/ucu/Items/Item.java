package ua.edu.ucu.Items;
import lombok.Setter;

public abstract class Item {
    @Setter
    private String description;


    public String getDescription() {
        return description;
    }

    public abstract double price();

}
