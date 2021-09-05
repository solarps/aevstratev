package homework5;

import java.util.StringJoiner;

public class WildAnimal extends Animal {

    public WildAnimal(int id, int age, double weight, ColorType color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return (super.getVoice().concat("I am a wild animal "));
    }
}
