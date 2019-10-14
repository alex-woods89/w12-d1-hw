package staff;

public abstract class Employee {
    private String nino;
    private String name;
    private int salary;

    public Employee(String nino, String name, int salary){
        this.nino = nino;
        this.name = name;
        this.salary = salary;
    }

    public String getNino(){
        return this.nino;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name != null){this.name = name;}
    }

    public int getSalary(){
        return this.salary;
    }

    public void raiseSalary(int bonus){
        if(bonus > 0 ){salary += bonus;}
    }
    public int payBonus(){
        return (salary/100);
    }

}
