package re;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getFullName());
        person.setAge(17);
        System.out.println("Tuổi = "+person.getAge());
    }
}