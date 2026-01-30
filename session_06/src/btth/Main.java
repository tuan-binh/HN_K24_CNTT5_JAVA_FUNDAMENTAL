package btth;

public class Main {
    public static void main(String[] args) {
        BankAccount tung = new BankAccount("838683868386","Tùng",100000000);
        BankAccount huyen = new BankAccount("999999999999","Huyền",5000);

        System.out.println("Thông tin của tùng trước:");
        tung.display();
        System.out.println("Thông tin của huyền trước:");
        huyen.display();

        huyen.deposit(50000000);
        tung.withdraw(50000000);

        System.out.println("Thông tin của tùng sau:");
        tung.display();
        System.out.println("Thông tin của huyền sau:");
        huyen.display();
    }
}
