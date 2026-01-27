import java.util.Scanner;

public class DemoThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ids = new int[100];
        String[] titles = new String[100];
        int[] quantities = new int[100];
        int current = 2;
        ids[0] = 1;
        titles[0] = "Lão hạc";
        quantities[0] = 10;
        ids[1] = 2;
        titles[1] = "Chiếc lược ngà";
        quantities[1] = 9;

        do {
            System.out.println("""
                    1. Xem danh sách
                    2. Thêm
                    3. Cập nhật
                    4. xoá
                    5. tìm kiếm
                    6. sắp xếp
                    7. thoát
                    Lựa chọn của bạn:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (current == 0) {
                        System.err.println("Danh sách trống ...");
                    } else {
                        for (int i = 0; i < current; i++) {
                            System.out.println("-------------------------------------");
                            System.out.println("ID: " + ids[i]);
                            System.out.println("TITLE: " + titles[i]);
                            System.out.println("QUANTITY: " + quantities[i]);
                            System.out.println("-------------------------------------");
                        }
                    }
                    break;
                case 2:
                    if (current == 100) {
                        System.err.println("Danh sách đã đầy");
                    } else {
                        System.out.println("Nhập số lượng muốn thêm: ");
                        int n = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < n; i++) {
                            System.out.println("nhập id: ");
                            int newId = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập tiêu đề: ");
                            String newTitle = sc.nextLine();
                            System.out.println("Nhập số lượng: ");
                            int newQuantity = Integer.parseInt(sc.nextLine());

                            ids[current] = newId;
                            titles[current] = newTitle;
                            quantities[current] = newQuantity;
                            current++;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }
        } while (true);

    }
}
