
import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public  void removeEmployee(int id){
        Employee EmployeeRemove= null;
        for(Employee employee : employeeList){
            if (employee.getId() == id){
                EmployeeRemove = employee ;
                break;
            }
            }
        if (EmployeeRemove != null){
            employeeList.remove(EmployeeRemove);
        }
    }

    public void displayEmployee(){
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }

}
