import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		SortedSet<Integer> s = new TreeSet<>();
		s.add(100);
		s.add(101);
		s.add(103);
		s.add(104);
		s.add(107);
		s.add(110);
		s.add(115);

		System.out.println(s);

		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(104));
		System.out.println(s.tailSet(104));
		System.out.println(s.subSet(103,110));
		System.out.print(s.comparator());
	}
}