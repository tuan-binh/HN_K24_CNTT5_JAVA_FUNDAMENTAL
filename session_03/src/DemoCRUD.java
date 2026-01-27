import java.util.Scanner;

public class DemoCRUD {
    public static void main(String[] args) {
        /**
         * C - create
         *      - thêm vị trí đầu
         *          - dịnh chuyển các phần sang bên phải
         *          - gán phần tử cần chèn vào đầu [0]
         *      - thêm vị trí cuối
         *          - sử dụng biến current để biết tồn tại cuối cùng
         *          - gán vào biến current = giá trị cần chền
         *      - thêm vị trí bất kỳ
         *          - duyệt từ vị trí cần chèn đến current
         *          - dịnh chuyển các phần tử sang phải
         *          - gán giá trị cần chèn vào vị trí
         * */
        // Đề bài: Ngọc đang cần thông tin liên hệ
        Scanner sc = new Scanner(System.in);
        String[] friendOfNgoc = new String[4];
        int current = 0;
        System.out.println("Nhập vào số lượng muốn: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên bạn tôi: ");
            String myFriend = sc.nextLine();
            friendOfNgoc[current] = myFriend;
            current++;
        }

        printFriend(current, friendOfNgoc);

        // Cập nhật - tìm đối tượng cần thay thế
        /**
         * Tìm đại ngồi đâu (vị trí - index)
         * // cập nhật lại thông tin bằng phép gán
         * */
//        System.out.println("Nhập tên muốn sửa: ");
//        String nameOfUpdate = sc.nextLine();
//        int index = -1;
//        for (int i = 0; i < current; i++) {
//            if(nameOfUpdate.equals(friendOfNgoc[i])) {
//                index = i;
//                break;
//            }
//        }
//        if (index == - 1) {
//            System.err.println("Không tồn tại");
//        } else {
//            System.out.println("Nhập tên bạn mới: ");
//            String newName = sc.nextLine();
//            friendOfNgoc[index] = newName;
//        }
//        for (int i = 0; i < current; i++) {
//            System.out.println(friendOfNgoc[i]);
//        }

        // Chức năng xoá:
        // Cần nhập tên người muốn xoá
        // Đi tìm vị trí
        // Dịnh chuyển các phàn từ vị trí xoá đến current sang trái
        System.out.println("Nhập tên muốn xoá: ");
        String nameDelete = sc.nextLine();
        int indexDelete = -1;
        for (int i = 0; i < current; i++) {
            if(nameDelete.equals(friendOfNgoc[i])) {
                indexDelete = i;
                break;
            }
        }
        if(indexDelete == -1) {
            System.err.println("Không tìm thấy");
        } else {
            for (int i = indexDelete; i < current-1; i++) {
                friendOfNgoc[i] = friendOfNgoc[i+1];
            }
            current--;
            friendOfNgoc[current] = null;
        }
        printFriend(current, friendOfNgoc);
    }

    private static void printFriend(int current, String[] friendOfNgoc) {
        for (int i = 0; i < current; i++) {
            System.out.println(friendOfNgoc[i]);
        }
    }

    // Cú pháp phương thức
//    [modifier] [returnType] methodName( parameters ) {
//        // Body
//    }
    // Đối số & Tham số
    // Gọi hàm ra sao

}
