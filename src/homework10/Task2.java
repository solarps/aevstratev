package homework10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Box> list = new ArrayList<>();
        List<Box> newList = new ArrayList<>();
        fillList(list);
        checkWeight(list,newList);
        System.out.println(newList);
    }

    private static void checkWeight(List<Box> list, List<Box> newList) {
        for (Box box:list) {
            if (box.getWeight() > 300) newList.add(box);
        }
    }

    public static List<Box> fillList(List<Box> list){
        for (int i = 0;i<100;i++){
            list.add(new Box());
        }
        return list;
    }
}
