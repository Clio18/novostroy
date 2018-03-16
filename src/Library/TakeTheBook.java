package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeTheBook implements LibraryManager {
    @Override
    public void execute(ArrayList<Book> list) {
        System.out.println("Enter the ISBN: ");
        Scanner scanner = new Scanner(System.in);
        String ISBN = scanner.next();
        System.out.println("Enter the data of the customer: ");
        String name = scanner.next();
        String lastName = scanner.next();
        String address = scanner.next();
        String passport = scanner.next();
        ArrayList<Book> cardOfClient = new ArrayList<Book>();
        for (Book book: list){
            if (book.getISBN().equals(ISBN)){
                cardOfClient.add(book);
                list.remove(book);
            }
        }
        Customer customer = new Customer(name, lastName, address, passport, cardOfClient);
    }
}
