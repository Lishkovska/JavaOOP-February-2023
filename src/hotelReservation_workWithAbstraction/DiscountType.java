package hotelReservation_workWithAbstraction;

public enum DiscountType {

    VIP(20),
    SecondVisit(10),
    None(0);
    ;

    private int discount;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    DiscountType(int discount) {
        this.discount = discount;
    }
}
