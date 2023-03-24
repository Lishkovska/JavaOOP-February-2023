package firstAndReserveTeam_encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> players = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String firstName = inputData[0];
            String lastName = inputData[1];
            int age = Integer.parseInt(inputData[2]);
            double salaray = Double.parseDouble(inputData[3]);

            Person player = new Person(firstName, lastName, age, salaray);
            players.add(player);
        }

        Team team = new Team("Black Eagles");

        for (Person player : players) {
            team.addPlayer(player);
        }

        System.out.printf("First team have %d players%n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players",team.getFirstTeam().size());
    }
}
