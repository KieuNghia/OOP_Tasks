package Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/24/2015.
 */
class Shop<T extends PC> {
    private String name;
    private PC[] pcArray;
    private int pointer;

    public Shop(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Shop(int size){
        pcArray = new PC[size];
        pointer = 0;
    }


    public void add(T pc) {
        if (pointer < pcArray.length) {

            pcArray[pointer] = pc;
            pointer++;

        }
        else{
            PC[] temp = new PC[pcArray.length * 2];
            int i;
            int j;
            for(i = 0; i<pcArray.length; i++ ){
                temp[i] = pcArray[i];
            }
            temp[i] = pc;
            pcArray = temp;

        }


    }

    public void showAll() {
        System.out.println(this.getName() + " has ");
        for (int i = 0; i < pointer; i++) {
            System.out.println(pcArray[i].toString());
        }
    }

    public int count() {
      return pointer;

    }

    public PC getItemByIndex(int index) {

        return  pcArray[index];
    }

    public void sortByprice() {
        Arrays.sort(pcArray, 0, pointer);    }


}

