package org.example;

class Pryam implements Figure {
    private double ширина;
    private double высота;
    private String цветФона;
    private String цветГраницы;

    public Pryam(double ширина, double высота, String цветФона, String цветГраницы) {
        this.ширина = ширина;
        this.высота = высота;
        this.цветФона = цветФона;
        this.цветГраницы = цветГраницы;
    }

    public double расчетПериметра() {
        return 2 * (ширина + высота);
    }

    public double расчетПлощади() {
        return ширина * высота;
    }

    public String toString() {
        return "Прямоугольник: " + "Периметр = " + расчетПериметра() + " , " +
                "Площадь = " + расчетПлощади() + ", " +
                "Цвет фона = " + цветФона + ", " +
                "Цвет границы = " + цветГраницы;
    }
}

