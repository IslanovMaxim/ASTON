package Lesson9;

import java.util.*;

public class Task1 {

    public static void DemoStream() {

        ArrayList<Integer> AL = new ArrayList<Integer>();
        int number;
        Random rnd = new Random();

        for (int i=0; i<10; i++) {
            number = rnd.nextInt() % 100;
            AL.add(number);
        }

        System.out.println("Массив:");
        System.out.println(AL);

        int m = (int)(AL.stream().filter((n)->(n%2)==0)).count();
        System.out.println("m = " + m);
    }
    public static void main(String[] args) {
        DemoStream();
    }
}
