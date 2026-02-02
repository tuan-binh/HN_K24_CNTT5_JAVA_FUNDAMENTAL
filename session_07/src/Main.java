
public class Main {
    public static void main(String[] args) {
        Person haBichNgoc = new Person(
                "Hà Bích Ngọc",
                19,
                false,
                true,
                true,
                false,
                true
        );

        Person nguyenVanHieu = new Person(
                "Nguyễn Văn Hiếu",
                19,
                false,
                false,
                false,
                true,
                false
        );

        Person nguyenTheKien = new Person(
                "Nguyễn Thế Kiên",
                19,
                true,
                true,
                true,
                false,
                false
        );

        Person[] cntt5 = {
                haBichNgoc,
                nguyenVanHieu,
                nguyenTheKien
        };

        for (int i = 0; i < cntt5.length; i++) {
            System.out.println(cntt5[i]);
        }

        Person.className = "HN-KS24-CNTT4";

        for (int i = 0; i < cntt5.length; i++) {
            System.out.println(cntt5[i]);
            cntt5[i].learning();
        }

//        Person.learning();
    }
}