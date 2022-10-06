import java.util.ArrayDeque; // FIFO
class trial
{
	public static void main(String[] args) {
		
		ArrayDeque<String> Name=new ArrayDeque<>();
		Name.add("saurav");
		Name.add("priya");
		Name.add("loves");

		System.out.println(Name);
		
		Name.add("love");
		System.out.println(Name);
		Name.remove();
		System.out.println(Name);
		

		for(String str:Name)
			System.out.println(str);
	}
}