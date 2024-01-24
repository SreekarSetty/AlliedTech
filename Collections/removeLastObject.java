package Collections;

import java.util.ArrayList;

public class removeLastObject
{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sreekar");
		al.add("Somi");
		al.add("Setty");
		al.add("Java");
		al.add("Full");
		al.add("Developer");
		System.out.println("Before Removal");
		System.out.println(al);
		
		int lastIndex = al.size()-1;
		al.remove(lastIndex);
		System.out.println("After Removal");
		System.out.println(al);
		
		
	}

}
