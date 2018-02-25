import java.util.ArrayList;

public class ShowNotAvailableFlats implements MainCommand {
    Novostroika novostroika = new Novostroika(new ArrayList<FlatConsistent>());

    @Override
    public void mainCommand() {
        boolean flag = true;
        for (FlatConsistent flatConsistent : novostroika.list) {
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
    public void mainCommand(int number) {

    }

}
