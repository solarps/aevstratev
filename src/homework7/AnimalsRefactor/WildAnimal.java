package homework7.AnimalsRefactor;

public class WildAnimal extends Animal implements AnimalsInterface{

    public WildAnimal(int id, int age, double weight, ColorType color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return (super.getVoice().concat("I am a wild animal "));
    }
}
