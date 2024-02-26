package org.example;

public class Animal extends Lesson5 {
    protected String type;
    protected String name;
    protected int swims;
    protected int run;
    protected int appetite;
    protected boolean fullness;
    private static int count;


    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " " + this.name + " пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " " + this.name + " не пробежал(а) дистанцию ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " " + this.name + " проплыл(а) " + distance + "м.");
        }
        else if (type == "Кот"){
            System.out.println(this.type + " " + this.name + " не умеет плавать ");
        }
        else if (type == "Кошка"){
            System.out.println(this.type + " " + this.name + " не умеет плавать ");
        }
        else {
            System.out.println(this.type + " по кличке " + this.name + " не проплыл(а) дистанцию ");
        }

    }

    public void eat(Plate plate) {
    }
}