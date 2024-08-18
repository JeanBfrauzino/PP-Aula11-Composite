package Composite;

public class Sticker implements Item {
    @Override
    public String getName() {
        return "Sticker";
    }

    @Override
    public double getPrice() {
        return 1.00;
    }
}