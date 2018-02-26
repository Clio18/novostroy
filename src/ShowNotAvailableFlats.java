import java.util.ArrayList;

public class ShowNotAvailableFlats extends ChooseCommand implements MainCommand {

    @Override
    public void mainCommand(ArrayList <FlatConsistent> list) {
        boolean flag = true;
        for (FlatConsistent flatConsistent : list) {
            if (!flatConsistent.isFree()) {
                System.out.println("Sold flats number: " + flatConsistent.number);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("All flats are free!");
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
