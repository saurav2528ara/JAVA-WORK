// Join() jha lgega vhi sbse phle execute hoga.

class A extends Thread
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
		
		A t1=new A();
		A t2=new A();
		A t3=new A();

		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");

		t2.start();
		try 
		{
			t2.join(); // t2 thread sabse phle execute hoga or baki wait krenge
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}

		t1.start();
		t3.start();
	}
}