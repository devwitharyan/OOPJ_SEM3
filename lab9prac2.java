class college{
    String college_name = "DU";
    public college(){
        System.out.println("College Constructor");
    }
    public void display(){
        System.out.println(this.college_name);
    }
}

class student extends college{
    String student_name = "someHuman";

    public student(){
        super();
        System.out.println("Student Constructor");
    }

    public void display(){
       System.out.println(super.college_name);
        super.display();
    }
}

public class lab9prac2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }
}
