import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo 1 biến chứa tên
        // Đối tượng nào trong Java cũng tuân theo quy tắc đặt tên PascalCase
        String name = "Hà Bích Ngọc";
        int age = 19;
        float score = 7.5F;
        double money = 10000000.0;

        // Đặt tên biến:
        // camelCase: ngày sinh --> date of birth
        String dateOfBirth = "";

        // snake_case: họ tên --> full name
        String full_name = "";

        // PascalCase: địa chỉ hiện tại: current address
        String CurrentAddress = "";

        // Wrapper Class
        // Cú pháp khai báo biến
        // <DataType> <VariableName> = <Giá trị>

        //  Bài toán: Tính tuổi khi nhập ngày sinh:

        int birthYear = 2006;
        int nowYear = 2026;
        int ageOfDuc = nowYear - birthYear;
//        System.out.print(ageOfDuc);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tuổi: ");
//        int myAge = Integer.parseInt(sc.nextLine());
//        System.out.println(myAge);
//        System.out.println("Nhập tuổi: ");
//        String myName = sc.nextLine();
//        System.out.print(myName);

        // ==> Giải quyết tình huống nuốt dòng Java:
        /**
         * Cái nào khác chuỗi thì --> nhập chuỗi ép kiểu về số
         * */

//        boolean result = Boolean.parseBoolean("true");
//        System.out.println(result);


        /**
         * ================================================
         * | Ngọc   | Đại    | Linh   | Sơn    | Tùng     |
         * ================================================
         * */

        System.out.println("================================================");
        System.out.print("\t| Ngọc \t| Đại \t| Linh \t |Sơn \t| Tùng |\n");
        System.out.println("================================================");

        System.out.println("==================================================================");
        System.out.printf("| %10s | %10s | %10s | %10s | %10s |\n","Ngọc","Đại","Linh","Sơn","Tùng");
        System.out.println("==================================================================");

        /**
         * 1. Cách thức lưu trữ (vùng nhớ)
         * 2. Kiểu dữ liệu
         * 3. Biến
         * 4. Toán tử
         * 5. Nhập xuất
         * */

        final double myScore = 10;


    }
}
