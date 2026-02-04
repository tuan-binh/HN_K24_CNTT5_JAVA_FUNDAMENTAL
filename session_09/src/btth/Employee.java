package btth;

import java.util.Scanner;

public class Employee {
    // thuộc tính
    private String id;
    private String name;
    private int age;
    private int credit;
    private double baseSalary;
    private double salary;

    // phương thức

    public Employee() {
    }

    public Employee(String id, String name, int age, int credit, double baseSalary, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.credit = credit;
        this.baseSalary = baseSalary;
        this.salary = salary;
    }

    // getter / setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData(Scanner sc) {
        System.out.println("Nhập mã nhân viên: ");
        this.id = sc.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập hệ số lương: ");
        this.credit = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập lương cơ bản: ");
        this.baseSalary = Double.parseDouble(sc.nextLine());
    }

    public void displayData() {
        System.out.println("-------------------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Credit: " + credit);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------------------------");
    }

    public double calSalary() {
        this.salary = baseSalary * credit;
        return baseSalary * credit;
    }

}
