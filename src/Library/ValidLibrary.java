package Library;

public class ValidLibrary implements Validation {
    @Override
    public Book Valid(Book book) {
        try {
            if (book.getName().toCharArray().length > 10 || book.getISBN().toCharArray().length != 6) {
                throw new LibraryException();
            }
        } catch (LibraryException e) {
            System.out.println("Error");
            return null;
        }
        return book;
    }

    @Override
    public Customer Valid(Customer customer) {
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
            System.out.println("Error");
            return null;
        }
        return customer;
    }

}
