class A extends Thread
{
	public void run()
	{
		System.out.println("is Alive method program");
	}
}
class trial
{
	public static void main(String[] args) {
		
		A t1=new A();
		A t2=new A();

		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());

		t2.start();
		System.out.println(t2.isAlive());

	}
}