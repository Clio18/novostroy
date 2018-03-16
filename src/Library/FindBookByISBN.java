package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class FindBookByISBN implements LibraryManager {
    @Override
    public void execute(ArrayList<Book> list) {
        System.out.println("Enter the ISBN: ");
        Scanner scanner = new Scanner(System.in);
        String ISBN = scanner.next();
        for (Book book: list){
            if (book.getISBN().equals(ISBN)){
                System.out.println(book);
            }
        }
    }
}
