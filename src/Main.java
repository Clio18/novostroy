import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandId = 0;
        Novostroika novostroika = new Novostroika(new ArrayList<>());
        PrintListOfCommands printListOfCommands = new PrintListOfCommands();
        int a = printListOfCommands.mainCommand2(novostroika.list);

        

//        while (commandId != -1) {
//            commandId = scanner.nextInt();
//            FactoryMethod.getCommand(commandId);
//        }
    }
}
