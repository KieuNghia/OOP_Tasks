package Task_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/24/2015.
 */
public class Main {

    public static void main(String args[]) {
        Desktop alienware = new Desktop("AlienwareI7", 1200, "Intell i7", 4, 16, "DRR3", 2033, "Nvidia GF 980", 4, 1024);
        Desktop alienware2 = new Desktop("AlienwareI6", 1000, "Intell i7", 4, 8, "DRR3", 2033, "Nvidia GF 970", 4, 500);
        Desktop razor = new Desktop("Razor", 800, "Intell i5", 4, 8, "DRR3", 2033, "Nvidia GF 960", 2, 1024);

        Laptop msi = new Laptop("MSI", 1300, "Intel i7", 4, 8, "DRR3", 2033, "Nvidia GF 970m", 4, 1024, 15.6, "IPS", 6000);
        Laptop acer = new Laptop("Acer", 700, "Intel i7", 4, 8, "DRR3", 2033, "Nvidia GF 960m", 2, 500, 13.3, "IPS", 4000);
        Laptop apple = new Laptop("Apple Air", 700, "Intel i5", 2, 8, "DRR3", 1133, "Intel HD4000", 1, 500, 13.3, "IPS", 4000);

        Shop PCshop = new Shop(4);
        PCshop.setName("PCSHOP");
        PCshop.add(alienware);
        PCshop.add(alienware2);
        PCshop.add(razor);
        PCshop.add(msi);
        PCshop.add(acer);
        PCshop.add(apple);


        PCshop.showAllPCs();
        System.out.println("-------SORTING---------------");
        PCshop.sortByprice();
        PCshop.showAllPCs();

        System.out.println("-----------------------------");
        System.out.println("Average price for all desktop PCs");
        System.out.println(Desktop.averagePrice());
        System.out.println("-----------------------------");
        System.out.println("Average price for all laptop PCs");
        System.out.println(Laptop.averagePrice());
    }
}
