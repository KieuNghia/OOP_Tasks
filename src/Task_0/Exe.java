package Task_0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/21/2015.
 */
public class Exe {
    Phone [] array;


    public static void task_a(Phone[] array) { //a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;


        for (int i = 0; i < array.length; i++) {
            boolean checker = array[i].innerCityTimerCheck(10);
            if (checker == true) {
                System.out.println("User: " + array[i].toString() + "  All ok with intercity limit");
            } else {

                System.out.println("User: " + array[i].toString() + " Limit reached");
            }

        }

    }

    public static void task_b(Phone[] array) { //b) сведения об абонентах, которые пользовались междугородной связью;

        for (int i = 0; i < array.length; i++) {
            if (array[i].getOuterCity() != 0) {
                System.out.println(array[i].toString());
            } else {
                continue;
            }

        }
    }
    public static void printArray(Phone [] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i].toString());
        }
    }


    public static void main(String[] args) {




        Phone[] array = {new Phone(1, "Alex", "Rudkovsky", "Alexandrovich", "Kharkiv city", 19002, 321, 100, 200, 50),new Phone(2, "BAlex", "Rudkovsky", "Alexandrovich", "Kharkiv city", 19002, 321, 100, 200, 50), new Phone(3, "DAlex", "Rudkovsky", "Alexandrovich", "Kharkiv city", 19002, 321, 100, 200, 50), new Phone(4, "CAlex", "Rudkovsky", "Alexandrovich", "Kharkiv city", 19002, 321, 100, 200, 50),new Phone(5, "FAlex", "Rudkovsky", "Alexandrovich", "Kharkiv city", 191002, 321, 100, 200, 0)};
       /* System.out.println("TASK A");
        task_a(array);
        System.out.println("---------------------");
        System.out.println("TASK B");
        task_b(array);
        System.out.println("---------------------");

       // printArray(array);
        System.out.println("Sorting by name");*/
        System.out.println(Arrays.toString(array));


        /*Arrays.sort(array, new Comparator<Phone>() {
            @Override
            public int compare(Phone phone1, Phone phone2) {


                return phone1.getLastName().compareTo(phone2.getLastName());

            }
        });*/
       // printArray(array);


    }
}
