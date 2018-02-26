import java.util.ArrayList;

public class PrintListOfCommands extends ChooseCommand implements MainCommand {
    @Override
    public void mainCommand(ArrayList<FlatConsistent> list) {

    }

    @Override
    public void mainCommand(int number, ArrayList<FlatConsistent> list) {

    }

    @Override
    public void mainCommand(double number1, double number2, ArrayList<FlatConsistent> list) {

    }

    @Override
    public int mainCommand2(ArrayList<FlatConsistent> list) {
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
}
