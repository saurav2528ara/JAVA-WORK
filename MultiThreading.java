//  					By extending Thread class

class A extends Thread
{
	@Override
	public void run()
	{
		try 
		{
				for(int i=1; i<=5; i++)
			{
				System.out.println("Bharat");
				Thread.sleep(1000);
			}	
		}
		catch(InterruptedException n)
		{
			System.out.println(n);
		}
		
	}
}
class trial
{
	public static void main(String[] args) throws InterruptedException {
		A in = new A();
		in.start(); // start() predefined funtion

		for (int i=0; i<=5; i++)
		{
			System.out.println("Saurav");
			Thread.sleep(1000);
		}
	}
}

//		By Implementing Runnable Interface

class A implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("My child Thread");
		}
	}
}
class trial
{
	public static void main(String[] args) {
		
		A r=new A();
		Thread t=new Thread(r);
		t.start();

		for(int i=1; i<=5; i++)
		{
			System.out.println("Main Thread");
		}
	}
}