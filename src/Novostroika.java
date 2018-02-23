import java.util.ArrayList;
import java.util.List;

public class Novostroika {
    public ArrayList<FlatConsistent> list;

    public Novostroika(ArrayList<FlatConsistent> list) {
        list.add(new FlatConsistent(1, 1, 38.8, 8000.8, 2, 44.1, true));
        list.add(new FlatConsistent(2, 2, 45.9, 8989.7, 2, 33.3, true));
        list.add(new FlatConsistent(3, 3, 89.9, 89765.9, 3, 70.1, true));
        this.list = list;
    }

    public ArrayList<FlatConsistent> getList() {
        return list;
    }

    public void setList(ArrayList<FlatConsistent> list) {
        this.list = list;
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
        return listOfCommands.size() - 1;
    }

    public static void printListOfFlats(ArrayList<FlatConsistent> flats) {
        System.out.println("Список квартир в доме: ");
        for (FlatConsistent flat : flats) {
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
                System.out.println("Количество окон: " + flats.get(i).getNumberOfWindows());
                System.out.println("Площадь комнаты: " + flats.get(i).getSquereOfRoom());
                if (flats.get(i).isFree()) {
                    System.out.println("Квартира свободна");
                } else System.out.println("Квартира продана");
            }
        }
    }

    public static void shownRange(double min, double max, ArrayList<FlatConsistent> flats) {
        if (max < min) {
            System.out.println("Неверный дипазон");
            return;
        }
        List<Integer> flats1 = new ArrayList<>();
        for (int i = 0; i < flats.size(); i++) {
            if (flats.get(i).value >= min && flats.get(i).value <= max) {
                flats1.add(flats.get(i).number);
            }
        }
        if (flats1.isEmpty()) {
            System.out.println("no flats");
        } else {
            System.out.print("List of flats:  ");
            for (int i = 0; i < flats1.size(); i++) {
                System.out.print(flats1.get(i) + ",");

            }
            System.out.println();
        }
    }

    public static void buyTheFlat(int number, ArrayList<FlatConsistent> flats) {
        for (FlatConsistent flatConsistent : flats) {
            if (flatConsistent.getNumber() == number) {
                flatConsistent.setFree(false);
            }
        }

    }

    public static void showAvailableFlats(ArrayList<FlatConsistent> flats) {
        boolean flag = true;
        for (FlatConsistent flatConsistent : flats) {
            if (flatConsistent.isFree()) {
                System.out.println("Available flat number: " + flatConsistent.number);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The house hasn't any available flats");
        }


    }

    public static void showNotAvailableFlats(ArrayList<FlatConsistent> flats) {
        boolean flag = true;
        for (FlatConsistent flatConsistent : flats) {
            if (!flatConsistent.isFree()) {
                System.out.println("Sold flats number: " + flatConsistent.number);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("All flats are free!");
        }
    }
}
