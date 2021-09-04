package homework5;

public class HomeWork5 {
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
