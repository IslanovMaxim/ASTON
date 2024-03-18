package Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Task3 {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("f10");
        collection.add("a15");
        collection.add("f2");
        collection.add("f4");
        collection.add("f5");
        collection.add("b54");
        collection.add("a16");
        Collections.sort(collection, (s1, s2) -> {
            String alphabetic1 = s1.replaceAll("d", "");
            String alphabetic2 = s2.replaceAll("d", "");
            if (!alphabetic1.equals(alphabetic2)) {
                return alphabetic1.compareTo(alphabetic2);
            } else {
                return Integer.parseInt(s1.replaceAll("[^0-9]", ""))
                        - Integer.parseInt(s2.replaceAll("[^0-9]", ""));
            }
        });
        String[] array = new String[collection.size()];
        collection.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}