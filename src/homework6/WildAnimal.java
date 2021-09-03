package homework6;

import java.util.StringJoiner;

public class WildAnimal extends Animal{

    private boolean isPredator;

    public WildAnimal(int id,AnimalType animalType, int age, double weight, ColorType color, boolean isPredator){
        super(id, animalType, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "[", "]")
                .add("id='" + getId() + "'")
                .add("animal='" + getAnimalType() + "'")
                .add("age='" + getAge() + "'")
                .add("color='" + getColor() + "'")
                .add("weight='" + getWeight() + "'")
                .add("isPredator=" + isPredator)
                .toString();
    }


    public String getAnswer(){
        String answer = "I am a wild animal";
        if (isPredator){
            answer += " and I am hungry";
        }
        if(getAnimalType() == AnimalType.Dog){
            answer += "\nWoof";
        }
        else if(getAnimalType() == AnimalType.Cat){
            answer += "\nMeow";
        }
        return answer;
    }
}
