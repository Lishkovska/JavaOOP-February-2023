package validationData_encapsulation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String firstName = inputData[0];
            String lastName = inputData[1];
            int age = Integer.parseInt(inputData[2]);
            double salaray = Double.parseDouble(inputData[3]);

            Person person = new Person(firstName, lastName, age, salaray);
            personList.add(person);
        }

        double bonus = Double.parseDouble(scanner.nextLine());

        for (Person person : personList) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }

    }