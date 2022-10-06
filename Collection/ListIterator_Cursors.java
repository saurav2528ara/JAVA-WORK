import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Saurav");
		l.add("Arrah");
		l.add("patna");
		l.add("Noida");
		System.out.println(l);

		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("Gaurav"))
			{
				itr.remove();
			}
			else if(s.equals("patna"))
			{
				itr.add("gatna");
			}
			else if(s.equals("Noida"))
			{
				itr.set("nepal");
			}
		}
		System.out.print(l);
	}
}