package Task_0_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class SmallCars extends Car {
    public SmallCars(String manufacturer, String modelName, int year, int price, int fuelConsumption, int acceleration, int maxSpeed) {
        super(manufacturer, modelName, year, price, fuelConsumption, acceleration, maxSpeed);
    }

    public SmallCars() {

        this.manufacturer = "Toyota";
        this.modelName = "Prius";
        this.year = 2014;
        this.price = 15;
        this.fuelConsumption = 6;
        this.acceleration = 15;
        this.maxSpeed = 120;

    }
}

