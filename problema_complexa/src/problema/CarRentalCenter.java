package problema;

import java.util.ArrayList;

class CarRentalCenter {
     private String City;
     private ArrayList<Car> availableCars;
     private ArrayList<Car> rentedCars;
     public CarRentalCenter(String City, ArrayList<Car> availableCars){
         this.City = City;
         this.availableCars = availableCars;
         this.rentedCars = new ArrayList<Car>();
     }
   public void rentCar(Car availableCar){
         if(availableCars.contains(availableCar)){
             rentedCars.add(availableCar);
             availableCars.remove(availableCar);
          /*   System.out.println("Car " + availableCar + "rented from " +City);
         }else {
             System.out.println("Car " + availableCar + " is not available at " +City);

         }

           */
     }




     /* public void returnCity(Car availableCar){
         if(rentedCars.contains(availableCar)){
             rentedCars.remove(availableCar);
             availableCars.add(availableCar);
        System.out.println("Car " +availableCar + "returned to " +City);

         }else{
             System.out.println("Car " +availableCar + "was not rented from " +City );

         }

 */
     }
     public void displayAvailableCars(){
         System.out.println("Cars available at " +City + " : " +availableCars + "\n");
     }

     public void displayRentedCars(){
         System.out.println("Rented cars at " +City + " : " +rentedCars);
     }
}
