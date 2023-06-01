package org.example;

public class SquareSheet extends SteelSheet {

    public SquareSheet(int thickness, double density, int width) {
        super(thickness, density, width, width);
    }

    @Override
    public double area() {
        return getWidth() * getLength();
    }
}
