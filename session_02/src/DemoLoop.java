import java.util.Scanner;

public class DemoLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // (Bài toán: 100 từ “Đừng có overthiking nữa, không có gì mà phải sợ”);
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i + ". Đừng có overthiking nữa, không có gì mà phải sợ");
//        }
        // Ứng dụng:
        /**
         *         1. Duyệt 1 -> hiển thị
         *         2. Kiểm tra số chẵn lẻ trong 1 danh sách
         *         3. Tính tổng
         *         4.....
         * */

        /**
         * Con gái: A Chạ Thương iem;
         * Con trai: - A Chin Nhỗi -> break
         * */
        String answer;
        do {
            System.out.println("Con gái: \"Anh Chạ Thương Em 👉👈\"");
            System.out.print("Con trai: ");
            answer = sc.nextLine();
        }
        while (!answer.equals("A Chin Nhỗi"));
        System.out.println("Oke a");
    }
}
