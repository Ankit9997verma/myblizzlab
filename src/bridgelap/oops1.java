package bridgelap;

//File: oops1.java
class Car1 {
 String model;
 int year;
 static int numberOfCars = 0;

 // Constructor
 Car1(String model, int year) {
     this.model = model;
     this.year = year;
     numberOfCars++; // increment whenever a new object is created
 }

 void displayDetails() {
     System.out.println("Car Model: " + model + ", Year: " + year);
 }
}

public class oops1 {
 public static void main(String[] args) {
     Car1 car1 = new Car1("BMW", 2021);
     Car1 car2 = new Car1("Audi", 2023);

     car1.displayDetails();
     car2.displayDetails();

     System.out.println("Total number of cars created: " + Car1.numberOfCars);
 }
}

