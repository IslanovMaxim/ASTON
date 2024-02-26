package org.example;

import java.util.Scanner;
public class Lesson5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Кот", "Барсик", 0, 200, 10, false);
        animals[1] = new Cat("Кошка", "Мурка", 0, 200, 15, false);
        animals[2] = new Cat("Кот", "Мухтар", 50, 500,20,false);
        animals[3] = new Cat("Собака", "Мелисса", 50, 500, 25,false);


        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего собак создано: " + (Dog.getCount()));
        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Бег: ");
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(100);
        }
        System.out.println();
        System.out.println("Плавание: ");
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(50);
        }
        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].fullness == false && animals[i].appetite < plate.food){
                animals[i].eat(plate);
                animals[i].fullness = true;
                System.out.println("Котик " + animals[i].name + " покушал!");
            } else {
                System.out.println("Котик " + animals[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
