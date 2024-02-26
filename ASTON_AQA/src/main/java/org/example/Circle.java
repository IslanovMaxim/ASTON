package org.example;

class Circle implements Figure {
    private double радиус;
    private String цветФона;
    private String цветГраницы;
    public Circle(double радиус, String цветФона, String цветГраницы) {
        this.радиус = радиус;
        this.цветФона = цветФона;
        this.цветГраницы = цветГраницы;
    }
    public double расчетПериметра() {
        return 2 * Math.PI * радиус;
    }
    public double расчетПлощади() {
        return Math.PI * радиус * радиус;
    }
    public String toString() {
        return "Круг: " + "Периметр = " + расчетПериметра() + ", " +
                "Площадь = " + расчетПлощади() + ", " +
                "Цвет фона = " + цветФона + ", " +
                "Цвет границы = " + цветГраницы;
    }
}

