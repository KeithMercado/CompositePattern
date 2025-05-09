public class Client {
    public static void main(String[] args) {
        // Create Teachers
        Teacher teacher1 = new Teacher("Jeremias Esperanza", "Computer Science", 50000);
        Teacher teacher2 = new Teacher("Laurice Laureta", "Information Technology", 45000);

        // Create Students
        Student student1 = new Student("Keith Mercado", "22-12785-500", 32000);
        Student student2 = new Student("John Gonzales", "22-12345-678", 28500);

        // Create Departments
        Department csDepartment = new Department("Department of Computer Science");
        csDepartment.add(teacher1);
        csDepartment.add(student1);

        Department itDepartment = new Department("Department of Information Technology");
        itDepartment.add(teacher2);
        itDepartment.add(student2);

        // Create College
        College informaticsCollege = new College("College of Informatics and Computer Studies");
        informaticsCollege.add(csDepartment);
        informaticsCollege.add(itDepartment);

        // Display details of College
        informaticsCollege.displayDetails();

        // Calculate and display total number of students
        System.out.println("Total students in " + informaticsCollege + ": " + informaticsCollege.getNumberOfStudents());

        // Calculate and display the budget of College
        System.out.println("Total budget of " + informaticsCollege + ": ₱" + informaticsCollege.calculateBudget());
    }
}
