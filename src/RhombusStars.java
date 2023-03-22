import java.util.Scanner;

public class RhombusStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int starCounter = 0; starCounter < n; starCounter++) {
            printRow(n, starCounter);
        }

        for (int starCounter = n - 1; starCounter > 0; starCounter--) {
            printRow(n, starCounter);
        }


    }

    private static void printRow(int n, int starCounter) {
        for (int j = 0; j < n - starCounter; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < starCounter - 1; k++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
