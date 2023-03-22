package cardsWithPower_workWithAbstraction;

public class Card {

    private CardRankPower cardRankPower;
    private CardSuitPower cardSuitPower;

    public Card(CardRankPower cardRankPower, CardSuitPower cardSuitPower) {
        this.cardRankPower = cardRankPower;
        this.cardSuitPower = cardSuitPower;
    }

    public CardRankPower getCardRankPower() {
        return cardRankPower;
    }

    public void setCardRankPower(CardRankPower cardRankPower) {
        this.cardRankPower = cardRankPower;
    }

    public CardSuitPower getCardSuitPower() {
        return cardSuitPower;
    }

    public void setCardSuitPower(CardSuitPower cardSuitPower) {
        this.cardSuitPower = cardSuitPower;
    }

    public static int getPower(CardRankPower cardRankPower, CardSuitPower cardSuitPower){
        int power = cardRankPower.getPower() + cardSuitPower.getPower();
        return power;
    }
}
