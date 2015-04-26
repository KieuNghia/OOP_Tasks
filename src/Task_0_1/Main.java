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
        ExecutiveCars car1 = new ExecutiveCars();
        LargerCars car2 = new LargerCars();
        MediumCars car3 = new MediumCars();
        SmallCars car4 = new SmallCars();


        taxiStation.addCar(car1);
        taxiStation.addCar(car2);
        taxiStation.addCar(car3);
        taxiStation.addCar(car4);

      taxiStation.showCars();
        taxiStation.showBySpeed( 100 );
      // System.out.print("Price of taxiStation = " +taxiStation.countPrice());
        taxiStation.sortByFuelConsumption();
        //taxiStation.showCars();

    }

}
