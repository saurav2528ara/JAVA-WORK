import java.util.*;
class trial
{
	public static void main(String[] args) {


		
		Employee  e1=new Employee("sun",200);
		Employee  e2=new Employee("bun",100);
		Employee  e3=new Employee("run",300);
		Employee  e4=new Employee("ton",400);
		Employee  e5=new Employee("ant",500);

		Set<String> t = new TreeSet<>();  // Comparable default sorting order

		t.add("saurav");
		t.add("gaurav");

		System.out.print(t);


	}

	
}
class Employee{

		String name; int id;

		Employee(String name, int id)
		{
			this.name=name;
			this.id=id;
		}
	}