package Composite;

public class Miniature implements Item {
    @Override
    public String getName() {
        return "Miniature";
    }

    @Override
    public double getPrice() {
        return 20.00;
    }
}
