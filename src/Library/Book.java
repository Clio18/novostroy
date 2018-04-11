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
                this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
                this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
                this.pages = pages;
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
