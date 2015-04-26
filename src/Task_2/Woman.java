package Task_2;

import java.util.Random;

/**
 * Created by nghia on 26.04.2015.
 */
public class Woman extends Human {
    public Woman(boolean sex, String name, String surname, float height, float weight) {
        super(sex, name, surname, height, weight);
        this.setSex(false);
    }

    public Woman() {

    }

    public Human makeChildren(String name, Human human) {
        float childHeight;
        float childWeight;
        Human child;

        Random random = new Random();
        childHeight = (float) (this.getHeight() + 0.1 * (human.getHeight() - this.getHeight()));
        childWeight = (float) (this.getWeight() + 0.1 * (human.getWeight() - this.getWeight()));
        if (random.nextDouble() <= 0.5) {
            child = new Woman(false, name, human.getSurname(), childHeight, childWeight);
        } else {
            child = new Man(true, name, human.getSurname(), childHeight, childWeight);
        }

        return child;


    }
}
