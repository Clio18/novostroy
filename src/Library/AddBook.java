package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class AddBook implements LibraryManager {
     @Override
    public void execute(ArrayList<Book> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create new book");
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter ISBN");
        String ISBN = scanner.nextLine();
        System.out.println("Enter number of pages");
        int pages = scanner.nextInt();
        System.out.println("Enter the authors");
        String authors = scanner.next();
         System.out.println("Your book is created");
        Book book = new Book(name, ISBN, pages, authors);
        list.add(book);
        System.out.println("Your book has been added to the library!");
    }
}
