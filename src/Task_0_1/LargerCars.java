package Task_0_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class LargerCars extends Car {

    int cargoSpace;

    public LargerCars(String manufacturer, String modelName, int year, int price, int fuelConsumption, int acceleration, int maxSpeed, int cargoSpace) {
        super(manufacturer, modelName, year, fuelConsumption, acceleration, maxSpeed);
        setPrice(price);
        setCargoSpace(cargoSpace);
    }

    @Override
    public void setPrice(int price) {
        try {

            if (price < 10000)
                throw new IllegalArgumentException();
            else
                this.price = price;
        } catch (IllegalArgumentException e) {
            System.out.println("Price must be >10000");
        }
    }

    public void setCargoSpace(int cargoSpace) {
        try {

            if (cargoSpace < 40)
                throw new IllegalArgumentException();
            else
                this.cargoSpace = cargoSpace;
        } catch (IllegalArgumentException e) {
            System.out.println("Cargo space must be >40L");
        }

    }

    @Override
    public String toString() {
        return "LargerCar{" +
                "manufacturer= " + manufacturer +
                "modelName= " + modelName +
                "year= " + year +
                "price= " + price +
                "fuelConsumption" + fuelConsumption +
                "acceleration" + acceleration +
                "maxSpeed" + maxSpeed +
                "cargoSpace= " + cargoSpace +
                '}';    }
}
