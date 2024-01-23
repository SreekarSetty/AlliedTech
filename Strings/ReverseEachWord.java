package Strings;

import java.util.Scanner;

public class ReverseEachWord 
{
	public String m2(String str)
	{
		
		String strarr[]=str.split(" ");
		StringBuffer rev= new StringBuffer();
		for(int i=0;i<strarr.length;i++)
		{
			String s1 = strarr[i];
			StringBuffer sb=new StringBuffer(s1);
			sb.reverse();
			rev.append(sb+" ");
			
		}
		
		return rev.toString();
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str = sc.nextLine();
		
		ReverseEachWord obj = new ReverseEachWord();
		obj.m2(str);
		
	}

}
