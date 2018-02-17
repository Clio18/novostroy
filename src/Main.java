import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<FlatConsistent> flats = new ArrayList<>();
        flats.add(new FlatConsistent(1, 1, 38.8, 8000.8, 2, 44.1, true));
        flats.add(new FlatConsistent(2, 2, 45.9, 8989.7, 2, 33.3, false));
        flats.add(new FlatConsistent(3, 3, 89.9, 89765.9, 3, 70.1, true));
        int a = printListOfCommands();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int mark = scanner.nextInt();
            if (mark > a - 1) {
                System.out.println("Введите команду из списка");
            } else if (mark == 1) {
                printListOfFlats(flats);
                break;
            } else if (mark == 6) {
                Scanner scanner1 = new Scanner(System.in);
                int num = scanner1.nextInt();
                scanner1.close();
                shownFlatConsistent(num, flats);
            } else if (mark == 7) {
                Scanner scanner2 = new Scanner(System.in);
                double min = scanner2.nextDouble();
                double max = scanner2.nextDouble();
                scanner2.close();
                shownRange(min, max, flats);
            } else break;
        }
    }


    public static int printListOfCommands() {
        System.out.println("Cписок доступных команд: ");
        ArrayList listOfCommands = new ArrayList();
        listOfCommands.add("Список доступных команд - нажмите 0");
        listOfCommands.add("Список квартир - нажмите 1");
        listOfCommands.add("Список квартир на этаже - нажмите 2");
        listOfCommands.add("Список доступных квартир - нажмите 3");
        listOfCommands.add("Список проданых квартир - нажмите 4");
        listOfCommands.add("Купить квартиру - нажмите 5");
        listOfCommands.add("Детальная информация о квартире - нажмите 6");
        listOfCommands.add("Показать квартиры в диапазоне цен - нажмите 7");
        for (int i = 0; i < listOfCommands.size(); i++) {
            System.out.println(listOfCommands.get(i));
        }
        System.out.println("Введите цифру: ");
        return listOfCommands.size();
    }

    public static void printListOfFlats(ArrayList<FlatConsistent> flats) {
        System.out.println("Список квартир в доме: ");
        for (Flat flat : flats) {
            System.out.println("Квартира №: " + flat.number);
            System.out.println("Этаж: " + flat.floor);
            System.out.println("Общая площадь: " + flat.square);
            System.out.println("Стоимость: " + flat.value);
            System.out.println(" ");
        }
    }

    public static void shownFlatConsistent(int number, ArrayList<FlatConsistent> flats) {
        for (int i = 0; i < flats.size(); i++) {
            if (flats.get(i).number == number) {
                System.out.println("Характеристика квартиры №: " + number);
                System.out.println("Квартира №: " + flats.get(i).number);
                System.out.println("Этаж: " + flats.get(i).floor);
                System.out.println("Общая площадь: " + flats.get(i).square);
                System.out.println("Стоимость: " + flats.get(i).value);
                System.out.println("Количество окон: " + flats.get(i).numberOfWindows);
                System.out.println("Площадь комнаты: " + flats.get(i).squereOfRoom);
                if (flats.get(i).free) {
                    System.out.println("Квартира свободна");
                } else System.out.println("Квартира продана");
            }
        }
    }

    public static void shownRange(double min, double max, ArrayList<FlatConsistent> flats) {
        for (int i = 0; i < flats.size(); i++) {
            if (flats.get(i).value >= min && flats.get(i).value <= max) {
                System.out.println("Квартиры в этом диапазоне №: " + flats.get(i).number);
            }
        }
    }

    public static void  buyTheFlat(int number){

    }

}
