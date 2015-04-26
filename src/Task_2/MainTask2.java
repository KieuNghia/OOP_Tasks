package Task_2;

import Task_0_1.Main;

import java.util.Scanner;

/**
 * Created by nghia on 26.04.2015.
 */
public class MainTask2 {

    public static void main(String args[]) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please insert man info");
//
//        System.out.println("Please insert man name");
//        String manName = scanner.nextLine();
//        System.out.println("Please insert man surname");
//        String manSurname = scanner.nextLine();
//        System.out.println("Please insert man height");
//        float manHeight = scanner.nextFloat();
//        System.out.println("Please insert man weight");
//        float manWeight = scanner.nextFloat();
//
//        Man man = new Man(true, manName, manSurname, manHeight, manWeight);
//        System.out.println("Please insert woman info");
//
//        System.out.println("Please insert woman name");
//        String womanName = scanner.nextLine();
//        System.out.println("Please insert woman surname");
//        String womanSurname = scanner.nextLine();
//        System.out.println("Please insert woman height");
//        float womanHeight = scanner.nextFloat();
//        System.out.println("Please insert woman weight");
//        float womanWeight = scanner.nextFloat();
//        Woman woman = new Woman(false, womanName, womanSurname, womanHeight, womanWeight);
//        System.out.println(man.toString());
//        System.out.println(woman.toString());
        Man man2 = new Man(true, "Vania","Vania",180,50);           //
        Woman woman2 = new Woman(true, "Vania","Vania",150,50);
        System.out.println(man2.toString());
        System.out.println(woman2.toString());


        Human child = woman2.relationship(man2);
        if (child == null) {
            System.out.println("Razbezalish");
        } else System.out.println(child.toString());

        /*
        Last console results
        Human{sex=Man, name='Vania', surname='Vania', weight=50.0, height=180.0}
        Human{sex=Woman, name='Vania', surname='Vania', weight=50.0, height=150.0}
        Human{sex=Man, name='Vania', surname='Vania', weight=50.0, height=153.0}
         */


    }
}
