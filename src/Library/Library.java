package Library;

import java.util.*;


public class Library {
    private List<Book> listOfBooks;
    private List<Customer> customerList;

    public Library(List<Book> listOfBooks, List<Customer> customerList) {
        this.customerList = customerList;
        this.listOfBooks = listOfBooks;
    }

    private List<Book> getListOfBooks() {
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
        ValidBook validBook = new ValidBook();
        if (validBook.valid(book)!= null) {
            getListOfBooks().add(book);
        }
    }


    public Book findBookByName(String name) {
        Book isBook = null;
        for (Book book : listOfBooks) {
            if (book.getName().equals(name)) {
                Book book1 = new Book(book.getName(), book.getISBN(), book.getPages(), book.getAuthors(), book.getisIstaken());
                isBook = book1;
            }
        }
        return isBook;
    }

    public Book findBookByISBN(String ISBN) {
        Book isBook = null;
        for (Book book : listOfBooks) {
            if (book.getISBN().equals(ISBN)) {
                Book book1 = new Book(book.getName(), book.getISBN(), book.getPages(), book.getAuthors(), book.getisIstaken());
                isBook = book1;
            }
        }
        return isBook;
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
