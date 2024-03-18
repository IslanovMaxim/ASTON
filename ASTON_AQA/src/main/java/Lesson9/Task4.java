package Lesson9;

import java.util.*;
import java.util.stream.Collectors;
public class Task4 {
    Collection<Student> students = Arrays.asList(
            new Student("Дмитрий", 20, Gender.MAN),
               new Student("Максим", 25, Gender.MAN),
               new Student("Екатерина", 30, Gender.WOMAN),
               new Student("Михаил", 30, Gender.MAN)
       );
    private enum Gender {
        MAN,
        WOMAN
    }
    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;
        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        public String getName() {
            return name;
        }
        public Integer getAge() {
            return age;
        }
        public Gender getGender() {
            return gender;
        }
        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof  Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
    public static void main(String[] args) {
        Task4 students = new Task4();
        int Age = 0;
        int countMaleStudents = 0;
        for (Student student : students.students) {
            if (student.getGender() == Gender.MAN) {
                Age += student.getAge();
                countMaleStudents++;
            }
        }
        double averageAge = (double) Age / countMaleStudents;
        System.out.println (averageAge);

        List<Student> selectedStudents = students.students.stream()
                .filter(student -> student.age >= 18 && student.age <= 27)
                .collect(Collectors.toList());
        System.out.println(selectedStudents);
    }
}