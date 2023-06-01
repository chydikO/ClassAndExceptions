package org.example;

public class RectangularSheet extends SteelSheet {

    public RectangularSheet(int thickness, double density, int width, int length) {
        super(thickness, density, width, length);
    }

    @Override
    public double area() {
        return getWidth() * getLength();
    }

}