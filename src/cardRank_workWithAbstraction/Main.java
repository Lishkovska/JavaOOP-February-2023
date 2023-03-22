package cardRank_workWithAbstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Card Ranks: Ordinal value: 0; Name value: ACE
        System.out.println("Card Ranks:");
        CardRank[] cardRanks = CardRank.values();
        for (CardRank cardRank : cardRanks){
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    cardRank.ordinal(), cardRank);
        }
    }
}


