package homework5;

public class Cat extends HomeAnimal{
    public Cat(int id, int age, double weight, ColorType color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }


    @Override
    public String getVoice(){
        return (super.getVoice().concat("Meow"));
    }
}
