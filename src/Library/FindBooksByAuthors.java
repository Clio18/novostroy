package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class FindBooksByAuthors implements LibraryManager {
    @Override
    public void execute(ArrayList<Book> list) {
        System.out.println("Enter 3 author: ");
        ArrayList listOfAuthors = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            listOfAuthors.add(scanner.next());
        }
        for (int i = 0; i < listOfAuthors.size(); i++) {
            for (Book book: list){
                if (listOfAuthors.get(i).equals(book.getAuthors())){
                    System.out.println(book);
                }
            }

        }
    }
}
