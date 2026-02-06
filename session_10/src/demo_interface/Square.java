package demo_interface;

public class Square implements IShape {
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double perimeter() {
        return 4 * size;
    }

    @Override
    public double area() {
        return size * size;
    }
}
