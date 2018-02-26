public class FactoryMethod {
    public ChooseCommand getCommand (Object o){
        ChooseCommand chooseCommand = null;
        if (o instanceof BuyTheFlat) {
            chooseCommand = new BuyTheFlat();
        } else if (o instanceof PrintListOfCommands) {
            chooseCommand = new PrintListOfCommands();
        } else if (o instanceof PrintListOfFlats){
            chooseCommand = new PrintListOfFlats();
        } else if (o instanceof ShowAvailableFlats){
            chooseCommand = new ShowAvailableFlats();
        } else if (o instanceof ShownFlatConsistent){
            chooseCommand = new ShownFlatConsistent();
        } else if (o instanceof ShowNotAvailableFlats){
            chooseCommand = new ShowNotAvailableFlats();
        } else if (o instanceof ShownRange){
            chooseCommand = new ShownRange();
        }
        return chooseCommand;
    }


}
