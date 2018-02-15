import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int a = printListOfCommands();
            Scanner scanner = new Scanner(System.in);
            while (scanner.nextInt() != -1) {
                scanner.nextInt();
                if (scanner.nextInt()>a-1){
                    throw new Exception();
                }else
                if (scanner.nextInt()==1){
                    printListOfFlats();
                }
            }
        } catch (Exception e) {
            System.out.println("Даной команды не существует!");
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

    public static void printListOfFlats(){
        System.out.println("Список квартир в доме: ");
        ArrayList<Flat> flats = new ArrayList<>();
        flats.add(new Flat(1,1,38.8,8000.8));
        flats.add(new Flat(2, 2, 45.9, 8989.7));
        flats.add(new Flat(3, 3, 89.9, 89765.9));
        for (Flat flat: flats) {
            System.out.println("Квартира №: " + flat.number);
            System.out.println("Этаж: " + flat.floor);
            System.out.println("Общая площадь: " + flat.square);
            System.out.println("Стоимость: " + flat.value);
            System.out.println(" ");
        }
    }

}
