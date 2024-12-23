
public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string as an object that represents sequence of characters
		
		//1. String literal - jenom jeden object pro stejnou hodnotu "Some String" (prvni dva radky)
		String s1 = "Some String";
		String s5 = "hello";
		
		//2. new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		
		String t = "String rozdeleny mezerama";
		String[] splittedString = t.split(" "); //rozdeli String na tri casti pomoci mezer
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		String[] splittedString2 = t.split("rozdeleny"); //rozdeli String na dve casti od hodnoty "rozdeleny"
		System.out.println(splittedString2[0]);
		System.out.println(splittedString2[1]);
		System.out.println(splittedString2[1].trim()); //vynecha mezeru
		for(int i =t.length()-1;i>=0;i--) //i-- odzadu
		{
			System.out.println(t.charAt(i)); //rozdeli na znaky
		}
	}

}
