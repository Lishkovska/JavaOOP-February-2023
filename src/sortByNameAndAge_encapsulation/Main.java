package sortByNameAndAge_encapsulation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);

        int n = Integer.parseInt(reader.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] inputDat = reader.nextLine().split(" ");
            String firstName = inputDat[0];
            String lastName = inputDat[1];
            int age = Integer.parseInt(inputDat[2]);

            Person person = new Person(firstName, lastName, age);
            peopleList.add(person);

        }

        peopleList.stream().sorted((a, b) -> {
            int result = a.getFirstName().compareTo(b.getFirstName());
            if (result != 0) {
                return result;
            } else {
                return Integer.compare(a.getAge(), b.getAge());
            }
        }).collect(Collectors.toList());

        for (Person person : peopleList) {
            System.out.println(person.toString());
        }


    }
}



