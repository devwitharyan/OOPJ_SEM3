//write a program to simply demonstrate this and static keywords

class cons{
	int a;
	static String uni = "DU";

	public cons(int a){
		this.a = a;
	}
	public void display(){
		System.out.println(this.a + "" + uni);
	}

}
class lab8prac1{
	public static void main(String[] args){
		cons obj = new cons(10);
		obj.display();
	}
}