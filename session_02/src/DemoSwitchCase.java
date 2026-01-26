import java.util.Scanner;

public class DemoSwitchCase {
    public static void main(String[] args) {
        /**
         * Sử dụng tính tiền gửi xe của từng loại
         * •	Căng hải: free
         * •	Xe đạp: 5000đ
         * •	Xe máy: 10000đ
         * •	Xe ô tô: 50000đ
         * •	Không phải phương tiện -> thông báo lỗi
         * Mục đích:
         *      - phân loại xe với tính tiền gửi xe
         * Yêu cầu:
         *      - Nhập loại phương tiện (vehicle)
         *      - Kiểm tra tính tiền gửi xe
         *      - In ra số tiền phải trả
         * Giải pháp:
         *      - Switch case / if else
         * Thực thi:
         *      - B1: Nhập loại phương tiện
         *      - B2: Sử dụng Switch case để phân loại
         *      - B3: In ra cái giá phải trả
         * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập loại xe: ");
        String vehicle = sc.nextLine();

        int price = 0;

        switch (vehicle) {
            case "căng hải":
                price = 0;
                break;
            case "xe đạp":
                price = 5000;
                break;
            case "xe máy":
                price = 10000;
                break;
            case "ô tô":
                price = 50000;
                break;
            default:
                System.out.println("Phương tiện không thể gửi chỗ tôi!");
        }
        if (price == 0) {
            System.out.println("free");
        } else {
            System.out.printf("Xe %s gửi xe : %d", vehicle, price);
        }
    }
}
