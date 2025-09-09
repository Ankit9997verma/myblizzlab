package constructor;

//Problem 1: University Management System
public class constructor4 {
 static class Student {
     public int rollNumber;
     protected String name;
     private double CGPA;

     public Student(int rollNumber, String name, double CGPA) {
         this.rollNumber = rollNumber;
         this.name = name;
         this.CGPA = CGPA;
     }

     public double getCGPA() {
         return CGPA;
     }

     public void setCGPA(double CGPA) {
         this.CGPA = CGPA;
     }
 }

 static class PostgraduateStudent extends Student {
     private String specialization;

     public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
         super(rollNumber, name, CGPA);
         this.specialization = specialization;
     }

     public void displayDetails() {
         System.out.println("Roll: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization);
     }
 }

 public static void main(String[] args) {
     PostgraduateStudent pg = new PostgraduateStudent(101, "Rahul", 8.7, "AI");
     pg.displayDetails();
     System.out.println("CGPA: " + pg.getCGPA());
     pg.setCGPA(9.2);
     System.out.println("Updated CGPA: " + pg.getCGPA());
 }
}
