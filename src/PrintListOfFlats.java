import java.util.ArrayList;

public class PrintListOfFlats implements MainCommand {
    Novostroika novostroika = new Novostroika(new ArrayList<FlatConsistent>());
    @Override
    public void mainCommand() {
        System.out.println("Список квартир в доме: ");
        for (FlatConsistent flat : novostroika.list) {
            System.out.println("Квартира №: " + flat.number);
            System.out.println("Этаж: " + flat.floor);
            System.out.println("Общая площадь: " + flat.square);
            System.out.println("Стоимость: " + flat.value);
            System.out.println(" ");
        }
    }

    @Override
    public void mainCommand(int number) {

    }
}
