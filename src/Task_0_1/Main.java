package Task_0_1;

import Task_0.Exe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class Main {

    public static void main(String[] args) {


        TaxiStation taxiStation = new TaxiStation();
        ExecutiveCars car1 = new ExecutiveCars("Bentley", "Rodster", 2015, 60001, 20, 3, 200, 5 );
        LargerCars car2 = new LargerCars("Opel", "Transporter", 2010, 15000, 20, 20, 150, 50);


        taxiStation.addCar(car1);
        taxiStation.addCar(car2);

        taxiStation.showCars();
        taxiStation.showBySpeed(100);
        // System.out.print("Price of taxiStation = " +taxiStation.countPrice());
        taxiStation.sortByFuelConsumption();
        //taxiStation.showCars();

    }

}
