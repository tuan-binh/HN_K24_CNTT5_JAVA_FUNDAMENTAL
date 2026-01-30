package btth;

public class BankAccount {
    // Thuộc tính
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Phương thức

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        if (money <= 0) {
            System.err.println("Số tiền nạp không hợp lệ...");
        } else {
            balance += money;
        }
    }

    public void withdraw(double money) {
        if (money > 0 && (balance - money >= 0)) {
            balance -= money;
        } else {
            System.err.println("Số dư không đủ");
        }
    }

    public void display() {
        System.out.println("------------------------------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + ownerName);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------------");
    }
}
