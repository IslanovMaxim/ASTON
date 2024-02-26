package org.example;

public class Cat extends Animal {
    private static int count;

    public Cat(String type, String name, int swims, int run, int appetite, boolean fullness) {
        this.type = type;
        this.name = name;
        this.swims = swims;
        this.run = run;
        this.appetite = appetite;
        this.fullness = fullness;
        count++;
    }
    public static int getCount() {
        return count;
    }
    public void eat (Plate p) {
        p.decreaseFood(appetite);
    }

}
