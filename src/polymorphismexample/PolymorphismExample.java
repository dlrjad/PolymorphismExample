package polymorphismexample;

import polymorphismexample.check.Check;
import polymorphismexample.classes.Boss;
import polymorphismexample.classes.Contractor;
import polymorphismexample.classes.Employee;

public class PolymorphismExample {
    private static Boss boss = new Boss();
    private static Contractor contractor = new Contractor();
    private static Employee employee = new Employee();
    
    public static void main(String[] args) {
        
        Check check = new Check();
        
        check.viewEmployee(boss);
        check.viewEmployee(contractor);
        check.viewEmployee(employee);
        
        employee = boss;
        check.viewEmployee(employee);

        employee = new Boss();
        boss = (Boss)employee;
        check.viewEmployee(boss);
        check.viewEmployee(employee);
        
        employee = new Contractor();
        check.viewEmployee(contractor);
        
    }
}
