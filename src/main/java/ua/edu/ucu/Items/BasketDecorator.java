package ua.edu.ucu.Items;

public class BasketDecorator extends ItemDecorator{

    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double getPrice(){
        return 4 + this.item.price();
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
