//demonstrate single inheritance

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

class lab8prac2{
	public static void main(String[] args) {
		b x = new b();
		x.displayB();
		x.displayA();
	}
}