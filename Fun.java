import java.util.Scanner;
class Fun
{
	int s1,s2;
	int add,mul,sun,mod,div;
	public static void main(String[] args)
	{
		Fun ref = new Fun();
		ref.input();
		ref.process();
		ref.output();
	}

	void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two number: ");
		s1 = in.nextInt();
		s2 = in.nextInt();
	}
	void process()
	{
		add = s1+s2;
		mul = s1*s2;
		sun = s1-s2;
		div = s1/s2;
		mod = s1%s2;
	}
	void output()
	{
		System.out.println(add);
		System.out.println(mul);
		System.out.println(sun);
		System.out.println(div);
		System.out.println(mod);
	}
}