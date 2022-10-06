import java.util.ArrayList;
class trial
{
	public static void main(String[] args) {
		
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("saurav");
		Name.add("priya");
		Name.add("loves");

		System.out.println(Name);
		Name.add("Babu");
		System.out.println(Name);
		Name.add(1,"love");
		System.out.println(Name);
		Name.remove(3);
		System.out.println(Name);
		System.out.println(Name.get(2));
	}
}