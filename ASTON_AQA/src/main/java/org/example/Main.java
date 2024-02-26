package org.example;

class Main {
    public static void main(String[] args) {
        Figure круг = new Circle(5, "красный", "черный");
        Figure прямоугольник = new Pryam(4, 5, "синий", "белый");
        Figure треугольник = new Triangle(3, 5, 6, "белый", "синий");
        System.out.println(круг);
        System.out.println(прямоугольник);
        System.out.println(треугольник);
    }
}