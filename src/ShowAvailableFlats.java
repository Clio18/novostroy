import java.util.ArrayList;

public class ShowAvailableFlats implements MainCommand {
    Novostroika novostroika = new Novostroika(new ArrayList<FlatConsistent>());
    @Override
    public void mainCommand() {
        boolean flag = true;
        for (FlatConsistent flatConsistent : novostroika.list) {
            if (flatConsistent.isFree()) {
                System.out.println("Available flat number: " + flatConsistent.number);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The house hasn't any available flats");
        }
    }

    @Override
    public void mainCommand(int number) {

    }
}
