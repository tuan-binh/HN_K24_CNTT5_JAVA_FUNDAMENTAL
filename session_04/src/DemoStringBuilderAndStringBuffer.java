public class DemoStringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Nguyễn Thanh Tùng");
        str.append("Is Love ❤️ ");
        str.append("Đặng Tô Ngọc Dũng");
        System.out.println(str);
        str.insert(27," Tiểu tam ");
        System.out.println(str);

        str.setLength(100);
        System.out.println(str);
    }
}
