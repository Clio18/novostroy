package Library;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String lastName;
    private String address;
    private String passport;
   private ArrayList<Book> cardOfClient;

    public Customer(String name, String lastName, String address, String passport, ArrayList<Book> cardOfClient) {
        this.cardOfClient = cardOfClient;
    }


    public void setCardOfClient(ArrayList<Book> cardOfClient) {
        this.cardOfClient = cardOfClient;
    }

    public Customer(String name, String lastName, String address, String passport) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
