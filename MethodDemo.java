
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo d = new MethodDemo();
		String name = d.getData();  
		System.out.println(name);
		MethodDemo2 d1 = new MethodDemo2();
		d1.getUserData();
		getData2(); //pro static class staci: getData2()
	}

	public String getData()   
	{
		System.out.println ("zdar");
		return "Živane";
	}
	
	public static String getData2() 
	{
		System.out.println ("zdar");
		return "Živane";
	}
}