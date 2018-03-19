package Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> reservedList;

    public LibraryManager(List<Book> reservedList) {
        Library library = new Library(new ArrayList<Book>());
        reservedList.addAll(library.getListOfBooks());
        this.reservedList = reservedList;
    }

    public List<Book> getReservedList() {
        return reservedList;
    }

    public void setReservedList(List<Book> reservedList) {
        this.reservedList = reservedList;
    }
}
