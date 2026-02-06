package demo_abstract_class;

public class ProductStaff extends Employee {
    private int quantity;
    private double price;

    public ProductStaff() {
    }

    public ProductStaff(String name, Double salary, int quantity, double price) {
        super(name, salary);
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calSalary() {
        return super.getSalary() + price * quantity;
    }
}
