package Task_0_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class MediumCars extends Car {
    public MediumCars(String manufacturer, String modelName, int year, int price, int fuelConsumption, int acceleration, int maxSpeed) {
        super(manufacturer, modelName, year, price, fuelConsumption, acceleration, maxSpeed);
    }
    public MediumCars(){
        this.manufacturer = "Chevrolet";
        this.modelName = "Epica";
        this.year = 2013;
        this.price = 11;
        this.fuelConsumption = 7;
        this.acceleration = 10;
        this.maxSpeed = 180;

    }
}
