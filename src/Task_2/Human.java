package Task_2;

/**
 * Created by nghia on 26.04.2015.
 */
public abstract class Human implements BeingHuman {

    private boolean sex;
    private String name;
    private String surname;
    private float height;
    private float weight;


    public Human(boolean sex, String name, String surname, float height, float weight) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public Human() {

    }


    @Override
    public String toString() {

        return "Human{" +
                "sex=" + this.getClass().toString() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name.matches("[0-9]+") && name.length() > 2) {
                this.name = name;
            } else {
                throw new IllegalArgumentException();
            }}
        catch (IllegalArgumentException e){
            System.out.println("Wrong surname format, not string");
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        try {
            if (surname.matches("[0-9]+") && surname.length() > 2) {
                this.surname = surname;
            } else {
                throw new IllegalArgumentException();
            }}
        catch (IllegalArgumentException e){
            System.out.println("Wrong surname format, not string");
        }

        }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (Float.valueOf(height) != null && height > 0) {
            this.height = height;

        } else throw new IllegalArgumentException("Wrong height");
    }

    public float getWeight() {


        return weight;
    }

    public void setWeight(float weight) {
        if (Float.valueOf(weight) != null && weight > 0) {

            this.weight = weight;
        } else throw new IllegalArgumentException("Wrong weight");
    }

    @Override
    public boolean speak(Human human) {
        if (this.sex == false && human.sex == false) {
            return true;

        }
        if (this.sex == false && human.sex == true) {
            return true;
        }

        if (this.sex == true && human.sex == false) {
            return true;
        } else return Math.random() < 0.5;


    }

    @Override
    public boolean endure(Human human) {
        if (this.sex == false && human.sex == false) {
            return Math.random() <= 0.05;

        }
        if (this.sex == false && human.sex == true) {
            return Math.random() <= 0.7;
        }

        if (this.sex == true && human.sex == false) {
            return Math.random() <= 0.7;
        } else return Math.random() < 0.056;


    }

    @Override
    public boolean spendTime(Human human) {

        if (Math.abs(this.height - human.height) > this.height * 0.1 && Math.random() < 0.85) {
            return true;


        } else return false;


    }

    @Override
    public Human relationship(Human human) {
        if ((this.speak(human) == true && this.endure(human) == true && this.spendTime(human) == true && this.sex != human.sex)) {

            String sex = human.getClass().toString();

            Human woman;
            if (sex.equals("Man")) {
                return ((Woman) this).makeChildren(name, human);
            } else {
                return ((Woman) human).makeChildren(name, this);


            }


        }
        return null;
    }
}
