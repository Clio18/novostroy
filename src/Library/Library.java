package Library;

import java.util.ArrayList;


public class Library {
    public ArrayList<Book> listOfBooks;

    public Library(ArrayList<Book> listOfBooks) {
        listOfBooks.add(new Book("A", "978-3-16-148410-0", 100, "BB"));
        listOfBooks.add(new Book("Aa", "000-0-10-148410-0", 200, "AAa"));
        this.listOfBooks = listOfBooks;
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
}
