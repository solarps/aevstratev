package homework5;

public class Wolf extends WildAnimal {
    boolean isPredator;

    public Wolf(int id, int age, double weight, ColorType color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return (super.getVoice().concat((isPredator ? "and I am angry" : "")));
    }
}
