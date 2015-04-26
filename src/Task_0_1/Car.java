package Task_0_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public abstract class Car {
    protected String manufacturer;
    protected String modelName;
    protected int year;
    protected int price;
    protected int fuelConsumption;
    protected int acceleration; //time to 100kmp
    protected int maxSpeed;

    protected Car(String manufacturer, String modelName, int year, int price, int fuelConsumption, int acceleration, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
    }

    protected Car(){
        this.manufacturer = "Generic";
        this.modelName = "Generic";
        this.year = 2000;
        this.price = 0;
        this.fuelConsumption = 0;
        this.acceleration = 0;
        this.maxSpeed = 0;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", acceleration=" + acceleration +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", year='" + year + '\'' +
                ", modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }



}
