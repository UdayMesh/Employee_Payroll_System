public class Main {
    public static void main(String [] arg){
        PayrollSystem payrollSystem = new PayrollSystem();

        FullTimeEmpolyee emp1 = new FullTimeEmpolyee("Subodh",10, 15000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Raj",11, 40, 220);


        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployee();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(11);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployee();


    }
}