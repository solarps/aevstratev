package homework10;

import java.util.Random;
import java.util.StringJoiner;

public class Box {
    private int weight;
    Random random = new Random();

    public Box() {
        this.weight = random.nextInt(1000);
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        String sb = "Box{" + "weight=" + weight +
                '}';
        return sb;
    }
}
