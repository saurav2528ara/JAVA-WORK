import java.util.*;
import java.io.*;
import java.lang.*;

class trial
{
	public static void main(String[] args) {
		
		// TreeSet<String> t = new TreeSet<String>();
			TreeSet<Integer> t = new TreeSet<Integer>();

		// t.add("Saurav");
		// t.add("gaurav");
		// t.add("noida");
		// t.add("patna");
		// t.add("bihar");

			t.add(10);
			t.add(0);
			t.add(15);
			t.add(20);
			t.add(20);


		System.out.print(t);

		class myComparator implements Comparator
		{
			public int compare(Object obj1, Object obj2)
			{
				// String s1=(String)obj1;
				// String s2=(String)obj2;
				Integer i1=(Integer)obj1;
				Integer i2=(Integer)obj2;

				// return -s1.compareTo(s2);
				// return i2.compareTo(i1);
					return i1.compareTo(i2);
			}
		}
	}
}