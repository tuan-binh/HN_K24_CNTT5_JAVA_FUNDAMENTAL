package demo_abstract_class;

public class Main {
    public static void main(String[] args) {
        OfficeStaff ngocCEO = new OfficeStaff();
        ngocCEO.setName("Hà Bích Ngọc");
        ngocCEO.setSalary(50000000.0);
        ngocCEO.setAllowance(10000000.0);
        System.out.println(ngocCEO.calSalary());

        ProductStaff linhCEO = new ProductStaff();
        linhCEO.setName("Hồ Khánh Linh");
        linhCEO.setSalary(40000000.0);
        linhCEO.setQuantity(100);
        linhCEO.setPrice(100000.0);
        System.out.println(linhCEO.calSalary());

        Employee employee = new Employee() {
            @Override
            public double calSalary() {
                return 0;
            }
        };
    }
}
