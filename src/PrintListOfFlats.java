import java.util.ArrayList;

public class PrintListOfFlats extends ChooseCommand implements MainCommand {
    @Override
    public void mainCommand(ArrayList <FlatConsistent> list) {
        System.out.println("Список квартир в доме: ");
        for (FlatConsistent flat : list) {
            System.out.println("Квартира №: " + flat.number);
            System.out.println("Этаж: " + flat.floor);
            System.out.println("Общая площадь: " + flat.square);
            System.out.println("Стоимость: " + flat.value);
            System.out.println(" ");
        }
    }

    @Override
    public void mainCommand(int number, ArrayList <FlatConsistent> list) {

    }

    @Override
    public void mainCommand(double number1, double number2, ArrayList<FlatConsistent> list) {

    }

    @Override
    public int mainCommand2(ArrayList<FlatConsistent> list) {
        return 0;
    }
}
