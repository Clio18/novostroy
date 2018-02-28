
public class FactoryMethod {
    public static MainCommand getCommand(int number) {
        switch (number) {
            case 0:
                return new PrintListOfCommands();
            case 1:
                return new PrintListOfFlats();
            case 6:
                return new ShownFlatConsistent();
            case 7:
                return new ShownRange();
            case 3:
                return new ShowAvailableFlats();
            case 4:
                return new ShowNotAvailableFlats();
            case 5:
                return new BuyTheFlat();
        }
        return null;
    }


}

