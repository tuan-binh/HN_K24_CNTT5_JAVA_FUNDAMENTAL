package demo_interface;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println("Chu vi hình chữ nhật = " + rectangle.perimeter());

        System.out.println("Diện tích hình chữ nht = "+rectangle.area());

        rectangle.resize(1.5);

        System.out.println("Chu vi hình chữ nhật = " + rectangle.perimeter());

        System.out.println("Diện tích hình chữ nht = "+rectangle.area());

        IShape shape = new IShape() {
            @Override
            public double perimeter() {
                return 0;
            }

            @Override
            public double area() {
                return 0;
            }
        };
    }
}