package bridgelap;

class Demo {
 void show() {
     int localVar = 10; 
     System.out.println("Inside method, localVar = " + localVar);
 }
}

public class oops2 {
 public static void main(String[] args) {
     Demo d = new Demo();
     d.show();

 }
}
