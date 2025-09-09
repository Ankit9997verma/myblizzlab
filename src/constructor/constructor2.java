package constructor;

//Problem 2: Online Course Management
public class constructor2 {
 static class Course {
     private String courseName;
     private int duration;
     private double fee;

     // Class variable
     private static String instituteName = "ABC Institute";

     // Constructor
     public Course(String courseName, int duration, double fee) {
         this.courseName = courseName;
         this.duration = duration;
         this.fee = fee;
     }

     // Instance method
     public void displayCourseDetails() {
         System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee +
                 ", Institute: " + instituteName);
     }

     // Class method
     public static void updateInstituteName(String newName) {
         instituteName = newName;
     }
 }

 public static void main(String[] args) {
     Course c1 = new Course("Java", 3, 15000);
     Course c2 = new Course("Python", 2, 12000);

     c1.displayCourseDetails();
     c2.displayCourseDetails();

     Course.updateInstituteName("XYZ Academy");

     c1.displayCourseDetails();
     c2.displayCourseDetails();
 }
}
