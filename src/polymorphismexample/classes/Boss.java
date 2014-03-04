package polymorphismexample.classes;

public class Boss extends Employee{
    
    String department = "Manager";

    @Override
    public String getDetails() {
        return "Name: " + name + "\n" + "Department: " + department;
    }
    
    public String getDepartament(){
        return department;
    }
}
