package birthdayCelebration_interfacesAbstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split(" ");
        String type = inputData[0];

        List<Birthable> list = new ArrayList<>();


        while (!type.equals("End")){
            if (type.equals("Citizen")){
              list.add(new Citizen(inputData[1],Integer.parseInt(inputData[2]),
                      inputData[3],inputData[4] ));
            } else if (type.equals("Pet")){
              list.add(new Pet(inputData[1],inputData[2] ));
            }
            type = scanner.nextLine();
        }

        int year = Integer.parseInt(scanner.nextLine());

        list.stream()
                .filter(t -> t.getBirthDate()
                .endsWith(String.valueOf(year)))
                .map(Birthable::getBirthDate)
                .forEach(System.out::println);
        }

    }

