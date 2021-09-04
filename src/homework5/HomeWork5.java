package homework5;

public class HomeWork5 {
    public static void main(String[] args) {
        int id=0;
        HomeAnimal dog = new HomeAnimal(++id, AnimalType.Dog, 5, 20, ColorType.Black, "Rex", true, true);
        System.out.println();
        System.out.println(dog);
        System.out.println(dog.getAnswer());
        dog.getHome();
        WildAnimal wolf = new WildAnimal(++id, AnimalType.Wolf, 6, 24, ColorType.Gray, true);
        System.out.println(wolf);
        System.out.println(wolf.getAnswer());
    }
}
