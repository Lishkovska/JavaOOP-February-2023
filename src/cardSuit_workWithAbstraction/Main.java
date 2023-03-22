package cardSuit_workWithAbstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //Card Suits:
        // Ordinal value: 0; Name value: CLUBS
        System.out.println("Card Suits:");
        CardSuit[] cardSuits = CardSuit.values();
        for( CardSuit cardSuit : cardSuits){
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuit.ordinal(),
                    cardSuit);
        }


    }
}
