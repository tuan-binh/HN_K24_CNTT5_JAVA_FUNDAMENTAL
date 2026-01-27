
public class DemoArray {
    public static void main(String[] args) {
        // Cú pháp khai báo mảng:
        String[] friends = new String[28];
        // Cú pháp: Datatype[] arrayName = new Datatype[numberOfElement];
//        System.out.println(friends);
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }

        // Khởi tạo mảng mà có giá trị luôn
        String[] ngoc = {
                "Nguyễn Hữu Đại",
                "Hồ Khánh Linh",
                "Phạm Thái Sơn",
                "Lê Thanh Tùng"
        };

        for (int i = 0; i < ngoc.length; i++) {
            System.out.println(ngoc[i]);
        }
    }
}