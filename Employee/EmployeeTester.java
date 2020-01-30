public class EmployeeTester {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
            new Employee("Ninja", 599999.00),
            new Employee("Jack Barkes", 57489.99),
            new Employee("Yeeeeeeeeet", 0),
            new Employee("Nihonjin", 55554.99),
            new Employee("Ayaya", 66666.66),
            new Employee(),
        };
        printEmployees(employees);
        printHighestSalary(employees);
    }

    public static void printEmployees(Employee[] array) {
        for(Employee e : array) {
            System.out.println(e);
        }
    }

    public static void printHighestSalary(Employee[] array) {
        int high = 0;
        int index = 0;
        for(Employee e : array) {
            if (e.getSalary() > array[high].getSalary()) {
                high = index; 
            }
            index++;
        }
        System.out.println(array[high].getName() + " had the highest salary, $" + array[high].getSalary());
    }
}