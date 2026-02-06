package demo_interface;

public interface IShape {
    double perimeter();
    double area();

    // JAVA 8 trở đi
    // phương thức mặc định (default)
    default boolean isShape() {
        return true;
    }

    // phương thức tĩnh (static)
    static boolean hasArea() {
        return true;
    }
}
