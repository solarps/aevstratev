package homework7.AnimalsRefactor;

public class Lion extends WildAnimal implements AnimalsInterface{
    boolean isPredator;

    public Lion(int id, int age, double weight, ColorType color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return (super.getVoice().concat((isPredator ? "and I am angry" : "")));
    }
}
