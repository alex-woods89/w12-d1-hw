package management;


import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(double budget, String deptName, String nino, String name, int salary){
        super(deptName, nino, name, salary);
        this.budget = budget;
    }

   public int payBonus(){
       int salary = this.getSalary();
       return (salary/100 * 2);
   }

}
