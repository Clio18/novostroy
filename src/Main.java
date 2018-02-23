import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxCommandId = Novostroika.printListOfCommands();
        Scanner scanner = new Scanner(System.in);
        int commandId = 0;
        Novostroika novostroika = new Novostroika(new ArrayList<>());


        while (commandId != -1) {
            if (scanner.hasNextInt()) {
                commandId = scanner.nextInt();
                if (commandId == 0) {
                    Novostroika.printListOfCommands();
                } else if (commandId > maxCommandId || commandId < -1) {
                    System.out.println("Неверный номер команды");
                } else if (commandId == 1) {
                    Novostroika.printListOfFlats(novostroika.list);
                } else if (commandId == 6) {
                    System.out.println("Введите номер квартиры");
                    int num = scanner.nextInt();
                    Novostroika.shownFlatConsistent(num, novostroika.list);
                } else if (commandId == 7) {
                    System.out.println("Введите нижнюю границу");
                    if (scanner.hasNextDouble()) {
                        double min = scanner.nextDouble();
                        System.out.println("Введите верхнюю границу");
                        if (scanner.hasNextDouble()) {
                            double max = scanner.nextDouble();
                            Novostroika.shownRange(min, max, novostroika.list);
                        }
                    }
                } else if (commandId == 3) {
                    Novostroika.showAvailableFlats(novostroika.list);
                } else if (commandId == 4) {
                    Novostroika.showNotAvailableFlats(novostroika.list);
                } else if (commandId == 5) {
                    System.out.println("Enter the flat's number: ");
                    if (scanner.hasNextInt()) {
                        int num = scanner.nextInt();
                        Novostroika.buyTheFlat(num, novostroika.list);
                        System.out.println("You have already bought flat number: " + num);
                    }
                }
            } else {
                scanner.next();
                System.out.println("Irregular enter. Enter the number of command");
            }
        }
    }

}
