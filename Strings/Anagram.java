package Strings;
import java.util.*;

public class Anagram 
{
	public String m1(String s1,String s2)
	{
		
		char s1arr[] = s1.toCharArray();
		char s2arr[] = s2.toCharArray();	
		
		Arrays.sort(s1arr);
		Arrays.sort(s2arr);
		
		String s3 = Arrays.toString(s1arr);
		String s4 = Arrays.toString(s2arr);
		
		if(s3.equals(s4))return "Anagram";
		else return "Not Anagram";
		
		
	}

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	Anagram obj= new Anagram();
	String s1=sc.nextLine();
	String s2 = sc.nextLine();
	System.out.println(obj.m1(s1,s2));
	
}

}
