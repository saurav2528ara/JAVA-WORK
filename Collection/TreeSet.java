import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		// TreeSet<String> t = new TreeSet<String>();
		   TreeSet<Integer> t = new TreeSet<Integer>();
		// t.add("A");
		// t.add("a");
		// t.add("B");
		// t.add("Z");
		// t.add("L");

		   t.add(10);
		   t.add(0);   // check 0 is lesser than 10 or not
		   t.add(15);		// check 15 is lesser than 10 or not
		   t.add(20);  // --> compare(20,10) and compare(20,15)
 
		   t.add(20); // compare(20,10) compare(20,15) compare(20,20)
		   
		   System.out.print(t);


		// System.out.println(t);  // A/q to ASCII value
		// System.out.println("A".compareTo("B"));
		// System.out.println("Z".compareTo("A"));
		// System.out.println("A".compareTo("A"));
		// System.out.print("A".compareTo(null));

	}
}