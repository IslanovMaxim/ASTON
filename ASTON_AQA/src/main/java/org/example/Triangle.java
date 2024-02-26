package org.example;

class Triangle implements Figure {
    private double сторона1;
    private double сторона2;
    private double сторона3;
    private String цветФона;
    private String цветГраницы;

    public Triangle(double сторона1, double сторона2, double сторона3, String цветФона, String цветГраницы) {
        this.сторона1 = сторона1;
        this.сторона2 = сторона2;
        this.сторона3 = сторона3;
        this.цветФона = цветФона;
        this.цветГраницы = цветГраницы;
    }

    public double расчетПериметра() {
        return сторона1 + сторона2 + сторона3;
    }

    public double расчетПлощади() {
        double полупериметр = расчетПериметра() / 2;
        return Math.sqrt(полупериметр * (полупериметр - сторона1) * (полупериметр - сторона2) * (полупериметр - сторона3));
    }

    public String toString() {
        return "Треугольник: " + "Периметр = " + расчетПериметра() +
                "Площадь = " + расчетПлощади() + ", " +
                "Цвет фона = " + цветФона + ", " +
                "Цвет границы = " + цветГраницы;
    }
}

