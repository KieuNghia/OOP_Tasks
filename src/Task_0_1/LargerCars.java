package Task_0_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class LargerCars extends Car{
    public LargerCars(String manufacturer, String modelName, int year, int price, int fuelConsumption, int acceleration, int maxSpeed) {
        super(manufacturer, modelName, year, price, fuelConsumption, acceleration, maxSpeed);
    }
    public LargerCars(){
        this.manufacturer = "Skoda";
        this.modelName = "Roamer";
        this.year = 2014;
        this.price = 15;
        this.fuelConsumption = 8;
        this.acceleration = 15;
        this.maxSpeed = 220;

    }
}
