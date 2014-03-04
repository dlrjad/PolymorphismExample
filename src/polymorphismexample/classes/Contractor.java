package polymorphismexample.classes;

public class Contractor extends Employee{
    String department = "Engagement";

    @Override
    public String getDetails() {
        return "Name: " + name + "\n" + "Department: " + department;
    }
    
    public String getDepartament(){
        return department;
    }
}
