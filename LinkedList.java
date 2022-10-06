import java.util.LinkedList;
class trial
{
	public static void main(String[] args) {
		
		LinkedList<String> Name=new LinkedList<String>();
		Name.add("saurav");
		Name.add("priya");
		Name.add("loves");

		System.out.println(Name);
		Name.addFirst("Babu");
		System.out.println(Name);
		Name.addLast("love");
		System.out.println(Name);
		Name.remove(3);
		System.out.println(Name);
		System.out.println(Name.get(2));

		for(String str:Name)
			System.out.println(str);
	}
}