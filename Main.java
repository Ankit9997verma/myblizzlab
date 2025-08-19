class Car {
    // instance variables
    String model;
    int year;

    // constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", 2022);
        Car car2 = new Car("Toyota Corolla", 2020);

        System.out.println("Car model: " + car1.model + ", Year: " + car1.year);
        System.out.println("Car model: " + car2.model + ", Year: " + car2.year);
    }
}
