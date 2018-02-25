import java.util.ArrayList;

public class ShownFlatConsistent implements MainCommand {
    Novostroika novostroika = new Novostroika(new ArrayList<FlatConsistent>());
    @Override
    public void mainCommand() {

    }

    @Override
    public void mainCommand(int number) {
        for (int i = 0; i < novostroika.list.size(); i++) {
            if (novostroika.list.get(i).number == number) {
                System.out.println("Характеристика квартиры №: " + number);
                System.out.println("Квартира №: " + novostroika.list.get(i).number);
                System.out.println("Этаж: " + novostroika.list.get(i).floor);
                System.out.println("Общая площадь: " + novostroika.list.get(i).square);
                System.out.println("Стоимость: " + novostroika.list.get(i).value);
                System.out.println("Количество окон: " + novostroika.list.get(i).getNumberOfWindows());
                System.out.println("Площадь комнаты: " + novostroika.list.get(i).getSquereOfRoom());
                if (novostroika.list.get(i).isFree()) {
                    System.out.println("Квартира свободна");
                } else System.out.println("Квартира продана");
            }
        }
    }
}
