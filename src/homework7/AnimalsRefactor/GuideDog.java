package homework7.AnimalsRefactor;

public class GuideDog extends Dog implements AnimalsInterface{

    private boolean isTrained;

    public GuideDog(int id, int age, double weight, ColorType color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public String LeadHome(){
        return "Leading home";
    }


    @Override
    public String getVoice() {
        return (super.getVoice().concat((isTrained) ? "I can take you home. " : ""));
    }

}
