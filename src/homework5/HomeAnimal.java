package homework5;

import java.util.StringJoiner;

public class HomeAnimal extends Animal {

    private String name;
    private boolean isVaccinated;

    public HomeAnimal(int id,  int age, double weight, ColorType color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String getVoice() {
        return (super.getVoice() + String.format("My name is %s. I am a home animal. ",name));
    }
}
