package Task_0_1;

import java.util.Comparator;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/23/2015.
 */
public class FuelConsumptionComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2){
        int returnVal = 0;

        if(car1.getFuelConsumption()< car2.getFuelConsumption()) {
            returnVal = -1;
        }
        else if(car1.getFuelConsumption() > car2.getFuelConsumption()){
            returnVal = 1;

        }
        else{
            returnVal = 0;

        }
    return returnVal;
    }

}
