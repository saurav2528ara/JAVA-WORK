import java.util.Stack; // LIFO
class trial
{
	public static void main(String[] args) {
		
		Stack<String> Name=new Stack<String>();
		Name.push("saurav");
		Name.push("priya");
		Name.push("loves");

		System.out.println(Name);
		
		Name.push("love");
		System.out.println(Name);
		Name.pop();
		System.out.println(Name);
		

		for(String str:Name)
			System.out.println(str);
	}
}