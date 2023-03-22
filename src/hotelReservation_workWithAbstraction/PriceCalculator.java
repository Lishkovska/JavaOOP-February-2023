package hotelReservation_workWithAbstraction;

public class PriceCalculator {


    public static double getTotalPrice (int days, double pricePerDay, Season season, DiscountType discountType){
        double price = pricePerDay * days;
        price = price * season.getMultiplier();
        price = price * (100 - discountType.getDiscount()) / 100.0;
        return price;
    }
}
