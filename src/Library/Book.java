package Library;

import java.util.List;

public class Book {
    private String name;
    private String ISBN;
    private int pages;
    private List<String> authors;
    private boolean isTaken;

    public Book() {
    }

    public Book(String name, String ISBN, int pages, List<String> authors, boolean isTaken) {
        this.name = name;
        this.ISBN = ISBN;
        this.pages = pages;
        this.authors = authors;
        this.isTaken = isTaken;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name != null && name.toCharArray().length < 100) {
                this.name = name;
            } else throw new LibraryException();
        } catch (LibraryException libraryException) {
            System.out.println("Wrong name");
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        try {

            if (ISBN != null && ISBN.toCharArray().length == 6) {
                this.ISBN = ISBN;
            } else throw new LibraryException();

        } catch (LibraryException libraryException) {
            System.out.println("Wrong ISBN");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        try {
            if(pages>0) {
                this.pages = pages;
            }else throw new LibraryException();
        } catch (LibraryException libraryException){
            System.out.println("Wrong pages");
        }
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public boolean getisIstaken() {
        return isTaken;
    }

    public void setIstaken(boolean isTaken) {
        this.isTaken = isTaken;
    }
}
