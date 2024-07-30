public class p7_1
{
	public static void main(String[] args)
	{
		String str1="Hello", str2="Hyy";
		int a=100;
		System.out.println("Length : "+str1.length()); 
		System.out.println("CharAt : "+str1.charAt(0));
		System.out.println("Concat : "+str1.concat(str2));
		System.out.println("IndexOf : "+str1.indexOf('e'));
		System.out.println("Equals : "+str1.equals(str2));
		System.out.println("ValueOf : "+String.valueOf(a));
		System.out.println("ToString : "+str1.toString());
		System.out.println("Trim : "+str1.trim());
		System.out.println("Substring : "+str1.substring(2,5));

	}
}