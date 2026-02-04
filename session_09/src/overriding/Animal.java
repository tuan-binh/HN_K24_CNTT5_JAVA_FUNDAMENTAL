package overriding;

public class Animal {
    private String name;
    private boolean gender;

    public Animal() {
    }

    public Animal(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void speak() {
        System.out.println("động vật đang kêu");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    //
}
