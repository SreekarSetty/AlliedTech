package Strings;

import java.util.Scanner;

public class RotateWords
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String s1=str+str;
		String output=sc.nextLine();
		
		if(s1.contains(output))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
