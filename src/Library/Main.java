package Library;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
       Library library = new Library(new ArrayList<Book>(), new ArrayList<Customer>());
       ValidBook validLibrary = new ValidBook();
        Book book = new Book();
        book.setName("A");
        book.setISBN("1-2-34");
        book.setPages(10);
        book.setAuthors(Arrays.asList("AA", "BB", "CC"));
        library.addBook(book);

        Book book1 = new Book();
        book1.setName("B");
        book1.setISBN("2-3-45");
        book1.setPages(100);
        book1.setAuthors(Arrays.asList("AAa", "BBb", "CCc"));
        library.addBook(book1);

        Customer customer = new Customer();
        customer.setName("Ivan");
        customer.setLastName("Ivanov");
        customer.setAddress("Kiev, Svobody st., 1/1");
        customer.setSeries("MV");
        customer.setPassportNumber(123456);
        if (validLibrary.valid(customer) != null) {
            library.getCustomerList().add(customer);
        }

        Customer customer1 = new Customer();
        customer1.setName("Boris");
        customer1.setLastName("Borisov");
        customer1.setAddress("Kharkiv, Sumskaya st., 11/12");
        customer1.setSeries("KV");
        customer1.setPassportNumber(789123);
        if (validLibrary.valid(customer1) != null) {
            library.getCustomerList().add(customer1);
        }

        System.out.println(library.findBookByName("A"));




    }
}
