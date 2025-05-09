import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationalComponent {
    private String name;
    private List<OrganizationalComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(OrganizationalComponent component) {
        components.add(component);
    }

    public void remove(OrganizationalComponent component) {
        components.remove(component);
    }

    public List<OrganizationalComponent> getChildren() {
        return components;
    }

    @Override
    public int getNumberOfStudents() {
        int totalStudents = 0;
        for (OrganizationalComponent component : components) {
            totalStudents += component.getNumberOfStudents();
        }
        return totalStudents;
    }

    @Override
    public void displayDetails() {
        System.out.println("  Department: " + name);
        for (OrganizationalComponent component : components) {
            component.displayDetails();
        }
    }

    @Override
    public double calculateBudget() {
        double totalBudget = 0;
        for (OrganizationalComponent component : components) {
            totalBudget += component.calculateBudget();
        }
        return totalBudget;
    }
}
