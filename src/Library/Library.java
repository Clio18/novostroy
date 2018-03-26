package Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Library {
    private List<Book> listOfBooks;
    private List<Customer> customerList;

    public Library(List<Book> listOfBooks, List<Customer> customerList) {
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

        Customer customer = new Customer();
        customer.setName("Ivan");
        customer.setLastName("Ivanov");
        customer.setAddress("Kiev, Svobody st., 1/1");
        customer.setSeries("MV");
        customer.setPassportNumber(123456);
        customerList.add(customer);
        Customer customer1 = new Customer();
        customer1.setName("Boris");
        customer1.setLastName("Borisov");
        customer1.setAddress("Kharkiv, Sumskaya st., 11/12");
        customer1.setSeries("KV");
        customer1.setPassportNumber(789123);
        customerList.add(customer1);
        this.customerList = customerList;

        this.listOfBooks = listOfBooks;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addBook(Book book) {
        getListOfBooks().add(book);
    }


    public Book findBookByName(String name) {
        Book book1 = null;

        for (Book book : listOfBooks) {
            if (book.getName().equals(name)) {
                book1 = book;
            }
        }
        return book1;
    }

    public Book findBookByISBN(String ISBN) {
        Book book1 = null;
        for (Book book : listOfBooks) {
            if (book.getISBN().equals(ISBN)) {
                book1 = book;
            }
        }
        return book1;
    }

    public void takeBook(Customer customer, String ISBN) {
        for (Customer customer1: customerList){
            if(customer1.getPassportNumber()==customer.getPassportNumber()&&customer1.getSeries().equals(customer.getSeries())){
                for (Book book:listOfBooks){
                    if (book.getISBN().equals(ISBN)){
                        book.setIstaken(true);
                    }else System.out.println("already taken");
                }
            }else System.out.println("Customer does not exist");
        }
    }

    public void returnBook(Customer customer, String ISBN) {
        for (Customer customer1: customerList){
            if(customer1.getPassportNumber()==customer.getPassportNumber()&&customer1.getSeries().equals(customer.getSeries())){
                for (Book book:listOfBooks){
                    if (book.getISBN().equals(ISBN)){
                        book.setIstaken(false);
                    }
                }
            }
        }
    }

    public Book findBookByAuthors (String author1, String author2){
        int count = 0;
        Book books = null;
        for (Book book: listOfBooks){
            for (String authors:book.getAuthors()){
                if (authors.equals(author1)){
                    count = count + 1;
                } else if (authors.equals(author2)){
                    count = count + 1;
                }
            }
            if (count>1){
                books = book;
            }
        }
        return books;
    }


}
