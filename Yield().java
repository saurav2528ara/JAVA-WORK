class Thread1 extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		for(int i=1; i<=3; i++)
		{
			System.out.println(n);
			Thread.yield();  // Same priority ka koi dusra thread waiting state me hai
								// tb ye dusre thread ko chance deta hai		
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		for(int i=1; i<=3; i++)
		{
			System.out.println(n);
			
		}
	}
}
class trial
{
	public static void main(String[] args) {
		
		Thread1 t1= new Thread1();
		Thread2 t2=new Thread2();

		t1.start();
		t2.start();
	}
}
