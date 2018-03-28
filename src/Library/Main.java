package Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        Library library = new Library(new ArrayList<Book>(), new ArrayList<Customer>());
        System.out.println(library.getListOfBooks());
        System.out.println(library.getListOfBooks().get(0).getName());
        System.out.println(library.findBookByName("Ann"));
        library.findBookByName("A").setName("vv");
        System.out.println(library.getListOfBooks().get(0).getName());
        System.out.println(library.findBookByISBN("1-2-34").getisIstaken());
        library.takeBook(new Customer("Ivan", "Ivanov", "Kiev, Svobody st., 1/1", "MV", 123456), "1-2-34");
        System.out.println(library.findBookByISBN("1-2-34").getisIstaken());
        library.returnBook(new Customer("Ivan", "Ivanov", "Kiev, Svobody st., 1/1", "MV", 123456), "1-2-34");
        System.out.println(library.findBookByISBN("1-2-34").getisIstaken());

        System.out.println(library.findBookByAuthors(library.makingAuthorLiist("AA")));
        //System.out.println(library.getListOfBooks().get(0).getISBN().toCharArray().length);




    }
}
