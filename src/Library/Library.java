package Library;

import java.util.List;

public class Library {
    public List<Book> listOfBooks;

    public Library (List<Book> listOfBooks) {
        listOfBooks.add(new Book("A", "978-3-16-148410-0", 100, "AA, BB, CC"));
        listOfBooks.add(new Book("Aa", "000-0-10-148410-0", 200, "AAa, BBb, CCc"));
        this.listOfBooks = listOfBooks;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBook(Library library, Book book) {
        library.getListOfBooks().add(book);
    }

    public Book findBookByName(Library library, String name){
        Book book1 = null;

        for (Book book:library.getListOfBooks()){
            if (book.getName().equals(name)){
                book1 = book;
            }
        }
        return book1;
    }
    public Book findBookByISBN(Library library, String ISBN){
        Book book1 = null;

        for (Book book:library.getListOfBooks()){
            if (book.getISBN().equals(ISBN)){
                book1 = book;
            }
        }
        return book1;
    }
}
