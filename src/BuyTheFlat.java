import java.util.ArrayList;
import java.util.Scanner;

public class BuyTheFlat implements MainCommand {
    @Override
    public void execute(ArrayList<FlatConsistent> list) {
        System.out.println("Enter the number: ");
        int number = new Scanner(System.in).nextInt();
        for (FlatConsistent flatConsistent : list) {
            if (flatConsistent.getNumber() == number) {
                flatConsistent.setFree(false);
            }
        }
        System.out.println("You have bought flat number: " + number);
    }
}
