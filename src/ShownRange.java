import java.util.ArrayList;
import java.util.List;

public class ShownRange extends ChooseCommand implements MainCommand {
    @Override
    public void mainCommand(ArrayList<FlatConsistent> list) {

    }

    @Override
    public void mainCommand(int number, ArrayList<FlatConsistent> list) {

    }

    @Override
    public void mainCommand(double min, double max, ArrayList<FlatConsistent> list) {
        if (max < min) {
            System.out.println("Неверный дипазон");
            return;
        }
        List<Integer> flats1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).value >= min && list.get(i).value <= max) {
                flats1.add(list.get(i).number);
            }
        }
        if (flats1.isEmpty()) {
            System.out.println("no flats");
        } else {
            System.out.print("List of flats:  ");
            for (int i = 0; i < flats1.size(); i++) {
                System.out.print(flats1.get(i) + ",");

            }
            System.out.println();
        }

    }

    @Override
    public int mainCommand2(ArrayList<FlatConsistent> list) {
        return 0;
    }
}
