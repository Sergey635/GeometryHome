package com.company;

public class Cube implements IPaking {
        private int side;

    public Cube(int side) {
        this.side = side;
    }

    public int getArea(){
            return (6 * (side * side));
    }
    public int volume(){
        return side * side * side;
    }
    public int perimetr(){
        return side * 12;
    }
    public  double diagonal(){
        return side * Math.sqrt(3);
    }
    public double diagonalSide(){
        return side * Math.sqrt(2);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "Довжина сторони куба = " + side +
                '}';
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public String toXML() {
        return null;
    }
}


