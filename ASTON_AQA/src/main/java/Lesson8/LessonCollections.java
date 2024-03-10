package Lesson8;

import java.util.*;

public class LessonCollections {
    public static void main(String[] args) {
        //1. Counting unique words.
        String[] words = {
                "пихта",
                "ясень",
                "пихта",
                "пихта",
                "клён",
                "лиственница",
                "пихта",
                "берёза",
                "ива",
                "сосна",
                "ель",
                "ель",
                "сосна",
                "дуб",
                "клён",
                "ива",
                "тополь",
                "топль",
                "ясень",
                "пихта",
                "сосна"
        };

        System.out.println("Слово : количество таких слов в списке:");
        countUnique(words);

        //2.Phonebook

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "+7 912 441 82 47");
        phonebook.add("Сергеев", "+7 912 441 82 48");
        phonebook.add("Максимов", "+7 912 441 82 49");
        phonebook.add("Иванов", "+7 912 441 82 40");
        phonebook.add("Петров", "+7 912 441 82 41");
        phonebook.add("Петров", "+7 912 441 82 42");
        phonebook.add("Алексеев", "+7 912 441 82 43");
        phonebook.add("Сидоров", "+7 912 441 82 44");
        phonebook.add("Сидоров", "+7 912 441 82 45");

        System.out.println("\n\nТелефонный справочник.");
        System.out.println("Фамилия : номер телефона:");
        phonebook.show();
    }

    private static void countUnique(String[] words) {
        Map<String, Integer> numberOfWords = new LinkedHashMap<>();
        for (String word : words) {
            countWord(numberOfWords, word);
        }
        for (String word: numberOfWords.keySet()) {
            System.out.println(word + " : " + numberOfWords.get(word) + ".");
        }
    }

    private static void countWord(Map<String, Integer> numberOfWords, String word) {
        if (numberOfWords.containsKey(word)) {
            numberOfWords.put(word, numberOfWords.get(word) + 1);
        }
        else {
            numberOfWords.put(word,1);
        }
    }
}