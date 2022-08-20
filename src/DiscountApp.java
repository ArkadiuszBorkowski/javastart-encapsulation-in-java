class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price = 1100;
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price);

        System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice);

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;
        DiscountService discountService2 = new DiscountService();
        double discountPrice2 = discountService.calculateDiscountPrice(client2, price);

        System.out.println("Witaj " + client2.getFirstName() + " " + client2.getLastName());
        System.out.println("Kwota przed rabatem: " + price2);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice2);
    }
}
