package Task_0;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 4/21/2015.
 */
public class Phone {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String adress;
    private int creditNum;
    private int debit;
    private int credit;
    private int interCity;
    private int outerCity;

    public Phone(int id, String lastName, String firstName, String middleName, String adress, int creditNum, int debit, int credit, int interCity, int outerCity) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.adress = adress;
        this.creditNum = creditNum;
        this.debit = debit;
        this.credit = credit;
        this.interCity = interCity;
        this.outerCity = outerCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(int creditNum) {
        this.creditNum = creditNum;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getInterCity() {
        return interCity;
    }

    public void setInterCity(int interCity) {
        this.interCity = interCity;
    }

    public int getOuterCity() {
        return outerCity;
    }

    public void setOuterCity(int outerCity) {
        this.outerCity = outerCity;
    }

    public boolean innerCityTimerCheck(int limit) {
        int current = 0;
        current = this.getInterCity();
        if (current > limit) {
            return false;
        } else return true;


    }

    @Override
    public String toString() {
        return
                "{id= " + id +
                ", lastName= '" + lastName + '\'' +
                ", firstName= '" + firstName + '\'' +
                ", middleName= '" + middleName + '\'' +
                ", adress= '" + adress + '\'' +
                ", creditNum= " + creditNum +
                ", debit= " + debit +
                ", credit= " + credit +
                ", interCity= " + interCity +
                ", outerCity= " + outerCity +
                '}';
    }
}
