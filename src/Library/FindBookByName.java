package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class FindBookByName implements LibraryManager {
    @Override
    public void execute(ArrayList<Book> list) {
        System.out.println("Enter the name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (Book book: list){
            if (book.getName().equals(name)){
                System.out.println(book);
            }
        }
    }
}
