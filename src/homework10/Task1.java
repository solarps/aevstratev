package homework10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new LinkedList<>();

        long start = System.currentTimeMillis();
        addElements(firstList);
        getRandomElements(firstList);
        double finish = System.currentTimeMillis() - start;
        System.out.println(finish);

        start = System.currentTimeMillis();
        addElements(secondList);
        getRandomElements(secondList);
        finish = System.currentTimeMillis() - start;
        System.out.println(finish);
    }
    public  static  void addElements(List<Integer> list){
        for (int i = 0; i < 1_000_000; i++){
            list.add(random.nextInt());
        }
    }
    public static void getRandomElements(List<Integer> list){
        for (int i = 0;i< 10_000;i++){
            list.get(random.nextInt(1_000_000));
        }
    }
}
