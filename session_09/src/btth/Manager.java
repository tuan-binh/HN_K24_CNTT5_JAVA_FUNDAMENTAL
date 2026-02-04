package btth;

import java.util.Scanner;

public class Manager extends Employee{
    private String position;
    private String department;

    public Manager() {
    }

    public Manager(String id, String name, int age, int credit, double baseSalary, double salary, String position, String department) {
        super(id, name, age, credit, baseSalary, salary);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void inputManager(Scanner sc) {
        super.inputData(sc);
        System.out.println("Nhập vị trí: ");
        this.position = sc.nextLine();
        System.out.println("Nhập phòng ban: ");
        this.department = sc.nextLine();
    }

    public void displayData() {
        super.displayData();
        System.out.println("Position: "+position);
        System.out.println("Department: "+department);
        System.out.println("-------------------------------------------");
    }

    public double calSalary() {
        super.setSalary(super.calSalary() * 1.2);
        return super.getCredit() * super.getBaseSalary() * 1.2;
    }

}
