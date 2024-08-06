class A{
    public void display(){
        System.out.println("Class A");
    }
}

class B{
    public void display(){
        System.out.println("Class B");
    }
}

public class lab9prac1 {
    public static void main(String[] args) {
        B objB = new B();
        objB.display();
    }
}
