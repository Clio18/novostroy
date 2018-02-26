import java.util.ArrayList;

public class BuyTheFlat extends ChooseCommand implements MainCommand {
    @Override
    public void mainCommand(ArrayList <FlatConsistent> list) {

    }

    @Override
    public void mainCommand(int number, ArrayList <FlatConsistent> list) {
        for (FlatConsistent flatConsistent : list) {
            if (flatConsistent.getNumber() == number) {
                flatConsistent.setFree(false);
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
