import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>(); // Empty linkedList
		// LinkedList<String> l = new LinkedList<String>(Collection c); --> Equivalent LinkedList object

		l.add("Saurav");
		l.add("30");
		l.add("gaurav");
		l.add("40");
		System.out.println(l);
		l.set(1,"software");
		System.out.println(l);
		l.removeLast();
		l.addFirst("engine");
		System.out.print(l);
	}
}