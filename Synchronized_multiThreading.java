						/* Multithreading Synchronized */

						// eg- 3 passenger but 1 seat avilable

class Bus implements Runnable
{
	int availabe=2,passenger;
	Bus(int passenger)
	{
		this.passenger=passenger; // passenger=1
	}
	public synchronized void run() // using synchornized at a time only one thread used
	{
		String name=Thread.currentThread().getName();
		if(availabe>=passenger)
		{
			System.out.println(name+"Reverse seat");
			availabe=availabe-passenger;
		}
		else 
		{
			System.out.println("Sorry seat not availabe");
		}
	}
}
class trial
{
	public static void main(String[] args) {
		
		Bus in=new Bus(2);
		
		Thread t1=new Thread(in);
		Thread t2=new Thread(in);
		Thread t3=new Thread(in);

		t1.setName("ram");
		t1.setName("saurav");
		t1.setName("sharma");

		t1.start();
		t2.start();
		t3.start();

	}
}