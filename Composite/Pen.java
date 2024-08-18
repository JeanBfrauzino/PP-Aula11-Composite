package Composite;

public class Pen implements Item {
    @Override
    public String getName() {
        return "Pen";
    }

    @Override
    public double getPrice() {
        return 3.00;
    }
}
