package homework5;

import java.util.StringJoiner;

public class HomeAnimal extends Animal {

    private String name;
    private boolean isVaccinated;
    private boolean isEducated;
    private String answer;

    public HomeAnimal(int id, AnimalType animalType, int age, double weight, ColorType color, String name, boolean isVaccinated, boolean isEducated) {
        super(id, animalType, age, weight, color);

        this.name = name;
        this.isVaccinated = isVaccinated;
        this.isEducated = isEducated;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "[", "]")
                .add("id='" + getId() + "'")
                .add("animal='" + getAnimalType() + "'")
                .add("name='" + name + "'")
                .add("age='" + getAge() + "'")
                .add("color='" + getColor() + "'")
                .add("weight='" + getWeight() + "'")
                .add("isVaccinated=" + isVaccinated)
                .add("isEducated=" + isEducated)
                .toString();
    }


    public String getAnswer() {
        answer = "My name is " + name;
        if (getAnimalType() == AnimalType.Dog) {
            answer += "\nWoof";
            if (isEducated) {
                answer += "\nI can take you home.";
            }
        } else if (getAnimalType() == AnimalType.Cat) {
            answer += "\nMeow";
        } else if (getAnimalType() == AnimalType.Fish) {
            answer += "\n.....";
        }
        return answer;
    }

    public void getHome() {
        if (getAnimalType() == AnimalType.Dog) {
            if (isEducated) {
                System.out.println("We walked couple streets and came home");
            } else {
                System.out.println("Sorry I cant do this");
            }
        }
    }

}
