import overriding.Dog;

public class Main {
    public static void main(String[] args) {
        Teacher maixuanchinh = new Teacher("Chinh",30,50000000,"Dạy các em",16000);
        System.out.println(maixuanchinh);
        // Kế thừa:
        /** - kế thừa đơn
         *              A
         *              |
         *              B
         *
         *  - kế thừa nhiều cấp
         *              A
         *              |
         *              B
         *              |
         *              C
         *
         *  - kế thừa phân cấp
         *
         *              A
         *             / \
         *            B   C
         *
         * */

        // Đa hình:
        /**
         *  1. Overriding - ghi đè
         *      - thế hiện class cha và class con
         *              Animal (speak( "đông vật đang kêu ))
         *                      |                               \
         *                     Dog (speak( "woof woof ..." ))   Cat (speak( "nyan nyan..." ))

         *
         *  2. Overloading - nạp chồng
         *      sum(int a, int b)
         *      sum(double a, double b)
         *      sum(int a, int b, int c)
         *
         * */

        Dog myPet = new Dog("Cậu vàng",true,"Chó ta");
        myPet.eat("hạt ngũ cốc",15,true);


    }
}