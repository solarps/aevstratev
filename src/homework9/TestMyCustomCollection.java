package homework9;


public class TestMyCustomCollection {
    public static void main(String[] args) {
        String[] strings = {"Some", "interesting", "text", "here"};
        CustomCollection list = new CustomCollectionImp();
        list.add("Hello");
        list.add("World");
        list.addAll(strings);
        list.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //System.out.println(list.get(0));
    }
}
