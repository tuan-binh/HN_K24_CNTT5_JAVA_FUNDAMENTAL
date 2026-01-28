import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str1 = "Ngọc";
        String str2 = "Ngọc";
        System.out.println(str1 == str2);
        String str3 = new String("Linh");
        String str4 = new String("Linh");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        System.out.println("A".compareTo("a"));

        System.out.println("Hà Bích Ngọc".endsWith("Ngọc1"));

        String str = "Trần Thị Khánh Huyền Tập Trung Vào";
        str = str.substring(0,20);
        System.out.println(str);
//        String[] arrString = str.split(" ");
//        for (int i = 0; i < arrString.length; i++) {
//            System.out.println(arrString[i]);
//        }
        char[] arrChar = str.toCharArray();
        System.out.println(Arrays.toString(arrChar));

    }
}