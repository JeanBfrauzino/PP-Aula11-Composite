package Composite;

public class Keychain implements Item {
    @Override
    public String getName() {
        return "Keychain";
    }

    @Override
    public double getPrice() {
        return 5.00;
    }
}
