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

    public Node getNodeByIndex(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public boolean add(String str) {
        Node newNode = new Node(str);
        if (first == null) {
            first = last = newNode;

        } else {
            Node prev = last;
            last.next = newNode;
            last = newNode;
            last.prev = prev;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String s : strArr) {
            add(s);
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
        if (index < size) {
            if (index == 0) first = first.next;
            else {
                Node prev = getNodeByIndex(index - 1);
                Node next = getNodeByIndex(index + 1);
                prev.next = next;
                next.prev = prev;
            }
            size--;
            return true;
        } else return false;
    }

    @Override
    public boolean delete(String str) {
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.str.equals(str)) {
                if (i == 0) first = first.next;
                Node prev = getNodeByIndex(i - 1);
                prev.next = getNodeByIndex(i + 1);
                size--;
                return true;
            } else current = current.next;
        }
        return false;
    }

    @Override
    public String get(int index) {
        return getNodeByIndex(index).str;
    }

    @Override
    public boolean contains(String str) {
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.str.equals(str)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean clear() {
        first = last = null;
        size = 0;
        return true;
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
