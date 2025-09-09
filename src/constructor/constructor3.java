package constructor;

//Problem 3: Vehicle Registration
public class constructor3 {
 static class Vehicle {
     private String ownerName;
     private String vehicleType;

     // Class variable
     private static double registrationFee = 1000;

     // Constructor
     public Vehicle(String ownerName, String vehicleType) {
         this.ownerName = ownerName;
         this.vehicleType = vehicleType;
     }

     // Instance method
     public void displayVehicleDetails() {
         System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType +
                 ", Registration Fee: " + registrationFee);
     }

     // Class method
     public static void updateRegistrationFee(double newFee) {
         registrationFee = newFee;
     }
 }

 public static void main(String[] args) {
     Vehicle v1 = new Vehicle("Ankur", "Car");
     Vehicle v2 = new Vehicle("Ravi", "Bike");

     v1.displayVehicleDetails();
     v2.displayVehicleDetails();

     Vehicle.updateRegistrationFee(1500);

     v1.displayVehicleDetails();
     v2.displayVehicleDetails();
 }
}
