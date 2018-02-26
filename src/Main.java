import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int commandId = 0;
        Novostroika novostroika = new Novostroika(new ArrayList<>());
        PrintListOfCommands printListOfCommands = new PrintListOfCommands();
        int maxCommandId = printListOfCommands.mainCommand2(novostroika.list);
        PrintListOfFlats printListOfFlats = new PrintListOfFlats();
        ShowAvailableFlats showAvailableFlats = new ShowAvailableFlats();
        ShowNotAvailableFlats showNotAvailableFlats = new ShowNotAvailableFlats();
        ShownFlatConsistent shownFlatConsistent = new ShownFlatConsistent();
        BuyTheFlat buyTheFlat = new BuyTheFlat();
        ShownRange shownRange = new ShownRange();




        while (commandId != -1) {
            if (scanner.hasNextInt()) {
                commandId = scanner.nextInt();
                if (commandId == 0) {
                    printListOfCommands.mainCommand2(novostroika.list);
                } else if (commandId > maxCommandId || commandId < -1) {
                    System.out.println("Неверный номер команды");
                } else if (commandId == 1) {
                    printListOfFlats.mainCommand(novostroika.list);
                } else if (commandId == 6) {
                    System.out.println("Введите номер квартиры");
                    int num = scanner.nextInt();
                    shownFlatConsistent.mainCommand(num, novostroika.list);
                } else if (commandId == 7) {
                    System.out.println("Введите нижнюю границу");
                    if (scanner.hasNextDouble()) {
                        double min = scanner.nextDouble();
                        System.out.println("Введите верхнюю границу");
                        if (scanner.hasNextDouble()) {
                            double max = scanner.nextDouble();
                            shownRange.mainCommand(min, max, novostroika.list);
                        }
                    }
                } else if (commandId == 3) {
                    showAvailableFlats.mainCommand(novostroika.list);
                } else if (commandId == 4) {
                    showNotAvailableFlats.mainCommand(novostroika.list);
                } else if (commandId == 5) {
                    System.out.println("Enter the flat's number: ");
                    if (scanner.hasNextInt()) {
                        int num = scanner.nextInt();
                        buyTheFlat.mainCommand(num, novostroika.list);
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
