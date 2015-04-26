package Task_1;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/24/2015.
 */
public class Desktop extends PC {

    static private int count;
    static private int sum;

    private String CPU;
    private int cores;
    private int ramAmount;
    private String ramType;
    private int ramClock;
    private String videoCardName;
    private int videocardMemory;
    private int HDDAmount;


    public Desktop(String name, double price, String CPU, int cores, int ramAmount, String ramType, int ramClock, String videoCardName, int videocardMemory, int HDDAmount) {
        super(name, price);
        this.CPU = CPU;
        this.cores = cores;
        this.ramAmount = ramAmount;
        this.ramType = ramType;
        this.ramClock = ramClock;
        this.videoCardName = videoCardName;
        this.videocardMemory = videocardMemory;
        this.HDDAmount = HDDAmount;
        count++;
        sum += price;
    }

    public Desktop() {
        this.name = "Generic";
        this.price = 1;
        this.CPU = "Generic";
        this.cores = 1;
        this.ramAmount = 1;
        this.ramType = "ddr";
        this.ramClock = 1;
        this.videoCardName = "Generic videocard";
        this.videocardMemory = 1;
        this.HDDAmount = 1;
        count++;
        sum += price;

    }

    @Override
    public String toString() {
        return "Desktop{" +
                "Name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", CPU='" + CPU + '\'' +
                ", cores=" + cores +
                ", ramAmount=" + ramAmount +
                ", ramType='" + ramType + '\'' +
                ", ramClock=" + ramClock +
                ", videoCardName='" + videoCardName + '\'' +
                ", videocardMemory=" + videocardMemory +
                ", HDDAmount=" + HDDAmount +

                '}';
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getRamClock() {
        return ramClock;
    }

    public void setRamClock(int ramClock) {
        this.ramClock = ramClock;
    }

    public String getVideoCardName() {
        return videoCardName;
    }

    public void setVideoCardName(String videoCardName) {
        this.videoCardName = videoCardName;
    }

    public int getVideocardMemory() {
        return videocardMemory;
    }

    public void setVideocardMemory(int videocardMemory) {
        this.videocardMemory = videocardMemory;
    }

    public int getHDDAmount() {
        return HDDAmount;
    }

    public void setHDDAmount(int HDDAmount) {
        this.HDDAmount = HDDAmount;
    }

    static public double averagePrice(){
        return sum/count;

    }
}
