package polymorphismexample.check;

import polymorphismexample.classes.Boss;
import polymorphismexample.classes.Contractor;
import polymorphismexample.classes.Employee;

public class Check {
    
    public void viewEmployee(Employee e) {
        if (e instanceof Boss) {
            e.getDetails();
            Boss boss = (Boss) e;
            System.out.println("Belongs to the department " + boss.getDepartament());
        } else if (e instanceof Contractor) {
            Contractor contractor = (Contractor) e;
            System.out.println("Belongs to the department " + contractor.getDepartament());
        } else {
            System.out.println("Temporary employee");
        }
    }
}
