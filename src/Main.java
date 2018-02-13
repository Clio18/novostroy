import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList listOfCommands = new ArrayList();
        String command = "Список доступных команд - нажмите 0";
        String command1 = "Список квартир - нажмите 1";
        String command2 = "Список квартир на этаже - нажмите 2";
        listOfCommands.add(command);
        listOfCommands.add(command1);
        listOfCommands.add(command2);
        for (int i = 0; i < listOfCommands.size(); i++) {
            System.out.println(listOfCommands.get(i));
        }
    }
}
