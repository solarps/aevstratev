package homework6;

//import homework6.Animal;

public class HomeWork6 {
    public static void main(String[] args) {
        HomeAnimal dog = new HomeAnimal(1, AnimalType.Dog, 5, 20, ColorType.Black, "Rex", true, true);
        System.out.println();
        System.out.println(dog);
        System.out.println(dog.getAnswer());
        dog.getHome();
        WildAnimal wolf = new WildAnimal(2, AnimalType.Wolf, 6, 24, ColorType.Gray, true);
        System.out.println(wolf);
        System.out.println(wolf.getAnswer());
    }
}
