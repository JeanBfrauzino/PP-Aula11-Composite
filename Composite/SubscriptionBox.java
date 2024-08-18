package Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SubscriptionBox implements Item {
    private String level;
    private int maxItems;
    private List<Item> items;

    public SubscriptionBox(String level, int maxItems) {
        this.level = level;
        this.maxItems = maxItems;
        this.items = new ArrayList<>();
        generateRandomItems();
    }

    private void generateRandomItems() {
        List<Item> possibleItems = List.of(
                new Comic(), new Keychain(), new Bust(), new Sticker(),
                new Poster(), new TShirt(), new Pen(), new Miniature()
        );

        Random random = new Random();
        for (int i = 0; i < maxItems; i++) {
            items.add(possibleItems.get(random.nextInt(possibleItems.size())));
        }
    }

    @Override
    public String getName() {
        return "Subscription Box (" + level + ")";
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void displayItems() {
        System.out.println("Itens na " + getName() + ":");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": R$" + item.getPrice());
        }
        System.out.println("Valor total: R$" + getPrice());
    }
}
