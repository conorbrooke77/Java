package Lab8.Question2;

public class Employee extends Person{
    private int annualSalary;

    public Employee(String name, int annualSalary) {
        super(name);
        setAnnualSalary(annualSalary);
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "\nAn employee with a salary of " + annualSalary;
    }

    public String toString() {
        return super.toString() + "\nAnnual Salary: " + annualSalary;
    }
}
