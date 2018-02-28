import java.util.ArrayList;

public class ShowNotAvailableFlats implements MainCommand {
    @Override
    public void execute (ArrayList <FlatConsistent> list) {
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
}
