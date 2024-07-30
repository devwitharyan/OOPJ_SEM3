class time
{
	int hour;
	int minute;
	public time(int hour, int minute)
	{
		this.hour=hour;
		this.minute=minute;
	}
	public void addition(time t1, time t2)
	{
		this.hour=t1.hour+t2.hour;
		this.minute=t1.minute+t2.minute;

		int temp=this.minute/60;
		this.hour+=temp;
		this.minute-=temp*60;
	}
	public void display()
	{
		System.out.println(this.hour+":"+this.minute);
	}
}
class p6_1
{
	public static void main(String[] args)
	{
		time t1=new time(5,15);
		time t2=new time(3,15);
		time t3=new time(0,0);
		t3.addition(t1,t2);
		t3.display();
	}
}