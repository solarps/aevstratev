package homework7.AnimalsRefactor;

public class Fish extends HomeAnimal implements AnimalsInterface{


    public Fish(int id, int age, double weight, ColorType color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String getVoice(){
        return (super.getVoice().concat("....."));
    }
}
