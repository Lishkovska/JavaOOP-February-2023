package hotelReservation_workWithAbstraction;

public enum Season {

    //1 during Autumn
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4)
    ;


    private int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
