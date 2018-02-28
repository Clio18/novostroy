import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ShownRange implements MainCommand {

    @Override
    public void execute(ArrayList<FlatConsistent> list) {
        System.out.println("Enter min border: ");
        double min = new Scanner(System.in).nextDouble();
        System.out.println("Enter max border: ");
        double max = new Scanner(System.in).nextDouble();
        if (max < min) {
            System.out.println("Неверный дипазон");
            return;
        }
//        List<Integer> flats2 = list.stream()
//                                    .filter(f -> f.value >= min && f.value <= max)
//                                    .map(FlatConsistent::getNumber)
//                                    .collect(toList());

        List<Integer> flats1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).value >= min && list.get(i).value <= max) {
                flats1.add(list.get(i).number);
            }
        }
        if (flats1.isEmpty()) {
            System.out.println("no flats");
        } else {
            System.out.print("List of flats:  ");
//            flats1.stream()
//                  .forEach(f -> System.out.println(f+","));
//
//            String s = flats1.stream()
//                             .map(Object::toString)
//                             .collect(joining(",\n"));
            //System.out.println(s);
            for (int i = 0; i < flats1.size(); i++) {
                System.out.print(flats1.get(i) + ",");

            }
            System.out.println();
        }

    }
}
