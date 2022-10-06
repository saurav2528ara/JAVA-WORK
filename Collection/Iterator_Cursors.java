import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<=10; i++)
		{
			l.add(i);
		}
		System.out.println(l);
	

	Iterator itr = l.iterator();	// by using operator, we can perform both read and remove.
	while(itr.hasNext())
	{
		Integer i = (Integer)itr.next();
		if(i%2 != 0)
		{
			System.out.println(i);
		}
		else 
			itr.remove();
	}
	System.out.print(l);
}
}
