public class Employee {
    private String name;
    private double salary;
    private int empNumber;
    private static int empCount;

    public Employee() {
        this("Anonymous", 0.0);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        empCount++;
        this.empNumber = empCount;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpNumber() {
        return this.empNumber;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", salary='" + getSalary() + "'" +
            ", empNumber='" + getEmpNumber() + "'" +
            "}";
    }

}
    

 
