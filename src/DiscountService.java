public class DiscountService {

    public double calculateDiscountPrice(Client client, double price) {
        double discountPrice = price;
        if (client.isPremium())
            return  calculatePremiumDiscount(price);
         else
            return calculateStandardDiscount(price);
        }



    private double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return price *= 0.85;
        } else {
            return  price *= 0.95;
        }
    }

    private double calculateStandardDiscount(double price) {
        if (price > 1000) {
            return price *= 0.9;
        } else {
            return  price;
        }
    }
}
