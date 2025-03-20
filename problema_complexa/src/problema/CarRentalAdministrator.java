package problema;

import java.util.ArrayList;
import java.util.Date;

class CarRentalAdministrator {
    private ArrayList<Car> availableCars;

    private ArrayList<Customer> customers;
    private ArrayList<Rental> rentals;

    public CarRentalAdministrator(){
        availableCars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    public void addCar(Car car){
        this.availableCars.add(car);
    }

   public void createRental(Date rentalDate, Date returnDate, Car car,Customer customer) {

        Rental rental = new Rental(rentalDate,returnDate,car,customer);
        rentals.add(rental);
        availableCars.remove(car);
    }

    public void endRental(Rental rental){
        availableCars.add(rental.getCar());
        rentals.remove(rental);
    }

    public ArrayList<Car>getAvailableCars( String thisCity, Date startDate){
        ArrayList<Car> availableCars = new ArrayList<>(this.availableCars);
      //  availableCars.clear();
       /* for(Rental rental : rentals){
            /*if(rental.getCustomer().getReturnDate().before(startDate)|| rental.getCustomer().getRentalDate().after(endDate)){
                availableCars.add(rental.getCar());*/
           /* if((rental.getCustomer().getReturnCity().equals(thisCity))&& rental.getCustomer().getReturnDate().before(startDate)){
                availableCars.add(rental.getCar());
            } */

        return availableCars;
    }


    public void createRental(Customer customer , Car car, Date rentalDate, Date returnDate, String rentalCity, String returnCity) {
    customer.setRentalCar(car);
   /*  customer.getRentalDate();
     customer.getReturnDate();
     customer.getReturnCity();
     customer.getRentalCity(); */
     rentals.add(new Rental(customer,car));
    // availableCars.remove(car);

    }


}
