package Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
       Library library = new Library(new ArrayList<Book>(), new ArrayList<Customer>());
        System.out.println(library.getListOfBooks());
        System.out.println(library.getListOfBooks().get(0).getName());
        //System.out.println(library.findBookByName("A"));

        System.out.println(library.getCustomerList());





    }
}
