package Task_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/24/2015.
 */
public abstract class PC implements Comparable<PC> {

    protected String name;
    protected double price;

    protected PC() {

    }

    protected PC(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(PC pc) {
        if (this.price > pc.price) {
            return -1;

        }
        else if (this.price < pc.price){
            return 1;
        }
        else {
            return 0;
        }


    }
}
