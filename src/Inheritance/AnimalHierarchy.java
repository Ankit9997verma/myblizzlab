package Inheritance;

//File: AnimalHierarchy.java
class Animal {
 String name;
 int age;

 Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

class Dog extends Animal {
 Dog(String name, int age) {
     super(name, age);
 }

 @Override
 void makeSound() {
     System.out.println(name + " barks!");
 }
}

class Cat extends Animal {
 Cat(String name, int age) {
     super(name, age);
 }

 @Override
 void makeSound() {
     System.out.println(name + " meows!");
 }
}

class Bird extends Animal {
 Bird(String name, int age) {
     super(name, age);
 }

 @Override
 void makeSound() {
     System.out.println(name + " chirps!");
 }
}

public class AnimalHierarchy {
 public static void main(String[] args) {
     Animal[] animals = {
         new Dog("jimmy", 3),
         new Cat("Billa", 2),
         new Bird("Mitthu", 1)
     };

     for (Animal a : animals) {
         a.makeSound(); // Polymorphism
     }
 }
}
