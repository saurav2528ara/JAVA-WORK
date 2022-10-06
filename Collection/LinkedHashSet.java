import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		LinkedHashSet<String> h = new LinkedHashSet<String>();

		h.add("priya");
		h.add("loves");
		h.add("Saurav");
		System.out.println(h);

		System.out.print(h.add("Saurav"));

	}
}