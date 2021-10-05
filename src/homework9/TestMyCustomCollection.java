package homework9;

public class TestMyCustomCollection{
    public static void main(String[] args) {
        String[] strings = {"Some", "interesting", "text", "here"};
        CustomCollection list = new CustomCollectionImp();
        list.add("Hello");
        list.add("World");
        list.addAll(strings);
        //list.addAll(list);
        list.delete(1);
        list.delete("Hello");
        System.out.println(list.contains("Hello"));
        System.out.println(list.contains("Some"));
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
