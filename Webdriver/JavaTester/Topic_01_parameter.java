package JavaTester;

public class Topic_01_parameter {

	public static void main(String[] args) {
System.out.println(showName());
System.out.println(showName("Automation test"));
System.out.println(showName("Mai","Yuki"));

	}
 
	public static String showName() {
		return "Automative Unit";
	}
	public static String showName(String FullName) {
	return FullName;	
	}
	public static String showName(String firstName,String lastName)
	{
		return firstName + "" + lastName;
	}
}
