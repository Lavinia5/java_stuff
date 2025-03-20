package problema;

import java.util.Date;

class Rental {
     private Date rentalDate;
     private Date returnDate;
     private Car car;
     private Customer customer;
     public Rental(Date rentalDate, Date returnDate, Car car, Customer customer){
         this.rentalDate = rentalDate;
         this.returnDate = returnDate;
         this.car = car;
         this.customer = customer;
     }

    public Rental(Customer customer, Car car) {
         this.customer = customer;
         this.car = car;
    }

    public Car getCar() {
         return car;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public Date getRentalDate() {
         return rentalDate;
    }

    public Customer getCustomer() {
         return customer;
    }
}
