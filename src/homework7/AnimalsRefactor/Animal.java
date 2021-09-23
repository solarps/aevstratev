package homework7.AnimalsRefactor;


public class Animal implements AnimalsInterface {
    private int id;
    private int age;
    private double weight;
    private ColorType color;

    public Animal(int id, int age, double weight, ColorType color){
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String getVoice(){
        return "Hello, ";
    }
}
