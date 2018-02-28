import java.util.ArrayList;

public class PrintListOfFlats implements MainCommand {
    @Override
    public void execute (ArrayList <FlatConsistent> list) {
        System.out.println("Список квартир в доме: ");
        for (FlatConsistent flat : list) {
            System.out.println("Квартира №: " + flat.number);
            System.out.println("Этаж: " + flat.floor);
            System.out.println("Общая площадь: " + flat.square);
            System.out.println("Стоимость: " + flat.value);
            System.out.println(" ");
        }
    }

}
