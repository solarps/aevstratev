package homework6;



public class Animal {
    private int id;
    private AnimalType animalType;
    private int age;
    private double weight;
    private ColorType color;

    public Animal(int id,AnimalType animalType, int age, double weight, ColorType color){
        this.id = id;
        this.animalType = animalType;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public ColorType getColor() {
        return color;
    }

}
