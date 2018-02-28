import java.util.ArrayList;
import java.util.Scanner;

public class ShownFlatConsistent implements MainCommand {

    @Override
    public void execute(ArrayList<FlatConsistent> list) {
        System.out.println("Enter number of falat: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).number == number) {
                System.out.println("Характеристика квартиры №: " + number);
                System.out.println("Квартира №: " + list.get(i).number);
                System.out.println("Этаж: " + list.get(i).floor);
                System.out.println("Общая площадь: " + list.get(i).square);
                System.out.println("Стоимость: " + list.get(i).value);
                System.out.println("Количество окон: " + list.get(i).getNumberOfWindows());
                System.out.println("Площадь комнаты: " + list.get(i).getSquereOfRoom());
                if (list.get(i).isFree()) {
                    System.out.println("Квартира свободна");
                } else System.out.println("Квартира продана");
            }
        }
    }

}
