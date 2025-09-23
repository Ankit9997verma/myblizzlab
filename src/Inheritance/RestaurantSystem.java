package Inheritance;

//File: RestaurantSystem.java
interface Worker {
 void performDuties();
}

class Person {
 String name;
 int id;

 Person(String name, int id) {
     this.name = name;
     this.id = id;
 }
}

class Chef extends Person implements Worker {
 Chef(String name, int id) {
     super(name, id);
 }

 @Override
 public void performDuties() {
     System.out.println(name + " cooks food.");
 }
}

class Waiter extends Person implements Worker {
 Waiter(String name, int id) {
     super(name, id);
 }

 @Override
 public void performDuties() {
     System.out.println(name + " serves customers.");
 }
}

public class RestaurantSystem {
 public static void main(String[] args) {
     Worker w1 = new Chef("Ravi", 101);
     Worker w2 = new Waiter("Amit", 102);

     w1.performDuties();
     w2.performDuties();
 }
}
