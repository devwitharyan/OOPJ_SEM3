//wap with following specification, class name: employee, data member: empID, empName, desgnation, age, salary and member function: get emp details and display employee details 
import java.util.*;

class employee {
	int empID;
	String empName;
    String desg;
    int age;
    int salary;

    public void getinput(){
        Scanner sc = new Scanner(System.in);

        this.empID = sc.nextInt();
        this.empName = sc.nextLine();
        this.desg = sc.nextLine();
        sc.nextLine();
        this.age = sc.nextInt();
        this.salary = sc.nextInt();
    }

	public void display(){
        System.out.println("empID: " + empID);
        System.out.println("empName: " + empName);
        System.out.println("desg: " + desg);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);
	}
}

public class lab5prac2{
	public static void main(String[] args) {
		employee e1 = new employee();
		// student s2 = new student(102, "student2");
        e1.getinput();
		e1.display();
	}
}
