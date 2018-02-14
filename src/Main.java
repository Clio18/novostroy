import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printListOfCommands();
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }

    public static void printListOfCommands() {
        System.out.println("Cписок доступных команд: ");
        ArrayList listOfCommands = new ArrayList();
        listOfCommands.add("Список доступных команд - нажмите 0");
        listOfCommands.add("Список квартир - нажмите 1");
        listOfCommands.add("Список квартир на этаже - нажмите 2");
        for (int i = 0; i < listOfCommands.size(); i++) {
            System.out.println(listOfCommands.get(i));
        }
        System.out.println("Введите цифру: ");
    }
}
