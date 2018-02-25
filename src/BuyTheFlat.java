import java.util.ArrayList;

public class BuyTheFlat implements MainCommand {
    Novostroika novostroika = new Novostroika(new ArrayList<FlatConsistent>());
    @Override
    public void mainCommand() {

    }

    @Override
    public void mainCommand(int number) {
        for (FlatConsistent flatConsistent : novostroika.list) {
            if (flatConsistent.getNumber() == number) {
                flatConsistent.setFree(false);
            }
        }


    }
}
