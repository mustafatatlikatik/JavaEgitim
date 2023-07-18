public class Main {
    public static void main(String[] args) { //inheritance miras demek
        Customer customer = new Customer();
        Employee employee = new Employee();
        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        employeeManager.List();
        employeeManager.Add();
        System.out.println("--------------------------------");
        customerManager.List();
        customerManager.Add();
        employeeManager.BestEmployee();

    }
}