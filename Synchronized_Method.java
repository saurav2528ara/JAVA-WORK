class Table
{
	public void	 printTable(int n)
	{
		for (int i=1; i<=10; i++)
		{
			System.out.println(n*i);
		}
	}
}
class thread1 extends Thread
{
	Table t;
	thread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class thread2 extends Thread
{
	
	Table t;
	thread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(2);
	}
}
class trial
{
	public static void main(String[] args) {
		
		Table in=new Table();

		thread1 t1=new thread1(in);
		thread2 t2=new thread2(in);

		t1.start(); t2.start();
	}
}