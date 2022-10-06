class trial
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

	//  Another approach to throws in same manner

	class trial
	{
		public static void main(String[] args) {
			
			for(int i=1; i<=10; i++)
			{
				try 
				{
					System.out.println(i);
					Thread.sleep(1000);
				}
				catch(InterruptedException n)
				{
					System.out.println("Printing numbers:");
				}
			}
		}
	}
}