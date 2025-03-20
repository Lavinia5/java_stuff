package problema;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

class Main {
    public static void main(String[] args) {
        CarRentalAdministrator admin = new CarRentalAdministrator();
        Car car1 = new Car("audi", 1500, 2009, 15000);
        Car car2 = new Car("bmw", 2000, 1889, 20000);
        Car car3 = new Car("mercedes", 1800, 2023, 1000);
        Car car4 = new Car("lexus", 1998, 2017, 1000);
        Car car5 = new Car("lexus1", 1998, 2017, 1000);
        Car car6 = new Car("lexus2", 1998, 2017, 1000);
        Car car7 = new Car("lexus3", 1998, 2017, 1000);
        Car car8 = new Car("lexus4", 1998, 2017, 1000);
        Car car9 = new Car("lexus5", 1998, 2017, 1000);
        Car car10 = new Car("lexus6", 1998, 2017, 1000);

        admin.addCar(car1);
        admin.addCar(car2);
        admin.addCar(car3);
        admin.addCar(car4);
        admin.addCar(car5);

        Customer customer1 = new Customer("John", "Lll", "66666", new Date(2022, 7, 1),
                new Date(2022, 7, 8), "Iasi", "Bucuresti");
        Customer customer2 = new Customer("Jane", "Lolo", "6666634", new Date(2022, 7, 5),
                new Date(2022, 7, 12), "Cluj", "Timisoara");
        Customer customer3 = new Customer("Janee", "Loloe", "66678", new Date(2022,7,5),
                new Date(2022,7,7), "Timisoara", "Iasi");
        admin.addCustomer(customer1);
        admin.addCustomer(customer2);
        admin.addCustomer(customer3);
        admin.createRental(customer1, car1, new Date(2022, 7, 1), new Date(2022, 7, 8), "Iasi", "Bucuresti");
        admin.createRental(customer2, car2, new Date(2022, 7, 5), new Date(2022, 7, 12), "Cluj", "Iasi");
        admin.createRental(customer3, car3, new Date(2022,7,5), new Date(2022,7,12), "Iasi", "Bucuresti");
        Date startDate = new Date(2022, 7, 9);
        Date endDate = new Date(2022, 7, 14);
        String rentalCity = "Iasi";
        String returnCity = " Bucuresti";
        /*ArrayList<Car> availableCars = admin.getAvailableCars("Iasi", startDate);
        System.out.println("Available cars: ");
        for (Car car : availableCars) {
            System.out.println(car);

        }

         */
        ArrayList<Car> carsTimisoara = new ArrayList<>();
        carsTimisoara.add(car1);
        carsTimisoara.add(car2);
        carsTimisoara.add(car3);
        carsTimisoara.add(car4);
        carsTimisoara.add(car5);
        CarRentalCenter timisoara = new CarRentalCenter("Timisoara", carsTimisoara);

        System.out.println("Available cars Timisoara: ");
        for (Car car : carsTimisoara) {
            System.out.println(car);

        }

        ArrayList<Car> carsBucuresti = new ArrayList<>();
        carsBucuresti.add(car6);
        carsBucuresti.add(car7);
        carsBucuresti.add(car8);
        carsBucuresti.add(car9);
        carsBucuresti.add(car10);
        CarRentalCenter bucuresti = new CarRentalCenter("Bucuresti", carsBucuresti);
        System.out.println("Available cars Bucuresti: ");
        for (Car car : carsBucuresti) {
            System.out.println(car);

        }
        timisoara.rentCar(car1);
        timisoara.rentCar(car2);
        timisoara.rentCar(car3);
        bucuresti.rentCar(car10);
        bucuresti.rentCar(car9);

        timisoara.displayAvailableCars();
        timisoara.displayRentedCars();
        bucuresti.displayAvailableCars();
        bucuresti.displayRentedCars();

    }

}
