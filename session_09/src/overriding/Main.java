package overriding;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Tiều cường",true);
        System.out.println(animal);
        animal.speak();
        Dog dog = new Dog("Milu",false,"shiba");
        System.out.println(dog);
        dog.speak();
        Cat cat = new Cat("Doraemon",true);
        System.out.println(cat);
        cat.speak();

        Animal[] zoos = { dog, cat };

        for (int i = 0; i < zoos.length; i++) {
            if(zoos[i] instanceof Cat) {
                ((Cat) zoos[i]).eatPate();
            }
        }

        // ÉP KIỂU: UPCASTING và DOWNCASTING
        /**
         * 1. UPCASTING (Con -> Cha)
         *      - an toàn hơn
         * 2. DOWNCASTING (Cha -> Con)
         *      - không an toàn (chúng ta phải sử dụng instanceof )
         * */
    }
}
