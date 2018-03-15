package Library;

public class Book {
    private String name;
    private String ISBN;
    private int pages;
    private String authors;

    public Book(String name, String ISBN, int pages, String authors) {
        this.name = name;
        this.ISBN = ISBN;
        this.pages = pages;
        this.authors = authors;
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

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
