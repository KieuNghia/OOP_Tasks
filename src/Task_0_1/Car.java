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
        setYear(year);
        setPrice(price);
        setFuelConsumption(fuelConsumption);
        setAcceleration(acceleration);
        setMaxSpeed(maxSpeed);
    }

    protected Car(String manufacturer, String modelName, int year, int fuelConsumption, int acceleration, int maxSpeed){
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
        try{

        if(year<1950)
            throw new IllegalArgumentException();
        else
            this.year = year;
        }
        catch (IllegalArgumentException e){
            System.out.println("Wrong year");
        }
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        try{

            if(price<=0)
                throw new IllegalArgumentException();
            else
                this.price = price;
        }
        catch (IllegalArgumentException e){
            System.out.println("Price must be >0");
        }
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {

        try{

            if(fuelConsumption<3)
                throw new IllegalArgumentException();
            else
                this.fuelConsumption = fuelConsumption;
        }
        catch (IllegalArgumentException e){
            System.out.println("Fuel consumption must be >3");
        }    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {

        try{

            if(acceleration<=0)
                throw new IllegalArgumentException();
            else
                this.acceleration = acceleration;
        }
        catch (IllegalArgumentException e){
            System.out.println("acceleration must be >0");
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {

        try{

            if(maxSpeed<=0)
                throw new IllegalArgumentException();
            else
                this.maxSpeed = maxSpeed;
        }
        catch (IllegalArgumentException e){
            System.out.println("Max speeed must be >0");
        }
    }


    public abstract String toString();




}
