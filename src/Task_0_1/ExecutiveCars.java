package Task_0_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class ExecutiveCars extends Car {
    private int champagneBottle;

    public ExecutiveCars(String manufacturer, String modelName, int year, int price, int fuelConsumption, int acceleration, int maxSpeed, int champagneBottle) {
        super(manufacturer, modelName, year, fuelConsumption, acceleration, maxSpeed);
        setPrice(price);
        setChampagneBottle(champagneBottle);


    }


    public void setPrice(int price) {
        try {

            if (price < 60000)
                throw new IllegalArgumentException();
            else
                this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println("Price must be >60000");
        }
    }

    public void setChampagneBottle(int champagneBottle) {
        try {

            if (champagneBottle < 0)
                throw new IllegalArgumentException();
            else
                this.champagneBottle = champagneBottle;
        } catch (IllegalArgumentException e) {
            System.out.println("Bottle must be >0");
        }
    }

    @Override
    public String toString() {
        return "ExecutiveCars{" +
                "manufacturer= " + manufacturer +
                "modelName= " + modelName +
                "year= " + year +
                "price= " + price +
                "fuelConsumption" + fuelConsumption +
                "acceleration" + acceleration +
                "maxSpeed" + maxSpeed +
                "champagneBottle=" + champagneBottle +
                '}';
    }
}
