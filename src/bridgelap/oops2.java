package bridgelap;

//File: oops2.java
class Demo {
 void show() {
     int localVar = 10; // local variable
     System.out.println("Inside method, localVar = " + localVar);
 }
}

public class oops2 {
 public static void main(String[] args) {
     Demo d = new Demo();
     d.show();

     // Trying to access localVar here will cause an ERROR
     // System.out.println(localVar); // ❌ Compile-time error: cannot find symbol
 }
}
