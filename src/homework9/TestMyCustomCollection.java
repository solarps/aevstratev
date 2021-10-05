package homework9;

import homework8.StringCollection;
import homework8.StringCollectionImp;

public class TestMyCustomCollection{
    public static void main(String[] args) {
        String[] strings = {"Some", "interesting", "text", "here"};

        StringCollection collection = new StringCollectionImp();
        collection.add("Hello");
        collection.add("World");
        collection.add("Some");
        collection.add("interesting");
        collection.add("text");
        collection.add("here");


        CustomCollection c = new CustomCollectionImp();
        assert (c.size() == 0);

        // Check add elements
        assert (c.add("one"));
        assert (c.add("two"));
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("two"));

        // Check contains element
        assert (c.contains("one"));
        assert (!c.contains("three"));

        // Check delete element by value
        assert (c.delete("two"));
        assert (!c.delete("two"));
        assert (c.size() == 1);

        // Check add element by index
        assert (c.add("four"));
        assert (c.addAll(strings));
        assert (c.get(0).equals("one"));
        assert (!c.get(1).equals("five"));
        assert (c.get(1).equals("four"));
        assert (c.delete("four"));
        assert (c.delete("Some"));
        assert (c.delete("interesting"));
        assert (c.delete("text"));
        assert (c.delete("here"));


        // Check equals
        StringCollection c1 = new StringCollectionImp();
        assert (c1.add("one"));
        assert (c.equals(c1));
        assert (c1.add("ten"));
        assert (!c1.equals(c));

        // Check clear
        assert (c.clear());
        assert (!c.contains("Some value"));
        assert (!c.delete("Some value"));
        assert (c.size() == 0);


    }
}
