package problema;

import java.util.ArrayList;
import java.util.Date;

class Car {
    private String brand;
    private int engineCapacity;
    private int productionYear;
    private int mileage;
    public Car(String brand, int engineCapacity, int productionYear, int mileage) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }
public String getBrand(){
        return brand;
}
    public String toString(){
        return "Brand : " +brand + " Engine Capacity : " + engineCapacity + " Production Year : " +productionYear
                + " Mileage : " +mileage + "\n";
    }
}

