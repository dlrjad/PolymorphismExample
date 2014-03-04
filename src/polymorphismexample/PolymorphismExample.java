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
        
        boss.getDepartament();
        check.viewEmployee(boss);
        
        contractor.getDepartament();
        check.viewEmployee(contractor);

        check.viewEmployee(employee);
    }
}
