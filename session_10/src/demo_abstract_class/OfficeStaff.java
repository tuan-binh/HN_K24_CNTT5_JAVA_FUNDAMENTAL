package demo_abstract_class;

public class OfficeStaff extends Employee {
    private Double allowance;

    public OfficeStaff() {
    }

    public OfficeStaff(String name, Double salary, Double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    @Override
    public double calSalary() {
        return super.getSalary() + allowance;
    }
}
