import java.util.ArrayList;

public class ShowAvailableFlats implements MainCommand {
    @Override
    public void execute (ArrayList<FlatConsistent> list) {
        boolean flag = true;
        for (FlatConsistent flatConsistent : list) {
            if (flatConsistent.isFree()) {
                System.out.println("Available flat number: " + flatConsistent.number);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The house hasn't any available flats");
        }
    }

}