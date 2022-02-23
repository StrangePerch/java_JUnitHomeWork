package com.company;


public class Area {
    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static double squareArea(double side) {
        return side * side;
    }

    public static double rhombusArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
}
