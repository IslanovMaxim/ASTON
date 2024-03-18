package Lesson9;

import java.util.ArrayList;
import java.util.List;
public class Task2 {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("Highload");
        collection.add("High");
        collection.add("Load");
        collection.add("Highload");
        long count = collection.stream()
                .filter(s -> s.equals("High"))
                .count();
        String firstElement = collection.stream()
                .findFirst()
                .orElse("0");
        String lastElement = collection.stream()
                .reduce((a, b) -> b)
                .orElse("0");
        System.out.println("Cколько раз объект «High» встречается в коллекции: " + count);
        System.out.println("Первый элемент коллекции: " + firstElement);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}