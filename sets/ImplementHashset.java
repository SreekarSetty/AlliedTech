package sets;

import java.util.*;

public class ImplementHashset
{
	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet<String>();
		h1.add("Sreekar");
		h1.add("somi");
		h1.add("setty");
		h1.add("sreedath");
		h1.add("somi");
		h1.add("setty");
		h1.add("Shiva Shanker");
		h1.add("somi");
		h1.add("setty");
		h1.add("Sudha Rani Yama");
		System.out.println(h1);
		
		Iterator itr = h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		for(String s:h1)
		{
			System.out.println(s);
		}
		
		String[] sarr = h1.toArray(new String[h1.size()]);
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println(sarr[i]);
		}
		
	}

}
