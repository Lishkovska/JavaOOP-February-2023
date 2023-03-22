package cardsWithPower_workWithAbstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        Card card = new Card(CardRankPower.valueOf(rank), CardSuitPower.valueOf(suit));

        System.out.printf("Card name: %s of %s; Card power: %d%n", card.getCardRankPower(), card.getCardSuitPower()
                , Card.getPower(card.getCardRankPower(), card.getCardSuitPower()));

    }
}
