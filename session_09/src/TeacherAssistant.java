public class TeacherAssistant extends Teacher {
    private boolean isPartTime;

    public TeacherAssistant() {
    }

    public TeacherAssistant(String name, int age, double baseSalary, String expertise, int hours, boolean isPartTime) {
        super(name, age, baseSalary, expertise, hours);
        this.isPartTime = isPartTime;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public void setPartTime(boolean partTime) {
        isPartTime = partTime;
    }
}
