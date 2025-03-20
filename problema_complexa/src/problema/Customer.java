package problema;

import java.util.Date;

class Customer {
    private String firstName;
    private String lastName;
    private String cnp;
    private Date rentalDate;
    private Date returnDate;
    private String rentalCity;
    private String returnCity;
    private Car rentalCar;
    public Customer(String firstName, String lastName, String cnp,
                    Date rentalDate, Date returnDate, String rentalCity, String returnCity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalCity = rentalCity;
        this.returnCity = returnCity;
    }
public Car getRentalCar(){
        return rentalCar;
}
public void setRentalCar(Car car){
        this.rentalCar = car;
}

public Date getReturnDate(){
        return this.returnDate;
}
public Date getRentalDate(){
        return this.rentalDate;
    }
    public String getRentalCity(){
        return this.rentalCity;
    }
    public String getReturnCity(){
        return this.returnCity;
    }
    public String toString() {
        return "First Name: " + firstName + " Last Name: " + lastName + "CNP: " + cnp + " Rental Date : " + rentalCity
                + " Rental City " + rentalCity + " Return Date : " + returnDate + " Return City: " + returnCity;
    }
}