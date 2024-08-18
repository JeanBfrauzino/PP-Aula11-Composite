package Composite;

public class Main {
    public static void main(String[] args) {
        SubscriptionBox bronzeBox = new SubscriptionBox("Bronze", 3);
        SubscriptionBox silverBox = new SubscriptionBox("Prata", 5);
        SubscriptionBox goldBox = new SubscriptionBox("Ouro", 7);
        SubscriptionBox platinumBox = new SubscriptionBox("Platina", 10);

        bronzeBox.displayItems();
        System.out.println();

        silverBox.displayItems();
        System.out.println();

        goldBox.displayItems();
        System.out.println();

        platinumBox.displayItems();
    }
}
