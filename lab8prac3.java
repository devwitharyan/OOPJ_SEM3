//demonstrate multilevel inheritance

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
class c extends b{
	public void displayC(){
		System.out.println("C");
	}
}

class lab8prac3{
	public static void main(String[] args) {
		c x = new c();
		x.displayB();
		x.displayA();
		x.displayC();

	}
}