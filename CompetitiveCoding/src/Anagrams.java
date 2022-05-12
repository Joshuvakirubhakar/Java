//ALGORITHM:
//	1.Get a String,remove whitespaces using replaceAll("\\s", "") and convert the string into char array 
//	and to lowercase.
//	2. Use toCharArray()  -----> to connvert it into char array. declare "boolean result = true;"
//	3.if "s1 length is not equals to s2" the set" boolean result to false".
//	4.Then sort the array if length is equal using "Arrays.sort(char a, b)".
//	5.if array "a" is equals to array"b" then set "boolean result to true."
//	6.if result "is true then print anagram." else print "not anagram"

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:  ");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String:  ");
		String str2 = sc.nextLine();
		sc.close();
		anagrams(str1,str2);
		
	}

	private static void anagrams(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");  //replaceAll("\\s", ""); ---->replaces all the White spaces
		String s2 = str2.replaceAll("\\s", "");		//"\\s" -----> is the Unicode of  a White space
		char a[] = s1.toLowerCase().toCharArray();  //1st to lowercase then to convert String into Char Array
		char b[] = s2.toLowerCase().toCharArray();
		boolean result = true;
		if(s1.length() != s2.length()) {		//two strings length must be equal
			result = false;
		}
		else {
			Arrays.sort(a);
			Arrays.sort(b);
			result = Arrays.equals(a, b);
		}
		if(result) {
			System.out.println(s1+"<-------is a Anagram of--------> " +s2);
		}
		else {
			System.out.println("Not an Anagram");
		}
	}

}
