import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandId = 0;
        Novostroika novostroika = new Novostroika(new ArrayList<>());
        PrintListOfCommands printListOfCommands = new PrintListOfCommands();
        printListOfCommands.execute(novostroika.getList());

        while (commandId != -1) {
            commandId = scanner.nextInt();
            MainCommand command = FactoryMethod.getCommand(commandId);
            command.execute(novostroika.getList());
        }
    }
}
