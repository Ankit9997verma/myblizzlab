package ProjectOOPs;
import java.util.*;

import java.util.*;

//======================
//Course class
//======================
class Course {
 private String courseId;
 private String courseName;
 private int credits;

 public Course(String courseId, String courseName, int credits) {
     this.courseId = courseId;
     this.courseName = courseName;
     this.credits = credits;
 }

 public String getCourseId() { return courseId; }
 public String getCourseName() { return courseName; }
 public int getCredits() { return credits; }
}

//======================
//Enrollment (Composition)
//======================
class Enrollment {
 private Course course;
 private double grade; // grade on 4.0 scale

 public Enrollment(Course course, double grade) {
     this.course = course;
     this.grade = grade;
 }

 public Course getCourse() { return course; }
 public double getGrade() { return grade; }
}

//======================
//Base Class: Student
//======================
class Student {
 private String studentId;
 private String name;
 private List<Enrollment> enrollments;

 public Student(String studentId, String name) {
     this.studentId = studentId;
     this.name = name;
     this.enrollments = new ArrayList<>();
 }

 public String getStudentId() { return studentId; }
 public String getName() { return name; }

 // Enroll in a course with grade
 public void enroll(Course course, double grade) {
     enrollments.add(new Enrollment(course, grade));
 }

 public List<Enrollment> getEnrollments() {
     return enrollments;
 }

 // Polymorphic method - can be overridden by subclasses
 
 public double calculateGPA() {
     if (enrollments.isEmpty()) return 0.0;

     double totalPoints = 0, totalCredits = 0;
     for (Enrollment e : enrollments) {
         totalPoints += e.getGrade() * e.getCourse().getCredits();
         totalCredits += e.getCourse().getCredits();
     }

     return totalPoints / totalCredits;
 }

 // Print transcript with GPA
 public void printTranscript() {
     System.out.println("Transcript for " + name + " (" + studentId + "):");
     for (Enrollment e : enrollments) {
         System.out.println("- " + e.getCourse().getCourseName() + " (" + e.getCourse().getCredits() + " cr): " + e.getGrade());
     }
     System.out.printf("GPA: %.2f%n", calculateGPA());
 }
}

//======================
//Subclass: UndergraduateStudent
//======================
class UndergraduateStudent extends Student {
 public UndergraduateStudent(String studentId, String name) {
     super(studentId, name);
 }

 @Override
 public double calculateGPA() {
     double totalPoints = 0, totalCredits = 0;

     for (Enrollment e : getEnrollments()) {
         double grade = Math.min(e.getGrade(), 4.0); // cap at 4.0
         totalPoints += grade * e.getCourse().getCredits();
         totalCredits += e.getCourse().getCredits();
     }

     return totalCredits == 0 ? 0.0 : totalPoints / totalCredits;
 }
}

//======================
//Subclass: PostgraduateStudent
//======================
class PostgraduateStudent extends Student {
 public PostgraduateStudent(String studentId, String name) {
     super(studentId, name);
 }

 @Override
 public double calculateGPA() {
     double gpa = super.calculateGPA();
     return gpa < 2.5 ? 0.0 : gpa; // PG fails if GPA < 2.5
 }
}

//======================
//Main Class
//======================
public class StudentManagementSystem {
 public static void main(String[] args) {
     // Create courses
     Course java = new Course("C101", "Java Programming", 3);
     Course math = new Course("M101", "Mathematics", 4);
     Course db   = new Course("D101", "Databases", 2);

     // Create students
     Student s1 = new UndergraduateStudent("UG001", "Alice");
     Student s2 = new PostgraduateStudent("PG001", "Bob");

     // Enroll students
     s1.enroll(java, 3.5);
     s1.enroll(math, 3.7);

     s2.enroll(java, 2.2); // GPA < 2.5 → 0.0
     s2.enroll(db, 2.8);

     // Print transcripts
     s1.printTranscript();
     System.out.println("---------------------");
     s2.printTranscript();
 }
}
