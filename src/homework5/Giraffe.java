package homework5;

public class Giraffe extends WildAnimal{
    boolean isPredator;

    public Giraffe(int id, int age, double weight, ColorType color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return (super.getVoice().concat((isPredator ? "and I am angry" : "")));
    }
}
