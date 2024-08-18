package Composite;

public class TShirt implements Item {
    @Override
    public String getName() {
        return "T-Shirt";
    }

    @Override
    public double getPrice() {
        return 25.00;
    }
}
