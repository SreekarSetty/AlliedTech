package Collections;

import java.util.ArrayList;

public class ImplementArrayList
{
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		for(int i:al)
		{
			System.out.println(i);
		}
		
		if(al.contains(3))
		{
			System.out.println("3 is found in Array List");
		}
		
	}

}
