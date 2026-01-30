package re;

public class Person {
    // Thuộc tính
    protected String fullName;
    int age;
    String className;

    // Constructors


    public Person() {
    }

    public Person(String fullName, int age, String className) {
        this.fullName = fullName;
        this.age = age;
        this.className = className;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
