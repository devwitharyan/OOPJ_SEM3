interface Eventlistener
{
	void performevent();
}

interface Mouselistener extends Eventlistener
{
	void mouseclicked();
	void mousepressed();
	void mousereleased();
	void mousemoved();
	void mousedragged();
}

interface Keylistener extends Eventlistener
{
	void keypressed();
	void keyreleased();
}

class Eventdemo implements Mouselistener, Keylistener
{
	public void mouseclicked()
	{
		System.out.println("Mouse Clicked");
	}
	public void mousepressed()
	{
		System.out.println("Mouse Pressed");
	}
	public void mousereleased()
	{
		System.out.println("Mouse Released");
	}
	public void mousemoved()
	{
		System.out.println("Mouse Moved");
	}
	public void mousedragged()
	{
		System.out.println("Mouse Dragged");
	}
	public void keypressed()
	{
		System.out.println("Key Pressed");
	}
	public void keyreleased()
	{
		System.out.println("Key Released");
	}
	public void performevent()
	{
		System.out.println("Perform Event");
	}
}

public class lab11prac1
{
	public static void main(String[] args)
	{
		Eventdemo e1 = new Eventdemo();
		e1.mouseclicked();
		e1.mousepressed();
		e1.mousereleased();
		e1.mousemoved();
		e1.mousedragged();

		e1.keypressed();
		e1.keyreleased();

		e1.performevent();

	}
}