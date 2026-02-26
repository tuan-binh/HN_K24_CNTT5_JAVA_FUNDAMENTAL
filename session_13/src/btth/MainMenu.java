package btth;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        PatientManager patientManager = new PatientManager();

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                
                1. Thêm mới
                2. Xoá
                3. Cập nhật
                4. Tìm kiếm
                5. Sắp xếp theo tuổi
                6. Sắp xếp theo tên
                7. Hiển thị danh sách
                8. Thoát
                Lựa chọn của bạn:
                """);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                Patient patient = new Patient();
                System.out.println("Nhập tên: ");
                patient.setName(sc.nextLine());
                patientManager.addPatient(patient);
                break;
            case 2:
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
            case 8:
                break;
        }

    }
}
