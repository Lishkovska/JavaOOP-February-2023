package cardsWithPower_workWithAbstraction;

public enum CardSuitPower {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39)

    ;

    private int power;

    CardSuitPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
