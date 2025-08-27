package bridgelap;


class Car {
 String model;
 int year;
 Car(String model, int year) {
     this.model = model;
     this.year = year;
       }
 void display() {
     System.out.println("Car Model: " + model + ", Year: " + year);
     }
 }
public class oops {
 public static void main(String[] args) {
     // Creating car objects
     Car car1 = new Car("BMW", 2000);
     Car car2 = new Car("TOYOTA", 2020);

     // Displaying details
     car1.display();
     car2.display();
           }
}