package java8;
import java.util.*;
import java.util.stream.Collectors;

//Given an array of Strings, write a program to Capitalize the first letter of the each String,
//and print the strings in alphabetical order.

public class CapitalizeFirstLetter
{
	public static void main(String[] args) {
		

		    String[] stringsArray = {"apple", "banana", "orange", "grape"};

	        List<String> capitalizedStrings = Arrays.stream(stringsArray)
	                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
	                .sorted()
	                .collect(Collectors.toList());
	        
	        System.out.println("Capitalized and sorted strings: ");
	        capitalizedStrings.forEach(System.out::println);

		 

		
		
	}

}
