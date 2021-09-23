package homework7.AnimalsRefactor;

public class Dog extends HomeAnimal implements AnimalsInterface{


    public Dog(int id, int age, double weight, ColorType color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String getVoice() {
    return (super.getVoice().concat("Woof. "));
    }
}
