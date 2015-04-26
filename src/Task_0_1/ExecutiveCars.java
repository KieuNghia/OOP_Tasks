package Task_0_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class ExecutiveCars extends Car {
    public ExecutiveCars(String manufacturer, String modelName, int year, int price, int fuelConsumption, int acceleration, int maxSpeed) {
        super(manufacturer, modelName, year, price, fuelConsumption, acceleration, maxSpeed);


    }
    public ExecutiveCars(){
        this.manufacturer = "Bently";
        this.modelName = "Continental";
        this.year = 2014;
        this.price = 200000;
        this.fuelConsumption = 15;
        this.acceleration = 5;
        this.maxSpeed = 280;

    }
}
