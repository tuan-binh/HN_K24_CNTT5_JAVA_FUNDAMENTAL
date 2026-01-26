import java.util.Scanner;

public class DemoDecisionMarking {
    public static void main(String[] args) {
        /**
         * Yêu cầu người dùng vào chơi công viên nước: giá mặc định: 50000đ
         * •	< 7 -> 70%
         * •	7 – 18 -> 50%
         * •	18 – 60 -> 0%
         * •	60  free
         * In ra thông tin giá vé phải trả
         * */
        /**
         * Mục đích:
         *      - tính giảm giá dựa vào tuổi
         * Yêu cầu:
         *      - Nhập vào tuổi và so sánh tính giá tiền
         * Giải pháp:
         *      - sử dụng: if else if
         * Thực thi:
         *      - B1: Nhập tuổi
         *      - B2: Kiểm tra
         *      - B3: In ra
         * */

        /**
         *          < 7 -> 70%
         *          7 – 18 -> 50%
         *          18 – 60 -> 0%
         *          60  free
         * */
        Scanner sc = new Scanner(System.in);

        double defaultPrice = 50000;
        System.out.println("Nhập vào số tuổi: ");
        int age = sc.nextInt();
        if( age < 7 ) {
            defaultPrice = defaultPrice - (defaultPrice * 0.7);
        } else if (age < 18) {
            defaultPrice = defaultPrice * 0.5;
        } else if (age >= 60) {
            defaultPrice = 0;
        }
        System.out.printf("Bạn %d tuổi và giá vé: %f",age, defaultPrice);

    }
}
