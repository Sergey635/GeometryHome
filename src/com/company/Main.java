package com.company;

public class Main {

    public static void main(String[] args) {
        Cube s1 = new Cube(5);
        System.out.println("Площа куба = " + s1.getArea());
        System.out.println("Об'єм куба = " + s1.volume());
        System.out.println("Периметр куба = " + s1.perimetr());
        System.out.println("Діагональ куба = " + s1.diagonal());
        System.out.println("Діагональ грані = " + s1.diagonalSide());
        System.out.println(s1.toString());

    }
}
