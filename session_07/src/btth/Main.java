package btth;

public class Main {
    public static void main(String[] args) {
        Student haBichNgoc = new Student("SV001","Hà Bich Ngọc");
        Student nguyenHuuDai = new Student("SV002","Nguyễn Hữu Đại");
        Student hoKhanhLinh = new Student("SV003","Hồ Khánh Linh");
        Student phamThaiSon = new Student("SV004","Phạm Thái Sơn");
        Student leThanhTung = new Student("SV005","Lê Thanh Tùng");


        Student.studentCount = 5;

        Student[] nhom5 = {
                haBichNgoc,
                nguyenHuuDai,
                hoKhanhLinh,
                phamThaiSon,
                leThanhTung
        };

        for (int i = 0; i < Student.studentCount; i++) {
            nhom5[i].displayInfo();
        }




    }
}
