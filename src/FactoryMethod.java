import java.util.ArrayList;
import java.util.Scanner;

public class FactoryMethod {
    public static void getCommand(int number) {
        Novostroika novostroika = new Novostroika(new ArrayList<>());
        ArrayList list = novostroika.list;
        Scanner scanner = new Scanner(System.in);
        ;
        switch (number) {

            case 0:
                PrintListOfCommands printListOfCommands = new PrintListOfCommands();
                printListOfCommands.mainCommand2(list);
                break;
            case 1:
                PrintListOfFlats printListOfFlats = new PrintListOfFlats();
                printListOfFlats.mainCommand(list);
                break;
            case 6:
                ShownFlatConsistent shownFlatConsistent = new ShownFlatConsistent();
                System.out.println("Введите номер квартиры");
                int num = scanner.nextInt();
                shownFlatConsistent.mainCommand(num, list);
                break;
            case 7:
                ShownRange shownRange = new ShownRange();
                System.out.println("Введите нижнюю границу");
                double min = scanner.nextDouble();
                System.out.println("Введите верхнюю границу");
                double max = scanner.nextDouble();
                shownRange.mainCommand(min, max, list);
                break;
            case 3:
                ShowAvailableFlats showAvailableFlats = new ShowAvailableFlats();
                showAvailableFlats.mainCommand(list);
                break;
            case 4:
                ShowNotAvailableFlats showNotAvailableFlats = new ShowNotAvailableFlats();
                showNotAvailableFlats.mainCommand(list);
                break;
            case 5:
                BuyTheFlat buyTheFlat = new BuyTheFlat();
                System.out.println("Enter the flat's number: ");
                int n = scanner.nextInt();
                buyTheFlat.mainCommand(n, list);
                System.out.println("You have already bought flat number: " + n);
                break;
        }
    }
}
