import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>();

		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));


		System.out.print(t);

		class myComparator implements Comparator
		{
			public int compare(Object obj1, Object obj2)
			{
				String s1=obj1.toString();
				String s2=obj2.toString();

				return s1.compareTo(s2);
			}
		}
	}
}