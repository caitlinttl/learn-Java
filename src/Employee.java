public class Employee {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.quitJob();
        System.out.println(employee.name);
    }

    String name = "Kevin";
    int salary = 10000;
    
    public int getSalary() {
        return salary;
    }
    public void quitJob() { 
        System.out.println("I'm out!");
    }
}