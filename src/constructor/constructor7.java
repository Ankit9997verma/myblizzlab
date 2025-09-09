package constructor;

//Problem 4: Employee Records
public class constructor7 {
 static class Employee {
     public int employeeID;
     protected String department;
     private double salary;

     public Employee(int employeeID, String department, double salary) {
         this.employeeID = employeeID;
         this.department = department;
         this.salary = salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public double getSalary() {
         return salary;
     }
 }

 static class Manager extends Employee {
     private String teamName;

     public Manager(int employeeID, String department, double salary, String teamName) {
         super(employeeID, department, salary);
         this.teamName = teamName;
     }

     public void displayDetails() {
         System.out.println("ID: " + employeeID + ", Dept: " + department +
                 ", Salary: " + getSalary() + ", Team: " + teamName);
     }
 }

 public static void main(String[] args) {
     Manager m = new Manager(2001, "IT", 75000, "Backend Team");
     m.displayDetails();
     m.setSalary(85000);
     m.displayDetails();
 }
}
