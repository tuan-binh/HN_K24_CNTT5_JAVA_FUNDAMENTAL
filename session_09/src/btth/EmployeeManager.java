package btth;

import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[100];
        int current = 0;
        do {
            System.out.println("""
                    **********************MENU******************
                    1. Nhập thông tin nhân viên
                    2. Nhập thông tin quản lý
                    3. Tính lương nhân viên và quản lý
                    4. Hiển thị thông tin các nhân viên và quản lý
                    5. Sắp xếp các nhân sự theo lương giảm dần
                    6. Tính số lượng nhân viên và quản lý
                    7. Tìm kiếm nhân sự theo tên
                    8. Thoát
                    Lựa chọn của bạn:
                    """);
            int choice = Integer.parseInt(sc.nextLine());

        } while (true);
    }
}
