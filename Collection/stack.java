import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();

		s.push("Saurav");
		s.push("Gaurav");
		s.push("arrah");
		s.push("patna");
		System.out.println(s);
		s.pop();  		// Remove top of the Stack
		System.out.println(s);
		System.out.println(s.search("arrah"));
		System.out.println(s.search("Gaurav"));
		System.out.print(s.search("Z"));  // --> -1


	}
}