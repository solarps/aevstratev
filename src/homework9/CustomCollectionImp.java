package homework9;

import java.util.Collection;

public class CustomCollectionImp implements CustomCollection {
    static public class Node {
        String str;
        Node next;
        Node prev;

        public Node(String str) {
            this.str = str;
        }
    }

    private Node first;
    private Node last;
    private int size;


    @Override
    public boolean add(String str) {
        Node newNode = new Node(str);
        if (first == null) {
            first = last = newNode;

        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            add(strArr[i]);
        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        final int sizeCollection = strColl.size();
        for (int i = 0; i < sizeCollection; i++) {
            add(get(i));
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public String get(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.str;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean equals(Collection coll) {
        return false;
    }
}
