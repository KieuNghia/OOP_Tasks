package Task_1;

import java.util.Arrays;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/24/2015.
 */
class Shop {
    private String name;
    private PC[] pcArray;
    private int counter;

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

    }


    public void add(PC pc) {
        if (counter < pcArray.length) {

            pcArray[counter] = pc;
            counter++;

        }
        else{
            PC[] temp = new PC[pcArray.length * 2];
            System.arraycopy(pcArray,0,temp,0,pcArray.length);

            temp[counter] = pc;
            counter++;
            pcArray = temp;

        }


    }

    public void showAllPCs() {
        System.out.println(this.getName() + " has ");
        for (int i = 0; i < counter; i++) {
            System.out.println(pcArray[i]);
        }
    }

    public int countAllPCs() {
      return counter;

    }

    public PC getItemByIndex(int index) {

        return  pcArray[index];
    }

    public void sortByprice() {
        Arrays.sort(pcArray, 0, counter);    }


}

