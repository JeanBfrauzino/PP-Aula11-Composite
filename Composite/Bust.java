package Composite;

public class Bust implements Item {
    @Override
    public String getName() {
        return "Bust";
    }

    @Override
    public double getPrice() {
        return 10.00;
    }
}
