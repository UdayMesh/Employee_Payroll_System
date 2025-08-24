public class FullTimeEmpolyee extends Employee{
    private double monthlySalary;

    FullTimeEmpolyee(String name, int id, double monthlySalary){
        super(name , id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }

}
