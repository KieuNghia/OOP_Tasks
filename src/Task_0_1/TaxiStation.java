package Task_0_1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class TaxiStation {
    private String name;
    private List<Car> cars = new ArrayList<Car>();

    public TaxiStation() {
        name = "Generic TaxiStation";
    }

    public TaxiStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addCar(Car car) {
        return cars.add(car);
    }

    public void showCars() {

        System.out.println(this.getName() + " has");
        for (Car car : cars) {
            System.out.println(car.toString());

        }


    }

    public int countPrice() {
        int price = 0;
        for (Car car : cars) {
            price += car.getPrice();
        }
        return price;


    }

    public void showBySpeed( int max) {
        System.out.println("Car with that speed characteristics max =["
                  + max + "]");
        for (Car car : cars) {
            int speed = car.getMaxSpeed();
            if ( max < speed) {
                System.out.println(car.toString());

            }
        }


    }

    public void sortByFuelConsumption() {
        Collections.sort(cars, new FuelConsumptionComparator());
    }


}
