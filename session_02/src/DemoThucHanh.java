import java.util.Scanner;

public class DemoThucHanh {
    public static void main(String[] args) {
        /**
         * •	Mục đích:
         * o	    Tính tiền phạt khi trả muộn sách
         * •	Yêu cầu:
         * o	    Nhập số lượng sách phải trả:
         * o	    Nhập ngày quá hạn của từng sách
         * o	    Kiểm tra < 5 ngày -> 2000đ / ngày
         * o	    Kiểm tra >=6 ngày -> 5000đ / ngày
         * o	    Tính tổng tiền phạt
         * •	Giải pháp:
         * o	    For
         * o	    If else
         * •	Thực thi:
         * o	    Khởi tạo biến tích luỹ tiền phạt
         * o	    B1: Nhập số lượng sách
         * o	    B2: Dùng vòng for lặp quá các quyển sách
         * 	        B3: Nhập số lượng ngày trả muộn (ngày trả muộn)
         * 	        B4: Kiểm tra điều kiện:
         * 	        < 5 -> 2000 * ngày trả muộn
         * 	        >= 6 -> 5 * 2000 + (ngày trả muộn - 5) * 5000
         * o	    B5: In ra kết quả
         * */

        Scanner sc = new Scanner(System.in);

//        int totalPrice = 0;
//
//        System.out.println("Nhập số lượng sách phải trả: ");
//        int quantity = sc.nextInt();
//        for (int i = 0; i < quantity; i++) {
//            System.out.println("Nhập vào số ngày trả: ");
//            int lateDay = sc.nextInt();
//            if (lateDay > 0 && lateDay <= 5) {
//                totalPrice += lateDay * 2000;
//            } else {
//                totalPrice += 5 * 2000 + (lateDay - 5) * 5000;
//            }
//        }
//
//        System.out.printf("Tổng tiền phạt %d",totalPrice);

        /**
         * YÊU CẦU 2:
         * •	Mục đích:
         * o	    Kiểm tra có đủ điều kiện làm thẻ VIP
         * •	Yêu cầu:
         * o	    Nhập thông tin ( age, số lượng sách đã mượn, có thẻ ưu tiên hay không )
         * o	    Kiểm tra đủ điều kiện hay không
         * o	    In thông tin ra màn hình
         * •	Giải pháp:
         * o	    If else
         * •	Thực thi:
         * o	    B1: Nhập tuổi
         * o	    B2: Nhập số lượng sách
         * o	    B3: Nhập thẻ ưu tiên
         * o	    B4: Kiểm tra (age >= 18 && quantityBorrow >= 10) || (isPriority == true)  true | false
         * o	    B5: Kiểm tra kq trả về là true hay false  đăng ký được thẻ VIP | không đủ điều kiện
         * */
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập số lượng sách đã mượn: ");
        int quantityBorrow = sc.nextInt();
        System.out.println("Có thẻ ưu tiên hay không (0 or 1): ");
        int isPriority = sc.nextInt();

        if((age >= 18 && quantityBorrow >= 10) || isPriority == 1) {
            System.out.println("Đủ điều kiện nâng cấp VIP");
        } else {
            System.out.println("Không đủ điều kiện");
        }
    }
}
