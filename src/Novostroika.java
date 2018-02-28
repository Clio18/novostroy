import java.util.ArrayList;
import java.util.List;

public class Novostroika {
    private ArrayList<FlatConsistent> list;

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
}
