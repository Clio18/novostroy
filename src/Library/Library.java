package Library;

import java.util.*;


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

    public Map<Customer, String> takeBook(Customer customer, String ISBN) {
//        for (Customer customer1: customerList){
//            if(customer1.getPassportNumber()==customer.getPassportNumber()&&customer1.getSeries().equals(customer.getSeries())){
//                for (Book book:listOfBooks){
//                    if (book.getISBN().equals(ISBN)){
//                        book.setIstaken(true);
//                    }else System.out.println("already taken");
//                }
//            }else System.out.println("Customer does not exist");
//        }

        Map<Customer, String> map = new HashMap<Customer, String>();
        for (Book book : listOfBooks) {
            if (book.getISBN().equals(ISBN)) {
                book.setIstaken(true);
            }
        }
        map.put(customer, ISBN);
        return map;
    }

    public void returnBook(Customer customer, String ISBN) {
        for (Customer customer1 : customerList) {
            if (customer1.getPassportNumber() == customer.getPassportNumber() && customer1.getSeries().equals(customer.getSeries())) {
                for (Book book : listOfBooks) {
                    if (book.getISBN().equals(ISBN)) {
                        book.setIstaken(false);
                    }
                }
            }
        }
    }

    public Book findBookByAuthors(ArrayList<String> list) {
        Book books = null;
        for (Book book : listOfBooks) {
            for (String author : list) {
                for (String bookAuthor : book.getAuthors()) {
                    if (author.equals(bookAuthor)) {
                        books = book;
                    }
                }
            }
        }
        return books;
    }

    public ArrayList makingAuthorLiist(String author) {
        ArrayList list = new ArrayList();
        list.add(author);
        return list;
    }

    public ArrayList makingAuthorLiist(String author, String author1) {
        ArrayList list = new ArrayList();
        list.add(author);
        list.add(author1);
        return list;
    }

    public ArrayList makingAuthorLiist(String author, String author1, String author2) {
        ArrayList list = new ArrayList();
        list.add(author);
        list.add(author1);
        list.add(author2);
        return list;
    }


}
