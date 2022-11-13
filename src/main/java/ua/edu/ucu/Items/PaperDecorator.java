package ua.edu.ucu.Items;

public class PaperDecorator extends ItemDecorator{

    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }

    public double getPrice(){
        return 13 + this.item.price();
    }
}
