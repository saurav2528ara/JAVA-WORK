						// Thread Priority

class A extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
class trial
{
	public static void main(String[] args) {
		
		A t1=new A();
		A t2=new A();
		A t3=new A();

		t1.setName("t1 Thread");
		t2.setName("t2 Thread");
		t3.setName("t3 Thread");

		t1.setPriority(6);
		t3.setPriority(2);
		t3.setPriority(4);


		t1.start();
		t2.start();
		t3.start();

	}
}