package org.example;

public abstract class SteelSheet {
    private int thickness;
    private double density;
    private int width;
    private int length;

    public SteelSheet(int thickness, double density, int width, int length) {
        this.thickness = thickness;
        this.density = density;
        this.width = width;
        this.length = length;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SteelSheets{" +
                "class-> " + this.getClass().getSimpleName() +
                ", thickness-> " + thickness +
                ", density-> " + density +
                ", width-> " + width +
                ", length-> " + length +
                ", area-> " + area() +
                ", weight-> " + weight() +
                '}';
    }

    public abstract double area();

    public double weight() {
        return area() * density * thickness;
    }
}
