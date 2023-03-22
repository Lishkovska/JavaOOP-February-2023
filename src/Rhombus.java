import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRhomb(n);
    }

    public static void printRhomb(int size) {
        for (int i = 1; i <= size; i++) {
            printRow(size - i, i);
        }
        for (int i = 1; i < size; i++) {
            printRow(i, size - i);
        }
    }

    private static void printRow(int counterForSpaces, int counterForStars) {
        for (int i = 0; i < counterForSpaces; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < counterForStars; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
