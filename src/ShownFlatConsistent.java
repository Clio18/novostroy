import java.util.ArrayList;

public class ShownFlatConsistent extends ChooseCommand  implements MainCommand {

    @Override
    public void mainCommand(ArrayList <FlatConsistent> list) {

    }

    @Override
    public void mainCommand(int number, ArrayList <FlatConsistent> list) {
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

    @Override
    public void mainCommand(double number1, double number2, ArrayList<FlatConsistent> list) {

    }

    @Override
    public int mainCommand2(ArrayList<FlatConsistent> list) {
        return 0;
    }
}
