//demonstrate hierarchical inheritance

class a{
	public void displayA(){
		System.out.println("A");
	}
}
class b extends a{
	public void displayB(){
		System.out.println("B");
	}
}
class c extends a{
	public void displayC(){
		System.out.println("C");
	}
}

class lab8prac4{
	public static void main(String[] args) {
		c y = new c();
		y.displayA();
		y.displayC();

	}
}