public class Student implements OrganizationalComponent {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public int getNumberOfStudents() {
        return 1; // A student is a leaf node, so it counts as 1
    }

    @Override
    public void displayDetails() {
        System.out.println("    Student: " + name + " (ID: " + studentId + ", Tuition Fee: " + tuitionFee + ")");
    }

    @Override
    public double calculateBudget() {
        return -tuitionFee; // Student's budget is negative of their tuition fee
    }
}
