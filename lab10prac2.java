abstract class vegetable
{
	String color;
	public vegetable(String color)
	{
		this.color=color;
	}
	public abstract String toString();
}

class potato extends vegetable
{
	public potato(String color)
	{
		super(color);
	}

	public String toString()
	{
		return this.color+"potato";
	}
}

class brinjal extends vegetable
{
	public brinjal(String color)
	{
		super(color);
	}

	public String toString()
	{
		return this.color+"brinjal";
	}
}

class tomato extends vegetable
{
	public tomato(String color)
	{
		super(color);
	}

	public String toString()
	{
		return this.color+"tomato";
	}
}

public class lab10prac2
{
	public static void main(String[] args)
	{
		potato p1 = new potato("Brown");
		System.out.println(p1);

		brinjal b1 = new brinjal("Purple");
		System.out.println(b1);

		tomato t1 = new tomato("Red");
		System.out.println(t1);
	}
}