package org.example;

public class TriangularSheet extends SteelSheet {


    public TriangularSheet(int thickness, double density, int width, int length) {
        super(thickness, density, width, length);
    }

    @Override
    public double area() {
        return 0.5d * getWidth() * getLength();
    }
}
