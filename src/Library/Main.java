package Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<Book>());
        //AddBook addBook = new AddBook();
        //addBook.execute(library.getListOfBooks());
        System.out.println(library.getListOfBooks());
        //FindBookByName findBookByName = new FindBookByName();
        //findBookByName.execute(library.getListOfBooks());
        //FindBooksByAuthors findBooksByAuthors = new FindBooksByAuthors();
        //findBooksByAuthors.execute(library.getListOfBooks());
        TakeTheBook takeTheBook = new TakeTheBook();
        takeTheBook.execute(library.getListOfBooks());
        System.out.println(library.getListOfBooks());

    }


}
