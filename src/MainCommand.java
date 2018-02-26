import java.util.ArrayList;

public interface MainCommand {
    public void mainCommand(ArrayList<FlatConsistent> list);
    public void mainCommand(int number, ArrayList<FlatConsistent> list);
    public void mainCommand(double number1, double number2, ArrayList<FlatConsistent> list);
    public int mainCommand2 (ArrayList<FlatConsistent> list);
}
