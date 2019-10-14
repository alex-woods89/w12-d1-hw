package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName, String nino, String name, int salary){
        super(nino, name, salary);
        this.deptName = deptName;
        }

        public String getDeptName(){
        return this.deptName;
        }

}
