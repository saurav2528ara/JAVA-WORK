import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v);

		Enumeration e = v.elements();  // Enumeration --> 1) hasmoreElements()  2) nextElements
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();  // retreive element 1 by 1
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println(v);

	}
}