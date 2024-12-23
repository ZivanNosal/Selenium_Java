//Arrays and ArrayLists

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr2 = {10,11,12,13,14,444,1000};
		
		//x2
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
		//		break; - program se zastavi kdyz najde prvni hodnotu odpovidajici podmince
			}
			else
			{
				System.out.println(arr2[i] +" is not multiple of 2");
			}
		}

		
		ArrayList<String> a = new ArrayList<String>();
		//create object of the class - object.method
		a.add("Ziv");
		a.add("Nos");
		a.add("X");
		a.add("Z");
		//a.get(2)
		System.out.println(a.get(2));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("*****");  //oddeleni vysledku
		
		
		for(String val :a)
		{
			System.out.println(val);
		}
		
		//check if item is present in list
		System.out.println(a.contains("Nos"));
		
		String[] name = {"zivan", "nosal", "sele"};
		List<String> nameArrayList = Arrays.asList(name);
		nameArrayList.contains("sele");
		
	}
}