package overriding;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, boolean gender) {
        super(name, gender);
    }

    @Override
    public void speak() {
        System.out.println(" Nyan Nyan... ");
    }

    public void eatPate() {
        System.out.println("Đang ăn rất sang chảnh...");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
