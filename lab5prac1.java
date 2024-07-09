// lab5prac1

class student {
	int enroll;
	String name;

	public student(int enroll, String name){
		this.enroll = enroll;
		this.name = name;
	}

	public void display(){
		System.out.println("enrollment no.: " + enroll + "name: " + name);
	}
}

public class lab5prac1{
	public static void main(String[] args) {
		student s1 = new student(101, "student1");
		student s2 = new student(102, "student2");

		s1.display();
		s2.display();

	}
}