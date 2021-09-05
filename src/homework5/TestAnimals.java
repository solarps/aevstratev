package homework5;

public class TestAnimals {
    public static void main(String[] args) {
        int id = 0;
        GuideDog dog = new GuideDog(++id,10,15,ColorType.Black,"Valeriy",true,true);
        System.out.println(dog.getVoice());
        System.out.println(dog.LeadHome());
        Hamster hamster = new Hamster(++id,2,2,ColorType.White,"Vasiliy",true);
        System.out.println(hamster.getVoice());
        Crocodile crocodile = new Crocodile(++id,5,20,ColorType.Green);
        crocodile.isPredator=true;
        System.out.println(crocodile.getVoice());

    }
}
