package Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<Book>());
        Book book = new Book("F", "000-3-16-111111-0", 67, "LL");
        library.addBook(library, book);
        System.out.println(library.getListOfBooks());
        System.out.println(library.findBookByName(library, "F"));
        System.out.println(library.findBookByISBN(library, "000-3-16-111111-0"));
    }


}
