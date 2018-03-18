package Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Library {

    private List<Book> listOfBooks;


    public Library(List<Book> listOfBooks) {
        Book book = new Book();
        book.setName("A");
        book.setISBN("1-2-34");
        book.setPages(10);
        book.setAuthors(Arrays.asList("AA", "BB", "CC"));
        listOfBooks.add(book);
        Book book1 = new Book();
        book1.setName("B");
        book1.setISBN("2-3-45");
        book1.setPages(100);
        book1.setAuthors(Arrays.asList("AAa", "BBb", "CCc"));
        listOfBooks.add(book1);
        this.listOfBooks = listOfBooks;

//        Customer customer = new Customer();
//        customer.setName("Ivan");
//        customer.setLastName("Ivanov");
//        customer.setAddress("Kiev, Svobody st., 1/1");
//        customer.setSeries("MV");
//        customer.setPassportNumber(123456);
//        customerList.add(customer);
//        Customer customer1 = new Customer();
//        customer1.setName("Boris");
//        customer1.setLastName("Borisov");
//        customer1.setAddress("Kharkiv, Sumskaya st., 11/12");
//        customer1.setSeries("KV");
//        customer1.setPassportNumber(789123);
//        customerList.add(customer1);
//        this.customerList = customerList;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBook(Book book) {
        getListOfBooks().add(book);
    }

    public List<Book> copyList(){
        List<Book> list1 = new ArrayList<Book>();
        for (int i = 0; i < getListOfBooks().size(); i++) {
            list1.add(getListOfBooks().get(i));
        }
        return list1;
    }

    public Book findBookByName(String name) {
        Book book1 = null;
        for (Book book : copyList()) {
            if (book.getName().equals(name)) {
                book1 = book;
            }
        }
        return book1;
    }

    public Book findBookByISBN(String ISBN) {
        Book book1 = null;
        for (Book book : copyList()) {
            if (book.getISBN().equals(ISBN)) {
                book1 = book;
            }
        }
        return book1;
    }

}
