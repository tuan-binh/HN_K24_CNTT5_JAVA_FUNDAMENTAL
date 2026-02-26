import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoCollection {
    public static void main(String[] args) {
//        ARRAYLIST
        List<Integer> numbers = new ArrayList<>();
        // thêm
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sau khi thêm");
        System.out.println(numbers);
        // xoá
        numbers.remove(1);
        System.out.println("Sau khi xoá");
        System.out.println(numbers);
        // cập nhật
        numbers.set(1, 2);
        System.out.println("Sau khi cập nhật");
        System.out.println(numbers);

//        LINKEDLIST
        List<String> fullName = new LinkedList<>();
        fullName.addLast("Bùi Văn Phương");
        fullName.addFirst("Nguyễn Thanh Tùng");
        System.out.println(fullName);

//        danh sách động vật yêu thích theo cân
        List<Animal> myFood = new ArrayList<>();
        Animal fish = new Animal("Cá", "Ca vang", true);
        myFood.add(fish);
        Animal gozila = new Animal("Vượn", "Vuon dit do", false);
        myFood.add(gozila);
        Animal cat = new Animal("Mèo", "Meo anh long ngan", false);
        myFood.add(cat);
        Animal dog = new Animal("Chó", "Cho tay tang", false);
        myFood.add(dog);
        Animal pig = new Animal("Lơn", "Lon mang", false);
        myFood.add(pig);

        for (int i = 0; i < myFood.size(); i++) {
            for (int j = i + 1; j < myFood.size(); j++) {
                if (myFood.get(i).getName().compareTo(myFood.get(j).getName()) > 0) {
                    Animal temp = myFood.get(i);
                    myFood.set(i, myFood.get(j));
                    myFood.set(j, temp);
                }
            }
        }

        for (int i = 0; i < myFood.size(); i++) {
            System.out.println(myFood.get(i));
        }

        String name = "Cá vàng";

//        for (int i = 0; i < myFood.size(); i++) {
//            if (myFood.get(i).getName().contains(name)) {
//                System.out.println(myFood.get(i));
//            }
//        }
//
//        for (int i = 0; i < myFood.size(); i++) {
//            System.out.println(myFood.get(i));
//        }
//
//        for (Animal e : myFood) {
//            System.out.println(e);
//        }

    }
}
