package overriding;

public class Dog extends Animal {

    private String breed; // giống loài

    public Dog() {
    }

    public Dog(String name, boolean gender, String breed) {
        super(name, gender);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

//    @Override
//    public void speak() {
//        System.out.println("woof woof...");
//    }


    @Override
    public void speak() {
        System.out.println("Woof Woof...");
    }

    public void eat(String eat) {
        System.out.println("Đang ăn sáng");
        System.out.println("loại: " + eat);
    }

    ;

    public void eat(String eat, int quantity) {
        System.out.println("Đang ăn chưa ");
        System.out.println("loại: " + eat);
        System.out.println("so lượng: " + quantity);
    }

    public void eat(String eat, int calories, boolean action) {
        System.out.println("Đang ăn tối");
        System.out.println("Loại: " + eat);
        System.out.println("calories: " + calories);
        System.out.println("CÓ đi lại: " + action);
    }


    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "breed='" + breed + '\'' +
                '}';
    }
}
