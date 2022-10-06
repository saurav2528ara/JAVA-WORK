import java.util.ArrayList;
class List
{
	public static void main(String[] args) {
		
		ArrayList<String> Name = new ArrayList<String>();
		ArrayList<Integer> No = new ArrayList<Integer>();

			Name.add("Saurav");
			Name.add("Arrah");
			Name.add("Patna");
			System.out.println(Name);
			Name.add(0,"noida");
			System.out.println(Name);
			System.out.println(Name.get(1));
			
	}
}