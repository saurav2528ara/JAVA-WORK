import java.util.*;
class trial
{
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		System.out.println(v.capacity());
		v.addElement("Saurav");
		v.addElement("gaurav");
		v.addElement("arrah");
		v.addElement("patna");
		System.out.println(v);
		v.removeElement("patna");
		System.out.println(v);
		// v.removeAllElements();
		// System.out.print(v);
		v.removeElementAt(2);
		System.out.println(v);


		// For Accessing

		v.elementAt(1);
		System.out.print(v);

	}
}