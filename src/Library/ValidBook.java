package Library;

public class ValidBook implements Validation {
    @Override
    public Book valid(Book book) {
        try {
            if (book.getName().toCharArray().length > 10) {
                throw new LibraryException();
            }
        } catch (LibraryException e) {
            System.out.println("Error: the length of book's name long than 10");
            return null;
        }
        try {
            if (book.getISBN().toCharArray().length != 6) {
                throw new LibraryException();
            }
        } catch (LibraryException e) {
            System.out.println("Error: the length of book's ISBN must consist 6 digits");
            return null;
        }
        return book;
    }

    @Override
    public Customer valid(Customer customer) {
        try {
            char firstLetter = customer.getSeries().toCharArray()[0];
            char secondLetter = customer.getSeries().toCharArray()[0];

            if (customer.getSeries().toCharArray().length != 2
                    || !Character.isLetter(firstLetter)
                    || Character.isLowerCase(firstLetter)
                    || !Character.isLetter(secondLetter)
                    || Character.isLowerCase(secondLetter))
            {
                throw new LibraryException();
            }
        } catch (LibraryException e) {
            System.out.println("Error: passport series must consist of 2 letters in uppercase");
            return null;
        }
        return customer;
    }

}
