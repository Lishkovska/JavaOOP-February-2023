package salaryIncrease_encapsulation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);

        int n = Integer.parseInt(reader.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = reader.nextLine().split(" ");
            String firstName = inputData[0];
            String lastName = inputData[1];
            int age = Integer.parseInt(inputData[2]);
            double salary = Double.parseDouble(inputData[3]);

            Person person = new Person(firstName, lastName, age, salary);
            people.add(person);
        }


        double bonus = Double.parseDouble(reader.nextLine());

        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
