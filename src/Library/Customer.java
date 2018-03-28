package Library;

public class Customer {
    private String name;
    private String lastName;
    private String address;
    private String series;
    private int passportNumber;

    public Customer(String name, String lastName, String address, String series, int passportNumber) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.series = series;
        this.passportNumber = passportNumber;
    }

    public Customer() {
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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
       try {
           if(series!=null&&series.toCharArray().length==2) {
               this.series = series;
           }else throw new LibraryException();
       } catch (LibraryException libraryException){
           System.out.println("Wrong serie");
       }
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }
}
