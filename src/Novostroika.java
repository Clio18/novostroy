import java.util.ArrayList;
import java.util.List;

public class Novostroika {
    public ArrayList<FlatConsistent> list;

    public Novostroika(ArrayList<FlatConsistent> list) {
        list.add(new FlatConsistent(1, 1, 38.8, 8000.8, 2, 44.1, true));
        list.add(new FlatConsistent(2, 2, 45.9, 8989.7, 2, 33.3, true));
        list.add(new FlatConsistent(3, 3, 89.9, 89765.9, 3, 70.1, true));
        this.list = list;
    }

    public ArrayList<FlatConsistent> getList() {
        return list;
    }

    public void setList(ArrayList<FlatConsistent> list) {
        this.list = list;
    }

//    public int printListOfCommands() {
//        System.out.println("Cписок доступных команд: ");
//        ArrayList listOfCommands = new ArrayList();
//        listOfCommands.add("Список доступных команд - нажмите 0");
//        listOfCommands.add("Список квартир - нажмите 1");
//        listOfCommands.add("Список квартир на этаже - нажмите 2");
//        listOfCommands.add("Список доступных квартир - нажмите 3");
//        listOfCommands.add("Список проданых квартир - нажмите 4");
//        listOfCommands.add("Купить квартиру - нажмите 5");
//        listOfCommands.add("Детальная информация о квартире - нажмите 6");
//        listOfCommands.add("Показать квартиры в диапазоне цен - нажмите 7");
//        for (int i = 0; i < listOfCommands.size(); i++) {
//            System.out.println(listOfCommands.get(i));
//        }
//        System.out.println("Введите цифру: ");
//        return listOfCommands.size() - 1;
//    }
}
