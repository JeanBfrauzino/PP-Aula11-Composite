package Composite;

public class Comic implements Item {
    @Override
    public String getName() {
        return "Comic";
    }

    @Override
    public double getPrice() {
        return 15.00;
    }
}